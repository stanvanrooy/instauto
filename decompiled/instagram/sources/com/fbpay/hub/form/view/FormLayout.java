package com.fbpay.hub.form.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TableLayout;
import android.widget.TableRow;
import com.facebook.react.uimanager.BaseViewManager;
import p000X.AnonymousClass0a4;

public class FormLayout extends TableLayout {
    public float A00;

    public final void addView(View view) {
        TableRow.LayoutParams layoutParams = (TableRow.LayoutParams) view.getLayoutParams();
        AnonymousClass0a4.A06(layoutParams);
        float f = layoutParams.weight;
        float f2 = this.A00;
        if (f2 == BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER || f2 + f > 1.0f) {
            this.A00 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            addView(new TableRow(getContext()), new TableLayout.LayoutParams(-1, -2));
        }
        this.A00 += f;
        ((TableRow) getChildAt(getChildCount() - 1)).addView(view);
    }

    public FormLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public FormLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A00 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
    }
}
