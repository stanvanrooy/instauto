package p000X;

import android.view.View;

/* renamed from: X.BXF */
public final class BXF implements View.OnClickListener {
    public final /* synthetic */ BXG A00;

    public BXF(BXG bxg) {
        this.A00 = bxg;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0Z0.A05(216834321);
        BXG bxg = this.A00;
        C06200Od.A00(bxg.getActivity(), bxg.A00.getText().toString());
        AnonymousClass5F9.A03(this.A00.getActivity(), "Copied to clipboard", 0);
        AnonymousClass0Z0.A0C(550662052, A05);
    }
}
