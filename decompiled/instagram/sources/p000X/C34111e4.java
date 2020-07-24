package p000X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.instagram.reels.viewer.common.ReelViewGroup;

/* renamed from: X.1e4  reason: invalid class name and case insensitive filesystem */
public final class C34111e4 implements GestureDetector.OnGestureListener {
    public final /* synthetic */ ReelViewGroup A00;

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    public final void onShowPress(MotionEvent motionEvent) {
    }

    public C34111e4(ReelViewGroup reelViewGroup) {
        this.A00 = reelViewGroup;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        this.A00.A05.B0g(motionEvent.getX());
        return true;
    }

    public final void onLongPress(MotionEvent motionEvent) {
        this.A00.A05.BA3(motionEvent.getX(), motionEvent.getY());
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        int width = this.A00.getWidth();
        int i = this.A00.A01;
        float f = (float) (width - i);
        if (motionEvent.getX() > ((float) i) && motionEvent.getX() < f) {
            C34151eA r6 = null;
            for (C34151eA r7 : this.A00.A09) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                C66582vi.A02(r7, this.A00.getWidth(), this.A00.A04.getHeight(), this.A00.A00, C66582vi.A00);
                if (C66582vi.A03(r7, x, y)) {
                    float x2 = motionEvent.getX();
                    float y2 = motionEvent.getY();
                    C66582vi.A02(r7, this.A00.getWidth(), this.A00.A04.getHeight(), this.A00.A00, C66582vi.A00);
                    if (C66582vi.A03(r7, x2, y2) && ReelViewGroup.A00(this.A00, r7)) {
                        return true;
                    }
                    if (r6 == null) {
                        r6 = r7;
                    }
                }
            }
            if (r6 != null && ReelViewGroup.A00(this.A00, r6)) {
                return true;
            }
        }
        this.A00.A05.BQz(motionEvent.getX(), motionEvent.getY());
        return true;
    }
}
