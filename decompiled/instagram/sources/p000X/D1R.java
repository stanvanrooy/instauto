package p000X;

import java.util.Collection;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.D1R */
public final class D1R {
    public int A00;
    public Integer A01 = Constants.ZERO;
    public final DCI A02;
    public final D1Z A03;
    public final C29262Cuo A04;
    public final D29 A05;
    public final C29614D1u A06;
    public final String A07;
    public final String A08;
    public final Collection A09;
    public final AtomicBoolean A0A;

    public final void A00(Integer num) {
        synchronized (this.A01) {
            if (this.A01 == Constants.ZERO) {
                this.A01 = num;
                this.A06.A01();
            }
        }
    }

    public D1R(C29614D1u d1u, Collection collection, AtomicBoolean atomicBoolean, C29262Cuo cuo, D29 d29, int i, String str, String str2, DCI dci, D1Z d1z) {
        this.A06 = d1u;
        this.A09 = collection;
        this.A0A = atomicBoolean;
        this.A04 = cuo;
        this.A05 = d29;
        this.A00 = i;
        this.A07 = str;
        this.A08 = str2;
        this.A02 = dci;
        this.A03 = d1z;
    }
}
