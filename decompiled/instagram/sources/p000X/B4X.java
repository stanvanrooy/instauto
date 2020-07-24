package p000X;

import android.content.Context;
import android.util.Log;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.B4X */
public final class B4X {
    public static B4X A04;
    public int A00 = 1;
    public B5W A01 = new B5W(this);
    public final Context A02;
    public final ScheduledExecutorService A03;

    public static final synchronized C60302jg A00(B4X b4x, C25171B4r b4r) {
        C60292jf r0;
        synchronized (b4x) {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                String.valueOf(b4r);
            }
            if (!b4x.A01.A02(b4r)) {
                B5W b5w = new B5W(b4x);
                b4x.A01 = b5w;
                b5w.A02(b4r);
            }
            r0 = b4r.A03.A00;
        }
        return r0;
    }

    public static synchronized B4X A01(Context context) {
        B4X b4x;
        synchronized (B4X.class) {
            if (A04 == null) {
                A04 = new B4X(context, C204328oh.A01.BvC(1, new B76("MessengerIpcClient"), 2));
            }
            b4x = A04;
        }
        return b4x;
    }

    public B4X(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.A03 = scheduledExecutorService;
        this.A02 = context.getApplicationContext();
    }
}
