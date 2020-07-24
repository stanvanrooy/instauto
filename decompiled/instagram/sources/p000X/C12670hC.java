package p000X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.0hC  reason: invalid class name and case insensitive filesystem */
public final class C12670hC {
    public static Handler A00;

    public static Handler A00() {
        if (A00 == null) {
            synchronized (C12670hC.class) {
                if (A00 == null) {
                    A00 = new Handler(Looper.getMainLooper());
                }
            }
        }
        return A00;
    }

    public static void A01() {
        if (!(!A08())) {
            throw new IllegalStateException("This operation can't be run on UI thread.");
        }
    }

    public static void A02() {
        A07("This operation must be run on UI thread.");
    }

    public static void A03(Runnable runnable) {
        AnonymousClass0ZA.A08(A00(), runnable);
    }

    public static void A04(Runnable runnable) {
        if (A08()) {
            runnable.run();
        } else {
            AnonymousClass0ZA.A0E(A00(), runnable, -1345656438);
        }
    }

    public static void A05(Runnable runnable) {
        AnonymousClass0ZA.A0E(A00(), runnable, -1469338351);
    }

    public static void A06(Runnable runnable, long j) {
        AnonymousClass0ZA.A09(A00(), runnable, j, 1838733632);
    }

    public static void A07(String str) {
        if (!A08()) {
            throw new IllegalStateException(str);
        }
    }

    public static boolean A08() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return true;
        }
        return false;
    }
}
