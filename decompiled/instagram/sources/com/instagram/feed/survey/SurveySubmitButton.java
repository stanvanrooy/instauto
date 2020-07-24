package com.instagram.feed.survey;

import android.content.Context;
import android.util.AttributeSet;
import com.facebook.C0003R;
import com.instagram.common.p004ui.base.IgTextView;

public class SurveySubmitButton extends IgTextView {
    public void setActivated(boolean z) {
        super.setActivated(z);
        boolean isActivated = isActivated();
        int i = C0003R.C0004drawable.not_activated_survey_submit_button_background;
        if (isActivated) {
            i = C0003R.C0004drawable.activated_survey_submit_button_background;
        }
        setBackgroundResource(i);
    }

    public SurveySubmitButton(Context context) {
        super(context);
    }

    public SurveySubmitButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SurveySubmitButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
