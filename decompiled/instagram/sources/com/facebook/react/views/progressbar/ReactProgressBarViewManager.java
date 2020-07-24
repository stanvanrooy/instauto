package com.facebook.react.views.progressbar;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import p000X.A0h;
import p000X.A0k;
import p000X.A6u;
import p000X.A71;
import p000X.AnonymousClass000;
import p000X.C23053A3d;

@ReactModule(name = "AndroidProgressBar")
public class ReactProgressBarViewManager extends BaseViewManager {
    public static final String DEFAULT_STYLE = "Normal";
    public static final String PROP_ANIMATING = "animating";
    public static final String PROP_INDETERMINATE = "indeterminate";
    public static final String PROP_PROGRESS = "progress";
    public static final String PROP_STYLE = "styleAttr";
    public static final String REACT_CLASS = "AndroidProgressBar";
    public static Object sProgressBarCtorLock = new Object();
    public final A0h mDelegate = new A71(this);

    public String getName() {
        return REACT_CLASS;
    }

    public void setTypeAttr(A6u a6u, String str) {
    }

    public void updateExtraData(A6u a6u, Object obj) {
    }

    public static ProgressBar createProgressBar(Context context, int i) {
        ProgressBar progressBar;
        synchronized (sProgressBarCtorLock) {
            progressBar = new ProgressBar(context, (AttributeSet) null, i);
        }
        return progressBar;
    }

    public static int getStyleFromString(String str) {
        if (str == null) {
            throw new A0k("ProgressBar needs to have a style, null received");
        } else if (str.equals("Horizontal")) {
            return 16842872;
        } else {
            if (str.equals("Small")) {
                return 16842873;
            }
            if (str.equals("Large")) {
                return 16842874;
            }
            if (str.equals("Inverse")) {
                return 16843399;
            }
            if (str.equals("SmallInverse")) {
                return 16843400;
            }
            if (str.equals("LargeInverse")) {
                return 16843401;
            }
            if (str.equals(DEFAULT_STYLE)) {
                return 16842871;
            }
            throw new A0k(AnonymousClass000.A0E("Unknown ProgressBar style: ", str));
        }
    }

    public A0h getDelegate() {
        return this.mDelegate;
    }

    public Class getShadowNodeClass() {
        return ProgressBarShadowNode.class;
    }

    public ProgressBarShadowNode createShadowNodeInstance() {
        return new ProgressBarShadowNode();
    }

    public A6u createViewInstance(C23053A3d a3d) {
        return new A6u(a3d);
    }

    public void onAfterUpdateTransaction(A6u a6u) {
        Drawable progressDrawable;
        ProgressBar progressBar = a6u.A01;
        if (progressBar != null) {
            progressBar.setIndeterminate(a6u.A04);
            ProgressBar progressBar2 = a6u.A01;
            if (progressBar2.isIndeterminate()) {
                progressDrawable = progressBar2.getIndeterminateDrawable();
            } else {
                progressDrawable = progressBar2.getProgressDrawable();
            }
            if (progressDrawable != null) {
                Integer num = a6u.A02;
                if (num != null) {
                    progressDrawable.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
                } else {
                    progressDrawable.clearColorFilter();
                }
            }
            a6u.A01.setProgress((int) (a6u.A00 * 1000.0d));
            if (a6u.A03) {
                a6u.A01.setVisibility(0);
            } else {
                a6u.A01.setVisibility(4);
            }
        } else {
            throw new A0k("setStyle() not called");
        }
    }

    @ReactProp(name = "animating")
    public void setAnimating(A6u a6u, boolean z) {
        a6u.A03 = z;
    }

    @ReactProp(name = "animating")
    public /* bridge */ /* synthetic */ void setAnimating(View view, boolean z) {
        ((A6u) view).A03 = z;
    }

    @ReactProp(customType = "Color", name = "color")
    public void setColor(A6u a6u, Integer num) {
        a6u.A02 = num;
    }

    @ReactProp(customType = "Color", name = "color")
    public /* bridge */ /* synthetic */ void setColor(View view, Integer num) {
        ((A6u) view).A02 = num;
    }

    @ReactProp(name = "indeterminate")
    public void setIndeterminate(A6u a6u, boolean z) {
        a6u.A04 = z;
    }

    @ReactProp(name = "indeterminate")
    public /* bridge */ /* synthetic */ void setIndeterminate(View view, boolean z) {
        ((A6u) view).A04 = z;
    }

    @ReactProp(name = "progress")
    public void setProgress(A6u a6u, double d) {
        a6u.A00 = d;
    }

    @ReactProp(name = "progress")
    public /* bridge */ /* synthetic */ void setProgress(View view, double d) {
        ((A6u) view).A00 = d;
    }

    @ReactProp(name = "styleAttr")
    public void setStyleAttr(A6u a6u, String str) {
        ProgressBar createProgressBar = createProgressBar(a6u.getContext(), getStyleFromString(str));
        a6u.A01 = createProgressBar;
        createProgressBar.setMax(1000);
        a6u.removeAllViews();
        a6u.addView(a6u.A01, new ViewGroup.LayoutParams(-1, -1));
    }

    public void setTestID(A6u a6u, String str) {
        super.setTestId(a6u, str);
    }

    public /* bridge */ /* synthetic */ void setTestID(View view, String str) {
        super.setTestId((A6u) view, str);
    }

    public /* bridge */ /* synthetic */ void setTypeAttr(View view, String str) {
    }

    public /* bridge */ /* synthetic */ void updateExtraData(View view, Object obj) {
    }
}
