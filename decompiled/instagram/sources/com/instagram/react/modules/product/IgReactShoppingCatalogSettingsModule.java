package com.instagram.react.modules.product;

import android.app.Activity;
import com.facebook.fbreact.specs.NativeIGShoppingCatalogSettingsModuleSpec;
import com.facebook.react.bridge.Callback;
import com.facebook.react.module.annotations.ReactModule;
import p000X.A44;
import p000X.Constants;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0C5;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass1N4;
import p000X.C05210Iq;
import p000X.C06590Pq;
import p000X.C109254nB;
import p000X.C109974oX;
import p000X.C11140eU;
import p000X.C11200ea;
import p000X.C12810hQ;
import p000X.C156066lW;
import p000X.C157216nY;
import p000X.C15890nh;
import p000X.C17850qu;
import p000X.C228039ra;
import p000X.C23300zv;

@ReactModule(name = "IGShoppingCatalogSettingsModule")
public class IgReactShoppingCatalogSettingsModule extends NativeIGShoppingCatalogSettingsModuleSpec {
    public static final String MODULE_NAME = "IGShoppingCatalogSettingsModule";
    public final C11140eU mEventBus;
    public final C11200ea mSelectionListener = new C156066lW(this);

    public String getName() {
        return MODULE_NAME;
    }

    public static C17850qu createCatalogSelectedTask(AnonymousClass0C1 r3, String str) {
        C15890nh r2 = new C15890nh(r3);
        r2.A09 = Constants.ONE;
        r2.A0C = "commerce/onboard/";
        r2.A09(AnonymousClass0C5.$const$string(212), str);
        r2.A06(AnonymousClass1N4.class, false);
        r2.A0G = true;
        return r2.A03();
    }

    public void launchCatalogSelectionPage(double d, String str, String str2, String str3) {
        C228039ra.A01(new C109974oX(this, str3, str, str2));
    }

    public IgReactShoppingCatalogSettingsModule(A44 a44, C06590Pq r5) {
        super(a44);
        C23300zv A00 = C23300zv.A00(C05210Iq.A02(r5));
        A00.A02(C109254nB.class, this.mSelectionListener);
        this.mEventBus = A00;
    }

    public void selectCatalog(String str, String str2, Callback callback, Callback callback2) {
        Activity currentActivity = getCurrentActivity();
        Callback callback3 = callback2;
        if (currentActivity == null) {
            callback2.invoke(new Object[0]);
            return;
        }
        AnonymousClass0C1 A06 = AnonymousClass0J1.A06(currentActivity.getIntent().getExtras());
        C17850qu createCatalogSelectedTask = createCatalogSelectedTask(A06, str);
        createCatalogSelectedTask.A00 = new C157216nY(this, A06, str, str2, callback, callback3);
        C12810hQ.A02(createCatalogSelectedTask);
    }
}
