package p000X;

import java.util.List;

/* renamed from: X.1Ds  reason: invalid class name and case insensitive filesystem */
public final class C26521Ds implements C26531Dt {
    public final /* synthetic */ C26461Dj A00;

    public C26521Ds(C26461Dj r1) {
        this.A00 = r1;
    }

    public final void A8k() {
        C26461Dj r1 = this.A00;
        r1.A00 = 0;
        AnonymousClass1FW r0 = r1.A04;
        if (r0 != null) {
            r0.A03.setVisibility(8);
            this.A00.A04.A00();
        }
        C26461Dj.A06(this.A00, AnonymousClass1DU.NEWS, "impression");
    }

    public final void BoP(int i) {
        C26461Dj.A02(this.A00, i);
        C26461Dj r2 = this.A00;
        r2.A00 = i;
        C26461Dj.A06(r2, AnonymousClass1DU.NEWS, "impression");
    }

    public final void BoQ() {
        C26461Dj.A02(this.A00, 0);
    }

    public final void Boj(List list, int i) {
        C26461Dj r1 = this.A00;
        C26461Dj.A04(r1, r1.A04, list, i);
    }
}
