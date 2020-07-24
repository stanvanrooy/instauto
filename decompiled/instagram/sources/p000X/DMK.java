package p000X;

import android.graphics.PointF;
import android.view.MotionEvent;
import com.instagram.p009ui.widget.drawing.common.Point2;

/* renamed from: X.DMK */
public final class DMK {
    public long A00;
    public PointF A01;

    public DMK(MotionEvent motionEvent) {
        Point2 point2 = new Point2();
        this.A01 = point2;
        point2.set(motionEvent.getX(), motionEvent.getY());
        this.A00 = motionEvent.getEventTime();
        motionEvent.getPressure();
        motionEvent.getSize();
    }

    public DMK(MotionEvent motionEvent, int i) {
        Point2 point2 = new Point2();
        this.A01 = point2;
        point2.set(motionEvent.getHistoricalX(i), motionEvent.getHistoricalY(i));
        this.A00 = motionEvent.getHistoricalEventTime(i);
        motionEvent.getHistoricalSize(i);
        motionEvent.getHistoricalPressure(i);
    }
}
