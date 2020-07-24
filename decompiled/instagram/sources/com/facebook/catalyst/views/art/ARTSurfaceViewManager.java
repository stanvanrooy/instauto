package com.facebook.catalyst.views.art;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.List;
import p000X.A1v;
import p000X.A20;
import p000X.A5P;
import p000X.A5e;
import p000X.AnonymousClass9DG;
import p000X.C230099zE;
import p000X.C230379zz;
import p000X.C23053A3d;

@ReactModule(name = "ARTSurfaceView")
public class ARTSurfaceViewManager extends BaseViewManager {
    public static final A5P MEASURE_FUNCTION = new A20();
    public static final String REACT_CLASS = "ARTSurfaceView";

    public String getName() {
        return REACT_CLASS;
    }

    public Class getShadowNodeClass() {
        return ARTSurfaceViewShadowNode.class;
    }

    public static boolean isFabric(AnonymousClass9DG r0) {
        return r0 instanceof A1v;
    }

    public ARTSurfaceViewShadowNode createShadowNodeInstance() {
        ARTSurfaceViewShadowNode aRTSurfaceViewShadowNode = new ARTSurfaceViewShadowNode();
        aRTSurfaceViewShadowNode.A05.setMeasureFunction(MEASURE_FUNCTION);
        return aRTSurfaceViewShadowNode;
    }

    public AnonymousClass9DG createViewInstance(C23053A3d a3d) {
        return new AnonymousClass9DG(a3d);
    }

    public AnonymousClass9DG createViewInstance(C23053A3d a3d, C230099zE r3, C230379zz r4) {
        if (r4 == null) {
            return new AnonymousClass9DG(a3d);
        }
        A1v a1v = new A1v(a3d);
        if (r3 != null) {
            updateProperties(a1v, r3);
        }
        return a1v;
    }

    public void setBackgroundColor(AnonymousClass9DG r2, int i) {
        if (r2 instanceof A1v) {
            ((A1v) r2).setBackgroundColor(i);
        }
    }

    public void updateExtraData(AnonymousClass9DG r3, Object obj) {
        ARTSurfaceViewShadowNode aRTSurfaceViewShadowNode = (ARTSurfaceViewShadowNode) obj;
        SurfaceTexture surfaceTexture = r3.getSurfaceTexture();
        r3.setSurfaceTextureListener(aRTSurfaceViewShadowNode);
        if (surfaceTexture != null && aRTSurfaceViewShadowNode.A00 == null) {
            aRTSurfaceViewShadowNode.A00 = new Surface(surfaceTexture);
            ARTSurfaceViewShadowNode.A00(aRTSurfaceViewShadowNode, true);
        }
    }

    public Object updateState(AnonymousClass9DG r5, C230099zE r6, C230379zz r7) {
        List list;
        if (!(r5 instanceof A1v)) {
            return null;
        }
        A1v a1v = (A1v) r5;
        ReadableNativeMap state = r7.getState();
        SurfaceTexture surfaceTexture = a1v.getSurfaceTexture();
        a1v.setSurfaceTextureListener(a1v);
        if (state.hasKey("elements")) {
            list = A5e.A01(state.getArray("elements"));
        } else {
            list = null;
        }
        a1v.A01 = list;
        if (surfaceTexture != null && a1v.A00 == null) {
            a1v.A00 = new Surface(surfaceTexture);
        }
        A1v.A00(a1v);
        return null;
    }
}
