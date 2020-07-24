package p000X;

import android.content.Context;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.DQD */
public final class DQD implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ DQK A01;
    public final /* synthetic */ CountDownLatch A02;
    public final /* synthetic */ AnonymousClass2QA A03;

    public DQD(AnonymousClass2QA r1, Context context, DQK dqk, CountDownLatch countDownLatch) {
        this.A03 = r1;
        this.A00 = context;
        this.A01 = dqk;
        this.A02 = countDownLatch;
    }

    public final void run() {
        this.A03.A00 = DQI.A00.AA1(this.A00, this.A01);
        this.A02.countDown();
    }
}
