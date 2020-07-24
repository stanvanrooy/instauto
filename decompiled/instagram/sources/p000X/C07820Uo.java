package p000X;

/* renamed from: X.0Uo  reason: invalid class name and case insensitive filesystem */
public final class C07820Uo implements Runnable {
    public final /* synthetic */ C10630dc A00;
    public final /* synthetic */ AnonymousClass0VN A01;

    public C07820Uo(C10630dc r1, AnonymousClass0VN r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void run() {
        AnonymousClass0VO r3 = (AnonymousClass0VO) this.A01.A04.A00();
        if (r3.equals(AnonymousClass0VO.FAILED_CONNECTION_REFUSED_SERVER_SHEDDING_LOAD) || r3.equals(AnonymousClass0VO.FAILED_CONNECTION_REFUSED_NOT_AUTHORIZED)) {
            C08220Wc r1 = this.A00.A01.A0P;
            synchronized (r1) {
                r1.A07 = true;
            }
        }
        C07990Vf r2 = this.A00.A01.A0l;
        C10630dc r12 = this.A00;
        if (r2 == r12.A00) {
            if (r3.equals(AnonymousClass0VO.FAILED_CONNECTION_REFUSED_BAD_USER_NAME_OR_PASSWORD)) {
                r12.A01.A0E.clear();
            }
            C07890Uv r22 = this.A00.A01;
            C07880Uu r13 = C07880Uu.CONNECT_FAILED;
            C07410Sz.A00(r3);
            C07890Uv.A03(r22, r13, new C11010eH(r3));
        }
        ((AnonymousClass064) this.A00.A01.A0A.A07(AnonymousClass064.class)).A02(C10890e2.LastConnectFailureReason, r3.name());
    }
}
