package p000X;

/* renamed from: X.CB2 */
public final class CB2 implements CB4 {
    public final /* synthetic */ C27380CAz A00;
    public final /* synthetic */ C27379CAy A01;
    public final /* synthetic */ String A02;

    public final void B8H() {
    }

    public CB2(C27379CAy cAy, C27380CAz cAz, String str) {
        this.A01 = cAy;
        this.A00 = cAz;
        this.A02 = str;
    }

    public final void B7y(C27377CAw cAw) {
        C27380CAz cAz = this.A00;
        long j = cAz.A08;
        cAw.A00(j);
        C27375CAu cAu = this.A01.A02;
        String str = cAz.A0B;
        String str2 = cAz.A0D;
        String str3 = cAw.A0C;
        String str4 = cAw.A0D;
        long j2 = cAz.A04;
        cAu.A00.BcG(C27375CAu.A00("cache_segment_hit", str, j, str2, str3, str4, j2, j2 + cAz.A03));
        C27379CAy.A02(this.A01, this.A02, cAw);
    }
}
