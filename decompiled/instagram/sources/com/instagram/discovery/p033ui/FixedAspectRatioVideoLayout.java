package com.instagram.discovery.p033ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.p009ui.simplevideolayout.SimpleVideoLayout;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0a4;
import p000X.C39121mO;
import p000X.C39131mP;
import p000X.C71753Ca;

/* renamed from: com.instagram.discovery.ui.FixedAspectRatioVideoLayout */
public class FixedAspectRatioVideoLayout extends SimpleVideoLayout {
    public float A00;
    public C71753Ca A01;

    public void setAspectRatio(float f) {
        boolean z = false;
        if (f > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            z = true;
        }
        AnonymousClass0a4.A0B(z, "aspect ratio shall be > 0");
        this.A00 = f;
    }

    public final void onMeasure(int i, int i2) {
        C39131mP A012 = C39121mO.A01(i, i2, this.A00, true);
        super.onMeasure(A012.A01, A012.A00);
    }

    public void setEnableTouchOverlay(boolean z) {
        this.A01.A00 = z;
    }

    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.A01.A00(canvas);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int A05 = AnonymousClass0Z0.A05(818847099);
        C71753Ca r1 = this.A01;
        if (r1.A00) {
            r1.A02.A02(motionEvent);
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        AnonymousClass0Z0.A0C(-228208669, A05);
        return onTouchEvent;
    }

    public FixedAspectRatioVideoLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public FixedAspectRatioVideoLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FixedAspectRatioVideoLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A00 = 1.0f;
        this.A01 = new C71753Ca(this);
        setWillNotDraw(false);
    }
}
