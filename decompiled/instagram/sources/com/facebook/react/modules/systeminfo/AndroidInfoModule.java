package com.facebook.react.modules.systeminfo;

import android.app.UiModeManager;
import android.os.Build;
import android.provider.Settings;
import com.facebook.fbreact.specs.NativePlatformConstantsAndroidSpec;
import com.facebook.react.module.annotations.ReactModule;
import java.util.HashMap;
import java.util.Map;
import p000X.A44;
import p000X.AnonymousClass0C5;
import p000X.C139155x8;
import p000X.C23062A3w;

@ReactModule(name = "PlatformConstants")
public class AndroidInfoModule extends NativePlatformConstantsAndroidSpec implements C139155x8 {
    public static final String IS_TESTING = "IS_TESTING";
    public static final String NAME = "PlatformConstants";

    public String getName() {
        return NAME;
    }

    public void invalidate() {
    }

    private Boolean isRunningScreenshotTest() {
        try {
            Class.forName("com.facebook.testing.react.screenshots.ReactAppScreenshotTestActivity");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0043, code lost:
        if (isRunningScreenshotTest().booleanValue() != false) goto L_0x0045;
     */
    public Map getTypedExportedConstants() {
        boolean z;
        HashMap hashMap = new HashMap();
        hashMap.put("Version", Integer.valueOf(Build.VERSION.SDK_INT));
        hashMap.put("Release", Build.VERSION.RELEASE);
        hashMap.put("Serial", Build.SERIAL);
        hashMap.put("Fingerprint", Build.FINGERPRINT);
        hashMap.put("Model", Build.MODEL);
        if (!"true".equals(System.getProperty("IS_TESTING"))) {
            z = false;
        }
        z = true;
        hashMap.put("isTesting", Boolean.valueOf(z));
        hashMap.put("reactNativeVersion", C23062A3w.A00);
        hashMap.put("uiMode", uiMode());
        return hashMap;
    }

    private String uiMode() {
        int currentModeType = ((UiModeManager) getReactApplicationContext().getSystemService("uimode")).getCurrentModeType();
        if (currentModeType == 1) {
            return "normal";
        }
        if (currentModeType == 2) {
            return "desk";
        }
        if (currentModeType == 3) {
            return "car";
        }
        if (currentModeType == 4) {
            return "tv";
        }
        if (currentModeType != 6) {
            return "unknown";
        }
        return "watch";
    }

    public String getAndroidID() {
        return Settings.Secure.getString(getReactApplicationContext().getContentResolver(), AnonymousClass0C5.$const$string(57));
    }

    public AndroidInfoModule(A44 a44) {
        super(a44);
    }
}
