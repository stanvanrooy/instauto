package p000X;

import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.0vv  reason: invalid class name and case insensitive filesystem */
public final class C20940vv implements C19490tZ {
    public static final C05110Id A01 = new C20950vw();
    public final AnonymousClass0C1 A00;

    public final /* bridge */ /* synthetic */ void BfK(C17090pf r7, C06270Ok r8, C73233Ja r9) {
        C20920vt r72 = (C20920vt) r7;
        AnonymousClass0C1 r2 = this.A00;
        DirectThreadKey AY6 = r72.AY6();
        boolean z = r72.A01;
        boolean z2 = r72.A02.A03;
        C15890nh r3 = new C15890nh(r2);
        r3.A09 = Constants.ONE;
        r3.A0E("direct_v2/threads/%s/mark_unread/", AY6.A00);
        r3.A06(AnonymousClass1N4.class, false);
        r3.A0C("marked", z);
        if (z2) {
            r3.A0C("sampled", z2);
        }
        C17850qu A03 = r3.A03();
        A03.A00 = AnonymousClass4T7.A00(this.A00, r9);
        C12810hQ.A02(A03);
    }

    public C20940vv(AnonymousClass0C1 r1) {
        this.A00 = r1;
    }

    public final boolean AiL(C17090pf r2) {
        return true;
    }
}
