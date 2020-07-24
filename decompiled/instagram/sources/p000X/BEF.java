package p000X;

import android.content.Intent;

/* renamed from: X.BEF */
public final class BEF extends C54162Wd {
    public final /* synthetic */ int A00 = 2;
    public final /* synthetic */ Intent A01;
    public final /* synthetic */ BED A02;

    public BEF(Intent intent, BED bed) {
        this.A01 = intent;
        this.A02 = bed;
    }

    public final void A00() {
        Intent intent = this.A01;
        if (intent != null) {
            this.A02.startActivityForResult(intent, this.A00);
        }
    }
}
