package p000X;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: X.BIK */
public final class BIK implements C25437BKa, BEH {
    public BIG A00;
    public final int A01 = 11;
    public final C138525vP A02;

    public final void Ay8(int i) {
    }

    public final void A00(C138525vP r3) {
        if (this.A00.A0I()) {
            r3.Axj(this.A00);
            return;
        }
        this.A00.A0D(new C25434BJq(this, r3));
        this.A00.A0F(new BKD(this, r3));
        this.A00.A0A();
    }

    public final boolean A01() {
        if (this.A01 == 10) {
            return true;
        }
        return false;
    }

    public final void Ay0(Bundle bundle) {
        if (this.A01 == 11) {
            BIL.A00.AC0(this.A00);
        }
        this.A02.Axj(this.A00);
        this.A00.A0E(this);
    }

    public final void Ay4(ConnectionResult connectionResult) {
        this.A02.Axj((Object) null);
    }

    public BIK(C138525vP r2) {
        this.A02 = r2;
    }
}
