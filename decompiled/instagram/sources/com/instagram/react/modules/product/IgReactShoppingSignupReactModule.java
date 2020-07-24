package com.instagram.react.modules.product;

import android.app.Activity;
import com.facebook.fbreact.specs.NativeIGShoppingBusinessSignupModuleSpec;
import com.facebook.react.bridge.Callback;
import com.facebook.react.module.annotations.ReactModule;
import com.instagram.realtimeclient.RealtimeSubscription;
import p000X.A44;
import p000X.Constants;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0C5;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0QD;
import p000X.AnonymousClass1N4;
import p000X.AnonymousClass4XO;
import p000X.C06360Ot;
import p000X.C109954oU;
import p000X.C109964oV;
import p000X.C12810hQ;
import p000X.C13300iJ;
import p000X.C15890nh;
import p000X.C17850qu;
import p000X.C468621e;
import p000X.C64372rN;

@ReactModule(name = "IGShoppingSignupReactModule")
public class IgReactShoppingSignupReactModule extends NativeIGShoppingBusinessSignupModuleSpec {
    public static final String HAS_DECLINED_SHOPPING_SIGNUP = "has_declined_shopping_signup";
    public static final String MODULE_NAME = "IGShoppingSignupReactModule";

    public String getName() {
        return MODULE_NAME;
    }

    public static C17850qu createUserSignupTask(AnonymousClass0C1 r3, boolean z) {
        C15890nh r2 = new C15890nh(r3);
        r2.A09 = Constants.ONE;
        r2.A0C = "commerce/signup/";
        r2.A06(AnonymousClass1N4.class, false);
        if (z) {
            r2.A09(HAS_DECLINED_SHOPPING_SIGNUP, RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        }
        r2.A0G = true;
        return r2.A03();
    }

    public IgReactShoppingSignupReactModule(A44 a44) {
        super(a44);
    }

    public void registerGetStarted(Callback callback, Callback callback2) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            C17850qu createUserSignupTask = createUserSignupTask(AnonymousClass0J1.A06(currentActivity.getIntent().getExtras()), false);
            createUserSignupTask.A00 = new C109964oV(this, callback, callback2);
            C12810hQ.A02(createUserSignupTask);
            return;
        }
        callback2.invoke(new Object[0]);
        AnonymousClass0QD.A09("IgReactShoppingSignupReactModule", new IllegalArgumentException("Activity can not be null to register get started"));
    }

    public void registerNotInterestedInShopping() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            AnonymousClass0C1 A06 = AnonymousClass0J1.A06(currentActivity.getIntent().getExtras());
            C13300iJ r3 = A06.A06;
            C468621e r2 = r3.A09;
            r3.A09 = C468621e.NOT_INTERESTED;
            r3.A0F(A06);
            C17850qu createUserSignupTask = createUserSignupTask(A06, true);
            createUserSignupTask.A00 = new AnonymousClass4XO(this, r3, r2, A06);
            C12810hQ.A02(createUserSignupTask);
            return;
        }
        AnonymousClass0QD.A09("IgReactShoppingSignupReactModule", new IllegalArgumentException("Activity can not be null to register not interested"));
    }

    public void syncShoppingOnboardingState(Callback callback, Callback callback2) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            AnonymousClass0C1 A06 = AnonymousClass0J1.A06(currentActivity.getIntent().getExtras());
            String A05 = C06360Ot.formatString(AnonymousClass0C5.$const$string(299), A06.A06.getId());
            C15890nh r2 = new C15890nh(A06);
            r2.A09 = Constants.A0N;
            r2.A0C = A05;
            r2.A06(C64372rN.class, false);
            C17850qu A03 = r2.A03();
            A03.A00 = new C109954oU(this, callback, callback2);
            C12810hQ.A02(A03);
            return;
        }
        AnonymousClass0QD.A0A("IgReactShoppingSignupReactModule", new IllegalArgumentException("Activity can not be null to sync the onboarding state"));
    }
}
