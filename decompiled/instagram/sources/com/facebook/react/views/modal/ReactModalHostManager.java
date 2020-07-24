package com.facebook.react.views.modal;

import android.graphics.Point;
import android.view.View;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import java.util.HashMap;
import java.util.Map;
import p000X.A0h;
import p000X.A1e;
import p000X.A3N;
import p000X.A3W;
import p000X.A6P;
import p000X.A6S;
import p000X.A6V;
import p000X.A6W;
import p000X.A6Z;
import p000X.A9C;
import p000X.C230099zE;
import p000X.C230299zk;
import p000X.C230379zz;
import p000X.C23053A3d;

@ReactModule(name = "RCTModalHostView")
public class ReactModalHostManager extends ViewGroupManager {
    public static final String REACT_CLASS = "RCTModalHostView";
    public final A0h mDelegate = new A6Z(this);

    public String getName() {
        return REACT_CLASS;
    }

    public void setAnimated(A6P a6p, boolean z) {
    }

    public void setIdentifier(A6P a6p, int i) {
    }

    public void setPresentationStyle(A6P a6p, String str) {
    }

    public void setSupportedOrientations(A6P a6p, A1e a1e) {
    }

    public Map getExportedCustomDirectEventTypeConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put("topRequestClose", C230299zk.A00("registrationName", "onRequestClose"));
        hashMap.put("topShow", C230299zk.A00("registrationName", "onShow"));
        return hashMap;
    }

    public A0h getDelegate() {
        return this.mDelegate;
    }

    public Class getShadowNodeClass() {
        return ModalHostShadowNode.class;
    }

    public void addEventEmitters(C23053A3d a3d, A6P a6p) {
        A9C A02 = A3W.A02(a3d, a6p.getId());
        if (A02 != null) {
            a6p.A02 = new A6W(this, A02, a6p);
            a6p.A00 = new A6V(this, A02, a6p);
        }
    }

    public LayoutShadowNode createShadowNodeInstance() {
        return new ModalHostShadowNode();
    }

    public A6P createViewInstance(C23053A3d a3d) {
        return new A6P(a3d);
    }

    public void onAfterUpdateTransaction(A6P a6p) {
        super.onAfterUpdateTransaction(a6p);
        a6p.A02();
    }

    public void onDropViewInstance(A6P a6p) {
        super.onDropViewInstance(a6p);
        ((A3N) a6p.getContext()).A07(a6p);
        A6P.A01(a6p);
    }

    public /* bridge */ /* synthetic */ void setAnimated(View view, boolean z) {
    }

    @ReactProp(name = "animationType")
    public void setAnimationType(A6P a6p, String str) {
        if (str != null) {
            a6p.setAnimationType(str);
        }
    }

    @ReactProp(name = "hardwareAccelerated")
    public void setHardwareAccelerated(A6P a6p, boolean z) {
        a6p.setHardwareAccelerated(z);
    }

    @ReactProp(name = "hardwareAccelerated")
    public /* bridge */ /* synthetic */ void setHardwareAccelerated(View view, boolean z) {
        ((A6P) view).setHardwareAccelerated(z);
    }

    public /* bridge */ /* synthetic */ void setIdentifier(View view, int i) {
    }

    public /* bridge */ /* synthetic */ void setPresentationStyle(View view, String str) {
    }

    @ReactProp(name = "statusBarTranslucent")
    public void setStatusBarTranslucent(A6P a6p, boolean z) {
        a6p.setStatusBarTranslucent(z);
    }

    @ReactProp(name = "statusBarTranslucent")
    public /* bridge */ /* synthetic */ void setStatusBarTranslucent(View view, boolean z) {
        ((A6P) view).setStatusBarTranslucent(z);
    }

    public /* bridge */ /* synthetic */ void setSupportedOrientations(View view, A1e a1e) {
    }

    @ReactProp(name = "transparent")
    public void setTransparent(A6P a6p, boolean z) {
        a6p.A03 = z;
    }

    @ReactProp(name = "transparent")
    public /* bridge */ /* synthetic */ void setTransparent(View view, boolean z) {
        ((A6P) view).A03 = z;
    }

    public Object updateState(A6P a6p, C230099zE r5, C230379zz r6) {
        Point A00 = A6S.A00(a6p.getContext());
        a6p.A01.A08(r6, A00.x, A00.y);
        return null;
    }
}
