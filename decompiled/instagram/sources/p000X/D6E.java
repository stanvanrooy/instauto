package p000X;

import java.nio.ByteBuffer;

/* renamed from: X.D6E */
public final class D6E implements D7Y {
    public int A00;
    public boolean A01;
    public final /* synthetic */ C29712D5y A02;

    public D6E(C29712D5y d5y) {
        this.A02 = d5y;
    }

    private void A00() {
        if (!this.A01) {
            C29712D5y d5y = this.A02;
            d5y.A08.A05(C29735D6z.A01(d5y.A07.A0S), this.A02.A07, 0, (Object) null, 0);
            this.A01 = true;
        }
    }

    public final boolean AhB() {
        return this.A02.A02;
    }

    public final void Ap0() {
        this.A02.A09.Ap0();
    }

    public final int BYz(D8z d8z, C29717D6d d6d, boolean z) {
        int i = this.A00;
        if (i == 2) {
            d6d.A00 = 4 | d6d.A00;
            return -4;
        } else if (z || i == 0) {
            d8z.A00 = this.A02.A07;
            this.A00 = 1;
            return -5;
        } else {
            C29712D5y d5y = this.A02;
            if (!d5y.A02) {
                return -3;
            }
            if (d5y.A03) {
                d6d.A00 = 0;
                d6d.A00 = 1 | d6d.A00;
                d6d.A04(d5y.A01);
                ByteBuffer byteBuffer = d6d.A01;
                C29712D5y d5y2 = this.A02;
                byteBuffer.put(d5y2.A04, 0, d5y2.A01);
                A00();
            } else {
                d6d.A00 = 4 | d6d.A00;
            }
            this.A00 = 2;
            return -4;
        }
    }

    public final int Bor(long j) {
        if (j <= 0 || this.A00 == 2) {
            return 0;
        }
        this.A00 = 2;
        A00();
        return 1;
    }
}
