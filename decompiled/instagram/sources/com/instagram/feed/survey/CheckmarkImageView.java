package com.instagram.feed.survey;

import android.content.Context;
import android.util.AttributeSet;
import com.instagram.common.p004ui.colorfilter.ColorFilterAlphaImageView;

public class CheckmarkImageView extends ColorFilterAlphaImageView {
    public final boolean A05() {
        return isSelected();
    }

    public CheckmarkImageView(Context context) {
        super(context);
        this.A01 = 0;
        this.A00 = 0;
    }

    public CheckmarkImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A01 = 0;
        this.A00 = 0;
    }

    public CheckmarkImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A01 = 0;
        this.A00 = 0;
    }
}
