package p000X;

/* renamed from: X.CEO */
public final class CEO implements C79583dh {
    public final /* synthetic */ CDY A00;

    public final boolean BRj(boolean z) {
        if (!z || C16230oG.isLocationPermitted(this.A00.getContext())) {
            CDY cdy = this.A00;
            cdy.A03.A07.A03 = Boolean.valueOf(z);
            CDY.A02(cdy);
            CDY cdy2 = this.A00;
            CDY.A03(cdy2, CDY.A00(cdy2));
            CDY.A01(this.A00);
            return true;
        }
        C35251g3.A02(this.A00.getRootActivity(), new CEU(this, z), "android.permission.ACCESS_FINE_LOCATION");
        return false;
    }

    public CEO(CDY cdy) {
        this.A00 = cdy;
    }
}
