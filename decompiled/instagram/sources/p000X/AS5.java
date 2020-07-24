package p000X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.AS5 */
public final class AS5 {
    public static final Handler A00 = new Handler(Looper.getMainLooper());

    public static void A00(Runnable runnable) {
        boolean z = false;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z = true;
        }
        if (z) {
            runnable.run();
        } else {
            AnonymousClass0ZA.A0E(A00, runnable, -2054899697);
        }
    }
}
