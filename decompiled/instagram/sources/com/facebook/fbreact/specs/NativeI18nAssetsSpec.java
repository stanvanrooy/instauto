package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import java.util.Map;
import p000X.A44;
import p000X.C139155x8;

public abstract class NativeI18nAssetsSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, C139155x8 {
    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract String getAssetContent(String str);

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract double getDictionarySize();

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract String getString(String str);

    public abstract Map getTypedExportedConstants();

    public final Map getConstants() {
        return getTypedExportedConstants();
    }

    public NativeI18nAssetsSpec(A44 a44) {
        super(a44);
    }
}
