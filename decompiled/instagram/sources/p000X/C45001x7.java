package p000X;

import java.util.List;

/* renamed from: X.1x7  reason: invalid class name and case insensitive filesystem */
public final class C45001x7 extends C45011x8 {
    public final boolean A00;
    public final boolean A01;

    public final void A00(int i, List list) {
        if (i >= 0 && i <= 100) {
            double d = ((double) i) / 100.0d;
            int i2 = 800;
            if (i >= 50) {
                i2 = 1000;
            }
            boolean z = false;
            if (i >= 50) {
                z = true;
            }
            boolean z2 = false;
            if (i >= 50) {
                z2 = true;
            }
            C12290gV r1 = this.A00;
            int max = Math.max(r1.A01(d), i2);
            int max2 = Math.max(r1.A03(d), i2);
            if (this.A00 && max > 1100) {
                max = 1100;
            }
            list.add(1086324736);
            list.add(1);
            if (z) {
                list.add(1090519040);
                list.add(Integer.valueOf(this.A00.A00));
            }
            if (z2) {
                list.add(1077936128);
                list.add(1);
            }
            list.add(1082130432);
            list.add(Integer.valueOf(max));
            list.add(1082130688);
            list.add(Integer.valueOf(max2));
            C12290gV r12 = this.A00;
            if (r12.A08) {
                int[] iArr = r12.A0D;
                int i3 = iArr[1];
                int i4 = iArr[0];
                int max3 = Math.max((i4 + ((int) (((double) (i3 - i4)) * d))) / 1000, i2);
                if (this.A00 && max3 > 1100) {
                    max3 = 1100;
                }
                list.add(1082130944);
                list.add(Integer.valueOf(max3));
            }
        }
    }

    public final String toString() {
        if (this.A01) {
            return "snapdragon_v3_auto";
        }
        return "snapdragon_v3";
    }

    public C45001x7(C12290gV r1, boolean z, boolean z2) {
        super(r1);
        this.A01 = z;
        this.A00 = z2;
    }

    public final void A01(int i, List list) {
        list.add(1115701248);
        list.add(1);
    }
}
