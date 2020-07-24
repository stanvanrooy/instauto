package p000X;

import android.view.View;
import com.facebook.C0003R;

/* renamed from: X.BWV */
public final class BWV implements View.OnClickListener {
    public final /* synthetic */ BWX A00;
    public final /* synthetic */ BWT A01;

    public BWV(BWT bwt, BWX bwx) {
        this.A01 = bwt;
        this.A00 = bwx;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0Z0.A05(-152861885);
        if (this.A00.A01.getVisibility() == 0) {
            this.A00.A01.setVisibility(8);
            this.A00.A02.setText(C0003R.string.dev_qp_raw_response_cta_show);
        } else {
            this.A00.A01.setVisibility(0);
            this.A00.A02.setText(C0003R.string.dev_qp_raw_response_cta_hide);
        }
        AnonymousClass0Z0.A0C(95797280, A05);
    }
}
