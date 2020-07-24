package p000X;

import android.view.View;

/* renamed from: X.1mh  reason: invalid class name and case insensitive filesystem */
public final class C39311mh extends C39261mc {
    public final /* synthetic */ C29191Oy A00;
    public final /* synthetic */ C37751kA A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C39311mh(C29191Oy r1, boolean z, int i, C37751kA r4) {
        super(z, i);
        this.A00 = r1;
        this.A01 = r4;
    }

    public final void onClick(View view) {
        AnonymousClass12J r1;
        C29191Oy r12 = this.A00;
        instagramComment r3 = this.A01.A03;
        boolean A06 = r3.A06();
        C23300zv r2 = r12.A03;
        if (A06) {
            r1 = new C34021ds(r3.A0C);
        } else {
            r1 = new C35301g9(r3);
        }
        r2.BXT(r1);
    }
}
