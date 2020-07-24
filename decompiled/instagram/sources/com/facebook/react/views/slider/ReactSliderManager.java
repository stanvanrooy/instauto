package com.facebook.react.views.slider;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.widget.SeekBar;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import java.util.Map;
import p000X.A0c;
import p000X.A0h;
import p000X.A11;
import p000X.A15;
import p000X.A18;
import p000X.A5P;
import p000X.A8M;
import p000X.AnonymousClass1E1;
import p000X.AnonymousClass951;
import p000X.C228209rw;
import p000X.C230049z6;
import p000X.C230299zk;
import p000X.C23043A0y;
import p000X.C23053A3d;

public class ReactSliderManager extends SimpleViewManager {
    public static final SeekBar.OnSeekBarChangeListener ON_CHANGE_LISTENER = new C228209rw();
    public static final String REACT_CLASS = "RCTSlider";
    public static final int STYLE = 16842875;
    public static A11 sAccessibilityDelegate = new A11();
    public final A0h mDelegate = new A18(this);

    public class ReactSliderShadowNode extends LayoutShadowNode implements A5P {
        public int A00;
        public int A01;
        public boolean A02;

        public final long Ap5(A8M a8m, float f, C230049z6 r6, float f2, C230049z6 r8) {
            if (!this.A02) {
                A15 a15 = new A15(AY1());
                a15.A02();
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(-2, 0);
                a15.measure(makeMeasureSpec, makeMeasureSpec);
                this.A01 = a15.getMeasuredWidth();
                this.A00 = a15.getMeasuredHeight();
                this.A02 = true;
            }
            return A0c.A00((float) this.A01, (float) this.A00);
        }

        public ReactSliderShadowNode() {
            this.A05.setMeasureFunction(this);
        }
    }

    public String getName() {
        return REACT_CLASS;
    }

    public void setDisabled(A15 a15, boolean z) {
    }

    public void setMaximumTrackImage(A15 a15, C23043A0y a0y) {
    }

    public void setMinimumTrackImage(A15 a15, C23043A0y a0y) {
    }

    public void setThumbImage(A15 a15, C23043A0y a0y) {
    }

    public void setTrackImage(A15 a15, C23043A0y a0y) {
    }

    public Map getExportedCustomDirectEventTypeConstants() {
        return C230299zk.A00("topSlidingComplete", C230299zk.A00("registrationName", "onSlidingComplete"));
    }

    public long measure(Context context, C23043A0y a0y, C23043A0y a0y2, C23043A0y a0y3, float f, C230049z6 r10, float f2, C230049z6 r12, float[] fArr) {
        A15 a15 = new A15(context);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(-2, 0);
        a15.measure(makeMeasureSpec, makeMeasureSpec);
        return A0c.A00(((float) a15.getMeasuredWidth()) / AnonymousClass951.A01.density, ((float) a15.getMeasuredHeight()) / AnonymousClass951.A01.density);
    }

    public A0h getDelegate() {
        return this.mDelegate;
    }

    public Class getShadowNodeClass() {
        return ReactSliderShadowNode.class;
    }

    public void addEventEmitters(C23053A3d a3d, A15 a15) {
        a15.setOnSeekBarChangeListener(ON_CHANGE_LISTENER);
    }

    public LayoutShadowNode createShadowNodeInstance() {
        return new ReactSliderShadowNode();
    }

    public A15 createViewInstance(C23053A3d a3d) {
        A15 a15 = new A15(a3d);
        AnonymousClass1E1.A0b(a15, sAccessibilityDelegate);
        return a15;
    }

    public /* bridge */ /* synthetic */ void setDisabled(View view, boolean z) {
    }

    @ReactProp(defaultBoolean = true, name = "enabled")
    public void setEnabled(A15 a15, boolean z) {
        a15.setEnabled(z);
    }

    @ReactProp(defaultBoolean = true, name = "enabled")
    public /* bridge */ /* synthetic */ void setEnabled(View view, boolean z) {
        ((A15) view).setEnabled(z);
    }

    public /* bridge */ /* synthetic */ void setMaximumTrackImage(View view, C23043A0y a0y) {
    }

    @ReactProp(customType = "Color", name = "maximumTrackTintColor")
    public void setMaximumTrackTintColor(A15 a15, Integer num) {
        Drawable findDrawableByLayerId = ((LayerDrawable) a15.getProgressDrawable().getCurrent()).findDrawableByLayerId(16908288);
        if (num == null) {
            findDrawableByLayerId.clearColorFilter();
        } else {
            findDrawableByLayerId.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    @ReactProp(defaultDouble = 1.0d, name = "maximumValue")
    public void setMaximumValue(A15 a15, double d) {
        a15.setMaxValue(d);
    }

    @ReactProp(defaultDouble = 1.0d, name = "maximumValue")
    public /* bridge */ /* synthetic */ void setMaximumValue(View view, double d) {
        ((A15) view).setMaxValue(d);
    }

    public /* bridge */ /* synthetic */ void setMinimumTrackImage(View view, C23043A0y a0y) {
    }

    @ReactProp(customType = "Color", name = "minimumTrackTintColor")
    public void setMinimumTrackTintColor(A15 a15, Integer num) {
        Drawable findDrawableByLayerId = ((LayerDrawable) a15.getProgressDrawable().getCurrent()).findDrawableByLayerId(16908301);
        if (num == null) {
            findDrawableByLayerId.clearColorFilter();
        } else {
            findDrawableByLayerId.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    @ReactProp(defaultDouble = 0.0d, name = "minimumValue")
    public void setMinimumValue(A15 a15, double d) {
        a15.setMinValue(d);
    }

    @ReactProp(defaultDouble = 0.0d, name = "minimumValue")
    public /* bridge */ /* synthetic */ void setMinimumValue(View view, double d) {
        ((A15) view).setMinValue(d);
    }

    @ReactProp(defaultDouble = 0.0d, name = "step")
    public void setStep(A15 a15, double d) {
        a15.setStep(d);
    }

    @ReactProp(defaultDouble = 0.0d, name = "step")
    public /* bridge */ /* synthetic */ void setStep(View view, double d) {
        ((A15) view).setStep(d);
    }

    public void setTestID(A15 a15, String str) {
        super.setTestId(a15, str);
    }

    public /* bridge */ /* synthetic */ void setTestID(View view, String str) {
        super.setTestId((A15) view, str);
    }

    public /* bridge */ /* synthetic */ void setThumbImage(View view, C23043A0y a0y) {
    }

    @ReactProp(customType = "Color", name = "thumbTintColor")
    public void setThumbTintColor(A15 a15, Integer num) {
        if (num == null) {
            a15.getThumb().clearColorFilter();
        } else {
            a15.getThumb().setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    public /* bridge */ /* synthetic */ void setTrackImage(View view, C23043A0y a0y) {
    }

    @ReactProp(defaultDouble = 0.0d, name = "value")
    public void setValue(A15 a15, double d) {
        a15.setOnSeekBarChangeListener((SeekBar.OnSeekBarChangeListener) null);
        a15.setValue(d);
        a15.setOnSeekBarChangeListener(ON_CHANGE_LISTENER);
    }
}
