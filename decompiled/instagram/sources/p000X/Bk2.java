package p000X;

import android.util.SparseArray;

/* renamed from: X.Bk2 */
public abstract class Bk2 {
    public final int A00;
    public final C226579p4 A01 = new C226579p4();
    public final boolean A02;
    public final boolean A03;

    public boolean A01() {
        if (this instanceof C26463Blx) {
            C26463Blx blx = (C26463Blx) this;
            if (!blx.A03 || !blx.A02) {
                return true;
            }
            String str = (String) blx.A01.A02();
            C239512q A0I = blx.A00.iterator();
            while (A0I.hasNext()) {
                if (!((C181217oT) A0I.next()).A02(str)) {
                    return false;
                }
            }
            return true;
        } else if (!(this instanceof C26462Blv)) {
            return true;
        } else {
            C26462Blv blv = (C26462Blv) this;
            for (int i = 0; i < blv.A00.size(); i++) {
                if (!((Bk2) blv.A00.valueAt(i)).A01()) {
                    return false;
                }
            }
            return true;
        }
    }

    public SparseArray A00() {
        if (!(this instanceof C26462Blv)) {
            SparseArray sparseArray = new SparseArray();
            sparseArray.put(this.A00, this.A01.A02());
            return sparseArray;
        }
        Object A022 = ((C26462Blv) this).A01.A02();
        AnonymousClass0a4.A06(A022);
        return (SparseArray) A022;
    }

    public Bk2(int i, boolean z, boolean z2) {
        this.A00 = i;
        this.A03 = z;
        this.A02 = z2;
    }
}
