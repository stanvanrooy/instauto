package p000X;

import java.util.concurrent.FutureTask;

/* renamed from: X.BST */
public final class BST implements Runnable {
    public final /* synthetic */ BSR A00;

    public BST(BSR bsr) {
        this.A00 = bsr;
    }

    public final void run() {
        BSQ bsq = this.A00.A01;
        if (bsq != null) {
            FutureTask futureTask = bsq.A00;
            if (futureTask != null) {
                futureTask.cancel(true);
                bsq.A00 = null;
            }
            this.A00.A01 = null;
        }
    }
}
