package com.instagram.creation.capture;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.uimanager.BaseViewManager;
import p000X.AnonymousClass0Z0;

public class RotateLayout extends ViewGroup {
    public int A00;
    public View A01;

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int i7 = this.A00;
        if (i7 != 0) {
            if (i7 != 90) {
                if (i7 != 180) {
                    if (i7 != 270) {
                        return;
                    }
                }
            }
            this.A01.layout(0, 0, i6, i5);
            return;
        }
        this.A01.layout(0, 0, i5, i6);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x001a  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004e  */
    public final void onMeasure(int i, int i2) {
        int measuredHeight;
        int i3;
        int i4 = this.A00;
        int i5 = 0;
        if (i4 != 0) {
            if (i4 != 90) {
                if (i4 != 180) {
                    if (i4 != 270) {
                        measuredHeight = 0;
                        setMeasuredDimension(i5, measuredHeight);
                        i3 = this.A00;
                        if (i3 != 0) {
                            if (i3 == 90) {
                                this.A01.setTranslationX(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                            } else if (i3 != 180) {
                                if (i3 == 270) {
                                    this.A01.setTranslationX((float) i5);
                                }
                                this.A01.setRotation((float) (-this.A00));
                            } else {
                                this.A01.setTranslationX((float) i5);
                            }
                            this.A01.setTranslationY((float) measuredHeight);
                            this.A01.setRotation((float) (-this.A00));
                        }
                        this.A01.setTranslationX(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                        this.A01.setTranslationY(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
                        this.A01.setRotation((float) (-this.A00));
                    }
                }
            }
            measureChild(this.A01, i2, i);
            i5 = this.A01.getMeasuredHeight();
            measuredHeight = this.A01.getMeasuredWidth();
            setMeasuredDimension(i5, measuredHeight);
            i3 = this.A00;
            if (i3 != 0) {
            }
            this.A01.setTranslationY(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            this.A01.setRotation((float) (-this.A00));
        }
        measureChild(this.A01, i, i2);
        i5 = this.A01.getMeasuredWidth();
        measuredHeight = this.A01.getMeasuredHeight();
        setMeasuredDimension(i5, measuredHeight);
        i3 = this.A00;
        if (i3 != 0) {
        }
        this.A01.setTranslationY(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        this.A01.setRotation((float) (-this.A00));
    }

    public void setOrientation(int i) {
        int i2 = i % 360;
        if (this.A00 != i2) {
            this.A00 = i2;
            requestLayout();
        }
    }

    public RotateLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackgroundResource(17170445);
    }

    public final void onFinishInflate() {
        int A06 = AnonymousClass0Z0.A06(-1651369656);
        View childAt = getChildAt(0);
        this.A01 = childAt;
        childAt.setPivotX(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        this.A01.setPivotY(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        AnonymousClass0Z0.A0D(-561552152, A06);
    }
}
