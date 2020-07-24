package p000X;

import java.util.Map;

/* renamed from: X.CEU */
public final class CEU implements C51742Ly {
    public final /* synthetic */ CEO A00;
    public final /* synthetic */ boolean A01;

    public CEU(CEO ceo, boolean z) {
        this.A00 = ceo;
        this.A01 = z;
    }

    public final void BE9(Map map) {
        if (AnonymousClass2WY.GRANTED == map.get("android.permission.ACCESS_FINE_LOCATION")) {
            CDY cdy = this.A00.A00;
            CFS cfs = cdy.A03.A07;
            cfs.A03 = Boolean.valueOf(this.A01);
            cdy.A05.setChecked(cfs.A00());
            CDY.A02(this.A00.A00);
            CDY cdy2 = this.A00.A00;
            CDY.A03(cdy2, CDY.A00(cdy2));
            CDY.A01(this.A00.A00);
        }
    }
}
