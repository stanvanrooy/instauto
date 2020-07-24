package com.instagram.p009ui.widget.drawing.common;

import android.graphics.PointF;
import com.facebook.react.uimanager.BaseViewManager;

/* renamed from: com.instagram.ui.widget.drawing.common.Point2 */
public class Point2 extends PointF {
    public final float A00(PointF pointF) {
        float f = this.x - pointF.x;
        float f2 = this.y - pointF.y;
        return (float) Math.sqrt((double) ((f * f) + (f2 * f2)));
    }

    public Point2() {
        super(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
    }

    public Point2(float f, float f2) {
        super(f, f2);
    }

    public Point2(PointF pointF) {
        super(pointF.x, pointF.y);
    }
}
