package com.facebook.react.modules.core;

import android.net.Uri;
import com.facebook.fbreact.specs.NativeDeviceEventManagerSpec;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.queue.MessageQueueThread;
import com.facebook.react.module.annotations.ReactModule;
import com.instagram.react.modules.navigator.IgReactNavigatorModule;
import p000X.A44;
import p000X.AnonymousClass0FY;
import p000X.C227819rD;
import p000X.C227829rE;
import p000X.C228259s1;
import p000X.C23041A0r;

@ReactModule(name = "DeviceEventManager")
public class DeviceEventManagerModule extends NativeDeviceEventManagerSpec {
    public static final String NAME = "DeviceEventManager";
    public final Runnable mInvokeDefaultBackPressRunnable;

    public interface RCTDeviceEventEmitter extends JavaScriptModule {
        void emit(String str, Object obj);
    }

    public String getName() {
        return NAME;
    }

    public DeviceEventManagerModule(A44 a44, C227819rD r3) {
        super(a44);
        this.mInvokeDefaultBackPressRunnable = new C227829rE(this, r3);
    }

    public void emitHardwareBackPressed() {
        A44 reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            ((RCTDeviceEventEmitter) reactApplicationContextIfActiveOrWarn.A01(RCTDeviceEventEmitter.class)).emit("hardwareBackPress", (Object) null);
        }
    }

    public void emitNewIntentReceived(Uri uri) {
        A44 reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            C228259s1 A03 = C23041A0r.A03();
            A03.putString(IgReactNavigatorModule.URL, uri.toString());
            ((RCTDeviceEventEmitter) reactApplicationContextIfActiveOrWarn.A01(RCTDeviceEventEmitter.class)).emit(IgReactNavigatorModule.URL, A03);
        }
    }

    public void invokeDefaultBackPressHandler() {
        A44 reactApplicationContext = getReactApplicationContext();
        Runnable runnable = this.mInvokeDefaultBackPressRunnable;
        MessageQueueThread messageQueueThread = reactApplicationContext.A05;
        AnonymousClass0FY.A00(messageQueueThread);
        messageQueueThread.runOnQueue(runnable);
    }
}
