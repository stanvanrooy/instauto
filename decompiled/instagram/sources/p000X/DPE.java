package p000X;

import android.os.Handler;
import java.util.Map;

/* renamed from: X.DPE */
public final class DPE implements C88443sQ {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ DKT A01;
    public final /* synthetic */ C30053DOi A02;
    public final /* synthetic */ DQ6 A03;

    public DPE(C30053DOi dOi, DQ6 dq6, DKT dkt, Handler handler) {
        this.A02 = dOi;
        this.A03 = dq6;
        this.A01 = dkt;
        this.A00 = handler;
    }

    public final void B2h(Exception exc, Map map) {
        C30073DPd dPd = new C30073DPd((Throwable) exc);
        dPd.A01(map);
        DKO.A03(this.A01, this.A00, dPd);
    }

    public final void onSuccess() {
        C30053DOi dOi = this.A02;
        dOi.A06 = null;
        dOi.A0H = false;
        DQ6 dq6 = this.A03;
        int i = dq6.A00 - 1;
        dq6.A00 = i;
        if (i == 0) {
            C30053DOi.A00(this.A02, this.A01, this.A00);
        }
    }
}
