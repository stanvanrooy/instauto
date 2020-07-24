package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.C0003R;
import com.facebook.react.uimanager.BaseViewManager;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass1E1;
import p000X.C25913Bc3;
import p000X.C28922Coy;
import p000X.C712039k;

public class SnackbarContentLayout extends LinearLayout implements C28922Coy {
    public TextView A00;
    public int A01;
    public int A02;
    public Button A03;

    public final void A59(int i, int i2) {
        this.A00.setAlpha(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        long j = (long) i2;
        long j2 = (long) i;
        this.A00.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).start();
        if (this.A03.getVisibility() == 0) {
            this.A03.setAlpha(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
            this.A03.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).start();
        }
    }

    public final void A5A(int i, int i2) {
        this.A00.setAlpha(1.0f);
        long j = (long) i2;
        long j2 = (long) i;
        this.A00.animate().alpha(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER).setDuration(j).setStartDelay(j2).start();
        if (this.A03.getVisibility() == 0) {
            this.A03.setAlpha(1.0f);
            this.A03.animate().alpha(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER).setDuration(j).setStartDelay(j2).start();
        }
    }

    private boolean A00(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.A00.getPaddingTop() == i2 && this.A00.getPaddingBottom() == i3) {
            return z;
        }
        TextView textView = this.A00;
        if (AnonymousClass1E1.A0k(textView)) {
            textView.setPaddingRelative(textView.getPaddingStart(), i2, textView.getPaddingEnd(), i3);
        } else {
            textView.setPadding(textView.getPaddingLeft(), i2, textView.getPaddingRight(), i3);
        }
        return true;
    }

    public Button getActionView() {
        return this.A03;
    }

    public TextView getMessageView() {
        return this.A00;
    }

    public final void onFinishInflate() {
        int A06 = AnonymousClass0Z0.A06(146968401);
        super.onFinishInflate();
        this.A00 = (TextView) findViewById(C0003R.C0005id.snackbar_text);
        this.A03 = (Button) findViewById(C0003R.C0005id.snackbar_action);
        AnonymousClass0Z0.A0D(-674656186, A06);
    }

    public final void onMeasure(int i, int i2) {
        boolean A002;
        int i3;
        super.onMeasure(i, i2);
        if (this.A02 > 0 && getMeasuredWidth() > (i3 = this.A02)) {
            i = View.MeasureSpec.makeMeasureSpec(i3, C25913Bc3.MAX_SIGNED_POWER_OF_TWO);
            super.onMeasure(i, i2);
        }
        Resources resources = getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(C0003R.dimen.design_snackbar_padding_vertical_2lines);
        getResources();
        int dimensionPixelSize2 = resources.getDimensionPixelSize(C0003R.dimen.design_snackbar_padding_vertical);
        boolean z = true;
        boolean z2 = false;
        if (this.A00.getLayout().getLineCount() > 1) {
            z2 = true;
        }
        if (!z2 || this.A01 <= 0 || this.A03.getMeasuredWidth() <= this.A01) {
            if (!z2) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            A002 = A00(0, dimensionPixelSize, dimensionPixelSize);
        } else {
            A002 = A00(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2);
        }
        if (!A002) {
            z = false;
        }
        if (z) {
            super.onMeasure(i, i2);
        }
    }

    public SnackbarContentLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C712039k.A0M);
        this.A02 = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.A01 = obtainStyledAttributes.getDimensionPixelSize(2, -1);
        obtainStyledAttributes.recycle();
    }
}
