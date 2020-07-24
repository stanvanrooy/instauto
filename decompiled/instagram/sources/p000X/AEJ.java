package p000X;

import java.util.Comparator;

/* renamed from: X.AEJ */
public final class AEJ implements Comparator {
    public final int compare(Object obj, Object obj2) {
        AEI aei = (AEI) obj;
        AEI aei2 = (AEI) obj2;
        if (!(aei == null && aei2 == null)) {
            if (aei == null) {
                return -1;
            }
            if (aei2 == null) {
                return 1;
            }
            if (!aei.equals(aei2)) {
                C24309Ala ala = aei.A02;
                C24309Ala ala2 = aei2.A02;
                if (ala == ala2) {
                    return (int) (aei.A01 - aei2.A01);
                }
                return ala.A00 - ala2.A00;
            }
        }
        return 0;
    }
}
