package com.instagram.p009ui.widget.scrollview;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ScrollView;
import com.facebook.forker.Process;
import p000X.AnonymousClass1EM;

/* renamed from: com.instagram.ui.widget.scrollview.MaxHeightScrollView */
public class MaxHeightScrollView extends ScrollView {
    public int A00;

    private void A00(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass1EM.A2l);
            this.A00 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    public final void onMeasure(int i, int i2) {
        int i3 = this.A00;
        if (i3 > 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(i3, Process.WAIT_RESULT_TIMEOUT);
        }
        super.onMeasure(i, i2);
    }

    public MaxHeightScrollView(Context context) {
        super(context);
        A00(context, (AttributeSet) null);
    }

    public MaxHeightScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context, attributeSet);
    }

    public MaxHeightScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(context, attributeSet);
    }
}
