package p000X;

import android.content.Context;
import android.view.View;

/* renamed from: X.CJI */
public final class CJI implements View.OnClickListener {
    public final /* synthetic */ CJF A00;
    public final /* synthetic */ C27577CIw A01;

    public CJI(CJF cjf, C27577CIw cIw) {
        this.A00 = cjf;
        this.A01 = cIw;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0Z0.A05(1610388313);
        CJF cjf = this.A00;
        C27577CIw cIw = this.A01;
        cjf.A04.A0D(cjf.A09, cjf.A03, cjf.A08, cIw.A00.name());
        AnonymousClass6NI.A02(cjf.getActivity());
        AnonymousClass7RN r9 = cIw.A00;
        Context context = cjf.getContext();
        C17850qu A03 = C27575CIu.A03(cjf.A02, cjf.A09, C17440qF.A00(context), (String) null, r9, cjf.A07, (String) null, cjf.A0A);
        A03.A00 = new CJG(cjf, context);
        cjf.schedule(A03);
        AnonymousClass0Z0.A0C(864438989, A05);
    }
}
