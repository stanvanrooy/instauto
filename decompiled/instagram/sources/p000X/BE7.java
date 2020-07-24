package p000X;

import android.util.SparseArray;

/* renamed from: X.BE7 */
public final class BE7 extends BE9 {
    public final SparseArray A00 = new SparseArray();

    public static final BE8 A00(BE7 be7, int i) {
        if (be7.A00.size() <= i) {
            return null;
        }
        SparseArray sparseArray = be7.A00;
        return (BE8) sparseArray.get(sparseArray.keyAt(i));
    }

    public BE7(BED bed) {
        super(bed);
        this.A00.A2k("AutoManageHelper", this);
    }

    public final void A05() {
        super.A05();
        String.valueOf(this.A00);
        if (this.A02.get() == null) {
            for (int i = 0; i < this.A00.size(); i++) {
                BE8 A002 = A00(this, i);
                if (A002 != null) {
                    A002.A02.A0A();
                }
            }
        }
    }

    public final void A06() {
        super.A06();
        for (int i = 0; i < this.A00.size(); i++) {
            BE8 A002 = A00(this, i);
            if (A002 != null) {
                A002.A02.A0B();
            }
        }
    }
}
