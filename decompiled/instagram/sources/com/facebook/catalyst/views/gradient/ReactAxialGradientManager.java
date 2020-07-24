package com.facebook.catalyst.views.gradient;

import android.view.View;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import p000X.A0L;
import p000X.A0h;
import p000X.A0k;
import p000X.A1e;
import p000X.C206858uF;
import p000X.C230109zF;
import p000X.C230349zs;
import p000X.C23038A0f;
import p000X.C23053A3d;

@ReactModule(name = "RCTAxialGradientView")
public class ReactAxialGradientManager extends SimpleViewManager {
    public static final String REACT_CLASS = "RCTAxialGradientView";
    public final A0h mDelegate = new C23038A0f(this);

    public String getName() {
        return REACT_CLASS;
    }

    private void throwBorderRadiusNotImplementedException() {
        throw new RuntimeException("Border radius type not yet implemented!");
    }

    /* access modifiers changed from: private */
    /* renamed from: setBorderRadiusInternal */
    public void setBorderRadius(A0L a0l, float f) {
        if (!C230349zs.A00(f)) {
            f = C230109zF.A00(f);
        }
        if (!C206858uF.A00(a0l.A00, f)) {
            a0l.A00 = f;
        }
    }

    public A0h getDelegate() {
        return this.mDelegate;
    }

    public A0L createViewInstance(C23053A3d a3d) {
        return new A0L(a3d);
    }

    public void onAfterUpdateTransaction(A0L a0l) {
        a0l.invalidate();
    }

    public /* bridge */ /* synthetic */ void onAfterUpdateTransaction(View view) {
        ((A0L) view).invalidate();
    }

    public void setBorderBottomLeftRadius(A0L a0l, float f) {
        throwBorderRadiusNotImplementedException();
    }

    public /* bridge */ /* synthetic */ void setBorderBottomLeftRadius(View view, float f) {
        throwBorderRadiusNotImplementedException();
    }

    public void setBorderBottomRightRadius(A0L a0l, float f) {
        throwBorderRadiusNotImplementedException();
    }

    public /* bridge */ /* synthetic */ void setBorderBottomRightRadius(View view, float f) {
        throwBorderRadiusNotImplementedException();
    }

    public void setBorderRadius(A0L a0l, float f) {
        setBorderRadius(a0l, f);
    }

    @ReactPropGroup(defaultFloat = Float.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
    public void setBorderRadius(A0L a0l, int i, float f) {
        if (i == 0) {
            setBorderRadius(a0l, f);
        } else {
            throwBorderRadiusNotImplementedException();
        }
    }

    public void setBorderTopLeftRadius(A0L a0l, float f) {
        throwBorderRadiusNotImplementedException();
    }

    public /* bridge */ /* synthetic */ void setBorderTopLeftRadius(View view, float f) {
        throwBorderRadiusNotImplementedException();
    }

    public void setBorderTopRightRadius(A0L a0l, float f) {
        throwBorderRadiusNotImplementedException();
    }

    public /* bridge */ /* synthetic */ void setBorderTopRightRadius(View view, float f) {
        throwBorderRadiusNotImplementedException();
    }

    @ReactProp(customType = "ColorArray", name = "colors")
    public void setColors(A0L a0l, A1e a1e) {
        if (a1e == null || a1e.size() < 2) {
            throw new A0k("The gradient must contain at least 2 colors");
        }
        int[] iArr = new int[a1e.size()];
        for (int i = 0; i < a1e.size(); i++) {
            iArr[i] = (int) a1e.getDouble(i);
        }
        a0l.A08 = iArr;
    }

    @ReactProp(name = "endX")
    public void setEndX(A0L a0l, float f) {
        a0l.A01 = f;
    }

    @ReactProp(name = "endX")
    public /* bridge */ /* synthetic */ void setEndX(View view, float f) {
        ((A0L) view).A01 = f;
    }

    @ReactProp(name = "endY")
    public void setEndY(A0L a0l, float f) {
        a0l.A02 = f;
    }

    @ReactProp(name = "endY")
    public /* bridge */ /* synthetic */ void setEndY(View view, float f) {
        ((A0L) view).A02 = f;
    }

    @ReactProp(name = "locations")
    public void setLocations(A0L a0l, A1e a1e) {
        if (a1e == null) {
            a0l.A07 = null;
            return;
        }
        float[] fArr = new float[a1e.size()];
        for (int i = 0; i < a1e.size(); i++) {
            fArr[i] = (float) a1e.getDouble(i);
        }
        a0l.A07 = fArr;
    }

    @ReactProp(name = "startX")
    public void setStartX(A0L a0l, float f) {
        a0l.A03 = f;
    }

    @ReactProp(name = "startX")
    public /* bridge */ /* synthetic */ void setStartX(View view, float f) {
        ((A0L) view).A03 = f;
    }

    @ReactProp(name = "startY")
    public void setStartY(A0L a0l, float f) {
        a0l.A04 = f;
    }

    @ReactProp(name = "startY")
    public /* bridge */ /* synthetic */ void setStartY(View view, float f) {
        ((A0L) view).A04 = f;
    }
}
