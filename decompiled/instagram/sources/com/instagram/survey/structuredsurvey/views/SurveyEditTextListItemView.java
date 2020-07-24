package com.instagram.survey.structuredsurvey.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import com.facebook.C0003R;
import p000X.C27002Bw5;
import p000X.C27006Bw9;
import p000X.C27019BwR;

public class SurveyEditTextListItemView extends C27019BwR {
    public EditText A00;

    public String getText() {
        return this.A00.getText().toString();
    }

    public final void onStartTemporaryDetach() {
        ((C27002Bw5) this.A00).A00 = new C27006Bw9(getText());
        super.onStartTemporaryDetach();
    }

    public void setItemOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.A00.setOnFocusChangeListener(onFocusChangeListener);
    }

    public SurveyEditTextListItemView(Context context) {
        super(context);
        setContentView(C0003R.layout.survey_editext_view);
        EditText editText = (EditText) findViewById(C0003R.C0005id.survey_edit_text);
        this.A00 = editText;
        editText.setFocusable(true);
        this.A00.setFocusableInTouchMode(true);
    }

    public SurveyEditTextListItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setContentView(C0003R.layout.survey_editext_view);
        EditText editText = (EditText) findViewById(C0003R.C0005id.survey_edit_text);
        this.A00 = editText;
        editText.setFocusable(true);
        this.A00.setFocusableInTouchMode(true);
    }
}
