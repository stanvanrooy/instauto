package com.facebook.react.modules.toast;

import com.facebook.fbreact.specs.NativeToastAndroidSpec;
import com.facebook.react.module.annotations.ReactModule;
import java.util.HashMap;
import java.util.Map;
import p000X.A44;
import p000X.A8w;
import p000X.C228039ra;
import p000X.C23132A8x;
import p000X.C23133A8y;

@ReactModule(name = "ToastAndroid")
public class ToastModule extends NativeToastAndroidSpec {
    public static final String DURATION_LONG_KEY = "LONG";
    public static final String DURATION_SHORT_KEY = "SHORT";
    public static final String GRAVITY_BOTTOM_KEY = "BOTTOM";
    public static final String GRAVITY_CENTER = "CENTER";
    public static final String GRAVITY_TOP_KEY = "TOP";
    public static final String NAME = "ToastAndroid";

    public String getName() {
        return NAME;
    }

    public void show(String str, double d) {
        C228039ra.A01(new C23133A8y(this, str, (int) d));
    }

    public void showWithGravity(String str, double d, double d2) {
        C228039ra.A01(new A8w(this, str, (int) d, (int) d2));
    }

    public void showWithGravityAndOffset(String str, double d, double d2, double d3, double d4) {
        C228039ra.A01(new C23132A8x(this, str, (int) d, (int) d2, (int) d3, (int) d4));
    }

    public Map getTypedExportedConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put(DURATION_SHORT_KEY, 0);
        hashMap.put(DURATION_LONG_KEY, 1);
        hashMap.put("TOP", 49);
        hashMap.put("BOTTOM", 81);
        hashMap.put("CENTER", 17);
        return hashMap;
    }

    public ToastModule(A44 a44) {
        super(a44);
    }
}
