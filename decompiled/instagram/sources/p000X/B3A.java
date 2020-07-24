package p000X;

import android.content.DialogInterface;

/* renamed from: X.B3A */
public final class B3A implements DialogInterface.OnCancelListener {
    public final /* synthetic */ B3G A00;
    public final /* synthetic */ C31011Wc A01;

    public B3A(C31011Wc r1, B3G b3g) {
        this.A01 = r1;
        this.A00 = b3g;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        C31011Wc r0 = this.A01;
        B39.A01(r0.A0D, this.A00, r0.A0B, false);
    }
}
