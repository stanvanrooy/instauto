package com.instagram.survey.structuredsurvey.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Checkable;
import android.widget.RadioButton;
import android.widget.TextView;
import com.facebook.C0003R;
import p000X.C27004Bw7;
import p000X.C27019BwR;

public class SurveyRadioListItemView extends C27019BwR implements Checkable {
    public TextView A00;
    public RadioButton A01;
    public boolean A02;

    public void setChecked(boolean z) {
        this.A02 = z;
        this.A01.setChecked(z);
        ((C27004Bw7) this.A00).A01 = Boolean.valueOf(this.A02).booleanValue();
    }

    public final void toggle() {
        setChecked(!this.A02);
    }

    public final void A02() {
        setContentView(C0003R.layout.survey_radio_view);
        this.A00 = (TextView) findViewById(C0003R.C0005id.survey_radio_text);
        this.A01 = (RadioButton) findViewById(C0003R.C0005id.survey_radio_button);
    }

    public final boolean isChecked() {
        return this.A02;
    }

    public SurveyRadioListItemView(Context context) {
        super(context);
        A02();
    }

    public SurveyRadioListItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A02();
    }
}
