package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import java.util.Map;
import p000X.A44;
import p000X.C139155x8;
import p000X.C23043A0y;

public abstract class NativeIgDialogSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, C139155x8 {
    public abstract Map getTypedExportedConstants();

    @ReactMethod
    public abstract void showDialog(String str, String str2, C23043A0y a0y, Callback callback, Callback callback2);

    public NativeIgDialogSpec(A44 a44) {
        super(a44);
    }

    public final Map getConstants() {
        return getTypedExportedConstants();
    }
}
