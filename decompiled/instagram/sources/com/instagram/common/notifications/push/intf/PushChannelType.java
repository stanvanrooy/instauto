package com.instagram.common.notifications.push.intf;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

public enum PushChannelType {
    NONE(NetInfoModule.CONNECTION_TYPE_NONE, (int) null),
    AMAZON("android_adm", (int) null),
    FBNS("android_mqtt", "⚡"),
    FCM("android_fcm", "🔥");
    
    public final String A00;
    public final String A01;

    /* access modifiers changed from: public */
    PushChannelType(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }
}
