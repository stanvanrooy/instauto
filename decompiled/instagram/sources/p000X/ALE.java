package p000X;

import android.view.MotionEvent;
import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: X.ALE */
public final class ALE implements View.OnTouchListener {
    public final /* synthetic */ C23399AKy A00;

    public ALE(C23399AKy aKy) {
        this.A00 = aKy;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getY() >= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            return false;
        }
        C23399AKy aKy = this.A00;
        if (aKy.A01) {
            aKy.A00 = true;
            aKy.A03.dismiss();
        }
        return true;
    }
}
