package p000X;

/* renamed from: X.1ps  reason: invalid class name and case insensitive filesystem */
public final class C41171ps extends AnonymousClass0L1 {
    public final /* synthetic */ C37531jo A00;

    public final void A00() {
        AnonymousClass0C1 r4 = this.A00.A07;
        if (!AnonymousClass1US.A02) {
            C64362rM r3 = new C64362rM();
            String A05 = C06360Ot.formatString("users/%s/info/", r4.A06.getId());
            C15890nh r2 = new C15890nh(r4);
            r2.A09 = Constants.A0N;
            r2.A0C = A05;
            r2.A06(C64372rN.class, false);
            C17850qu A03 = r2.A03();
            A03.A00 = r3;
            C12810hQ.A02(A03);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41171ps(C37531jo r3) {
        super("refreshCloseFriendsCount", 374);
        this.A00 = r3;
    }
}
