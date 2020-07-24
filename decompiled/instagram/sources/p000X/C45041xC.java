package p000X;

import java.util.List;

/* renamed from: X.1xC  reason: invalid class name and case insensitive filesystem */
public final class C45041xC extends C45011x8 {
    public final boolean A00;

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
            int max = Math.max(r1.A02(d), i2);
            int min = Math.min(r1.A02, AnonymousClass47U.A02.length);
            int i3 = (max - 1000) / 100;
            if (i3 < 0) {
                i3 = 0;
            }
            for (int i4 = 0; i4 < min; i4++) {
                list.add(Integer.valueOf(AnonymousClass47U.A02[i4] + i3));
            }
            list.add(7681);
            if (z) {
                list.add(15873);
            }
            if (z2) {
                list.add(1795);
            }
        }
    }

    public final String toString() {
        if (this.A00) {
            return "snapdragon_v2_auto";
        }
        return "snapdragon_v2";
    }

    public C45041xC(C12290gV r1, boolean z) {
        super(r1);
        this.A00 = z;
    }
}
