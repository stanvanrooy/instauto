package com.instagram.survey.structuredsurvey.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.CheckBox;
import android.widget.Checkable;
import android.widget.TextView;
import com.facebook.C0003R;
import p000X.C27005Bw8;
import p000X.C27019BwR;

public class SurveyCheckboxListItemView extends C27019BwR implements Checkable {
    public TextView A00;
    public CheckBox A01;
    public boolean A02;

    public void setChecked(boolean z) {
        this.A02 = z;
        this.A01.setChecked(z);
        ((C27005Bw8) this.A00).A00 = Boolean.valueOf(this.A02).booleanValue();
    }

    public final void toggle() {
        setChecked(!this.A02);
    }

    private void A00() {
        setContentView(C0003R.layout.survey_checkbox_view);
        this.A00 = (TextView) findViewById(C0003R.C0005id.survey_checkbox_text);
        this.A01 = (CheckBox) findViewById(C0003R.C0005id.survey_checkbox);
    }

    public final boolean isChecked() {
        return this.A02;
    }

    public SurveyCheckboxListItemView(Context context) {
        super(context);
        A00();
    }

    public SurveyCheckboxListItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }
}
