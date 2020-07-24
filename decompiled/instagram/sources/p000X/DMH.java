package p000X;

import android.graphics.PointF;
import com.instagram.p009ui.widget.drawing.common.Point2;

/* renamed from: X.DMH */
public final class DMH {
    public Point2 A00;
    public Point2 A01;
    public final DME A02 = new DME();
    public final long A03;
    public final Point2 A04 = new Point2();

    public final void A00(PointF pointF, long j) {
        if (j >= this.A03) {
            Point2 point2 = this.A00;
            Point2 point22 = this.A01;
            if (point2 == point22) {
                this.A00 = new Point2(pointF);
                return;
            }
            Point2 point23 = this.A04;
            float f = pointF.x - point22.x;
            point23.x = f;
            float f2 = pointF.y - point22.y;
            point23.y = f2;
            point23.x = f * 0.5f;
            point23.y = f2 * 0.5f;
            this.A02.A01(point2, point23, (float) j);
            this.A01.set(this.A00);
            this.A00.set(pointF);
            return;
        }
        throw new IllegalStateException("events must deliver in order");
    }

    public DMH(PointF pointF, long j) {
        Point2 point2 = new Point2(pointF);
        this.A00 = point2;
        this.A01 = point2;
        this.A03 = j;
        this.A02.A01(point2, this.A04, (float) j);
    }
}
