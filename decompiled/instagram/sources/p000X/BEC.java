package p000X;

import android.app.Dialog;

/* renamed from: X.BEC */
public final class BEC extends C54212Wi {
    public final /* synthetic */ Dialog A00;
    public final /* synthetic */ BEA A01;

    public BEC(BEA bea, Dialog dialog) {
        this.A01 = bea;
        this.A00 = dialog;
    }

    public final void A00() {
        BE9 be9 = this.A01.A01;
        be9.A02.set((Object) null);
        be9.A07();
        if (this.A00.isShowing()) {
            this.A00.dismiss();
        }
    }
}
