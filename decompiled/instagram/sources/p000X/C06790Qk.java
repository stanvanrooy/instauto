package p000X;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

/* renamed from: X.0Qk  reason: invalid class name and case insensitive filesystem */
public final class C06790Qk implements AnonymousClass0VC {
    /* JADX WARNING: Can't wrap try/catch for region: R(5:21|22|23|24|25) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0051 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x0058 */
    public final File BYC(File file) {
        C25953Bd7 bd7;
        File replaceFileExtension = AnonymousClass0VL.replaceFileExtension(file, ".pending", ".batch.enc.tmp");
        A00(replaceFileExtension);
        try {
            bd7 = new C25953Bd7(C227299qH.A00(new FileOutputStream(replaceFileExtension)));
            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file));
            int i = 4;
            if (C252117x.A02().A07()) {
                i = 1;
            }
            char[] cArr = new char[(i << 10)];
            while (true) {
                int read = inputStreamReader.read(cArr);
                if (read <= 0) {
                    break;
                }
                bd7.write(cArr, 0, read);
            }
            bd7.close();
            inputStreamReader.close();
            bd7.close();
        } catch (IOException | OutOfMemoryError e) {
            AnonymousClass0DB.A0M("FileBasedSessionHandler_EncodeAndRename", e, "Failed to to compress .batch file");
            A00(replaceFileExtension);
            replaceFileExtension = null;
        } catch (Throwable ) {
            throw th;
        }
        if (replaceFileExtension == null || !replaceFileExtension.exists()) {
            AnonymousClass0DB.A0D("FileBasedSessionHandler_EncodeAndRename", "Failed to rename to .batch file");
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
            bd7.close();
            throw th;
        }
    }

    public static void A00(File file) {
        if (file.exists()) {
            try {
                file.delete();
            } catch (Exception e) {
                AnonymousClass0DB.A0M("FileBasedSessionHandler_EncodeAndRename", e, String.format(Locale.US, "Failed to delete file:%s", new Object[]{file.getName()}));
            }
        }
    }
}
