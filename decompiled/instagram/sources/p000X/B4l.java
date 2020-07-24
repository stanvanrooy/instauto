package p000X;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* renamed from: X.B4l */
public final class B4l implements Runnable {
    public final /* synthetic */ C60302jg A00;
    public final /* synthetic */ B4m A01;

    public B4l(B4m b4m, C60302jg r2) {
        this.A01 = b4m;
        this.A00 = r2;
    }

    public final void run() {
        B4m b4m;
        Exception exc;
        try {
            C60302jg BrH = this.A01.A00.BrH(this.A00.A0B());
            if (BrH == null) {
                this.A01.B42(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = C60422js.A01;
            BrH.A08(executor, this.A01);
            BrH.A07(executor, this.A01);
            BrH.A06(executor, this.A01);
        } catch (C25173B4t e) {
            if (e.getCause() instanceof Exception) {
                b4m = this.A01;
                exc = (Exception) e.getCause();
            } else {
                b4m = this.A01;
                exc = e;
            }
            b4m.B42(exc);
        } catch (CancellationException unused) {
            this.A01.Aue();
        } catch (Exception e2) {
            this.A01.B42(e2);
        }
    }
}
