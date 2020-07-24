package p000X;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

/* renamed from: X.0Qo  reason: invalid class name and case insensitive filesystem */
public final class C06830Qo implements AnonymousClass0VC {
    /* JADX WARNING: Can't wrap try/catch for region: R(5:24|25|26|27|28) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:32|33|34|35|36) */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x004f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0056 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x005d */
    public final File BYC(File file) {
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream;
        File replaceFileExtension = AnonymousClass0VL.replaceFileExtension(file, ".pending", ".batch.gz.tmp");
        A00(replaceFileExtension);
        try {
            fileOutputStream = new FileOutputStream(replaceFileExtension);
            fileInputStream = new FileInputStream(file);
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(fileOutputStream, new Deflater(-1, true));
            int i = 4;
            if (C252117x.A02().A07()) {
                i = 1;
            }
            byte[] bArr = new byte[(i << 10)];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read <= 0) {
                    break;
                }
                deflaterOutputStream.write(bArr, 0, read);
            }
            deflaterOutputStream.close();
            fileInputStream.close();
            fileOutputStream.close();
        } catch (IOException | OutOfMemoryError e) {
            AnonymousClass0DB.A0M("FileBasedSessionHandler_CompressAndRename", e, "Failed to to encode .batch file");
            A00(replaceFileExtension);
            replaceFileExtension = null;
        } catch (Throwable ) {
            throw th;
        }
        if (replaceFileExtension == null || !replaceFileExtension.exists()) {
            AnonymousClass0DB.A0D("FileBasedSessionHandler_CompressAndRename", "Failed to rename to .batch file");
            return null;
        }
        File replaceFileExtension2 = AnonymousClass0VL.replaceFileExtension(replaceFileExtension, ".tmp", "");
        if (replaceFileExtension.renameTo(replaceFileExtension2) && file.delete()) {
            return replaceFileExtension2;
        }
        replaceFileExtension.delete();
        return null;
        try {
        } catch (Throwable th) {
            fileInputStream.close();
            throw th;
        }
        try {
        } catch (Throwable th2) {
            fileOutputStream.close();
            throw th2;
        }
    }

    public static void A00(File file) {
        if (file.exists()) {
            try {
                file.delete();
            } catch (Exception e) {
                AnonymousClass0DB.A0M("FileBasedSessionHandler_CompressAndRename", e, String.format(Locale.US, "Failed to delete file:%s", new Object[]{file.getName()}));
            }
        }
    }
}
