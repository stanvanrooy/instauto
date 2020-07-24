package p000X;

import android.view.View;

/* renamed from: X.1mI  reason: invalid class name and case insensitive filesystem */
public final class C39061mI implements View.OnClickListener {
    public final /* synthetic */ C30421Tt A00;
    public final /* synthetic */ C32271as A01;

    public C39061mI(C32271as r1, C30421Tt r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public final void onClick(View view) {
        boolean z;
        int A05 = AnonymousClass0Z0.A05(913653350);
        C39041mG.A00(this.A01);
        C30421Tt r3 = this.A00;
        C32271as r2 = this.A01;
        Boolean bool = r2.A09;
        if (bool == null || !bool.booleanValue()) {
            z = false;
        } else {
            z = !C52952Qw.A07(r2.A08, r2.A04.A0x()).isEmpty();
        }
        C32271as r1 = this.A01;
        r3.Ax5(z, r1.A04, r1.A07);
        AnonymousClass0Z0.A0C(1096804241, A05);
    }
}
