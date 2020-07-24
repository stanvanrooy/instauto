package p000X;

import android.os.Bundle;
import android.view.View;

/* renamed from: X.COI */
public final class COI implements View.OnClickListener {
    public final /* synthetic */ C27707COb A00;
    public final /* synthetic */ C27706COa A01;

    public COI(C27707COb cOb, C27706COa cOa) {
        this.A00 = cOb;
        this.A01 = cOa;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0Z0.A05(409382744);
        C27707COb cOb = this.A00;
        C27706COa cOa = this.A01;
        cOb.A00.A00.A04();
        COP cop = cOb.A00.A03;
        String id = cOa.A01.getId();
        AnonymousClass0C1 r2 = cop.A01;
        C37141jB A03 = C37591ju.A03(COZ.A00(Constants.A0N), cop.A00);
        A03.A4B = id;
        COP.A00(r2, A03);
        COH coh = cOb.A00;
        C52362Om r7 = new C52362Om(coh.getActivity(), coh.A01);
        C17510qM.A00.A0V();
        C13300iJ r5 = cOa.A01;
        int i = cOa.A00;
        COH coh2 = cOb.A00;
        AnonymousClass0C1 r1 = coh2.A01;
        C27286C7a c7a = coh2.A0A;
        C7X c7x = new C7X();
        c7x.A03 = c7a;
        C13510ie.A00(r1).A01(r5, false);
        Bundle bundle = new Bundle();
        bundle.putString("displayed_user_id", r5.getId());
        bundle.putInt("highlighted_products_count", i);
        c7x.setArguments(bundle);
        r7.A02 = c7x;
        r7.A02();
        AnonymousClass0Z0.A0C(1260274129, A05);
    }
}
