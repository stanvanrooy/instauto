package p000X;

import android.view.MotionEvent;

/* renamed from: X.DTH */
public final class DTH extends C38501lN {
    public final /* synthetic */ DTG A00;

    public DTH(DTG dtg) {
        this.A00 = dtg;
    }

    public final void A01(MotionEvent motionEvent) {
        DTG dtg = this.A00;
        dtg.A06.BNX(dtg.A08, dtg.A09, dtg.A01, dtg.A07);
    }

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        DTG dtg = this.A00;
        dtg.A06.B0Z(dtg.A08, dtg.A09, dtg.A00, dtg.A05);
        return true;
    }
}
