package p000X;

import android.os.Handler;

/* renamed from: X.1Vp  reason: invalid class name and case insensitive filesystem */
public final class C30891Vp extends C27291Hg {
    public final AnonymousClass1HD A00;
    public final C30371To A01;
    public final AnonymousClass1PL A02;
    public final AnonymousClass0C1 A03;
    public final C27371Ho A04;

    public final void BJx() {
        if (!C34001dq.A00(this.A03).A02) {
            C34001dq.A00(this.A03).A01();
            return;
        }
        AnonymousClass1NJ A022 = AnonymousClass1PZ.A00(this.A03).A02(C34001dq.A00(this.A03).A00);
        if (A022 != null) {
            C36841ih APu = this.A02.APu(A022);
            AnonymousClass0ZA.A09(new Handler(), new AnonymousClass6Q4(this, APu, A022, new AnonymousClass6Q5(A022, APu)), 100, -1746325630);
            AnonymousClass6N8.A02(this.A00.getActivity(), this.A04, A022.APo(), Constants.A12, this.A03);
        }
    }

    public C30891Vp(AnonymousClass1HD r1, AnonymousClass1PL r2, C27371Ho r3, C30371To r4, AnonymousClass0C1 r5) {
        this.A00 = r1;
        this.A02 = r2;
        this.A04 = r3;
        this.A01 = r4;
        this.A03 = r5;
    }
}
