package p000X;

import android.os.Handler;

/* renamed from: X.DNG */
public final class DNG implements DKT {
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ DKT A01;
    public final /* synthetic */ C30053DOi A02;

    public DNG(C30053DOi dOi, DKT dkt, Handler handler) {
        this.A02 = dOi;
        this.A01 = dkt;
        this.A00 = handler;
    }

    public final void B2m(Throwable th) {
        DKO.A03(this.A01, this.A00, th);
    }

    public final void onSuccess() {
        DKO.A02(this.A01, this.A00);
    }
}
