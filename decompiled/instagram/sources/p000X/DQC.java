package p000X;

import android.content.Context;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.DQC */
public final class DQC implements DQI {
    public final DQG AA1(Context context, DQK dqk) {
        C13150hy.A02(context, "context");
        C13150hy.A02(dqk, "pstnCallListener");
        AnonymousClass2QA r2 = new AnonymousClass2QA();
        r2.A00 = null;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        C12670hC.A04(new DQD(r2, context, dqk, countDownLatch));
        countDownLatch.await();
        DQG dqg = (DQG) r2.A00;
        if (dqg == null) {
            C13150hy.A00();
        }
        return dqg;
    }
}
