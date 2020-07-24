package com.instagram.notifications.push;

import android.content.Intent;
import p000X.AnonymousClass000;
import p000X.Constants;
import p000X.AnonymousClass0EY;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0QD;
import p000X.C05180Im;
import p000X.C54972Zr;

public class IgPushRegistrationService extends AnonymousClass0EY {
    public final void onHandleWork(Intent intent) {
        if (intent == null) {
            try {
                AnonymousClass0QD.A01("IgPushRegistrationService", "onHandleWork - Null Intent");
            } catch (RuntimeException e) {
                AnonymousClass0QD.A08("IgPushRegistrationService", "onHandleWork - runtime exception", e, 1);
            }
        } else if (intent.getExtras() == null) {
            AnonymousClass0QD.A01("IgPushRegistrationService", "onHandleWork - Empty extras");
        } else {
            String string = intent.getExtras().getString("PushRegistrationService.USER_ID");
            if (!AnonymousClass0J1.A09(string, Constants.ONE, new C54972Zr(intent), (C05180Im) null)) {
                AnonymousClass0QD.A01("IgPushRegistrationService", AnonymousClass000.A0E("onHandleWork - Error when adding operation, given id is not authenticated: ", string));
            }
        }
    }
}
