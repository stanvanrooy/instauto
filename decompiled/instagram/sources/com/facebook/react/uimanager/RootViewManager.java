package com.facebook.react.uimanager;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import p000X.C23053A3d;

public class RootViewManager extends ViewGroupManager {
    public static final String REACT_CLASS = "RootView";

    public String getName() {
        return REACT_CLASS;
    }

    public ViewGroup createViewInstance(C23053A3d a3d) {
        return new FrameLayout(a3d);
    }
}
