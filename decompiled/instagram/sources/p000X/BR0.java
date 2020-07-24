package p000X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.BR0 */
public final class BR0 implements Runnable {
    public BQK A00;
    public final /* synthetic */ C25591BQx A01;

    public BR0(C25591BQx bQx, BQK bqk) {
        this.A01 = bQx;
        this.A00 = bqk;
    }

    public final void run() {
        this.A01.A04.A00(Constants.ZERO, this.A00, (String) null, AWC.DEFAULT);
        C25591BQx bQx = this.A01;
        BR7 br7 = bQx.A01;
        AnonymousClass0ZA.A09(br7.A00, bQx.A02, TimeUnit.SECONDS.toMillis((long) bQx.A03.A02), -775304961);
    }
}
