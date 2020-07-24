package p000X;

import android.util.Log;
import com.facebook.common.dextricks.DexManifest;
import com.facebook.common.dextricks.DexStore;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

/* renamed from: X.00t  reason: invalid class name and case insensitive filesystem */
public final class C020500t {
    /* JADX INFO: finally extract failed */
    public static long A00(File file) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            long length = randomAccessFile.length() - 22;
            long j = 0;
            if (length >= 0) {
                long j2 = length - OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_FINISHED;
                if (j2 >= 0) {
                    j = j2;
                }
                int reverseBytes = Integer.reverseBytes(101010256);
                do {
                    randomAccessFile.seek(length);
                    if (randomAccessFile.readInt() == reverseBytes) {
                        randomAccessFile.skipBytes(2);
                        randomAccessFile.skipBytes(2);
                        randomAccessFile.skipBytes(2);
                        randomAccessFile.skipBytes(2);
                        C020600v r5 = new C020600v();
                        r5.A01 = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                        r5.A00 = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                        CRC32 crc32 = new CRC32();
                        long j3 = r5.A01;
                        randomAccessFile.seek(r5.A00);
                        byte[] bArr = new byte[DexStore.LOAD_RESULT_DEX2OAT_CLASSPATH_SET];
                        int read = randomAccessFile.read(bArr, 0, (int) Math.min(OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_NEEDED, j3));
                        while (read != -1) {
                            crc32.update(bArr, 0, read);
                            j3 -= (long) read;
                            if (j3 == 0) {
                                break;
                            }
                            read = randomAccessFile.read(bArr, 0, (int) Math.min(OdexSchemeArtXdex.STATE_DO_PERIODIC_PGO_COMP_NEEDED, j3));
                        }
                        long value = crc32.getValue();
                        randomAccessFile.close();
                        long j4 = value;
                        if (value == -1) {
                            return value - 1;
                        }
                        return j4;
                    }
                    length--;
                } while (length >= j);
                throw new ZipException("End Of Central Directory signature not found");
            }
            throw new ZipException(AnonymousClass000.A0B("File too short to be a zip file: ", randomAccessFile.length()));
        } catch (Throwable th) {
            randomAccessFile.close();
            throw th;
        }
    }

    public static List A01(File file, File file2) {
        C020400s r9;
        boolean z;
        ZipOutputStream zipOutputStream;
        File file3 = file;
        String A0E = AnonymousClass000.A0E(file3.getName(), ".classes");
        File file4 = file2;
        File[] listFiles = file4.listFiles(new C020300r(A0E));
        if (listFiles == null) {
            Log.w("MultiDex", AnonymousClass000.A0J("Failed to list secondary dex dir content (", file4.getPath(), ")."));
        } else {
            for (File file5 : listFiles) {
                file5.getPath();
                file5.length();
                if (!file5.delete()) {
                    Log.w("MultiDex", AnonymousClass000.A0E("Failed to delete old file ", file5.getPath()));
                } else {
                    file5.getPath();
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(file3);
        try {
            ZipEntry entry = zipFile.getEntry(AnonymousClass000.A06("classes", 2, DexManifest.DEX_EXT));
            int i = 2;
            while (entry != null) {
                r9 = new C020400s(file4, AnonymousClass000.A06(A0E, i, ".zip"));
                arrayList.add(r9);
                int i2 = 0;
                z = false;
                while (i2 < 3 && !z) {
                    i2++;
                    InputStream inputStream = zipFile.getInputStream(entry);
                    File createTempFile = File.createTempFile(AnonymousClass000.A0E("tmp-", A0E), ".zip", r9.getParentFile());
                    createTempFile.getPath();
                    try {
                        zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(createTempFile)));
                        ZipEntry zipEntry = new ZipEntry("classes.dex");
                        zipEntry.setTime(entry.getTime());
                        zipOutputStream.putNextEntry(zipEntry);
                        byte[] bArr = new byte[DexStore.LOAD_RESULT_DEX2OAT_CLASSPATH_SET];
                        for (int read = inputStream.read(bArr); read != -1; read = inputStream.read(bArr)) {
                            zipOutputStream.write(bArr, 0, read);
                        }
                        zipOutputStream.closeEntry();
                        zipOutputStream.close();
                        if (createTempFile.setReadOnly()) {
                            r9.getPath();
                            if (createTempFile.renameTo(r9)) {
                                A02(inputStream);
                                createTempFile.delete();
                                r9.A00 = A00(r9);
                                z = true;
                                r9.getAbsolutePath();
                                r9.length();
                                if (!z) {
                                    r9.delete();
                                    if (r9.exists()) {
                                        Log.w("MultiDex", AnonymousClass000.A0J("Failed to delete corrupted secondary dex '", r9.getPath(), "'"));
                                    }
                                }
                            } else {
                                th = new IOException(AnonymousClass000.A0O("Failed to rename \"", createTempFile.getAbsolutePath(), "\" to \"", r9.getAbsolutePath(), "\""));
                            }
                        } else {
                            th = new IOException(AnonymousClass000.A0O("Failed to mark readonly \"", createTempFile.getAbsolutePath(), "\" (tmp of \"", r9.getAbsolutePath(), "\")"));
                        }
                    } catch (Throwable th) {
                        A02(inputStream);
                        createTempFile.delete();
                        throw th;
                    }
                    throw th;
                }
                if (z) {
                    i++;
                    entry = zipFile.getEntry(AnonymousClass000.A06("classes", i, DexManifest.DEX_EXT));
                } else {
                    throw new IOException(AnonymousClass000.A0L("Could not create zip file ", r9.getAbsolutePath(), " for secondary dex (", i, ")"));
                }
            }
            try {
                zipFile.close();
                return arrayList;
            } catch (IOException e) {
                Log.w("MultiDex", "Failed to close resource", e);
                return arrayList;
            }
        } catch (IOException e2) {
            Log.w("MultiDex", AnonymousClass000.A0E("Failed to read crc from ", r9.getAbsolutePath()), e2);
            z = false;
        } catch (Throwable th2) {
            try {
                zipFile.close();
            } catch (IOException e3) {
                Log.w("MultiDex", "Failed to close resource", e3);
            }
            throw th2;
        }
    }

    public static void A02(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
            Log.w("MultiDex", "Failed to close resource", e);
        }
    }
}
