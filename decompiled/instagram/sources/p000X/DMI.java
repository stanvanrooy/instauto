package p000X;

import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.p009ui.widget.drawing.common.Point2;

/* renamed from: X.DMI */
public final class DMI implements DNS {
    public double A00;
    public DMH A01;
    public final float A02;
    public final float A03;
    public final Point2 A04 = new Point2();
    public final Point2 A05 = new Point2();
    public final Point2 A06 = new Point2();
    public final Point2 A07 = new Point2();

    public final void A00() {
        Point2 point2 = this.A04;
        Point2 point22 = this.A05;
        Point2 point23 = this.A06;
        float f = point22.x - point23.x;
        point2.x = f;
        float f2 = point22.y - point23.y;
        point2.y = f2;
        float f3 = this.A03;
        point2.x = f * f3;
        point2.y = f2 * f3;
        Point2 point24 = this.A07;
        float f4 = point24.x + point2.x;
        point24.x = f4;
        float f5 = point24.y + point2.y;
        point24.y = f5;
        float f6 = this.A02;
        point24.x = f4 * f6;
        point24.y = f5 * f6;
        point23.x += point24.x;
        point23.y += point24.y;
        double d = this.A00 + 8.0d;
        this.A00 = d;
        this.A01.A00(point23, (long) d);
    }

    public final void A9C(long j) {
        float A002 = this.A06.A00(this.A05);
        Point2 point2 = new Point2();
        float f = A002;
        while (A002 > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER && f > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            point2.set(this.A06);
            A00();
            f = this.A06.A00(point2);
            A002 -= f;
        }
    }

    public final DME AVx() {
        return this.A01.A02;
    }

    public final void Bhj(DMK dmk) {
        this.A05.set(dmk.A01);
        long j = dmk.A00;
        while (this.A00 + 8.0d < ((double) j)) {
            A00();
        }
    }

    public final void BpV(DMK dmk) {
        this.A01 = new DMH(dmk.A01, dmk.A00);
        this.A00 = (double) dmk.A00;
        this.A06.set(dmk.A01);
        this.A07.set(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
    }

    public DMI(float f, float f2) {
        this.A03 = f;
        this.A02 = f2;
    }
}
