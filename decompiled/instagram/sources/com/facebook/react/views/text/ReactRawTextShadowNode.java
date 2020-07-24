package com.facebook.react.views.text;

import com.facebook.react.uimanager.ReactShadowNodeImpl;
import com.facebook.react.uimanager.annotations.ReactProp;
import p000X.AnonymousClass000;

public class ReactRawTextShadowNode extends ReactShadowNodeImpl {
    public String A00 = null;

    @ReactProp(name = "text")
    public void setText(String str) {
        this.A00 = str;
        A06();
    }

    public final String toString() {
        return AnonymousClass000.A0N(AaL(), " [text: ", this.A00, "]");
    }
}
