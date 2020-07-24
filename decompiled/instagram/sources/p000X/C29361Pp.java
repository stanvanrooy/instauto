package p000X;

import java.util.Collections;

/* renamed from: X.1Pp  reason: invalid class name and case insensitive filesystem */
public final class C29361Pp implements C29371Pq {
    public final /* synthetic */ C27371Ho A00;
    public final /* synthetic */ AnonymousClass1PE A01;
    public final /* synthetic */ AnonymousClass0C1 A02;

    public C29361Pp(AnonymousClass1PE r1, AnonymousClass0C1 r2, C27371Ho r3) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = r3;
    }

    public final /* bridge */ /* synthetic */ void B85(Object obj) {
        AnonymousClass1NG r12 = (AnonymousClass1NG) obj;
        if (C29261Pf.MEDIA == r12.A0H) {
            C37111j8 r4 = new C37111j8(this.A02, r12.A04());
            C36901in.A0D(AnonymousClass0WN.A01(this.A01.A0b), "delivery", this.A00, r12.A04(), r4, Constants.ONE);
            if (r12.A04().Aho()) {
                C36901in.A0B(AnonymousClass0WN.A01(this.A01.A0b), this.A00, r12.A04(), "duplicate_ad_received", Collections.singletonList("duplicate_ad_received"), r4);
            }
        }
    }
}
