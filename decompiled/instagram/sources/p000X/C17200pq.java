package p000X;

import android.content.Context;
import android.os.SystemClock;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0pq  reason: invalid class name and case insensitive filesystem */
public final class C17200pq {
    public static long A00;
    public static C17210pr A01;
    public static long A02;
    public static C17210pr A03;
    public static Set A04;
    public static final long A05 = TimeUnit.SECONDS.toMillis(15);

    public static C17210pr A00() {
        boolean z = false;
        if (SystemClock.elapsedRealtime() - A02 > A05) {
            z = true;
        }
        if (z) {
            C17210pr A012 = A01(A03);
            if (A012 == null || !A012.A02) {
                A012 = null;
            }
            A03 = A012;
            A02 = SystemClock.elapsedRealtime();
        }
        return A03;
    }

    public static C17210pr A01(C17210pr r3) {
        if (r3 != null && C06460Pd.A03(r3.A00)) {
            return r3;
        }
        for (C17210pr r1 : A02()) {
            if (r1 != r3 && C06460Pd.A03(r1.A00)) {
                return r1;
            }
        }
        return null;
    }

    public static Set A02() {
        if (A04 == null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            linkedHashSet.add(C17210pr.KATANA);
            linkedHashSet.add(C17210pr.WAKIZASHI);
            for (C17210pr r1 : C17210pr.values()) {
                if (!linkedHashSet.contains(r1)) {
                    linkedHashSet.add(r1);
                }
            }
            A04 = linkedHashSet;
        }
        return A04;
    }

    public static boolean A03() {
        if (A00() != null) {
            return true;
        }
        return false;
    }

    public static boolean A04(Context context) {
        if (A00() == null) {
            boolean z = false;
            if (SystemClock.elapsedRealtime() - A00 > A05) {
                z = true;
            }
            if (z) {
                C17210pr A012 = A01(A01);
                if (A012 == null || A012.A02 || !A012.A00(context)) {
                    A012 = null;
                }
                A01 = A012;
                A00 = SystemClock.elapsedRealtime();
            }
            if (A01 != null) {
                return true;
            }
            return false;
        }
        return true;
    }
}
