package p000X;

import java.util.List;

/* renamed from: X.1xH  reason: invalid class name and case insensitive filesystem */
public final class C45091xH extends C45011x8 {
    public final String toString() {
        return "mediatek";
    }

    public final void A00(int i, List list) {
        int max;
        int i2;
        if (i >= 0 && i <= 100) {
            double d = ((double) i) / 100.0d;
            int i3 = 800;
            if (i >= 50) {
                i3 = 1000;
            }
            C12290gV r4 = this.A00;
            if (r4.A07) {
                int max2 = Math.max(r4.A01(d), i3);
                max = Math.max(r4.A03(d), i3);
                list.add(Integer.valueOf(r4.A00));
                list.add(Integer.valueOf(max2 * 1000));
                i2 = this.A00.A03;
            } else {
                max = Math.max(r4.A02(d), i3);
                i2 = r4.A02;
            }
            list.add(Integer.valueOf(i2));
            list.add(Integer.valueOf(max * 1000));
        }
    }

    public C45091xH(C12290gV r1) {
        super(r1);
    }
}
