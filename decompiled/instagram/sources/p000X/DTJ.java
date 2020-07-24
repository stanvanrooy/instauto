package p000X;

import android.view.MotionEvent;

/* renamed from: X.DTJ */
public final class DTJ extends C38501lN implements C29831Rk {
    public final /* synthetic */ DTI A00;

    public final boolean BKu(C38511lO r2) {
        return true;
    }

    public DTJ(DTI dti) {
        this.A00 = dti;
    }

    public final void A01(MotionEvent motionEvent) {
        DTI dti = this.A00;
        dti.A02.BNW(dti.A04, dti.A05, dti.A00, dti.A03);
    }

    public final boolean BKx(C38511lO r9) {
        this.A00.A05.A0M(true);
        DTI dti = this.A00;
        dti.A02.Ax3(r9, dti.A04, dti.A05, dti.A00, dti.A03);
        return true;
    }

    public final void BL0(C38511lO r3) {
        this.A00.A05.A0M(false);
    }

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        DTI dti = this.A00;
        dti.A02.B0Y(dti.A04, dti.A05, dti.A00, dti.A03);
        return true;
    }
}
