package p000X;

import android.net.Uri;

/* renamed from: X.D60 */
public final class D60 extends D6D implements D94 {
    public long A00 = -9223372036854775807L;
    public boolean A01;
    public final int A02;
    public final int A03;
    public final Uri A04;
    public final D93 A05;
    public final AnonymousClass96X A06;

    public final void A06() {
    }

    public final void Ap2() {
    }

    public final void A07(D3B d3b, boolean z) {
        long j = this.A00;
        this.A00 = j;
        this.A01 = false;
        A05(new D6O(j), (Object) null);
    }

    public final D6N AAq(C29791DAa dAa, C29736D7a d7a) {
        boolean z = false;
        if (dAa.A02 == 0) {
            z = true;
        }
        D6U.A02(z);
        return new C29709D5v(this.A04, this.A06.AAO(), this.A05.AAW(), this.A03, A04(dAa), this, d7a, this.A02);
    }

    public final void BaS(D6N d6n) {
        C29709D5v d5v = (C29709D5v) d6n;
        if (d5v.A0D) {
            for (C29715D6b A08 : d5v.A0G) {
                A08.A08();
            }
        }
        d5v.A0T.A02(d5v);
        AnonymousClass0ZA.A07(d5v.A0Q, (Object) null);
        d5v.A07 = null;
        d5v.A0E = true;
        d5v.A0S.A03();
    }

    public D60(Uri uri, AnonymousClass96X r4, D93 d93, int i, int i2) {
        this.A04 = uri;
        this.A06 = r4;
        this.A05 = d93;
        this.A03 = i;
        this.A02 = i2;
    }

    public final void BO4(long j, boolean z) {
        if (j == -9223372036854775807L) {
            j = this.A00;
        }
        if (this.A00 != j || this.A01 != z) {
            this.A00 = j;
            this.A01 = z;
            A05(new D6O(j), (Object) null);
        }
    }
}
