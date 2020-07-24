package com.instagram.notifications.push;

import android.content.Intent;
import com.amazon.device.messaging.ADMMessageHandlerBase;
import com.amazon.device.messaging.ADMMessageReceiver;
import com.instagram.common.notifications.push.intf.PushChannelType;
import p000X.AnonymousClass0QD;
import p000X.C16670oy;

public class ADMMessageHandler extends ADMMessageHandlerBase {

    public class Receiver extends ADMMessageReceiver {
        public Receiver() {
            super(ADMMessageHandler.class);
        }
    }

    public ADMMessageHandler() {
        super(ADMMessageHandler.class.getName());
    }

    public final void onRegistrationError(String str) {
        AnonymousClass0QD.A01("ADMMessagehandler onRegistrationError", str);
    }

    public final void onMessage(Intent intent) {
        C16670oy.A01().A08(intent, PushChannelType.AMAZON, (String) null);
    }

    public final void onRegistered(String str) {
        C16670oy.A01().A07(getApplicationContext(), str, PushChannelType.AMAZON, 0, false);
    }

    public final void onUnregistered(String str) {
        C16670oy.A01();
    }
}
