package com.facebook.common.dextricks;

import com.facebook.common.dextricks.DexManifest;
import com.facebook.superpack.SuperpackFile;
import com.facebook.superpack.ditto.DittoPatch;
import com.facebook.xzdecoder.XzInputStream;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import java.util.zip.CRC32;
import java.util.zip.CheckedInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;
import p000X.AnonymousClass000;
import p000X.C03960Bo;

public final class InputDex implements Closeable {
    public static final byte STATE_RAW = 0;
    public static final byte STATE_USED = 2;
    public static final byte STATE_ZIPPED = 1;
    public static final String XZS_ASSET_SUFFIX = ".xzs.tmp~";
    public final DexManifest.Dex dex;
    public InputStream mContents;
    public byte mState;
    public int sizeHint;

    public String toString() {
        return String.format("InputDex:[%s]", new Object[]{this.dex.assetName});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0097, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009b, code lost:
        throw r0;
     */
    private void synthesizeDexJarFile(OutputStream outputStream) {
        InputStream inputStream;
        CheckedInputStream checkedInputStream;
        InputStream inputStream2 = this.mContents;
        ZipOutputStream zipOutputStream = new ZipOutputStream(outputStream);
        ZipEntry zipEntry = new ZipEntry("classes.dex");
        if (inputStream2 instanceof FileInputStream) {
            FileInputStream fileInputStream = (FileInputStream) inputStream2;
            FileChannel channel = fileInputStream.getChannel();
            if (channel.position() == 0) {
                InputStream fileInputStream2 = new FileInputStream(fileInputStream.getFD());
                try {
                    checkedInputStream = fileInputStream2;
                    InputStream bufferedInputStream = new BufferedInputStream(fileInputStream2);
                    checkedInputStream = fileInputStream2;
                    try {
                        CheckedInputStream checkedInputStream2 = new CheckedInputStream(bufferedInputStream, new CRC32());
                        checkedInputStream = checkedInputStream2;
                        zipEntry.setSize(checkedInputStream2.skip(Long.MAX_VALUE));
                        zipEntry.setCrc(checkedInputStream2.getChecksum().getValue());
                        zipEntry.setMethod(0);
                        Mlog.safeFmt("computed zip data for %s from file size:%s crc:%s", this, Long.valueOf(zipEntry.getSize()), Long.valueOf(zipEntry.getCrc()));
                        checkedInputStream = checkedInputStream2;
                        C0015Fs.safeClose((Closeable) checkedInputStream2);
                        channel.position(0);
                    } catch (Throwable th) {
                        th = th;
                        inputStream = bufferedInputStream;
                        C0015Fs.safeClose((Closeable) inputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    inputStream = checkedInputStream;
                }
            }
        }
        zipOutputStream.putNextEntry(zipEntry);
        C03960Bo.A03(zipOutputStream, inputStream2, Integer.MAX_VALUE);
        zipOutputStream.finish();
        zipOutputStream.close();
    }

    public void close() {
        C0015Fs.safeClose((Closeable) this.mContents);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0073, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0077, code lost:
        throw r0;
     */
    public void extract(File file) {
        byte b = this.mState;
        this.mState = 2;
        if (b == 0 || b == 1) {
            String name = file.getName();
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            if (name.endsWith(".dex.jar")) {
                if (b == 1) {
                    Mlog.safeFmt("copying existing zip file %s", this);
                    C03960Bo.A03(fileOutputStream, this.mContents, Integer.MAX_VALUE);
                } else {
                    Mlog.safeFmt("synthesizing new zip file %s", this);
                    synthesizeDexJarFile(fileOutputStream);
                }
            } else if (name.endsWith(DexManifest.DEX_EXT)) {
                Mlog.safeFmt("writing raw dex file %s", this);
                this.mState = b;
                C03960Bo.A03(fileOutputStream, getDexContents(), Integer.MAX_VALUE);
            } else {
                throw new RuntimeException(AnonymousClass000.A0E("don't know how to make this kind of file: ", name));
            }
            fileOutputStream.close();
            return;
        }
        throw new RuntimeException("InputDex already used");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    public InputStream getDexContents() {
        ZipEntry nextEntry;
        int i;
        byte b = this.mState;
        this.mState = 2;
        if (b == 1) {
            ZipInputStream zipInputStream = new ZipInputStream(this.mContents);
            this.mContents = zipInputStream;
            do {
                nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null || nextEntry.getName().equals("classes.dex")) {
                    if (nextEntry == null) {
                        long size = nextEntry.getSize();
                        if (size > 2147483647L) {
                            i = Integer.MAX_VALUE;
                        } else {
                            i = (int) size;
                        }
                        this.sizeHint = i;
                    } else {
                        throw new IOException(String.format("zip file %s did not contain a classes.dex", new Object[]{this.dex}));
                    }
                }
                nextEntry = zipInputStream.getNextEntry();
                break;
            } while (nextEntry.getName().equals("classes.dex"));
            if (nextEntry == null) {
            }
        } else if (b != 0) {
            throw new RuntimeException("InputDex already used");
        }
        return this.mContents;
    }

    public int getSizeHint(InputStream inputStream) {
        int i = this.sizeHint;
        if (i > 0) {
            return i;
        }
        int available = inputStream.available();
        if (available > 1) {
            return available;
        }
        return -1;
    }

    public InputDex(DexManifest.Dex dex2, InputStream inputStream) {
        this.dex = dex2;
        String str = dex2.assetName;
        try {
            str = str.endsWith(XZS_ASSET_SUFFIX) ? str.substring(0, str.length() - 9) : str;
            if (str.endsWith(".xz")) {
                str = str.substring(0, str.length() - 3);
                inputStream = new XzInputStream(inputStream);
            }
            if (str.endsWith(".jar")) {
                str = str.substring(0, str.length() - 4);
                this.mState = 1;
            }
            if (str.endsWith(DexManifest.DEX_EXT)) {
                this.mContents = inputStream;
                C0015Fs.safeClose((Closeable) null);
                return;
            }
            throw new RuntimeException(AnonymousClass000.A0E("malformed dex asset name: ", dex2.assetName));
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (Throwable th) {
            C0015Fs.safeClose((Closeable) inputStream);
            throw th;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:17|18|19|20|21) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x001d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0026, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0027, code lost:
        if (r3 != null) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x002c, code lost:
        throw r0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0021 */
    public void patch(DittoPatch dittoPatch) {
        InputStream dexContents = getDexContents();
        if (dexContents != null) {
            SuperpackFile superpackFile = new SuperpackFile(SuperpackFile.createSuperpackFileNative(DexStoreUtils.MAIN_DEX_STORE_ID, dexContents));
            synchronized (dittoPatch) {
                throw new IllegalStateException();
            }
        }
        throw null;
    }
}
