package com.instagram.survey.structuredsurvey.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.facebook.C0003R;
import p000X.C27019BwR;

public class SurveyQuestionListItemView extends C27019BwR {
    public TextView A00;
    public TextView A01;

    private void A00() {
        setContentView(C0003R.layout.survey_question_view);
        this.A00 = (TextView) findViewById(C0003R.C0005id.survey_question_number);
        this.A01 = (TextView) findViewById(C0003R.C0005id.survey_question);
    }

    public SurveyQuestionListItemView(Context context) {
        super(context);
        A00();
    }

    public SurveyQuestionListItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }
}
