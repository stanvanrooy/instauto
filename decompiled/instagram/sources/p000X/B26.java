package p000X;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: X.B26 */
public final class B26 implements Executor {
    public final /* synthetic */ C25115B1l A00;

    public B26(C25115B1l b1l) {
        this.A00 = b1l;
    }

    public final void execute(Runnable runnable) {
        AnonymousClass0ZA.A0E(new Handler(Looper.getMainLooper()), runnable, -1655060156);
    }
}
