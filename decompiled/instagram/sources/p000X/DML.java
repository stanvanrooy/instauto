package p000X;

import com.instagram.p009ui.widget.drawing.common.Point2;

/* renamed from: X.DML */
public final class DML implements DNS {
    public DMH A00;

    public final void A9C(long j) {
        DMH dmh = this.A00;
        Point2 point2 = dmh.A00;
        if (point2 != dmh.A01) {
            dmh.A00(point2, j);
            dmh.A01 = dmh.A00;
        }
    }

    public final DME AVx() {
        return this.A00.A02;
    }

    public final void Bhj(DMK dmk) {
        this.A00.A00(dmk.A01, dmk.A00);
    }

    public final void BpV(DMK dmk) {
        this.A00 = new DMH(dmk.A01, dmk.A00);
    }
}
