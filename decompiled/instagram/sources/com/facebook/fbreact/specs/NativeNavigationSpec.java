package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import java.util.Map;
import p000X.A1e;
import p000X.A44;
import p000X.C139155x8;
import p000X.C23043A0y;

public abstract class NativeNavigationSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, C139155x8 {
    @ReactMethod
    public abstract void clearRightBarButton(double d);

    @ReactMethod
    public abstract void dismiss(double d, C23043A0y a0y);

    @ReactMethod
    public void getSavedInstanceState(double d, String str, Callback callback) {
    }

    public abstract Map getTypedExportedConstants();

    @ReactMethod
    public abstract void navigate(double d, String str, C23043A0y a0y);

    @ReactMethod
    public abstract void openURL(double d, String str);

    @ReactMethod
    public abstract void pop(double d);

    @ReactMethod
    public void popToScreen(double d, double d2) {
    }

    @ReactMethod
    public void present(double d, String str) {
    }

    @ReactMethod
    public abstract void reloadReact();

    @ReactMethod
    public void replaceTarget(double d, String str, String str2) {
    }

    @ReactMethod
    public abstract void setBarLeftAction(double d, C23043A0y a0y);

    @ReactMethod
    public abstract void setBarPrimaryAction(double d, C23043A0y a0y);

    @ReactMethod
    public abstract void setBarTitle(double d, String str);

    @ReactMethod
    public void setBarTitleWithConfig(double d, C23043A0y a0y) {
    }

    @ReactMethod
    public void setInstanceStateToSave(double d, String str, C23043A0y a0y) {
    }

    @ReactMethod
    public void setRouteStack(double d, A1e a1e) {
    }

    @ReactMethod
    public void updateAppRegistryConfiguration(String str) {
    }

    @ReactMethod
    public void updateNativeRoutesConfiguration(String str) {
    }

    public NativeNavigationSpec(A44 a44) {
        super(a44);
    }

    public final Map getConstants() {
        return getTypedExportedConstants();
    }
}
