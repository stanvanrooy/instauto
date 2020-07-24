package p000X;

import android.content.res.Resources;
import com.facebook.forker.Process;

/* renamed from: X.1k3  reason: invalid class name and case insensitive filesystem */
public final class C37681k3 {
    public static final int A00 = Resources.getSystem().getDisplayMetrics().widthPixels;

    public static String A00(C37671k2 r6) {
        int i = Process.WAIT_RESULT_TIMEOUT;
        String str = null;
        for (C37661k1 r2 : r6.A0E) {
            int i2 = r2.A02;
            if (i2 > i) {
                str = r2.A04;
                i = i2;
            }
        }
        return str;
    }
}
