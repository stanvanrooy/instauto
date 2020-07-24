package com.facebook.react.modules.dialog;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.fbreact.specs.NativeDialogManagerAndroidSpec;
import com.facebook.react.bridge.Callback;
import com.facebook.react.module.annotations.ReactModule;
import java.util.HashMap;
import java.util.Map;
import p000X.A1e;
import p000X.A44;
import p000X.A47;
import p000X.ABq;
import p000X.AnonymousClass0CH;
import p000X.C228039ra;
import p000X.C228139ro;
import p000X.C23043A0y;
import p000X.C23187ABr;
import p000X.C23189ABt;

@ReactModule(name = "DialogManagerAndroid")
public class DialogModule extends NativeDialogManagerAndroidSpec implements A47 {
    public static final String ACTION_BUTTON_CLICKED = "buttonClicked";
    public static final String ACTION_DISMISSED = "dismissed";
    public static final Map CONSTANTS;
    public static final String FRAGMENT_TAG = "com.facebook.catalyst.react.dialog.DialogModule";
    public static final String KEY_BUTTON_NEGATIVE = "buttonNegative";
    public static final String KEY_BUTTON_NEUTRAL = "buttonNeutral";
    public static final String KEY_BUTTON_POSITIVE = "buttonPositive";
    public static final String KEY_CANCELABLE = "cancelable";
    public static final String KEY_ITEMS = "items";
    public static final String KEY_MESSAGE = "message";
    public static final String KEY_TITLE = "title";
    public static final String NAME = "DialogManagerAndroid";
    public boolean mIsInForeground;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(ACTION_BUTTON_CLICKED, ACTION_BUTTON_CLICKED);
        hashMap.put(ACTION_DISMISSED, ACTION_DISMISSED);
        hashMap.put(KEY_BUTTON_POSITIVE, -1);
        hashMap.put(KEY_BUTTON_NEGATIVE, -2);
        hashMap.put(KEY_BUTTON_NEUTRAL, -3);
        CONSTANTS = hashMap;
    }

    public String getName() {
        return NAME;
    }

    public void onHostDestroy() {
    }

    public void onHostPause() {
        this.mIsInForeground = false;
    }

    public void onHostResume() {
        this.mIsInForeground = true;
        C23189ABt fragmentManagerHelper = getFragmentManagerHelper();
        if (fragmentManagerHelper != null) {
            C228039ra.A00();
            C228139ro.A00(fragmentManagerHelper.A02.mIsInForeground, "showPendingAlert() called in background");
            if (fragmentManagerHelper.A00 != null) {
                C23189ABt.A00(fragmentManagerHelper);
                ((C23187ABr) fragmentManagerHelper.A00).A06(fragmentManagerHelper.A01, FRAGMENT_TAG);
                fragmentManagerHelper.A00 = null;
                return;
            }
            return;
        }
        AnonymousClass0CH.A01(DialogModule.class, "onHostResume called but no FragmentManager found");
    }

    private C23189ABt getFragmentManagerHelper() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null || !(currentActivity instanceof FragmentActivity)) {
            return null;
        }
        return new C23189ABt(this, ((FragmentActivity) currentActivity).A05());
    }

    public Map getTypedExportedConstants() {
        return CONSTANTS;
    }

    public void initialize() {
        getReactApplicationContext().A06(this);
    }

    public void showAlert(C23043A0y a0y, Callback callback, Callback callback2) {
        C23189ABt fragmentManagerHelper = getFragmentManagerHelper();
        if (fragmentManagerHelper == null) {
            callback.invoke("Tried to show an alert while not attached to an Activity");
            return;
        }
        Bundle bundle = new Bundle();
        if (a0y.hasKey(KEY_TITLE)) {
            bundle.putString(KEY_TITLE, a0y.getString(KEY_TITLE));
        }
        if (a0y.hasKey(KEY_MESSAGE)) {
            bundle.putString(KEY_MESSAGE, a0y.getString(KEY_MESSAGE));
        }
        if (a0y.hasKey(KEY_BUTTON_POSITIVE)) {
            bundle.putString("button_positive", a0y.getString(KEY_BUTTON_POSITIVE));
        }
        if (a0y.hasKey(KEY_BUTTON_NEGATIVE)) {
            bundle.putString("button_negative", a0y.getString(KEY_BUTTON_NEGATIVE));
        }
        if (a0y.hasKey(KEY_BUTTON_NEUTRAL)) {
            bundle.putString("button_neutral", a0y.getString(KEY_BUTTON_NEUTRAL));
        }
        if (a0y.hasKey("items")) {
            A1e array = a0y.getArray("items");
            CharSequence[] charSequenceArr = new CharSequence[array.size()];
            for (int i = 0; i < array.size(); i++) {
                charSequenceArr[i] = array.getString(i);
            }
            bundle.putCharSequenceArray("items", charSequenceArr);
        }
        if (a0y.hasKey(KEY_CANCELABLE)) {
            bundle.putBoolean(KEY_CANCELABLE, a0y.getBoolean(KEY_CANCELABLE));
        }
        C228039ra.A01(new ABq(this, fragmentManagerHelper, bundle, callback2));
    }

    public DialogModule(A44 a44) {
        super(a44);
    }
}
