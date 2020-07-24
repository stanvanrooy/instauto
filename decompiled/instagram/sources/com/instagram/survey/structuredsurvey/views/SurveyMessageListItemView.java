package com.instagram.survey.structuredsurvey.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.facebook.C0003R;
import p000X.C27019BwR;

public class SurveyMessageListItemView extends C27019BwR {
    public TextView A00 = ((TextView) findViewById(C0003R.C0005id.survey_message_text));

    public SurveyMessageListItemView(Context context) {
        super(context);
        setContentView(C0003R.layout.survey_message_view);
    }

    public SurveyMessageListItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setContentView(C0003R.layout.survey_message_view);
    }
}
