package p000X;

import android.util.SparseArray;
import java.util.ArrayList;

/* renamed from: X.1Yp  reason: invalid class name and case insensitive filesystem */
public final class C31521Yp {
    public int A00 = 0;
    public SparseArray A01 = new SparseArray();

    public final void A01() {
        for (int i = 0; i < this.A01.size(); i++) {
            ((AnonymousClass1ZP) this.A01.valueAt(i)).A03.clear();
        }
    }

    public static AnonymousClass1ZP A00(C31521Yp r2, int i) {
        AnonymousClass1ZP r1 = (AnonymousClass1ZP) r2.A01.get(i);
        if (r1 != null) {
            return r1;
        }
        AnonymousClass1ZP r12 = new AnonymousClass1ZP();
        r2.A01.put(i, r12);
        return r12;
    }

    public final void A03(AnonymousClass1ZK r4) {
        int i = r4.mItemViewType;
        ArrayList arrayList = A00(this, i).A03;
        if (((AnonymousClass1ZP) this.A01.get(i)).A00 > arrayList.size()) {
            r4.resetInternal();
            arrayList.add(r4);
        }
    }

    public final void A02(int i, int i2) {
        AnonymousClass1ZP A002 = A00(this, i);
        A002.A00 = i2;
        ArrayList arrayList = A002.A03;
        while (arrayList.size() > i2) {
            arrayList.remove(arrayList.size() - 1);
        }
    }
}
