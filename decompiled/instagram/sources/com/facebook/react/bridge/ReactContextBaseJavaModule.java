package com.facebook.react.bridge;

import android.app.Activity;
import p000X.A44;
import p000X.AnonymousClass000;
import p000X.AnonymousClass0FY;

public abstract class ReactContextBaseJavaModule extends BaseJavaModule {
    public final A44 mReactApplicationContext;

    public final Activity getCurrentActivity() {
        return this.mReactApplicationContext.A00();
    }

    public final A44 getReactApplicationContext() {
        A44 a44 = this.mReactApplicationContext;
        AnonymousClass0FY.A01(a44, "Tried to get ReactApplicationContext even though NativeModule wasn't instantiated with one");
        return a44;
    }

    public final A44 getReactApplicationContextIfActiveOrWarn() {
        if (this.mReactApplicationContext.A0A() || this.mReactApplicationContext.A09()) {
            return this.mReactApplicationContext;
        }
        ReactSoftException.logSoftException("ReactContextBaseJavaModule", new RuntimeException(AnonymousClass000.A0E("Catalyst Instance has already disappeared: requested by ", getName())));
        return null;
    }

    public ReactContextBaseJavaModule() {
        this.mReactApplicationContext = null;
    }

    public ReactContextBaseJavaModule(A44 a44) {
        this.mReactApplicationContext = a44;
    }
}
