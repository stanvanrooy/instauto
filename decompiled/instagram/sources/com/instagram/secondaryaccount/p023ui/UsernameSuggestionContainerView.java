package com.instagram.secondaryaccount.p023ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.facebook.C0003R;
import com.facebook.forker.Process;

/* renamed from: com.instagram.secondaryaccount.ui.UsernameSuggestionContainerView */
public class UsernameSuggestionContainerView extends LinearLayout {
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getResources().getDimensionPixelOffset(C0003R.dimen.reg_button_height) * 5, Process.WAIT_RESULT_TIMEOUT));
    }

    public UsernameSuggestionContainerView(Context context) {
        super(context);
    }

    public UsernameSuggestionContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
