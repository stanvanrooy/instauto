package com.instagram.react.views.custom;

import com.facebook.C0003R;
import com.facebook.react.uimanager.SimpleViewManager;
import com.instagram.p009ui.widget.spinner.SpinnerImageView;
import p000X.C23053A3d;

public class IgLoadingIndicatorViewManager extends SimpleViewManager {
    public String getName() {
        return "IgLoadingIndicator";
    }

    public SpinnerImageView createViewInstance(C23053A3d a3d) {
        SpinnerImageView spinnerImageView = new SpinnerImageView(a3d);
        spinnerImageView.setImageResource(C0003R.C0004drawable.spinner_large);
        return spinnerImageView;
    }
}
