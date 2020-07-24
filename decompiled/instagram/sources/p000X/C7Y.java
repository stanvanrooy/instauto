package p000X;

import android.os.Bundle;
import android.view.View;

/* renamed from: X.C7Y */
public final class C7Y implements View.OnClickListener {
    public final /* synthetic */ C7X A00;

    public C7Y(C7X c7x) {
        this.A00 = c7x;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0Z0.A05(110634573);
        C7X c7x = this.A00;
        C52362Om r6 = new C52362Om(c7x.getActivity(), c7x.A01);
        C17510qM.A00.A0V();
        C7X c7x2 = this.A00;
        C13300iJ r4 = c7x2.A04;
        AnonymousClass0C1 r1 = c7x2.A01;
        C27286C7a c7a = c7x2.A06;
        C27710COe cOe = new C27710COe();
        cOe.A05 = c7a;
        C13510ie.A00(r1).A01(r4, false);
        Bundle bundle = new Bundle();
        bundle.putString("displayed_user_id", r4.getId());
        cOe.setArguments(bundle);
        r6.A02 = cOe;
        r6.A02();
        AnonymousClass0Z0.A0C(-630446380, A05);
    }
}
