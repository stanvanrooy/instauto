package p000X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.D1P */
public final class D1P {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final long A06;
    public final long A07;
    public final long A08;
    public final long A09;
    public final long A0A;
    public final D1B A0B;
    public final String A0C;
    public final Map A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;

    public final String toString() {
        return this.A0C + ", " + this.A06 + ", " + this.A0F + ", " + this.A04 + ", " + this.A03 + ", " + this.A00 + ", " + this.A05 + ", " + this.A0H + ", " + this.A0E + ", " + this.A02 + ", " + this.A09 + ", " + this.A07 + ", " + this.A01;
    }

    public D1P() {
        this("", -1, false, -1, -1, -1, -1, false, false, -1, -1, new D1B(false), -1, false, -1, -1, -1, (Map) null);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public D1P(D1P d1p, int i, D1B d1b) {
        this(r17, r18, r20, r21, r22, r23, r24, r25, r26, i, r28, d1b, r31, r10.A0G, r10.A09, r10.A07, r10.A01, r10.A0D);
        D1P d1p2 = d1p;
        String str = d1p2.A0C;
        long j = d1p2.A06;
        boolean z = d1p2.A0F;
        int i2 = d1p2.A04;
        int i3 = d1p2.A03;
        int i4 = d1p2.A00;
        int i5 = d1p2.A05;
        boolean z2 = d1p2.A0H;
        boolean z3 = d1p2.A0E;
        long j2 = d1p2.A08;
        long j3 = d1p2.A0A;
        boolean z4 = z2;
        boolean z5 = z3;
        long j4 = j2;
        long j5 = j3;
        int i6 = i2;
        int i7 = i3;
        int i8 = i4;
        int i9 = i5;
        String str2 = str;
        long j6 = j;
    }

    public D1P(String str, long j, boolean z, int i, int i2, int i3, int i4, boolean z2, boolean z3, int i5, long j2, D1B d1b, long j3, boolean z4, long j4, long j5, int i6, Map map) {
        HashMap hashMap = new HashMap();
        this.A0D = hashMap;
        this.A0C = str;
        this.A06 = j;
        this.A0F = z;
        this.A04 = i;
        this.A03 = i2;
        this.A00 = i3;
        this.A05 = i4;
        this.A0H = z2;
        this.A0E = z3;
        this.A02 = i5;
        this.A08 = j2;
        this.A0B = d1b;
        this.A0A = j3;
        this.A0G = z4;
        this.A09 = j4;
        this.A07 = j5;
        this.A01 = i6;
        Map map2 = map;
        if (map != null) {
            hashMap.putAll(map2);
        }
    }
}
