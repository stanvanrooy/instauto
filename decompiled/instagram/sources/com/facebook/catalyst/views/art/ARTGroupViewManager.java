package com.facebook.catalyst.views.art;

import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = "ARTGroup")
public class ARTGroupViewManager extends ARTRenderableViewManager {
    public ARTGroupViewManager() {
        super(ARTRenderableViewManager.CLASS_GROUP);
    }
}
