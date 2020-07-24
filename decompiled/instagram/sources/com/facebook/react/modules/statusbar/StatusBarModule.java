package com.facebook.react.modules.statusbar;

import android.app.Activity;
import android.os.Build;
import com.facebook.fbreact.specs.NativeStatusBarManagerAndroidSpec;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.HashMap;
import java.util.Map;
import p000X.A44;
import p000X.A5J;
import p000X.A5M;
import p000X.A5N;
import p000X.AnonymousClass0C5;
import p000X.AnonymousClass0CH;
import p000X.AnonymousClass951;
import p000X.C157316nj;
import p000X.C228039ra;

@ReactModule(name = "StatusBarManager")
public class StatusBarModule extends NativeStatusBarManagerAndroidSpec {
    public static final String DEFAULT_BACKGROUND_COLOR_KEY = "DEFAULT_BACKGROUND_COLOR";
    public static final String HEIGHT_KEY = "HEIGHT";
    public static final String NAME = "StatusBarManager";

    public String getName() {
        return NAME;
    }

    public void setColor(double d, boolean z) {
        int i = (int) d;
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            AnonymousClass0CH.A07("ReactNative", "StatusBarModule: Ignored status bar change, current activity is null.");
        } else if (Build.VERSION.SDK_INT >= 21) {
            C228039ra.A01(new A5J(this, getReactApplicationContext(), currentActivity, z, i));
        }
    }

    public Map getTypedExportedConstants() {
        float f;
        String str;
        A44 reactApplicationContext = getReactApplicationContext();
        Activity currentActivity = getCurrentActivity();
        int identifier = reactApplicationContext.getResources().getIdentifier(AnonymousClass0C5.$const$string(38), "dimen", "android");
        if (identifier > 0) {
            f = ((float) reactApplicationContext.getResources().getDimensionPixelSize(identifier)) / AnonymousClass951.A01.density;
        } else {
            f = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        }
        if (currentActivity == null || Build.VERSION.SDK_INT < 21) {
            str = "black";
        } else {
            str = String.format("#%06X", new Object[]{Integer.valueOf(currentActivity.getWindow().getStatusBarColor() & 16777215)});
        }
        Float valueOf = Float.valueOf(f);
        HashMap hashMap = new HashMap();
        hashMap.put(HEIGHT_KEY, valueOf);
        hashMap.put(DEFAULT_BACKGROUND_COLOR_KEY, str);
        return hashMap;
    }

    public void setHidden(boolean z) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            AnonymousClass0CH.A07("ReactNative", "StatusBarModule: Ignored status bar change, current activity is null.");
        } else {
            C228039ra.A01(new A5N(this, z, currentActivity));
        }
    }

    public void setStyle(String str) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            AnonymousClass0CH.A07("ReactNative", "StatusBarModule: Ignored status bar change, current activity is null.");
        } else if (Build.VERSION.SDK_INT >= 23) {
            C228039ra.A01(new A5M(this, currentActivity, str));
        }
    }

    public void setTranslucent(boolean z) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            AnonymousClass0CH.A07("ReactNative", "StatusBarModule: Ignored status bar change, current activity is null.");
        } else if (Build.VERSION.SDK_INT >= 21) {
            C228039ra.A01(new C157316nj(this, getReactApplicationContext(), currentActivity, z));
        }
    }

    public StatusBarModule(A44 a44) {
        super(a44);
    }
}
