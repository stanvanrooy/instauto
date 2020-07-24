package p000X;

import android.os.Handler;

/* renamed from: X.DKN */
public final class DKN implements Runnable {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ DKK A01;
    public final /* synthetic */ DKT A02;

    public DKN(DKK dkk, DKT dkt, Handler handler) {
        this.A01 = dkk;
        this.A02 = dkt;
        this.A00 = handler;
    }

    public final void run() {
        DKK dkk = this.A01;
        DKT dkt = this.A02;
        Handler handler = this.A00;
        if (dkk.A06 != Constants.ONE) {
            DKO.A03(dkt, handler, new IllegalStateException(AnonymousClass000.A0E("prepare() must be called before starting audio encoding. Current state is: ", DKQ.A00(dkk.A06))));
            return;
        }
        try {
            dkk.A01.start();
            dkk.A06 = Constants.A0C;
            DKO.A02(dkt, handler);
        } catch (Exception e) {
            DKO.A03(dkt, handler, e);
        }
    }
}
