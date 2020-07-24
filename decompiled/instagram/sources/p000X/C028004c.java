package p000X;

import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.FileDescriptor;

/* renamed from: X.04c  reason: invalid class name and case insensitive filesystem */
public final class C028004c {
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (r2 == null) goto L_0x0027;
     */
    public static boolean A00() {
        boolean z = false;
        FileDescriptor fileDescriptor = null;
        try {
            fileDescriptor = Os.open("/proc/zoneinfo", OsConstants.O_RDONLY, 0);
            z = fileDescriptor.valid();
        } catch (ErrnoException | NullPointerException unused) {
        } catch (Throwable th) {
            if (fileDescriptor != null && fileDescriptor.valid()) {
                try {
                    Os.close(fileDescriptor);
                } catch (ErrnoException unused2) {
                }
            }
            throw th;
        }
        if (fileDescriptor.valid()) {
            try {
                Os.close(fileDescriptor);
            } catch (ErrnoException unused3) {
            }
        }
        return z;
    }
}
