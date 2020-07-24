package p000X;

import android.os.StrictMode;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Random;

/* renamed from: X.0Gh  reason: invalid class name and case insensitive filesystem */
public final class C04840Gh extends ThreadLocal {
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x002e */
    public final Object initialValue() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            FileInputStream fileInputStream = new FileInputStream("/dev/urandom");
            ByteBuffer allocate = ByteBuffer.allocate(8);
            fileInputStream.read(allocate.array());
            Random random = new Random(allocate.getLong());
            fileInputStream.close();
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return random;
        } catch (IOException e) {
            try {
                throw new RuntimeException("Cannot read from /dev/urandom", e);
            } catch (Throwable th) {
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                throw th;
            }
        } catch (Throwable ) {
            throw th;
        }
    }
}
