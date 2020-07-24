package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import p000X.A1e;
import p000X.A44;
import p000X.C139155x8;
import p000X.C2102594w;
import p000X.C23043A0y;

public abstract class NativePushNotificationManagerIOSSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, C139155x8 {
    @ReactMethod
    public abstract void abandonPermissions();

    @ReactMethod
    public abstract void addListener(String str);

    @ReactMethod
    public abstract void cancelAllLocalNotifications();

    @ReactMethod
    public abstract void cancelLocalNotifications(C23043A0y a0y);

    @ReactMethod
    public abstract void checkPermissions(Callback callback);

    @ReactMethod
    public abstract void getApplicationIconBadgeNumber(Callback callback);

    @ReactMethod
    public abstract void getDeliveredNotifications(Callback callback);

    @ReactMethod
    public abstract void getInitialNotification(C2102594w r1);

    @ReactMethod
    public abstract void getScheduledLocalNotifications(Callback callback);

    @ReactMethod
    public abstract void onFinishRemoteNotification(String str, String str2);

    @ReactMethod
    public abstract void presentLocalNotification(C23043A0y a0y);

    @ReactMethod
    public abstract void removeAllDeliveredNotifications();

    @ReactMethod
    public abstract void removeDeliveredNotifications(A1e a1e);

    @ReactMethod
    public abstract void removeListeners(double d);

    @ReactMethod
    public abstract void requestPermissions(C23043A0y a0y, C2102594w r2);

    @ReactMethod
    public abstract void scheduleLocalNotification(C23043A0y a0y);

    @ReactMethod
    public abstract void setApplicationIconBadgeNumber(double d);

    public NativePushNotificationManagerIOSSpec(A44 a44) {
        super(a44);
    }
}
