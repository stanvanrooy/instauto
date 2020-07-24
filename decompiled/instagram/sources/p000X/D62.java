package p000X;

import android.os.Looper;
import android.os.SystemClock;
import com.facebook.forker.Process;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: X.D62 */
public final class D62 implements D5W {
    public static final C29756D8f A03 = new C29756D8f(2, -9223372036854775807L);
    public static final C29756D8f A04 = new C29756D8f(3, -9223372036854775807L);
    public static final C29756D8f A05 = new C29756D8f(0, -9223372036854775807L);
    public static final C29756D8f A06 = new C29756D8f(1, -9223372036854775807L);
    public D63 A00;
    public IOException A01;
    public final ExecutorService A02;

    public final void A01(int i) {
        IOException iOException = this.A01;
        if (iOException == null) {
            D63 d63 = this.A00;
            if (d63 != null) {
                if (i == Integer.MIN_VALUE) {
                    i = d63.A03;
                }
                IOException iOException2 = d63.A01;
                if (iOException2 != null && d63.A00 > i) {
                    throw iOException2;
                }
                return;
            }
            return;
        }
        throw iOException;
    }

    public final void A02(D9D d9d) {
        D63 d63 = this.A00;
        if (d63 != null) {
            d63.A01(true);
        }
        if (d9d != null) {
            AnonymousClass0Z9.A03(this.A02, new C29767D8u(d9d), 1649304882);
        }
        this.A02.shutdown();
    }

    public final void Ap0() {
        A01(Process.WAIT_RESULT_TIMEOUT);
    }

    public D62(String str) {
        this.A02 = Executors.newSingleThreadExecutor(new BW8(str));
    }

    public final long A00(D97 d97, C29737D7b d7b, int i) {
        Looper myLooper = Looper.myLooper();
        boolean z = false;
        if (myLooper != null) {
            z = true;
        }
        D6U.A03(z);
        boolean z2 = false;
        if (myLooper != null) {
            z2 = true;
        }
        D6U.A03(z2);
        this.A01 = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new D63(this, myLooper, d97, d7b, i, elapsedRealtime).A00(0);
        return elapsedRealtime;
    }
}
