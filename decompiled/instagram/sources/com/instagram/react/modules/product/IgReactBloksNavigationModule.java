package com.instagram.react.modules.product;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.facebook.fbreact.specs.NativeIGBloksNavigationReactModuleSpec;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;
import java.util.HashMap;
import java.util.Map;
import p000X.A44;
import p000X.AnonymousClass0RN;
import p000X.AnonymousClass1L8;
import p000X.AnonymousClass4MC;
import p000X.C06590Pq;
import p000X.C109934oQ;
import p000X.C109944oR;
import p000X.C228039ra;
import p000X.C23043A0y;
import p000X.C28351Lj;
import p000X.C53562Th;
import p000X.C53572Ti;

@ReactModule(name = "IGBloksNavigationReactModule")
public class IgReactBloksNavigationModule extends NativeIGBloksNavigationReactModuleSpec {
    public static final String MODULE_NAME = "IGBloksNavigationReactModule";
    public C06590Pq mSession;

    public String getName() {
        return MODULE_NAME;
    }

    private HashMap parseParams(C23043A0y a0y) {
        HashMap hashMap;
        if (a0y != null) {
            hashMap = a0y.toHashMap();
        } else {
            hashMap = new HashMap();
        }
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : hashMap.entrySet()) {
            if (entry.getValue() instanceof String) {
                hashMap2.put(entry.getKey(), (String) entry.getValue());
            }
        }
        return hashMap2;
    }

    public IgReactBloksNavigationModule(A44 a44, C06590Pq r2) {
        super(a44);
        this.mSession = r2;
    }

    @ReactMethod
    public void navigate(double d, String str, String str2, C23043A0y a0y) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null && (currentActivity instanceof FragmentActivity)) {
            C228039ra.A01(new C109944oR(this, currentActivity, str, str2, parseParams(a0y)));
        }
    }

    @ReactMethod
    public void runAction(double d, String str, C23043A0y a0y) {
        FragmentActivity fragmentActivity = (FragmentActivity) getCurrentActivity();
        AnonymousClass4MC r4 = new AnonymousClass4MC(this.mSession, fragmentActivity, (AnonymousClass0RN) null);
        HashMap parseParams = parseParams(a0y);
        Activity currentActivity = getCurrentActivity();
        AnonymousClass1L8 A00 = AnonymousClass1L8.A00(fragmentActivity);
        C53562Th A002 = C53572Ti.A00(this.mSession, str, parseParams);
        A002.A00 = new C109934oQ(this, r4);
        C28351Lj.A00(currentActivity, A00, A002);
    }
}
