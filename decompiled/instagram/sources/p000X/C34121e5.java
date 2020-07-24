package p000X;

import android.content.Context;
import android.view.MotionEvent;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.1e5  reason: invalid class name and case insensitive filesystem */
public final class C34121e5 {
    public float A00;

    public final Integer A00(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2, boolean z) {
        if (!(z || motionEvent == null || motionEvent2 == null)) {
            float abs = Math.abs(f2);
            float abs2 = Math.abs(f);
            if (abs > abs2) {
                if (motionEvent2.getRawY() - motionEvent.getRawY() < BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                    return Constants.A0C;
                }
                if (motionEvent.getY() > this.A00) {
                    return Constants.A0N;
                }
            } else if (abs2 > abs) {
                float rawX = motionEvent2.getRawX() - motionEvent.getRawX();
                if (rawX < BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                    return Constants.ZERO;
                }
                if (rawX > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
                    return Constants.ONE;
                }
            }
        }
        return Constants.A0Y;
    }

    public C34121e5(Context context) {
        this.A00 = C06220Of.A03(context, 5);
    }

    public final boolean A01(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2, boolean z, AnonymousClass2OG r8) {
        switch (A00(motionEvent, motionEvent2, f, f2, z).intValue()) {
            case 0:
                return r8.BQT();
            case 1:
                return r8.BQU();
            case 2:
                return r8.BQY(motionEvent, motionEvent2, f, f2);
            case 3:
                return r8.BQQ(motionEvent2.getRawY() - motionEvent.getRawY(), f2);
            default:
                return false;
        }
    }
}
