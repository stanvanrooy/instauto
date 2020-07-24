package com.facebook.catalyst.views.art;

import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = "ARTShape")
public class ARTShapeViewManager extends ARTRenderableViewManager {
    public ARTShapeViewManager() {
        super(ARTRenderableViewManager.CLASS_SHAPE);
    }
}
