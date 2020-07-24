package p000X;

import android.app.Activity;
import android.content.Intent;

/* renamed from: X.BEG */
public final class BEG extends C54162Wd {
    public final /* synthetic */ int A00 = 2;
    public final /* synthetic */ Activity A01;
    public final /* synthetic */ Intent A02;

    public BEG(Intent intent, Activity activity) {
        this.A02 = intent;
        this.A01 = activity;
    }

    public final void A00() {
        Intent intent = this.A02;
        if (intent != null) {
            this.A01.startActivityForResult(intent, this.A00);
        }
    }
}
