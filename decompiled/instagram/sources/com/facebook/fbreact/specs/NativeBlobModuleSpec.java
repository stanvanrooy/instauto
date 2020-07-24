package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import java.util.Map;
import p000X.A1e;
import p000X.A44;
import p000X.C139155x8;
import p000X.C23043A0y;

public abstract class NativeBlobModuleSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, C139155x8 {
    @ReactMethod
    public abstract void addNetworkingHandler();

    @ReactMethod
    public abstract void addWebSocketHandler(double d);

    @ReactMethod
    public abstract void createFromParts(A1e a1e, String str);

    public abstract Map getTypedExportedConstants();

    @ReactMethod
    public abstract void release(String str);

    @ReactMethod
    public abstract void removeWebSocketHandler(double d);

    @ReactMethod
    public abstract void sendOverSocket(C23043A0y a0y, double d);

    public NativeBlobModuleSpec(A44 a44) {
        super(a44);
    }

    public final Map getConstants() {
        return getTypedExportedConstants();
    }
}
