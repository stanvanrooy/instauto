package p000X;

import android.view.MotionEvent;

/* renamed from: X.DTD */
public final class DTD extends C38501lN implements C29831Rk {
    public final /* synthetic */ DTC A00;

    public final boolean BKu(C38511lO r2) {
        return true;
    }

    public DTD(DTC dtc) {
        this.A00 = dtc;
    }

    public final void A01(MotionEvent motionEvent) {
        DTC dtc = this.A00;
        dtc.A02.BNc(dtc.A04, dtc.A05, dtc.A00, dtc.A03);
    }

    public final boolean BKx(C38511lO r9) {
        this.A00.A05.A0M(true);
        DTC dtc = this.A00;
        dtc.A02.BKw(r9, dtc.A04, dtc.A05, dtc.A00, dtc.A03.A01);
        return true;
    }

    public final void BL0(C38511lO r3) {
        this.A00.A05.A0M(false);
    }

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        DTC dtc = this.A00;
        dtc.A02.B0c(dtc.A04, dtc.A05, dtc.A00, dtc.A03);
        return true;
    }
}
