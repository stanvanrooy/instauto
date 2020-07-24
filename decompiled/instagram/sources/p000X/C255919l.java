package p000X;

/* renamed from: X.19l  reason: invalid class name and case insensitive filesystem */
public final class C255919l {
    public long A00;
    public long A01;
    public AnonymousClass1GS A02;
    public C15920nk A03 = C15920nk.Undefined;
    public C44031vU A04;
    public Integer A05;
    public Integer A06;
    public String A07;
    public String A08;
    public String A09;

    public final C256019m A00() {
        long j = this.A00;
        if (j == -1 || this.A06 == Constants.A0N) {
            if (j == -1 && this.A06 == Constants.A0N) {
                this.A00 = 4000;
            }
            if (this.A08 == null) {
                C15920nk r1 = this.A03;
                if (r1 != C15920nk.Undefined) {
                    this.A08 = r1.name();
                } else {
                    this.A08 = "HttpRequest";
                }
            }
            return new C256019m(this.A05, this.A03, this.A06, this.A00, this.A07, this.A01, this.A09, this.A08, this.A04, this.A02);
        }
        throw new IllegalStateException("Setting cache timeout when cache policy is not UseCacheWithTimeout has no effect");
    }

    public C255919l() {
        Integer num = Constants.ZERO;
        this.A05 = num;
        this.A06 = num;
        this.A07 = null;
        this.A00 = -1;
        this.A01 = -1;
        this.A09 = "undefined";
    }
}
