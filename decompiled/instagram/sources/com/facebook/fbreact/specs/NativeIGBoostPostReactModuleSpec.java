package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import p000X.A44;
import p000X.C139155x8;

public abstract class NativeIGBoostPostReactModuleSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, C139155x8 {
    @ReactMethod
    public abstract void addListener(String str);

    @ReactMethod
    public abstract void clearTokenAndReLoginToFB(Callback callback, Callback callback2);

    @ReactMethod
    public abstract void clearWebviewCookie();

    @ReactMethod
    public abstract void dismissModalWithReactTag(double d);

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract String getBusinessUserAccessToken();

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract String getFBAccessToken();

    @ReactMethod
    public abstract void getFBAuth(Callback callback, Callback callback2);

    @ReactMethod
    public abstract void navigateToAppealPostWithReactTag(double d, String str, String str2);

    @ReactMethod
    public abstract void navigateToBoostPost(String str, String str2);

    @ReactMethod
    public abstract void navigateToBoostPostHECAppealAudience(String str, String str2, String str3, String str4, double d);

    @ReactMethod
    public abstract void navigateToCampaignControls(String str, String str2);

    @ReactMethod
    public abstract void navigateToCreatePromotion();

    @ReactMethod
    public abstract void pushAdsPreviewForMediaID(String str, String str2, double d, String str3);

    @ReactMethod
    public abstract void refreshMediaAfterPromotion(String str);

    @ReactMethod
    public abstract void removeListeners(double d);

    @ReactMethod
    public abstract void showPromotePreview(String str, String str2, String str3, Boolean bool, Boolean bool2);

    @ReactMethod
    public abstract void warmUpBusinessUserAccessToken(Callback callback);

    public NativeIGBoostPostReactModuleSpec(A44 a44) {
        super(a44);
    }
}
