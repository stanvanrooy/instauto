package p000X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.CWY */
public final class CWY implements GestureDetector.OnGestureListener {
    public float A00;
    public float A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final GestureDetector A05;
    public final List A06 = new ArrayList();
    public final List A07 = new ArrayList();
    public final int A08;

    public final boolean onDown(MotionEvent motionEvent) {
        this.A00 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        this.A01 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        this.A02 = false;
        this.A04 = false;
        return false;
    }

    public final void onLongPress(MotionEvent motionEvent) {
    }

    public final void onShowPress(MotionEvent motionEvent) {
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.A01 = f2;
        return this.A04;
    }

    public CWY(Context context) {
        GestureDetector gestureDetector = new GestureDetector(context, this);
        this.A05 = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        this.A08 = ViewConfiguration.get(context).getScaledPagingTouchSlop();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003f, code lost:
        if (r5 <= com.facebook.react.uimanager.BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0048, code lost:
        if (r5 >= com.facebook.react.uimanager.BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) goto L_0x004a;
     */
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        int i;
        float rawY = motionEvent2.getRawY() - motionEvent.getRawY();
        if (this.A04) {
            this.A00 = rawY;
            for (C27914CWc B12 : this.A06) {
                B12.B12(this, rawY);
            }
            return true;
        } else if (this.A02) {
            if (!this.A03) {
                float f3 = (float) this.A08;
                float abs = Math.abs(rawY);
                if (f3 < abs) {
                    i = 2;
                }
                if (f3 < abs) {
                    i = 1;
                }
                i = 0;
                for (C27914CWc cWc : this.A07) {
                    if (cWc.B1I(this, rawY, i)) {
                        this.A04 = true;
                        this.A06.add(cWc);
                    }
                }
            }
            return this.A04;
        } else {
            this.A02 = true;
            return false;
        }
    }
}
