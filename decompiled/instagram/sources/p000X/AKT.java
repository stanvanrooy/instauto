package p000X;

import java.util.Comparator;

/* renamed from: X.AKT */
public final class AKT implements Comparator {
    public final /* synthetic */ AK9 A00;

    public AKT(AK9 ak9) {
        this.A00 = ak9;
    }

    public final int compare(Object obj, Object obj2) {
        int i;
        AKX akx = (AKX) obj;
        AKX akx2 = (AKX) obj2;
        long AJ6 = akx.AJ6() - akx2.AJ6();
        if (AJ6 != 0) {
            i = -1;
            if (AJ6 > 0) {
                return 1;
            }
        } else if (akx.AS8() == null || akx2.AS8() == null || (i = akx.AS8().compareTo(akx2.AS8())) == 0) {
            return akx.hashCode() - akx2.hashCode();
        }
        return i;
    }
}
