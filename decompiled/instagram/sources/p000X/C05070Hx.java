package p000X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.0Hx  reason: invalid class name and case insensitive filesystem */
public final class C05070Hx {
    public int A00;
    public int A01;
    public int[] A02 = new int[5];
    public long[] A03 = new long[5];
    public AnonymousClass0I7[] A04 = new AnonymousClass0I7[5];
    public AnonymousClass0SN[] A05 = new AnonymousClass0SN[5];
    public String[] A06 = new String[5];

    public final void A00(C05060Hw r12) {
        for (int i = 0; i < this.A01; i++) {
            r12.Btm(TimeUnit.NANOSECONDS.toMillis(this.A03[i]), this.A03[i], this.A02[i], this.A06[i], this.A04[i], this.A05[i]);
        }
    }
}
