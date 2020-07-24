package p000X;

/* renamed from: X.1zg  reason: invalid class name and case insensitive filesystem */
public final class C46401zg implements C06570Po {
    public final C22760yx A00;
    public final AnonymousClass0C1 A01;

    public final void onUserSessionWillEnd(boolean z) {
    }

    public static C46401zg A01(AnonymousClass0C1 r2) {
        return (C46401zg) r2.AVA(C46401zg.class, new C46411zh(r2));
    }

    public final void A03(long j, String str) {
        long j2 = j;
        this.A00.A00.A5J(C35051fj.A00, j2, "comments", C06360Ot.formatString("source=%s", str));
    }

    public final void A04(long j, String str) {
        long j2 = j;
        this.A00.A00.A5J(C35051fj.A00, j2, "profile", C06360Ot.formatString("source=%s", str));
    }

    public final void A05(long j, String str, String str2) {
        long j2 = j;
        this.A00.A00.A5J(C35051fj.A00, j2, "action", C06360Ot.formatString("source=%s:destination=%s", str, str2));
    }

    public final void A06(C35071fl r4, long j, AnonymousClass1NJ r7) {
        C22790z0 r2 = this.A00.A00;
        r2.A3B(r4, j, AnonymousClass000.A0E("tracking_token=", C30671Ut.A0A(this.A01, r7)));
        r2.A3B(r4, j, AnonymousClass000.A0E("m_pk=", r7.getId()));
        r2.A3B(r4, j, AnonymousClass000.A0E("a_id=", C30671Ut.A02(this.A01, r7)));
        r2.A3B(r4, j, AnonymousClass000.A0E("a_pk=", r7.A0c(this.A01).getId()));
    }

    public C46401zg(AnonymousClass0C1 r2) {
        this.A01 = r2;
        this.A00 = C22760yx.A00(r2);
    }

    public static long A00(AnonymousClass1NJ r1) {
        return (long) r1.APo().hashCode();
    }

    public final void A02(long j) {
        long j2 = j;
        this.A00.A00.A5J(C35051fj.A00, j2, "video_views", C06360Ot.formatString("source=%s", "text"));
    }
}
