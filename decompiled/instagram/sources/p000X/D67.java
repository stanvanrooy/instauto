package p000X;

import android.net.Uri;
import com.google.android.exoplayer2.Format;

/* renamed from: X.D67 */
public final class D67 extends D6D {
    public final int A00 = 3;
    public final long A01;
    public final Format A02;
    public final C29742D7o A03;
    public final AnonymousClass96X A04;
    public final D1M A05;

    public D67(Uri uri, AnonymousClass96X r16, Format format, long j) {
        this.A04 = r16;
        this.A02 = format;
        long j2 = j;
        this.A01 = j2;
        this.A05 = new D1M(uri, (byte[]) null, 0, 0, -1, (String) null, 0, new D1P());
        this.A03 = new D6O(j2);
    }

    public final void A06() {
    }

    public final void Ap2() {
    }

    public final void A07(D3B d3b, boolean z) {
        A05(this.A03, (Object) null);
    }

    public final D6N AAq(C29791DAa dAa, C29736D7a d7a) {
        boolean z = false;
        if (dAa.A02 == 0) {
            z = true;
        }
        D6U.A02(z);
        return new C29712D5y(this.A05, this.A04, this.A02, this.A01, this.A00, A04(dAa));
    }

    public final void BaS(D6N d6n) {
        C29712D5y d5y = (C29712D5y) d6n;
        d5y.A09.A02((D9D) null);
        d5y.A08.A03();
    }
}
