package com.facebook.react.views.scroll;

import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.views.view.ReactClippingViewManager;
import p000X.A39;
import p000X.C23053A3d;

@ReactModule(name = "AndroidHorizontalScrollContentView")
public class ReactHorizontalScrollContainerViewManager extends ReactClippingViewManager {
    public static final String REACT_CLASS = "AndroidHorizontalScrollContentView";

    public String getName() {
        return REACT_CLASS;
    }

    public A39 createViewInstance(C23053A3d a3d) {
        return new A39(a3d);
    }
}
