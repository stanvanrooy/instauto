package com.instagram.survey.structuredsurvey.views;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.TextView;
import p000X.C06220Of;
import p000X.C27001Bw4;
import p000X.C27003Bw6;
import p000X.C27006Bw9;
import p000X.C27019BwR;

public class SurveyWriteInListItemView extends C27019BwR implements Checkable {
    public View.OnFocusChangeListener A00;
    public View A01;
    public Checkable A02;
    public EditText A03;
    public TextView A04;
    public C27001Bw4 A05;

    public String getText() {
        return this.A03.getText().toString();
    }

    public final boolean isChecked() {
        return this.A02.isChecked();
    }

    public void setChecked(boolean z) {
        this.A02.setChecked(z);
        ((C27003Bw6) this.A00).A01 = Boolean.valueOf(z).booleanValue();
        if (z) {
            this.A01.setVisibility(0);
            this.A03.setVisibility(0);
            return;
        }
        this.A01.setVisibility(4);
        this.A03.setVisibility(4);
        C06220Of.A0E(getRootView());
        ((Activity) getContext()).getWindow().setSoftInputMode(3);
    }

    public final void toggle() {
        setChecked(!this.A02.isChecked());
    }

    public final void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        String text = getText();
        ((C27003Bw6) this.A00).A02.A00 = new C27006Bw9(text);
    }

    public void setItemOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.A00 = onFocusChangeListener;
    }

    public SurveyWriteInListItemView(Context context) {
        super(context);
    }

    public SurveyWriteInListItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
