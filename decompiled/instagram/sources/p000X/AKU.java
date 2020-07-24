package p000X;

import java.util.Set;

/* renamed from: X.AKU */
public abstract class AKU {
    public int A00() {
        return !(this instanceof C23499AOv) ? ((C23498AOu) this).A00.A02() : ((C23499AOv) this).A00.A0A.A02();
    }

    public Integer A01() {
        return !(this instanceof C23499AOv) ? Constants.ZERO : Constants.ONE;
    }

    public void A03(Set set, Integer num) {
        if (!(this instanceof C23499AOv)) {
            ((C23498AOu) this).A00.A0A(set, num);
        }
    }

    public boolean A06(int i) {
        if (this instanceof C23499AOv) {
            return false;
        }
        C23815Abj abj = ((C23498AOu) this).A00;
        return abj.A09.size() + abj.A08().size() <= 1 - i && !abj.A02;
    }

    public boolean A04() {
        if ((this instanceof C23499AOv) || A00() > 1) {
            return true;
        }
        return false;
    }

    public final boolean A05() {
        if (A01() == Constants.ZERO) {
            return true;
        }
        return false;
    }

    public Integer A02(AnonymousClass0C1 r2) {
        return Constants.ONE;
    }
}
