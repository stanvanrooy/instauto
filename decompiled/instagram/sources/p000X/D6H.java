package p000X;

import android.net.Uri;
import java.io.IOException;

/* renamed from: X.D6H */
public final class D6H implements C29724D6l {
    public D6I A00;
    public final Object A01;
    public final /* synthetic */ D6G A02;

    private boolean A01(int i, C29791DAa dAa) {
        C29791DAa dAa2 = dAa;
        if (dAa == null) {
            dAa2 = null;
        } else if (dAa == null) {
            return false;
        }
        D6I d6i = this.A00;
        int i2 = i;
        if (d6i.A00 == i && C25948Bd0.A0D(d6i.A01, dAa2)) {
            return true;
        }
        this.A00 = new D6I(this.A02.A03.A02, i2, dAa2, 0);
        return true;
    }

    public D6H(D6G d6g, Object obj) {
        this.A02 = d6g;
        this.A00 = d6g.A04((C29791DAa) null);
        this.A01 = obj;
    }

    private D6X A00(D6X d6x) {
        long j = d6x.A04;
        long j2 = j;
        long j3 = d6x.A03;
        long j4 = j3;
        if (j == j && j3 == j3) {
            return d6x;
        }
        return new D6X(d6x.A00, d6x.A02, d6x.A05, d6x.A01, d6x.A06, j2, j4);
    }

    public final void B9L(Uri uri, String str) {
        this.A00.A06(uri, str);
    }

    public final void B0u(int i, C29791DAa dAa, D6X d6x) {
        if (A01(i, dAa)) {
            this.A00.A0B(A00(d6x));
        }
    }

    public final void B9R(int i, C29791DAa dAa, D4J d4j, D6X d6x) {
        if (A01(i, dAa)) {
            this.A00.A07(d4j, A00(d6x));
        }
    }

    public final void B9U(int i, C29791DAa dAa, D4J d4j, D6X d6x, Object obj) {
        if (A01(i, dAa)) {
            this.A00.A0A(d4j, A00(d6x), obj);
        }
    }

    public final void B9X(int i, C29791DAa dAa, D4J d4j, D6X d6x, IOException iOException, boolean z) {
        if (A01(i, dAa)) {
            this.A00.A09(d4j, A00(d6x), iOException, z);
        }
    }

    public final void B9e(int i, C29791DAa dAa, D4J d4j, D6X d6x) {
        if (A01(i, dAa)) {
            this.A00.A08(d4j, A00(d6x));
        }
    }

    public final void BAy(int i, C29791DAa dAa) {
        if (A01(i, dAa)) {
            this.A00.A02();
        }
    }

    public final void BAz(int i, C29791DAa dAa) {
        if (A01(i, dAa)) {
            this.A00.A03();
        }
    }

    public final void BH6(int i, C29791DAa dAa) {
        if (A01(i, dAa)) {
            this.A00.A04();
        }
    }

    public final void BTl(int i, C29791DAa dAa, D6X d6x) {
        if (A01(i, dAa)) {
            this.A00.A0C(A00(d6x));
        }
    }
}
