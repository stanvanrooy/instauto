package p000X;

import android.util.SparseArray;

/* renamed from: X.0bD  reason: invalid class name and case insensitive filesystem */
public final class C09320bD implements AnonymousClass0GE {
    public int[] A00;
    public final SparseArray A01;

    public C09320bD(SparseArray sparseArray) {
        this.A01 = sparseArray;
        if (sparseArray.size() > 0) {
            this.A00 = new int[this.A01.size()];
            for (int i = 0; i < this.A01.size(); i++) {
                this.A00[i] = this.A01.keyAt(i);
            }
        }
    }
}
