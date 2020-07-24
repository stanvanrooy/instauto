package p000X;

import android.view.View;

/* renamed from: X.C6Z */
public final class C6Z implements View.OnClickListener {
    public final /* synthetic */ C6X A00;

    public C6Z(C6X c6x) {
        this.A00 = c6x;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0Z0.A05(-1970864948);
        C6X.A00(this.A00);
        C6Y c6y = this.A00.A03;
        c6y.A08 = Constants.A0N;
        c6y.A00();
        this.A00.getActivity().finish();
        AnonymousClass0Z0.A0C(1823626031, A05);
    }
}
