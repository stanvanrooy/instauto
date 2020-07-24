package com.instagram.business.insights.p014ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.facebook.C0003R;
import com.instagram.common.p004ui.base.IgTextView;
import p000X.AnonymousClass1EM;

/* renamed from: com.instagram.business.insights.ui.InsightsHelpItemView */
public class InsightsHelpItemView extends LinearLayout {
    public IgTextView A00;
    public IgTextView A01;

    public void setPrimaryText(String str) {
        this.A01.setText(str);
    }

    public void setSecondaryText(CharSequence charSequence) {
        this.A00.setText(charSequence);
    }

    private void A00(Context context, AttributeSet attributeSet) {
        View inflate = LayoutInflater.from(context).inflate(C0003R.layout.insights_help_item_view, this);
        this.A01 = (IgTextView) inflate.findViewById(C0003R.C0005id.insightsHelpPrimaryText);
        this.A00 = (IgTextView) inflate.findViewById(C0003R.C0005id.insightsHelpSecondaryText);
        TypedArray typedArray = null;
        try {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass1EM.A2a);
            if (obtainStyledAttributes.hasValue(0)) {
                this.A01.setText(obtainStyledAttributes.getString(0));
            }
            if (obtainStyledAttributes.hasValue(1)) {
                this.A00.setText(obtainStyledAttributes.getString(1));
            }
            obtainStyledAttributes.recycle();
        } catch (Throwable th) {
            if (typedArray != null) {
                typedArray.recycle();
            }
            throw th;
        }
    }

    public IgTextView getSecondaryTextView() {
        return this.A00;
    }

    public InsightsHelpItemView(Context context) {
        super(context);
        setOrientation(1);
        A00(context, (AttributeSet) null);
    }

    public InsightsHelpItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(1);
        A00(context, attributeSet);
    }
}
