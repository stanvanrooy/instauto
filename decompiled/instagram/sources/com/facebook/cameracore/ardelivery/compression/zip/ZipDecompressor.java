package com.facebook.cameracore.ardelivery.compression.zip;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import p000X.AnonymousClass000;
import p000X.AnonymousClass0DB;
import p000X.AnonymousClass3Fi;
import p000X.C72423Fe;

public class ZipDecompressor implements AnonymousClass3Fi {
    public static final String TAG = "ZipDecompressor";
    public static final int UNZIP_BUFFER_SIZE = 4096;

    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r1 = new java.io.IOException("zipEntryName contains ../");
     */
    public static int unZipToFolderBuffered(InputStream inputStream, String str) {
        BufferedInputStream bufferedInputStream;
        ZipInputStream zipInputStream;
        FileOutputStream fileOutputStream;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            zipInputStream = new ZipInputStream(inputStream);
            try {
                bufferedInputStream = new BufferedInputStream(zipInputStream);
                try {
                    createDirIfNotExist(str, "");
                    byte[] bArr = new byte[4096];
                    int i = 0;
                    while (true) {
                        ZipEntry nextEntry = zipInputStream.getNextEntry();
                        if (nextEntry != null) {
                            String name = nextEntry.getName();
                            String str2 = File.separator;
                            if (name.contains(AnonymousClass000.A0E("..", str2))) {
                                break;
                            } else if (nextEntry.isDirectory()) {
                                createDirIfNotExist(str, name);
                            } else {
                                int lastIndexOf = name.lastIndexOf(str2);
                                if (lastIndexOf != -1) {
                                    new File(AnonymousClass000.A0J(str, str2, name.substring(0, lastIndexOf))).mkdirs();
                                }
                                try {
                                    fileOutputStream = new FileOutputStream(AnonymousClass000.A0J(str, str2, name));
                                } catch (Throwable th) {
                                    th = th;
                                    fileOutputStream = null;
                                    zipInputStream.closeEntry();
                                    C72423Fe.A00(bufferedOutputStream);
                                    C72423Fe.A00(fileOutputStream);
                                    throw th;
                                }
                                try {
                                    BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(fileOutputStream);
                                    while (true) {
                                        try {
                                            int read = bufferedInputStream.read(bArr);
                                            if (read == -1) {
                                                break;
                                            }
                                            bufferedOutputStream2.write(bArr, 0, read);
                                            i += read;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            bufferedOutputStream = bufferedOutputStream2;
                                            zipInputStream.closeEntry();
                                            C72423Fe.A00(bufferedOutputStream);
                                            C72423Fe.A00(fileOutputStream);
                                            throw th;
                                        }
                                    }
                                    bufferedOutputStream2.flush();
                                    zipInputStream.closeEntry();
                                    C72423Fe.A00(bufferedOutputStream2);
                                    C72423Fe.A00(fileOutputStream);
                                } catch (Throwable th3) {
                                    th = th3;
                                    zipInputStream.closeEntry();
                                    C72423Fe.A00(bufferedOutputStream);
                                    C72423Fe.A00(fileOutputStream);
                                    throw th;
                                }
                            }
                        } else {
                            C72423Fe.A00(bufferedInputStream);
                            C72423Fe.A00(zipInputStream);
                            return i;
                        }
                    }
                    throw th;
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (Throwable th5) {
                th = th5;
                bufferedInputStream = null;
                C72423Fe.A00(bufferedInputStream);
                C72423Fe.A00(zipInputStream);
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
            bufferedInputStream = null;
            zipInputStream = null;
            C72423Fe.A00(bufferedInputStream);
            C72423Fe.A00(zipInputStream);
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0015, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0019 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:16:0x0019=Splitter:B:16:0x0019, B:7:0x000f=Splitter:B:7:0x000f} */
    public boolean decompress(String str, String str2) {
        try {
            FileInputStream fileInputStream = new FileInputStream(str);
            boolean z = false;
            if (unZipToFolderBuffered(fileInputStream, str2) > 0) {
                z = true;
            }
            fileInputStream.close();
            return z;
        } catch (IOException | IllegalArgumentException e) {
            AnonymousClass0DB.A0P(TAG, e, "extracting effect fails. directory path: %s", str2);
            return false;
        } catch (Throwable ) {
            throw th;
        }
    }

    public static void createDirIfNotExist(String str, String str2) {
        File file = new File(AnonymousClass000.A0J(str, File.separator, str2));
        if (!file.isDirectory()) {
            file.mkdirs();
        }
    }
}
