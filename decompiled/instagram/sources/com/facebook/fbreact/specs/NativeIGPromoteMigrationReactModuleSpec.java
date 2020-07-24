package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import p000X.A44;
import p000X.C139155x8;

public abstract class NativeIGPromoteMigrationReactModuleSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, C139155x8 {
    @ReactMethod
    public abstract void postDataFromCreateEditAudienceScreen(double d, String str);

    @ReactMethod
    public abstract void postDataFromDestinationWebsiteScreen(double d, String str, String str2);

    public NativeIGPromoteMigrationReactModuleSpec(A44 a44) {
        super(a44);
    }
}
