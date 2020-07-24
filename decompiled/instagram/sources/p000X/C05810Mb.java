package p000X;

/* renamed from: X.0Mb  reason: invalid class name and case insensitive filesystem */
public final class C05810Mb {
    public float A00;
    public int A01 = 24;
    public AnonymousClass0MM A02 = new AnonymousClass0MM();
    public String A03;
    public boolean A04 = false;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
        if (r1 != false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (r4 != false) goto L_0x0026;
     */
    public final void A00() {
        boolean z;
        boolean z2;
        AnonymousClass0MM r6 = this.A02;
        long now = r6.A04.now();
        boolean A022 = r6.A05.A02(now);
        boolean z3 = false;
        if (!r6.A06.A02(now)) {
            z = false;
        }
        z = true;
        if (!r6.A07.A02(now)) {
            z2 = false;
        }
        z2 = true;
        if (r6.A08.A02(now) || z2) {
            z3 = true;
        }
        AnonymousClass0MM.A00(r6, now);
        if (z3) {
            this.A04 = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0020, code lost:
        if (r3 != false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
        if (r4 != false) goto L_0x002e;
     */
    public final void A01(float f) {
        boolean z;
        boolean z2;
        this.A00 = Math.max(this.A00, f);
        AnonymousClass0MM r6 = this.A02;
        long now = r6.A04.now();
        boolean A012 = r6.A05.A01(f, now);
        boolean z3 = false;
        if (!r6.A06.A01(f, now)) {
            z = false;
        }
        z = true;
        if (!r6.A07.A01(f, now)) {
            z2 = false;
        }
        z2 = true;
        if (r6.A08.A01(f, now) || z2) {
            z3 = true;
        }
        if (z3) {
            AnonymousClass0MM.A00(r6, now);
        }
        if (z3) {
            this.A04 = true;
        }
    }

    public final String toString() {
        return "MainFeedSeenStateMediaInfo{mMediaID='" + this.A03 + '\'' + ", mVersion=" + this.A01 + ", mPhotoViewedPercentages=" + this.A00 + ", mSeenStateTimeInfo=" + this.A02 + ", mIsDirty=" + this.A04 + '}';
    }

    public C05810Mb() {
    }

    public C05810Mb(C05810Mb r3) {
        this.A03 = r3.A03;
        this.A00 = r3.A00;
        this.A02 = new AnonymousClass0MM(r3.A02);
        this.A04 = r3.A04;
    }

    public C05810Mb(String str) {
        this.A03 = str;
    }
}
