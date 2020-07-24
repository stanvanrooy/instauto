package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import java.util.Map;
import p000X.A1e;
import p000X.A44;
import p000X.C139155x8;
import p000X.C206608tl;
import p000X.C228259s1;
import p000X.C23043A0y;

public abstract class NativeUIManagerSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, C139155x8 {
    @ReactMethod
    public abstract void blur(Double d);

    @ReactMethod
    public abstract void clearJSResponder();

    @ReactMethod
    public abstract void configureNextLayoutAnimation(C23043A0y a0y, Callback callback, Callback callback2);

    @ReactMethod
    public abstract void createView(Double d, String str, double d2, C23043A0y a0y);

    @ReactMethod
    public abstract void dismissPopupMenu();

    @ReactMethod
    public abstract void dispatchViewManagerCommand(Double d, double d2, A1e a1e);

    @ReactMethod
    public abstract void findSubviewIn(Double d, A1e a1e, Callback callback);

    @ReactMethod
    public abstract void focus(Double d);

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract C228259s1 getConstantsForViewManager(String str);

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract C206608tl getDefaultEventTypes();

    public abstract Map getTypedExportedConstants();

    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract C228259s1 lazilyLoadView(String str);

    @ReactMethod
    public abstract void manageChildren(Double d, A1e a1e, A1e a1e2, A1e a1e3, A1e a1e4, A1e a1e5);

    @ReactMethod
    public abstract void measure(Double d, Callback callback);

    @ReactMethod
    public abstract void measureInWindow(Double d, Callback callback);

    @ReactMethod
    public abstract void measureLayout(Double d, Double d2, Callback callback, Callback callback2);

    @ReactMethod
    public abstract void measureLayoutRelativeToParent(Double d, Callback callback, Callback callback2);

    @ReactMethod
    public abstract void removeSubviewsFromContainerWithID(double d);

    @ReactMethod
    public abstract void replaceExistingNonRootView(Double d, Double d2);

    @ReactMethod
    public abstract void sendAccessibilityEvent(Double d, double d2);

    @ReactMethod
    public abstract void setChildren(Double d, A1e a1e);

    @ReactMethod
    public abstract void setJSResponder(Double d, boolean z);

    @ReactMethod
    public abstract void setLayoutAnimationEnabledExperimental(boolean z);

    @ReactMethod
    public abstract void showPopupMenu(Double d, A1e a1e, Callback callback, Callback callback2);

    @ReactMethod
    public abstract void updateView(double d, String str, C23043A0y a0y);

    @ReactMethod
    public abstract void viewIsDescendantOf(Double d, Double d2, Callback callback);

    public final Map getConstants() {
        return getTypedExportedConstants();
    }

    public NativeUIManagerSpec(A44 a44) {
        super(a44);
    }
}
