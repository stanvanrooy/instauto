package com.facebook.react.views.progressbar;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ProgressBar;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.annotations.ReactProp;
import java.util.HashSet;
import java.util.Set;
import p000X.A0c;
import p000X.A5P;
import p000X.A8M;
import p000X.C230049z6;

public class ProgressBarShadowNode extends LayoutShadowNode implements A5P {
    public String A00 = ReactProgressBarViewManager.DEFAULT_STYLE;
    public final SparseIntArray A01 = new SparseIntArray();
    public final SparseIntArray A02 = new SparseIntArray();
    public final Set A03 = new HashSet();

    public final long Ap5(A8M a8m, float f, C230049z6 r8, float f2, C230049z6 r10) {
        int styleFromString = ReactProgressBarViewManager.getStyleFromString(this.A00);
        Set set = this.A03;
        Integer valueOf = Integer.valueOf(styleFromString);
        if (!set.contains(valueOf)) {
            ProgressBar createProgressBar = ReactProgressBarViewManager.createProgressBar(AY1(), styleFromString);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(-2, 0);
            createProgressBar.measure(makeMeasureSpec, makeMeasureSpec);
            this.A01.put(styleFromString, createProgressBar.getMeasuredHeight());
            this.A02.put(styleFromString, createProgressBar.getMeasuredWidth());
            this.A03.add(valueOf);
        }
        return A0c.A00((float) this.A02.get(styleFromString), (float) this.A01.get(styleFromString));
    }

    @ReactProp(name = "styleAttr")
    public void setStyle(String str) {
        if (str == null) {
            str = ReactProgressBarViewManager.DEFAULT_STYLE;
        }
        this.A00 = str;
    }

    public ProgressBarShadowNode() {
        this.A05.setMeasureFunction(this);
    }
}
