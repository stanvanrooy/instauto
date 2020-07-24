package p000X;

import java.util.Iterator;
import java.util.Set;

/* renamed from: X.COO */
public final class COO implements C27286C7a {
    public final /* synthetic */ COH A00;

    public COO(COH coh) {
        this.A00 = coh;
    }

    public final void BDu(C13300iJ r3) {
        this.A00.A08 = true;
    }

    public final void BDv(C13300iJ r3) {
        this.A00.A08 = true;
    }

    public final void BDw(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            BY6.A00(this.A00.A05, (C13300iJ) it.next(), COS.ADD);
        }
    }

    public final void BDx(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C13300iJ r3 = (C13300iJ) it.next();
            BY6.A00(this.A00.A05, r3, COS.REMOVE);
            COD cod = this.A00.A02;
            Iterator it2 = cod.A00.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (((C27706COa) it2.next()).A01.equals(r3)) {
                        it2.remove();
                        cod.A0J();
                        break;
                    }
                } else {
                    break;
                }
            }
        }
    }
}
