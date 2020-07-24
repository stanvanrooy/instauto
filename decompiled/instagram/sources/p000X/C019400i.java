package p000X;

import android.util.SparseArray;

/* renamed from: X.00i  reason: invalid class name and case insensitive filesystem */
public final class C019400i extends C035307i {
    public static final C019800m A03 = new C019800m();
    public boolean A00;
    public final SparseArray A01 = new SparseArray();
    public final C019800m A02 = new C019800m();

    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    public final boolean equals(Object obj) {
        boolean z;
        if (this != obj) {
            int i = 0;
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C019400i r7 = (C019400i) obj;
            if (this.A00 != r7.A00 || !this.A02.equals(r7.A02)) {
                return false;
            }
            SparseArray sparseArray = this.A01;
            SparseArray sparseArray2 = r7.A01;
            if (sparseArray != sparseArray2) {
                if (sparseArray != null && sparseArray2 != null && sparseArray.size() == sparseArray2.size()) {
                    while (true) {
                        if (i >= sparseArray.size()) {
                            break;
                        }
                        int keyAt = sparseArray.keyAt(i);
                        if (!sparseArray.get(keyAt).equals(sparseArray2.get(keyAt))) {
                            break;
                        }
                        i++;
                    }
                }
                z = false;
                return !z;
            }
            z = true;
            if (!z) {
            }
        }
    }

    public final /* bridge */ /* synthetic */ C035307i A01(C035307i r1) {
        A04((C019400i) r1);
        return this;
    }

    public final /* bridge */ /* synthetic */ C035307i A02(C035307i r5, C035307i r6) {
        C019400i r52 = (C019400i) r5;
        C019400i r62 = (C019400i) r6;
        if (r62 == null) {
            r62 = new C019400i(this.A00);
        }
        if (r52 == null) {
            r62.A04(this);
        } else {
            this.A02.A02(r52.A02, r62.A02);
            if (r62.A00) {
                A00(-1, this.A01, r52.A01, r62.A01);
                return r62;
            }
        }
        return r62;
    }

    public final /* bridge */ /* synthetic */ C035307i A03(C035307i r5, C035307i r6) {
        C019400i r52 = (C019400i) r5;
        C019400i r62 = (C019400i) r6;
        if (r62 == null) {
            r62 = new C019400i(this.A00);
        }
        if (r52 == null) {
            r62.A04(this);
        } else {
            this.A02.A03(r52.A02, r62.A02);
            if (r62.A00) {
                A00(1, this.A01, r52.A01, r62.A01);
                return r62;
            }
        }
        return r62;
    }

    public final void A04(C019400i r6) {
        this.A02.A06(r6.A02);
        if (this.A00 && r6.A00) {
            this.A01.clear();
            int size = r6.A01.size();
            for (int i = 0; i < size; i++) {
                this.A01.put(r6.A01.keyAt(i), r6.A01.valueAt(i));
            }
        }
    }

    public final int hashCode() {
        return ((((this.A00 ? 1 : 0) * true) + this.A02.hashCode()) * 31) + this.A01.hashCode();
    }

    public final String toString() {
        return "SensorMetrics{isAttributionEnabled=" + this.A00 + ", total=" + this.A02 + ", sensorConsumption=" + this.A01 + '}';
    }

    public C019400i(boolean z) {
        this.A00 = z;
    }

    public static void A00(int i, SparseArray sparseArray, SparseArray sparseArray2, SparseArray sparseArray3) {
        C019800m r2;
        C035307i A022;
        C035307i A023;
        sparseArray3.clear();
        int size = sparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            int keyAt = sparseArray.keyAt(i2);
            if (i > 0) {
                A023 = ((C019800m) sparseArray.valueAt(i2)).A03((C035307i) sparseArray2.get(keyAt, A03), (C035307i) null);
            } else {
                A023 = ((C019800m) sparseArray.valueAt(i2)).A02((C035307i) sparseArray2.get(keyAt, A03), (C035307i) null);
            }
            C019800m r1 = (C019800m) A023;
            if (!A03.equals(r1)) {
                sparseArray3.put(keyAt, r1);
            }
        }
        int size2 = sparseArray2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            int keyAt2 = sparseArray2.keyAt(i3);
            if (sparseArray.get(keyAt2) == null) {
                if (i > 0) {
                    r2 = A03;
                    A022 = r2.A03((C035307i) sparseArray2.valueAt(i3), (C035307i) null);
                } else {
                    r2 = A03;
                    A022 = r2.A02((C035307i) sparseArray2.valueAt(i3), (C035307i) null);
                }
                C019800m r12 = (C019800m) A022;
                if (!r2.equals(r12)) {
                    sparseArray3.put(keyAt2, r12);
                }
            }
        }
    }
}
