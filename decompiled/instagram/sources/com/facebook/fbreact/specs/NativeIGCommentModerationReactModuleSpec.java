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

public abstract class NativeIGCommentModerationReactModuleSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, C139155x8 {
    @ReactMethod
    public abstract void fetchBlockedCommenters(C2102594w r1);

    @ReactMethod
    public abstract void fetchCommentAudienceControlType(C2102594w r1);

    @ReactMethod
    public abstract void fetchCommentCategoryFilterDisabled(C2102594w r1);

    @ReactMethod
    public abstract void fetchCommentFilter(C2102594w r1);

    @ReactMethod
    public abstract void fetchCommentFilterKeywords(C2102594w r1);

    @ReactMethod
    public abstract void fetchCurrentUser(C2102594w r1);

    @ReactMethod
    public abstract void openCommenterBlockingViewControllerWithReactTag(double d, A1e a1e, Callback callback);

    @ReactMethod
    public abstract void setBlockedCommenters(C23043A0y a0y, C2102594w r2);

    @ReactMethod
    public abstract void setCommentAudienceControlType(String str, C2102594w r2);

    @ReactMethod
    public abstract void setCommentCategoryFilterDisabled(boolean z, C2102594w r2);

    @ReactMethod
    public abstract void setCustomKeywords(String str, C2102594w r2);

    @ReactMethod
    public abstract void setUseDefaultKeywords(boolean z, C2102594w r2);

    public NativeIGCommentModerationReactModuleSpec(A44 a44) {
        super(a44);
    }
}
