package p000X;

/* renamed from: X.0iX  reason: invalid class name and case insensitive filesystem */
public abstract class C13440iX extends C13450iY {
    public static final int[] A04 = C13180i1.A06;
    public int A00;
    public C12970hg A01 = C12940hd.A05;
    public int[] A02 = A04;
    public final C13030hm A03;

    public final C13460iZ A0A(int i) {
        if (i < 0) {
            i = 0;
        }
        this.A00 = i;
        return this;
    }

    public C13440iX(C13030hm r2, int i, C3U c3u) {
        super(i, c3u);
        this.A03 = r2;
        if (A0o(C12930hc.ESCAPE_NON_ASCII)) {
            A0A(127);
        }
    }

    public final void A0H(String str, String str2) {
        A0d(str);
        A0g(str2);
    }

    public final AnonymousClass4UF Btl() {
        return AnonymousClass2As.A01(getClass());
    }
}
