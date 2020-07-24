package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import p000X.A1e;
import p000X.A44;
import p000X.C139155x8;
import p000X.C2102594w;
import p000X.C23043A0y;

public abstract class NativeIGPurchaseExperienceBridgeModuleSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, C139155x8 {
    @ReactMethod
    public void authenticate(double d, C23043A0y a0y, C2102594w r4) {
    }

    @ReactMethod
    public abstract void checkoutConfirmationWillDismiss();

    @ReactMethod
    public abstract void dismissCheckout(double d, boolean z);

    @ReactMethod
    public abstract void getCheckoutInformation(C2102594w r1);

    @ReactMethod
    public abstract void onPaymentSuccess(String str, boolean z, String str2, A1e a1e, A1e a1e2);

    @ReactMethod
    public void openConnectFlow(double d, C23043A0y a0y, C2102594w r4) {
    }

    @ReactMethod
    public abstract void sharePurchaseToStory(double d, String str, String str2);

    public NativeIGPurchaseExperienceBridgeModuleSpec(A44 a44) {
        super(a44);
    }
}
