package p000X;

import android.os.Build;

/* renamed from: X.BNK */
public final class BNK {
    public final int A00;
    public final int A01;
    public final Object A02;

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
        if (r3 >= r1) goto L_0x0013;
     */
    public final boolean A00() {
        boolean z;
        int i;
        int i2;
        int i3 = this.A00;
        if (i3 > 0 && i3 < 9999 && (i2 = this.A01) > 0 && i2 < 10000) {
            z = true;
        }
        z = false;
        if (!z || (i = Build.VERSION.SDK_INT) < i3 || i >= this.A01) {
            return false;
        }
        return true;
    }

    public BNK(Object obj, int i, int i2) {
        this.A02 = obj;
        this.A00 = i;
        this.A01 = i2;
    }
}
