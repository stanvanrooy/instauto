package p000X;

import android.app.Activity;

/* renamed from: X.1Rt  reason: invalid class name and case insensitive filesystem */
public final class C29911Rt extends C27291Hg {
    public AnonymousClass12M A00;
    public final Activity A01;
    public final C29881Rq A02;

    public final void BJx() {
        AnonymousClass2LC A012;
        AnonymousClass12M r2 = this.A00;
        AnonymousClass2L7 r1 = r2.A00;
        r2.A00 = null;
        if (r1 != null && (A012 = r1.A01()) != null && A012.A0A != null) {
            C12670hC.A06(new AnonymousClass6QP(this, A012), 200);
        }
    }

    public C29911Rt(Activity activity, AnonymousClass0C1 r3, C29881Rq r4) {
        this.A01 = activity;
        this.A02 = r4;
        this.A00 = AnonymousClass12M.A00(activity, r3);
    }
}
