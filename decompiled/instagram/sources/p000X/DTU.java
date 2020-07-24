package p000X;

import android.view.View;

/* renamed from: X.DTU */
public final class DTU implements C79713du {
    public final /* synthetic */ View A00;
    public final /* synthetic */ AnonymousClass3T9 A01;

    public DTU(AnonymousClass3T9 r1, View view) {
        this.A01 = r1;
        this.A00 = view;
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        AnonymousClass3T9 r2 = this.A01;
        AnonymousClass3TA r0 = r2.A02;
        AnonymousClass3TA r1 = AnonymousClass3TA.A01;
        if (r0 == r1) {
            AnonymousClass3T9.A0A(r2, AnonymousClass3TA.A02, new DTT(this));
        } else {
            AnonymousClass3T9.A0A(r2, r1, new DTV(this));
        }
    }
}
