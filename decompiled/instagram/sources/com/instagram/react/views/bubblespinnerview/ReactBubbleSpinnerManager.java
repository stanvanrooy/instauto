package com.instagram.react.views.bubblespinnerview;

import android.util.AttributeSet;
import com.facebook.react.uimanager.SimpleViewManager;
import com.instagram.p009ui.widget.bubblespinner.BubbleSpinner;
import p000X.C23053A3d;
import p000X.C85453nO;

public class ReactBubbleSpinnerManager extends SimpleViewManager {
    public static final String REACT_CLASS = "AndroidBubbleSpinner";

    public String getName() {
        return REACT_CLASS;
    }

    public BubbleSpinner createViewInstance(C23053A3d a3d) {
        BubbleSpinner bubbleSpinner = new BubbleSpinner(a3d, (AttributeSet) null, 2131886882);
        bubbleSpinner.setLoadingStatus(C85453nO.LOADING);
        return bubbleSpinner;
    }
}
