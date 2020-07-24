package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import p000X.A44;
import p000X.C139155x8;

public abstract class NativeIGInsightsReactModuleSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, C139155x8 {
    @ReactMethod
    public abstract void navigateToCreatePromotion();

    @ReactMethod
    public abstract void navigateToFeedbackChannel(String str);

    @ReactMethod
    public abstract void navigateToSeeMorePromotions();

    @ReactMethod
    public abstract void navigateToSingleFeedView(String str);

    @ReactMethod
    public abstract void navigateToStoriesCamera();

    @ReactMethod
    public abstract void navigateToTopPostsCamera();

    @ReactMethod
    public abstract void onFilterChangedInsightsAccountGrowth(double d, double d2);

    @ReactMethod
    public void showInsightsFilterView(String str, String str2, String str3, String str4, String str5) {
    }

    public NativeIGInsightsReactModuleSpec(A44 a44) {
        super(a44);
    }
}
