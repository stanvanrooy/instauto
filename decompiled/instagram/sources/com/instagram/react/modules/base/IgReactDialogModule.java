package com.instagram.react.modules.base;

import android.app.Activity;
import android.app.Dialog;
import com.facebook.fbreact.specs.NativeIgDialogSpec;
import com.facebook.react.bridge.Callback;
import com.facebook.react.module.annotations.ReactModule;
import java.util.HashMap;
import java.util.Map;
import p000X.A44;
import p000X.AnonymousClass5F4;
import p000X.C144756Gy;
import p000X.C23043A0y;

@ReactModule(name = "IgDialog")
public class IgReactDialogModule extends NativeIgDialogSpec {
    public static final String CANCELABLE_KEY = "IS_CANCELABLE";
    public static final String CANCELED_ON_TOUCH_OUTSIDE_KEY = "CANCELED_ON_TOUCH_OUTSIDE";
    public static final String GRAVITY_BOTTOM = "BOTTOM";
    public static final String GRAVITY_CENTER = "CENTER";
    public static final String GRAVITY_TOP = "TOP";
    public static final String MESSAGE_GRAVITY_KEY = "MESSAGE_GRAVITY";
    public static final String MODULE_NAME = "IgDialog";
    public static final String NEGATIVE_BUTTON_KEY = "NEGATIVE_BUTTON";
    public static final String NEGATIVE_BUTTON_TEXT_KEY = "NEGATIVE_BUTTON_TEXT";
    public static final String POSITIVE_BUTTON_KEY = "POSITIVE_BUTTON";
    public static final String POSITIVE_BUTTON_TEXT_KEY = "POSITIVE_BUTTON_TEXT";

    public String getName() {
        return MODULE_NAME;
    }

    public Map getTypedExportedConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put(CANCELABLE_KEY, CANCELABLE_KEY);
        hashMap.put(CANCELED_ON_TOUCH_OUTSIDE_KEY, CANCELED_ON_TOUCH_OUTSIDE_KEY);
        hashMap.put(MESSAGE_GRAVITY_KEY, MESSAGE_GRAVITY_KEY);
        hashMap.put(NEGATIVE_BUTTON_TEXT_KEY, NEGATIVE_BUTTON_TEXT_KEY);
        hashMap.put(NEGATIVE_BUTTON_KEY, -2);
        hashMap.put(POSITIVE_BUTTON_KEY, -1);
        hashMap.put(POSITIVE_BUTTON_TEXT_KEY, POSITIVE_BUTTON_TEXT_KEY);
        hashMap.put("TOP", 48);
        hashMap.put("CENTER", 17);
        hashMap.put("BOTTOM", 80);
        return hashMap;
    }

    public IgReactDialogModule(A44 a44) {
        super(a44);
    }

    public Dialog showDialogHelper(String str, String str2, C23043A0y a0y, Callback callback, Callback callback2) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return null;
        }
        AnonymousClass5F4 r3 = new AnonymousClass5F4(currentActivity);
        if (str != null && !str.isEmpty()) {
            r3.A05(str);
        }
        if (str2 != null && !str2.isEmpty()) {
            r3.A04(str2);
        }
        if (a0y.hasKey(MESSAGE_GRAVITY_KEY)) {
            int i = a0y.getInt(MESSAGE_GRAVITY_KEY);
            r3.A08.setGravity(i);
            r3.A05.setGravity(i);
        }
        if (a0y.hasKey(CANCELABLE_KEY)) {
            r3.A08(a0y.getBoolean(CANCELABLE_KEY));
        }
        if (a0y.hasKey(CANCELED_ON_TOUCH_OUTSIDE_KEY)) {
            r3.A09(a0y.getBoolean(CANCELED_ON_TOUCH_OUTSIDE_KEY));
        }
        C144756Gy r2 = new C144756Gy(callback2, callback);
        if (a0y.hasKey(NEGATIVE_BUTTON_TEXT_KEY)) {
            r3.A06(a0y.getString(NEGATIVE_BUTTON_TEXT_KEY), r2);
        }
        if (a0y.hasKey(POSITIVE_BUTTON_TEXT_KEY)) {
            r3.A07(a0y.getString(POSITIVE_BUTTON_TEXT_KEY), r2);
        }
        r3.A0A.setOnDismissListener(r2);
        Dialog A00 = r3.A00();
        A00.show();
        return A00;
    }

    public void showDialog(String str, String str2, C23043A0y a0y, Callback callback, Callback callback2) {
        showDialogHelper(str, str2, a0y, callback, callback2);
    }
}
