package com.facebook.react.views.text;

import android.view.View;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ViewManager;
import p000X.C230129zH;
import p000X.C23053A3d;

@ReactModule(name = "RCTRawText")
public class ReactRawTextManager extends ViewManager {
    public static final String REACT_CLASS = "RCTRawText";

    public String getName() {
        return REACT_CLASS;
    }

    public void updateExtraData(View view, Object obj) {
    }

    public Class getShadowNodeClass() {
        return ReactRawTextShadowNode.class;
    }

    public ReactRawTextShadowNode createShadowNodeInstance() {
        return new ReactRawTextShadowNode();
    }

    public C230129zH createViewInstance(C23053A3d a3d) {
        throw new IllegalStateException("Attempt to create a native view for RCTRawText");
    }
}
