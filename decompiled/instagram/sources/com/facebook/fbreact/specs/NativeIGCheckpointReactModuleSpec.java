package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import p000X.A44;
import p000X.C139155x8;
import p000X.C2102594w;
import p000X.C23043A0y;

public abstract class NativeIGCheckpointReactModuleSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, C139155x8 {
    @ReactMethod
    public abstract void closeCheckpoint(double d);

    @ReactMethod
    public abstract void continueChallengeWithData(C23043A0y a0y, double d);

    @ReactMethod
    public abstract void extractCountryCodeAndNumber(String str, C2102594w r2);

    @ReactMethod
    public void fetchBBT(C2102594w r1) {
    }

    @ReactMethod
    public abstract void fetchFacebookToken(C2102594w r1);

    @ReactMethod
    public void fetchGoogleOAuthToken(double d, C2102594w r3) {
    }

    @ReactMethod
    public abstract void generateURIWithPreviewDataString(String str, C2102594w r2);

    @ReactMethod
    public abstract void getEncryptedPassword(String str, String str2, C2102594w r3);

    @ReactMethod
    public void goToHomeScreen() {
    }

    @ReactMethod
    public abstract void logoutAllUsersWithReactTag(double d);

    @ReactMethod
    public abstract void proceedAndUpdateChallengeWithParams(C23043A0y a0y, C23043A0y a0y2, double d, C2102594w r5);

    @ReactMethod
    public abstract void proceedChallengeWithParams(C23043A0y a0y, C2102594w r2);

    @ReactMethod
    public abstract void replayChallengeWithParams(C23043A0y a0y, C2102594w r2);

    @ReactMethod
    public abstract void resetChallengeWithReactTag(double d);

    public NativeIGCheckpointReactModuleSpec(A44 a44) {
        super(a44);
    }
}
