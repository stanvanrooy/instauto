package p000X;

import android.view.MotionEvent;

/* renamed from: X.1wF  reason: invalid class name and case insensitive filesystem */
public final class C44491wF extends C38501lN implements C29831Rk {
    public final /* synthetic */ C44481wE A00;

    public final boolean BKu(C38511lO r2) {
        return true;
    }

    public C44491wF(C44481wE r1) {
        this.A00 = r1;
    }

    public final void A01(MotionEvent motionEvent) {
        C44481wE r0 = this.A00;
        r0.A02.BNb(r0.A04, r0.A05, r0.A00, r0.A03);
    }

    public final boolean BKx(C38511lO r9) {
        this.A00.A05.A0M(true);
        C44481wE r0 = this.A00;
        r0.A02.BKw(r9, r0.A04, r0.A05, r0.A00, r0.A03.A03);
        return true;
    }

    public final void BL0(C38511lO r3) {
        this.A00.A05.A0M(false);
    }

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        C44481wE r0 = this.A00;
        r0.A02.B0b(r0.A04, r0.A05, r0.A00, r0.A03);
        return true;
    }
}
