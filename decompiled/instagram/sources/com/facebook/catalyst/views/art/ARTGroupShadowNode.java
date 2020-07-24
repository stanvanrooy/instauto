package com.facebook.catalyst.views.art;

import android.graphics.RectF;
import com.facebook.react.uimanager.annotations.ReactProp;
import p000X.A0k;
import p000X.A1e;
import p000X.C23080A5o;

public class ARTGroupShadowNode extends ARTVirtualNode {
    public RectF A00;

    @ReactProp(name = "clipping")
    public void setClipping(A1e a1e) {
        float[] A01 = C23080A5o.A01(a1e);
        if (A01 == null) {
            return;
        }
        if (A01.length == 4) {
            float f = A01[0];
            float f2 = A01[1];
            this.A00 = new RectF(f, f2, f + A01[2], A01[3] + f2);
            A06();
            return;
        }
        throw new A0k("Clipping should be array of length 4 (e.g. [x, y, width, height])");
    }
}
