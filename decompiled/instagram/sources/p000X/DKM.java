package p000X;

import android.os.Handler;

/* renamed from: X.DKM */
public final class DKM implements Runnable {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ DKK A01;
    public final /* synthetic */ DKT A02;

    public DKM(DKK dkk, DKT dkt, Handler handler) {
        this.A01 = dkk;
        this.A02 = dkt;
        this.A00 = handler;
    }

    public final void run() {
        DKK dkk = this.A01;
        DKT dkt = this.A02;
        Handler handler = this.A00;
        if (dkk.A06 == Constants.A0C) {
            DKK.A01(dkk);
        }
        try {
            if (dkk.A01 != null) {
                if (dkk.A06 == Constants.A0C) {
                    dkk.A01.flush();
                    dkk.A01.stop();
                }
                dkk.A01.release();
            }
            dkk.A06 = Constants.ZERO;
            dkk.A01 = null;
            dkk.A00 = null;
            dkk.A02 = null;
            DKO.A02(dkt, handler);
        } catch (Exception e) {
            DKO.A03(dkt, handler, e);
            dkk.A06 = Constants.ZERO;
            dkk.A01 = null;
            dkk.A00 = null;
            dkk.A02 = null;
        } catch (Throwable th) {
            dkk.A06 = Constants.ZERO;
            dkk.A01 = null;
            dkk.A00 = null;
            dkk.A02 = null;
            throw th;
        }
    }
}
