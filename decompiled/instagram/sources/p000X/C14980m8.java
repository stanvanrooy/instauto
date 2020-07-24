package p000X;

import com.facebook.proxygen.RequestStats;

/* renamed from: X.0m8  reason: invalid class name and case insensitive filesystem */
public final class C14980m8 implements C14990m9, C15000mA {
    public static C14980m8 A01;
    public C15010mB A00 = new C15010mB();

    public final synchronized long AOk(C15920nk r3) {
        return this.A00.A00(r3);
    }

    public final synchronized void BJN(C15920nk r4, RequestStats requestStats, String str) {
        this.A00.A01(r4, requestStats.getFlowStats().mTimeToFirstByte);
    }
}
