package p000X;

import android.view.View;

/* renamed from: X.C87 */
public final class C87 implements View.OnClickListener {
    public final /* synthetic */ C7X A00;

    public C87(C7X c7x) {
        this.A00 = c7x;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0Z0.A05(-16846163);
        C7X c7x = this.A00;
        c7x.A02.A01(c7x.A04.getId(), true, true);
        C7X c7x2 = this.A00;
        C52362Om r6 = new C52362Om(c7x2.getActivity(), c7x2.A01);
        C52892Qp A002 = C18980sj.A00.A00();
        C7X c7x3 = this.A00;
        r6.A02 = A002.A02(C52902Qq.A01(c7x3.A01, c7x3.A04.getId(), "shopping_settings_approved_partners", c7x3.getModuleName()).A03());
        r6.A02();
        AnonymousClass0Z0.A0C(683888930, A05);
    }
}
