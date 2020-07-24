package com.instagram.survey.p054ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import com.facebook.C0003R;

/* renamed from: com.instagram.survey.ui.RapidFeedbackPageView */
public class RapidFeedbackPageView extends RelativeLayout {
    public RapidFeedbackPageView(Context context) {
        super(context, (AttributeSet) null);
        LayoutInflater.from(getContext()).inflate(C0003R.layout.rapidfeedback_page, this);
    }

    public RapidFeedbackPageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(getContext()).inflate(C0003R.layout.rapidfeedback_page, this);
    }
}
