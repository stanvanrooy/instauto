package com.facebook.react.modules.appstate;

import com.facebook.fbreact.specs.NativeAppStateSpec;
import com.facebook.react.bridge.Callback;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.util.HashMap;
import java.util.Map;
import p000X.A44;
import p000X.A47;
import p000X.Constants;
import p000X.C228259s1;
import p000X.C23041A0r;

@ReactModule(name = "AppState")
public class AppStateModule extends NativeAppStateSpec implements A47 {
    public static final String APP_STATE_ACTIVE = "active";
    public static final String APP_STATE_BACKGROUND = "background";
    public static final String INITIAL_STATE = "initialAppState";
    public static final String NAME = "AppState";
    public static final String TAG = "AppStateModule";
    public String mAppState;

    public void addListener(String str) {
    }

    public void getCurrentAppState(Callback callback, Callback callback2) {
        callback.invoke(createAppStateEventMap());
    }

    public String getName() {
        return NAME;
    }

    public void onHostDestroy() {
    }

    public void removeListeners(double d) {
    }

    public Map getTypedExportedConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put(INITIAL_STATE, this.mAppState);
        return hashMap;
    }

    public void onHostPause() {
        this.mAppState = APP_STATE_BACKGROUND;
        sendAppStateChangeEvent();
    }

    public void onHostResume() {
        this.mAppState = APP_STATE_ACTIVE;
        sendAppStateChangeEvent();
    }

    public AppStateModule(A44 a44) {
        super(a44);
        String str;
        a44.A06(this);
        a44.A0B.add(this);
        if (a44.A06 == Constants.A0C) {
            str = APP_STATE_ACTIVE;
        } else {
            str = APP_STATE_BACKGROUND;
        }
        this.mAppState = str;
    }

    private C228259s1 createAppStateEventMap() {
        C228259s1 A03 = C23041A0r.A03();
        A03.putString("app_state", this.mAppState);
        return A03;
    }

    private void sendAppStateChangeEvent() {
        sendEvent("appStateDidChange", createAppStateEventMap());
    }

    private void sendEvent(String str, Object obj) {
        A44 reactApplicationContext = getReactApplicationContext();
        if (reactApplicationContext != null && reactApplicationContext.A0A()) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactApplicationContext.A01(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, obj);
        }
    }

    public void onWindowFocusChange(boolean z) {
        sendEvent("appStateFocusChange", Boolean.valueOf(z));
    }
}
