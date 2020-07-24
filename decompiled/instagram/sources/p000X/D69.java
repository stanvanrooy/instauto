package p000X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: X.D69 */
public final class D69 extends D6G {
    public int A00 = -1;
    public C29742D7o A01;
    public C29765D8s A02;
    public Object A03;
    public final C29763D8q A04;
    public final ArrayList A05;
    public final D6R[] A06;

    public D69(D6R... d6rArr) {
        C29746D7s d7s = new C29746D7s();
        this.A06 = d6rArr;
        this.A04 = d7s;
        this.A05 = new ArrayList(Arrays.asList(d6rArr));
    }

    public final D6N AAq(C29791DAa dAa, C29736D7a d7a) {
        D6N[] d6nArr = new D6N[this.A06.length];
        for (int i = 0; i < d6nArr.length; i++) {
            d6nArr[i] = this.A06[i].AAq(dAa, d7a);
        }
        return new C29711D5x(this.A04, d6nArr);
    }

    public final void Ap2() {
        C29765D8s d8s = this.A02;
        if (d8s == null) {
            super.Ap2();
            return;
        }
        throw d8s;
    }

    public final void BaS(D6N d6n) {
        C29711D5x d5x = (C29711D5x) d6n;
        int i = 0;
        while (true) {
            D6R[] d6rArr = this.A06;
            if (i < d6rArr.length) {
                d6rArr[i].BaS(d5x.A04[i]);
                i++;
            } else {
                return;
            }
        }
    }

    public final void A06() {
        super.A06();
        this.A01 = null;
        this.A03 = null;
        this.A00 = -1;
        this.A02 = null;
        this.A05.clear();
        Collections.addAll(this.A05, this.A06);
    }

    public final void A07(D3B d3b, boolean z) {
        super.A07(d3b, z);
        int i = 0;
        while (true) {
            D6R[] d6rArr = this.A06;
            if (i < d6rArr.length) {
                Integer valueOf = Integer.valueOf(i);
                D6R d6r = d6rArr[i];
                D6U.A02(!this.A02.containsKey(valueOf));
                C29747D7t d7t = new C29747D7t(this, valueOf);
                D6H d6h = new D6H(this, valueOf);
                this.A02.put(valueOf, new C29740D7g(d6r, d7t, d6h));
                d6r.A32(this.A00, d6h);
                d6r.BY7(this.A01, false, d7t);
                i++;
            } else {
                return;
            }
        }
    }
}
