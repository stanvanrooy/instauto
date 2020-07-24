package p000X;

import android.os.PowerManager;
import java.lang.ref.WeakReference;

/* renamed from: X.07z  reason: invalid class name and case insensitive filesystem */
public final class C036907z {
    public int A00 = 0;
    public long A01;
    public long A02;
    public long A03 = -1;
    public long A04 = Long.MAX_VALUE;
    public boolean A05 = false;
    public boolean A06 = true;
    public final String A07;
    public final WeakReference A08;

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        if (r0 != 0) goto L_0x0011;
     */
    public static boolean A00(C036907z r6, long j) {
        if (r6.A05) {
            if (r6.A06) {
                int i = r6.A00 - 1;
                r6.A00 = i;
            }
            r6.A03 = j;
            r6.A02 += j - r6.A01;
            r6.A04 = Long.MAX_VALUE;
            r6.A05 = false;
            return true;
        }
        return false;
    }

    public C036907z(PowerManager.WakeLock wakeLock, String str) {
        this.A07 = str;
        this.A08 = new WeakReference(wakeLock);
    }
}
