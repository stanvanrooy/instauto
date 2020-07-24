package p000X;

/* renamed from: X.BU4 */
public class BU4 {
    public BU7[] A00;
    public volatile int _size = 0;

    private final void A00(int i, int i2) {
        BU7[] bu7Arr = this.A00;
        if (bu7Arr == null) {
            C13150hy.A00();
        }
        BU7 bu7 = bu7Arr[i2];
        if (bu7 == null) {
            C13150hy.A00();
        }
        BU7 bu72 = bu7Arr[i];
        if (bu72 == null) {
            C13150hy.A00();
        }
        bu7Arr[i] = bu7;
        bu7Arr[i2] = bu72;
        bu7.Bi2(i);
        bu72.Bi2(i2);
    }

    public static final void A01(BU4 bu4, int i) {
        while (i > 0) {
            BU7[] bu7Arr = bu4.A00;
            if (bu7Arr == null) {
                C13150hy.A00();
            }
            int i2 = (i - 1) >> 1;
            BU7 bu7 = bu7Arr[i2];
            if (bu7 == null) {
                C13150hy.A00();
            }
            Comparable comparable = (Comparable) bu7;
            BU7 bu72 = bu7Arr[i];
            if (bu72 == null) {
                C13150hy.A00();
            }
            if (comparable.compareTo(bu72) > 0) {
                bu4.A00(i, i2);
                i = i2;
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0057, code lost:
        if (r8 != false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00b6, code lost:
        throw new java.lang.AssertionError();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000b, code lost:
        if (r0 != false) goto L_0x000d;
     */
    public final BU7 A02(int i) {
        boolean z = AnonymousClass2GE.A01;
        boolean z2 = false;
        if (z) {
            boolean z3 = false;
            if (this._size > 0) {
                z3 = true;
            }
        }
        BU7[] bu7Arr = this.A00;
        if (bu7Arr == null) {
            C13150hy.A00();
        }
        this._size--;
        if (i < this._size) {
            A00(i, this._size);
            int i2 = (i - 1) >> 1;
            if (i > 0) {
                BU7 bu7 = bu7Arr[i];
                if (bu7 == null) {
                    C13150hy.A00();
                }
                Comparable comparable = (Comparable) bu7;
                BU7 bu72 = bu7Arr[i2];
                if (bu72 == null) {
                    C13150hy.A00();
                }
                if (comparable.compareTo(bu72) < 0) {
                    A00(i, i2);
                    A01(this, i2);
                }
            }
            while (true) {
                int i3 = (i << 1) + 1;
                if (i3 < this._size) {
                    BU7[] bu7Arr2 = this.A00;
                    if (bu7Arr2 == null) {
                        C13150hy.A00();
                    }
                    int i4 = i3 + 1;
                    if (i4 < this._size) {
                        BU7 bu73 = bu7Arr2[i4];
                        if (bu73 == null) {
                            C13150hy.A00();
                        }
                        Comparable comparable2 = (Comparable) bu73;
                        BU7 bu74 = bu7Arr2[i3];
                        if (bu74 == null) {
                            C13150hy.A00();
                        }
                        if (comparable2.compareTo(bu74) < 0) {
                            i3 = i4;
                        }
                    }
                    BU7 bu75 = bu7Arr2[i];
                    if (bu75 == null) {
                        C13150hy.A00();
                    }
                    Comparable comparable3 = (Comparable) bu75;
                    BU7 bu76 = bu7Arr2[i3];
                    if (bu76 == null) {
                        C13150hy.A00();
                    }
                    if (comparable3.compareTo(bu76) <= 0) {
                        break;
                    }
                    A00(i, i3);
                    i = i3;
                } else {
                    break;
                }
            }
        }
        BU7 bu77 = bu7Arr[this._size];
        if (bu77 == null) {
            C13150hy.A00();
        }
        if (z) {
            if (bu77.AMo() == this) {
                z2 = true;
            }
        }
        bu77.Bhq((BU4) null);
        bu77.Bi2(-1);
        bu7Arr[this._size] = null;
        return bu77;
    }
}
