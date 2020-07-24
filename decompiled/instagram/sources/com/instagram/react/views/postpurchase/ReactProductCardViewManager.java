package com.instagram.react.views.postpurchase;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import p000X.AnonymousClass9VC;
import p000X.C170627Ri;
import p000X.C23053A3d;

public class ReactProductCardViewManager extends SimpleViewManager {
    public static final String REACT_CLASS = "AndroidProductCardView";

    public String getName() {
        return REACT_CLASS;
    }

    @ReactProp(name = "resizeMode")
    public void setResizeMode(C170627Ri r2, String str) {
        r2.setScaleType(AnonymousClass9VC.A00(str));
    }

    public C170627Ri createViewInstance(C23053A3d a3d) {
        return new C170627Ri(a3d);
    }
}
