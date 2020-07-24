package com.facebook.catalyst.views.art;

import android.view.View;
import com.facebook.react.uimanager.ReactShadowNode;
import com.facebook.react.uimanager.ViewManager;
import p000X.AnonymousClass000;
import p000X.C23053A3d;

public class ARTRenderableViewManager extends ViewManager {
    public static final String CLASS_GROUP = "ARTGroup";
    public static final String CLASS_SHAPE = "ARTShape";
    public static final String CLASS_TEXT = "ARTText";
    public final String mClassName;

    public static ARTRenderableViewManager createARTGroupViewManager() {
        return new ARTGroupViewManager();
    }

    public static ARTRenderableViewManager createARTShapeViewManager() {
        return new ARTShapeViewManager();
    }

    public static ARTRenderableViewManager createARTTextViewManager() {
        return new ARTTextViewManager();
    }

    public ReactShadowNode createShadowNodeInstance() {
        String str = this.mClassName;
        if (CLASS_GROUP.equals(str)) {
            return new ARTGroupShadowNode();
        }
        if (CLASS_SHAPE.equals(str)) {
            return new ARTShapeShadowNode();
        }
        if (CLASS_TEXT.equals(str)) {
            return new ARTTextShadowNode();
        }
        throw new IllegalStateException(AnonymousClass000.A0E("Unexpected type ", str));
    }

    public View createViewInstance(C23053A3d a3d) {
        throw new IllegalStateException("ARTShape does not map into a native view");
    }

    public Class getShadowNodeClass() {
        String str = this.mClassName;
        if (CLASS_GROUP.equals(str)) {
            return ARTGroupShadowNode.class;
        }
        if (CLASS_SHAPE.equals(str)) {
            return ARTShapeShadowNode.class;
        }
        if (CLASS_TEXT.equals(str)) {
            return ARTTextShadowNode.class;
        }
        throw new IllegalStateException(AnonymousClass000.A0E("Unexpected type ", str));
    }

    public void updateExtraData(View view, Object obj) {
        throw new IllegalStateException("ARTShape does not map into a native view");
    }

    public ARTRenderableViewManager(String str) {
        this.mClassName = str;
    }

    public String getName() {
        return this.mClassName;
    }
}
