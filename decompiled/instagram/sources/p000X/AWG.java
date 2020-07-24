package p000X;

import java.util.concurrent.CountDownLatch;

/* renamed from: X.AWG */
public final class AWG implements Runnable {
    public final /* synthetic */ AWE A00;
    public final /* synthetic */ CountDownLatch A01;

    public AWG(AWE awe, CountDownLatch countDownLatch) {
        this.A00 = awe;
        this.A01 = countDownLatch;
    }

    public final void run() {
        this.A01.countDown();
    }
}
