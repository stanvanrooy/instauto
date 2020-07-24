package com.facebook.react.views.modal;

import android.graphics.Point;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ReactShadowNodeImpl;
import p000X.A6S;

public class ModalHostShadowNode extends LayoutShadowNode {
    public final void A08(ReactShadowNodeImpl reactShadowNodeImpl, int i) {
        super.A08(reactShadowNodeImpl, i);
        Point A00 = A6S.A00(AY1());
        reactShadowNodeImpl.Bko((float) A00.x);
        reactShadowNodeImpl.Bkn((float) A00.y);
    }
}
