package p000X;

import java.util.List;

/* renamed from: X.AEH */
public final class AEH extends C46251zQ {
    public final /* synthetic */ AEG A00;
    public final /* synthetic */ List A01;
    public final /* synthetic */ List A02;

    public AEH(AEG aeg, List list, List list2) {
        this.A00 = aeg;
        this.A02 = list;
        this.A01 = list2;
    }

    public final int A00() {
        return this.A01.size();
    }

    public final int A01() {
        return this.A02.size();
    }

    public final boolean A03(int i, int i2) {
        AEI aei = (AEI) this.A02.get(i);
        AEI aei2 = (AEI) this.A01.get(i2);
        AnonymousClass0a4.A06(aei);
        AnonymousClass0a4.A06(aei2);
        if (!aei.equals(aei2) || !aei.A02.equals(aei2.A02)) {
            return false;
        }
        return true;
    }

    public final boolean A04(int i, int i2) {
        AEI aei = (AEI) this.A02.get(i);
        AEI aei2 = (AEI) this.A01.get(i2);
        AnonymousClass0a4.A06(aei);
        AnonymousClass0a4.A06(aei2);
        return aei.equals(aei2);
    }
}
