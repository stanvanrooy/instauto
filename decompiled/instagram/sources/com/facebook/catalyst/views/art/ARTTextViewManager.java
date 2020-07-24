package com.facebook.catalyst.views.art;

import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = "ARTText")
public class ARTTextViewManager extends ARTRenderableViewManager {
    public ARTTextViewManager() {
        super(ARTRenderableViewManager.CLASS_TEXT);
    }
}
