package p000X;

/* renamed from: X.CB0 */
public final class CB0 implements CB4 {
    public final /* synthetic */ C27380CAz A00;
    public final /* synthetic */ C27379CAy A01;
    public final /* synthetic */ String A02;

    public final void B8H() {
    }

    public CB0(C27379CAy cAy, C27380CAz cAz, String str) {
        this.A01 = cAy;
        this.A00 = cAz;
        this.A02 = str;
    }

    public final void B7y(C27377CAw cAw) {
        C27380CAz cAz = this.A00;
        long j = cAz.A08;
        String str = cAz.A0C;
        cAw.A02 = j;
        cAw.A09 = str;
        C27375CAu cAu = this.A01.A02;
        String str2 = cAz.A0D;
        String str3 = cAw.A0C;
        String str4 = cAz.A0B;
        long j2 = cAz.A05;
        cAu.A07(str2, str3, str4, j2, j2 + cAz.A02, j);
        this.A01.A02.A03(this.A00.A0B, cAw);
        C27379CAy cAy = this.A01;
        String str5 = this.A02;
        C27377CAw cAw2 = (C27377CAw) cAy.A05.remove(str5);
        if (cAw2 != null) {
            cAy.A08.remove(cAw2);
        }
        cAy.A07.remove(str5);
        cAy.A04.A03(str5);
    }
}
