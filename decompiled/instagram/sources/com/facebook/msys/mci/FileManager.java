package com.facebook.msys.mci;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.URI;
import java.net.URISyntaxException;
import p000X.C208928zC;

public class FileManager {
    public static File mCacheDir;
    public static boolean sInitialized;

    public static native void nativeInitialize();

    public static String getCacheDirectory() {
        return mCacheDir.toString();
    }

    public static synchronized File getFileFromPathWithOptionalScheme(String str) {
        File file;
        synchronized (FileManager.class) {
            if (str.startsWith("file://")) {
                try {
                    file = new File(new URI(str));
                } catch (URISyntaxException e) {
                    throw new RuntimeException(e);
                }
            } else if (str.startsWith("cache://")) {
                file = new File(mCacheDir, str.substring(8));
            } else {
                file = new File(str);
            }
        }
        return file;
    }

    static {
        C208928zC.A00();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:26|27|28|29|30) */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0045, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0049 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0050 */
    public static boolean copyFile(String str, String str2) {
        FileInputStream fileInputStream;
        File fileFromPathWithOptionalScheme = getFileFromPathWithOptionalScheme(str);
        File fileFromPathWithOptionalScheme2 = getFileFromPathWithOptionalScheme(str2);
        if (fileFromPathWithOptionalScheme2.exists()) {
            return false;
        }
        File parentFile = getFileFromPathWithOptionalScheme(str2).getParentFile();
        if (parentFile != null && !parentFile.exists()) {
            parentFile.mkdirs();
        }
        try {
            fileInputStream = new FileInputStream(fileFromPathWithOptionalScheme);
            FileOutputStream fileOutputStream = new FileOutputStream(fileFromPathWithOptionalScheme2);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read >= 0) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.close();
                    fileInputStream.close();
                    return true;
                }
            }
        } catch (IOException unused) {
            return false;
        } catch (Throwable ) {
            throw th;
        }
        try {
        } catch (Throwable th) {
            fileInputStream.close();
            throw th;
        }
    }

    public static boolean createDirectory(String str) {
        File fileFromPathWithOptionalScheme = getFileFromPathWithOptionalScheme(str);
        if (!fileFromPathWithOptionalScheme.exists() || !fileFromPathWithOptionalScheme.isDirectory()) {
            return fileFromPathWithOptionalScheme.mkdirs();
        }
        return true;
    }

    public static boolean deleteItem(String str) {
        return deleteItemRecursive(getFileFromPathWithOptionalScheme(str));
    }

    public static boolean deleteItemRecursive(File file) {
        boolean delete;
        if (!file.isDirectory()) {
            return file.delete();
        }
        boolean z = true;
        for (File file2 : file.listFiles()) {
            if (file2.isDirectory()) {
                if (z) {
                    delete = deleteItemRecursive(file2);
                }
                z = false;
            } else {
                if (z) {
                    delete = file2.delete();
                }
                z = false;
            }
            z = true;
            if (delete) {
            }
            z = false;
        }
        if (!file.delete() || !z) {
            return false;
        }
        return true;
    }

    public static boolean itemExists(String str) {
        return getFileFromPathWithOptionalScheme(str).exists();
    }

    public static String[] listDirectory(String str) {
        File[] listFiles = getFileFromPathWithOptionalScheme(str).listFiles();
        if (listFiles == null) {
            return null;
        }
        int length = listFiles.length;
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = listFiles[i].getAbsolutePath();
        }
        return strArr;
    }

    public static boolean moveFile(String str, String str2) {
        File fileFromPathWithOptionalScheme = getFileFromPathWithOptionalScheme(str);
        File fileFromPathWithOptionalScheme2 = getFileFromPathWithOptionalScheme(str2);
        if (fileFromPathWithOptionalScheme.equals(fileFromPathWithOptionalScheme2) || fileFromPathWithOptionalScheme.renameTo(fileFromPathWithOptionalScheme2)) {
            return true;
        }
        if (copyFile(str, str2)) {
            return fileFromPathWithOptionalScheme.delete();
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0030, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0034 */
    public static byte[] readFile(String str) {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(getFileFromPathWithOptionalScheme(str), "r");
            long length = randomAccessFile.length();
            if (length <= 2147483647L) {
                byte[] bArr = new byte[((int) length)];
                randomAccessFile.readFully(bArr);
                randomAccessFile.close();
                return bArr;
            }
            Log.e("FileUtils", "Cannot read more than 2GB into an array");
            throw new IOException("Cannot read more than 2GB into an array");
        } catch (IOException unused) {
            return null;
        } catch (Throwable ) {
            throw th;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:24|25|26|27|28) */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x003e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0045 */
    public static boolean writeDataToFile(byte[] bArr, String str) {
        File parentFile = getFileFromPathWithOptionalScheme(str).getParentFile();
        if (parentFile != null && !parentFile.exists()) {
            parentFile.mkdirs();
        }
        File fileFromPathWithOptionalScheme = getFileFromPathWithOptionalScheme(str);
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            FileOutputStream fileOutputStream = new FileOutputStream(fileFromPathWithOptionalScheme);
            byte[] bArr2 = new byte[1024];
            while (true) {
                int read = byteArrayInputStream.read(bArr2);
                if (read >= 0) {
                    fileOutputStream.write(bArr2, 0, read);
                } else {
                    fileOutputStream.close();
                    byteArrayInputStream.close();
                    return true;
                }
            }
            try {
            } catch (Throwable th) {
                byteArrayInputStream.close();
                throw th;
            }
        } catch (IOException unused) {
            return false;
        } catch (Throwable ) {
            throw th;
        }
    }
}
