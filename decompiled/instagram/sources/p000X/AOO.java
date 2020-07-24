package p000X;

import android.view.View;

/* renamed from: X.AOO */
public final class AOO implements View.OnClickListener {
    public final /* synthetic */ C13300iJ A00;
    public final /* synthetic */ C23472ANu A01;

    public AOO(C23472ANu aNu, C13300iJ r2) {
        this.A01 = aNu;
        this.A00 = r2;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0Z0.A05(962643343);
        C23472ANu aNu = this.A01;
        C13300iJ r7 = this.A00;
        aNu.A04();
        C225999o8 r1 = aNu.A0B;
        if (r1 != null) {
            r1.B69(Constants.ONE, r7);
        }
        new ALB(aNu.A0G.getContext()).A00(aNu.A00, aNu.A0H.A06, r7, new C23494AOq(aNu, r7), false);
        AnonymousClass0Z0.A0C(-856642567, A05);
    }
}
