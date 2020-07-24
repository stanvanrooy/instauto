package p000X;

/* renamed from: X.1qg  reason: invalid class name and case insensitive filesystem */
public final class C41671qg extends AnonymousClass1SZ {
    public final C27371Ho A00;
    public final AnonymousClass0C1 A01;
    public final String A02;

    public C41671qg(AnonymousClass0C1 r2, C27371Ho r3, String str) {
        super(C13740j9.A00("igtv_browse_organic"));
        this.A01 = r2;
        this.A00 = r3;
        this.A02 = str;
    }

    public final /* bridge */ /* synthetic */ void A01(Object obj, Object obj2) {
        AnonymousClass1NJ APe = ((C58442fx) obj).APe();
        C37141jB A03 = C37591ju.A03("instagram_organic_impression", this.A00);
        A03.A3f = this.A02;
        A03.A0B(this.A01, APe);
        C36901in.A04(AnonymousClass0WN.A01(this.A01), A03, APe, this.A00);
    }

    public final /* bridge */ /* synthetic */ void A02(Object obj, Object obj2) {
        AnonymousClass1NJ APe = ((C58442fx) obj).APe();
        C37141jB A03 = C37591ju.A03("instagram_organic_sub_impression", this.A00);
        A03.A3f = this.A02;
        A03.A3v = APe.getId();
        C36901in.A04(AnonymousClass0WN.A01(this.A01), A03, APe, this.A00);
    }
}
