package p000X;

import android.view.View;
import com.facebook.C0003R;

/* renamed from: X.BXH */
public final class BXH implements View.OnClickListener {
    public final /* synthetic */ C25806BaF A00;

    public BXH(C25806BaF baF) {
        this.A00 = baF;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0Z0.A05(-2055077227);
        C25806BaF.A00(this.A00, "ob_ref_tap_area");
        C25806BaF baF = this.A00;
        C06200Od.A00(baF.getContext(), baF.A04);
        AnonymousClass5F9.A00(this.A00.getContext(), C0003R.string.support_detail_copy_text_confirmation);
        AnonymousClass0Z0.A0C(-1476537185, A05);
    }
}
