package com.facebook.react.views.text;

import android.view.View;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.BaseViewManager;
import p000X.C23053A3d;

@ReactModule(name = "RCTVirtualText")
public class ReactVirtualTextViewManager extends BaseViewManager {
    public static final String REACT_CLASS = "RCTVirtualText";

    public String getName() {
        return REACT_CLASS;
    }

    public void updateExtraData(View view, Object obj) {
    }

    public View createViewInstance(C23053A3d a3d) {
        throw new IllegalStateException("Attempt to create a native view for RCTVirtualText");
    }

    public Class getShadowNodeClass() {
        return ReactVirtualTextShadowNode.class;
    }

    public ReactVirtualTextShadowNode createShadowNodeInstance() {
        return new ReactVirtualTextShadowNode();
    }
}
