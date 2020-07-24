package p000X;

/* renamed from: X.AM0 */
public final class AM0 implements AM4 {
    public final /* synthetic */ C23424ALx A00;

    public AM0(C23424ALx aLx) {
        this.A00 = aLx;
    }

    public final void B4V(int i) {
        C23424ALx aLx = this.A00;
        AnonymousClass0C1 r0 = aLx.A07;
        String str = aLx.A02;
        String str2 = aLx.A03;
        C15890nh r3 = new C15890nh(r0);
        r3.A09 = Constants.A0N;
        r3.A0E("live/%s/get_post_live_likes/", str);
        r3.A09("starting_offset", Integer.toString(i));
        r3.A09("encoding_tag", str2);
        r3.A06(AM1.class, true);
        C17850qu A03 = r3.A03();
        A03.A00 = new C23425ALy(aLx, i);
        C28351Lj.A00(aLx.A05, aLx.A06, A03);
    }
}
