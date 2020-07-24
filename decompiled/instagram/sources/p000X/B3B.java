package p000X;

import android.content.DialogInterface;

/* renamed from: X.B3B */
public final class B3B implements DialogInterface.OnClickListener {
    public final /* synthetic */ B3G A00;
    public final /* synthetic */ C31011Wc A01;

    public B3B(C31011Wc r1, B3G b3g) {
        this.A01 = r1;
        this.A00 = b3g;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C31011Wc r0 = this.A01;
        B39.A01(r0.A0D, this.A00, r0.A0B, true);
        this.A01.A01.show();
        this.A01.A02.dismiss();
    }
}
