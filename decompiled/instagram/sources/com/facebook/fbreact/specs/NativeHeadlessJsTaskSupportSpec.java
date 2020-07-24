package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import p000X.A44;
import p000X.C139155x8;
import p000X.C2102594w;

public abstract class NativeHeadlessJsTaskSupportSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, C139155x8 {
    @ReactMethod
    public abstract void notifyTaskFinished(double d);

    @ReactMethod
    public abstract void notifyTaskRetry(double d, C2102594w r3);

    public NativeHeadlessJsTaskSupportSpec(A44 a44) {
        super(a44);
    }
}
