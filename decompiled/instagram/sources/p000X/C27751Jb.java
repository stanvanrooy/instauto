package p000X;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1Jb  reason: invalid class name and case insensitive filesystem */
public final class C27751Jb extends AnonymousClass1J3 {
    public final Handler A00;
    public final boolean A01;

    public final AnonymousClass1JN A00() {
        return new C66732vx(this.A00, this.A01);
    }

    public final C27711Ix A02(Runnable runnable, long j, TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("run == null");
        } else if (timeUnit != null) {
            Runnable A02 = AnonymousClass1J9.A02(runnable);
            Handler handler = this.A00;
            C204198oR r4 = new C204198oR(handler, A02);
            Message obtain = Message.obtain(handler, r4);
            if (this.A01) {
                obtain.setAsynchronous(true);
            }
            AnonymousClass0ZA.A06(this.A00, obtain, timeUnit.toMillis(j));
            return r4;
        } else {
            throw new NullPointerException("unit == null");
        }
    }

    public C27751Jb(Handler handler, boolean z) {
        this.A00 = handler;
        this.A01 = z;
    }
}
