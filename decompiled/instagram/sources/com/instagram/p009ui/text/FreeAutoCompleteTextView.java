package com.instagram.p009ui.text;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.AutoCompleteTextView;
import android.widget.ListAdapter;
import p000X.AnonymousClass0Z0;

/* renamed from: com.instagram.ui.text.FreeAutoCompleteTextView */
public class FreeAutoCompleteTextView extends AutoCompleteTextView {
    public int A00;

    private void A00() {
        if ((Build.VERSION.SDK_INT < 24 || !isTemporarilyDetached()) && enoughToFilter() && getAdapter() != null) {
            performFiltering(getText(), 0);
            showDropDown();
        }
    }

    public final boolean enoughToFilter() {
        if (this.A00 == 0) {
            return true;
        }
        if (getText() == null || getText().length() < this.A00) {
            return false;
        }
        return true;
    }

    public void setThreshold(int i) {
        if (i < 0) {
            i = 1;
        }
        this.A00 = i;
        A00();
    }

    public int getThreshold() {
        return this.A00;
    }

    public final void onFocusChanged(boolean z, int i, Rect rect) {
        int A06 = AnonymousClass0Z0.A06(-2073548998);
        super.onFocusChanged(z, i, rect);
        if (z) {
            A00();
        }
        AnonymousClass0Z0.A0D(942823085, A06);
    }

    public void setAdapter(ListAdapter listAdapter) {
        super.setAdapter(listAdapter);
        A00();
    }

    public FreeAutoCompleteTextView(Context context) {
        super(context);
        this.A00 = super.getThreshold();
    }

    public FreeAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A00 = super.getThreshold();
    }

    public FreeAutoCompleteTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A00 = super.getThreshold();
    }

    public FreeAutoCompleteTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.A00 = super.getThreshold();
    }

    public FreeAutoCompleteTextView(Context context, AttributeSet attributeSet, int i, int i2, Resources.Theme theme) {
        super(context, attributeSet, i, i2, theme);
    }
}
