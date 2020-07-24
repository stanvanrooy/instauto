package p000X;

import android.view.View;

/* renamed from: X.20q  reason: invalid class name and case insensitive filesystem */
public final class C467320q implements View.OnClickListener {
    public final /* synthetic */ C06270Ok A00;
    public final /* synthetic */ AnonymousClass1NJ A01;
    public final /* synthetic */ AnonymousClass0C1 A02;
    public final /* synthetic */ C467220p A03;
    public final /* synthetic */ C43631un A04;
    public final /* synthetic */ C13390iS A05;
    public final /* synthetic */ C13300iJ A06;
    public final /* synthetic */ AnonymousClass1I6 A07;
    public final /* synthetic */ String A08;

    public C467320q(C43631un r1, C13300iJ r2, AnonymousClass0C1 r3, C467220p r4, C13390iS r5, AnonymousClass1NJ r6, C06270Ok r7, AnonymousClass1I6 r8, String str) {
        this.A04 = r1;
        this.A06 = r2;
        this.A02 = r3;
        this.A03 = r4;
        this.A05 = r5;
        this.A01 = r6;
        this.A00 = r7;
        this.A07 = r8;
        this.A08 = str;
    }

    public final void onClick(View view) {
        C467220p r2;
        int A052 = AnonymousClass0Z0.A05(-1399595332);
        this.A04.A02.setEnabled(false);
        C13300iJ r5 = this.A06;
        if (r5.A0e()) {
            C43631un r22 = this.A04;
            AnonymousClass5GK.A04(r22.A02, this.A02, r22.A04, r5, this.A03);
        } else if (this.A05 != C13390iS.FollowStatusFollowing) {
            this.A04.A03(this.A02, r5, this.A03, this.A01, this.A00, this.A07, this.A08);
        } else if (r5.A1o != Constants.ONE || (((r2 = this.A03) == null || !r2.BmW(r5)) && !C144556Gc.A01(this.A02))) {
            C43631un r4 = this.A04;
            AnonymousClass0C1 r52 = this.A02;
            C13300iJ r6 = this.A06;
            C467220p r7 = this.A03;
            AnonymousClass5GK.A01(r4.A02.getContext(), r6, new C102834cC(r4, r52, r6, r7, this.A01, this.A00, this.A07, this.A08), new AnonymousClass5GO(r4), r7);
        } else {
            this.A04.A03(this.A02, this.A06, this.A03, this.A01, this.A00, this.A07, this.A08);
        }
        AnonymousClass0Z0.A0C(1598262110, A052);
    }
}
