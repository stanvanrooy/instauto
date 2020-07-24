package p000X;

import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.0wX  reason: invalid class name and case insensitive filesystem */
public final class C21320wX implements C19490tZ {
    public static final C05110Id A01 = new C21330wY();
    public final AnonymousClass0C1 A00;

    public final /* bridge */ /* synthetic */ void BfK(C17090pf r5, C06270Ok r6, C73233Ja r7) {
        AnonymousClass0C1 r0 = this.A00;
        DirectThreadKey AY6 = ((C21300wV) r5).AY6();
        C15890nh r3 = new C15890nh(r0);
        r3.A09 = Constants.ONE;
        r3.A0E("direct_v2/threads/%s/remove_all_users/", AY6.A00);
        r3.A06(AnonymousClass1N4.class, false);
        C17850qu A03 = r3.A03();
        A03.A00 = AnonymousClass4T7.A00(this.A00, r7);
        C12810hQ.A02(A03);
    }

    public C21320wX(AnonymousClass0C1 r1) {
        this.A00 = r1;
    }

    public final boolean AiL(C17090pf r2) {
        return true;
    }
}
