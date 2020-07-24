package p000X;

/* renamed from: X.CB1 */
public final class CB1 implements CB4 {
    public final /* synthetic */ C27380CAz A00;
    public final /* synthetic */ C27379CAy A01;
    public final /* synthetic */ String A02;

    public CB1(C27379CAy cAy, String str, C27380CAz cAz) {
        this.A01 = cAy;
        this.A02 = str;
        this.A00 = cAz;
    }

    public final void B7y(C27377CAw cAw) {
        this.A01.A05.put(this.A02, cAw);
        this.A01.A08.add(cAw);
    }

    public final void B8H() {
        C27375CAu cAu = this.A01.A02;
        C27380CAz cAz = this.A00;
        String str = cAz.A0D;
        String str2 = cAz.A0A;
        long j = cAz.A08;
        String str3 = cAz.A0F;
        String str4 = cAz.A0B;
        long j2 = cAz.A05;
        cAu.A06(str, str2, j, str3, str4, j2, j2 + cAz.A02);
        C40781pF r3 = C40781pF.UNKNOWN;
        try {
            r3 = C40781pF.valueOf(this.A00.A0E);
        } catch (IllegalArgumentException | NullPointerException unused) {
        }
        C27380CAz cAz2 = this.A00;
        long j3 = cAz2.A08;
        String str5 = cAz2.A0D;
        String str6 = cAz2.A0A;
        String str7 = cAz2.A0F;
        String r10 = r3.toString();
        C27380CAz cAz3 = this.A00;
        long j4 = cAz3.A05;
        long j5 = j4;
        long j6 = j4 + cAz3.A02;
        boolean z = false;
        if (r3 == C40781pF.PREFETCH) {
            z = true;
        }
        C27379CAy.A02(this.A01, this.A02, new C27377CAw(j3, str5, str6, str7, r10, j5, j6, z));
    }
}
