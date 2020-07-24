package p000X;

import android.view.View;

/* renamed from: X.AFA */
public final class AFA implements View.OnClickListener {
    public final /* synthetic */ C53822Um A00;

    public AFA(C53822Um r1) {
        this.A00 = r1;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0Z0.A05(726831855);
        CNV cnv = this.A00.A04;
        CNV.A01(cnv, CNV.A00(cnv, "onboarding_use_a_different_catalog_clicked"));
        View.OnClickListener onClickListener = this.A00.A00;
        AnonymousClass0a4.A06(onClickListener);
        onClickListener.onClick(view);
        AnonymousClass0Z0.A0C(-2052656423, A05);
    }
}
