package p000X;

import java.util.List;

/* renamed from: X.1Eq  reason: invalid class name and case insensitive filesystem */
public final class C26691Eq extends C26621Ef {
    public final C26631Eg A00;
    public final String A01;

    public static C26691Eq A00(AnonymousClass0C1 r7) {
        Class<C26691Eq> cls = C26691Eq.class;
        C26591Ec A002 = C26591Ec.A00(r7);
        C26691Eq r4 = (C26691Eq) ((C26621Ef) A002.A03.get(cls));
        if (r4 != null) {
            return r4;
        }
        C26691Eq r42 = new C26691Eq(r7, new C26631Eg(StoredPreferences.A00, "pending_reel_countdown_follow_requests", new AnonymousClass1F0()));
        A002.A03.put(cls, r42);
        return r42;
    }

    public final /* bridge */ /* synthetic */ C17850qu A0E(Object obj) {
        return AnonymousClass7T1.A00((AnonymousClass7T2) obj, this.A02);
    }

    public final Integer A0F() {
        return Constants.ONE;
    }

    public final void A0G() {
        List<AnonymousClass7T2> list;
        C27471Hz r0 = (C27471Hz) this.A00.A01(this.A01, true);
        if (!(r0 == null || (list = r0.A00) == null)) {
            for (AnonymousClass7T2 r1 : list) {
                A0B(r1.A00, r1);
            }
            A08();
        }
        A0H();
    }

    public final void A0H() {
        this.A00.A02(this.A01);
    }

    public final void A0I() {
        this.A00.A06(this.A01, new C27471Hz(A05()));
    }

    public C26691Eq(AnonymousClass0C1 r3, C26631Eg r4) {
        super(r3);
        this.A01 = AnonymousClass000.A0E("pending_reel_countdown_follow_requests_", r3.A04());
        this.A00 = r4;
    }
}
