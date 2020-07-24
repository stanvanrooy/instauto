package p000X;

/* renamed from: X.CFO */
public final class CFO implements C44611wS {
    public final /* synthetic */ CDZ A00;

    public final void onPageScrollStateChanged(int i) {
    }

    public final void onPageScrolled(int i, float f, int i2) {
    }

    public CFO(CDZ cdz) {
        this.A00 = cdz;
    }

    public final void onPageSelected(int i) {
        CD3 cd3;
        C27398CBr cBr;
        String str;
        C06220Of.A0E(this.A00.mView);
        if (i == 0) {
            cd3 = this.A00.A02;
            cBr = C27398CBr.LOCATIONS_SELECTION;
            str = "region_tab";
        } else if (i == 1) {
            cd3 = this.A00.A02;
            cBr = C27398CBr.LOCATIONS_SELECTION;
            str = "local_tab";
        } else {
            return;
        }
        CCZ.A07(cd3, cBr, str);
    }
}
