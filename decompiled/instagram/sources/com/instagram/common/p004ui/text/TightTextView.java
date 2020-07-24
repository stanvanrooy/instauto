package com.instagram.common.p004ui.text;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.forker.Process;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.common.accessibility.AccessibleTextView;
import p000X.AnonymousClass0Z0;

/* renamed from: com.instagram.common.ui.text.TightTextView */
public class TightTextView extends AccessibleTextView {
    public boolean A00 = true;

    public final void onMeasure(int i, int i2) {
        int i3;
        Layout layout;
        int A06 = AnonymousClass0Z0.A06(-744288736);
        super.onMeasure(i, i2);
        if (!this.A00) {
            i3 = 1808413649;
        } else {
            if (!(View.MeasureSpec.getMode(i) == 1073741824 || (layout = getLayout()) == null)) {
                int lineCount = layout.getLineCount();
                float f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
                for (int i4 = 0; i4 < lineCount; i4++) {
                    if (layout.getLineWidth(i4) > f) {
                        f = layout.getLineWidth(i4);
                    }
                }
                int ceil = ((int) Math.ceil((double) f)) + getCompoundPaddingLeft() + getCompoundPaddingRight();
                if (ceil < getMeasuredWidth() && ceil > getMinimumWidth()) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(ceil, Process.WAIT_RESULT_TIMEOUT), i2);
                }
            }
            i3 = 481974070;
        }
        AnonymousClass0Z0.A0D(i3, A06);
    }

    public void setTightMeasurementEnabled(boolean z) {
        this.A00 = z;
    }

    public TightTextView(Context context) {
        super(context);
    }

    public TightTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TightTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
