package com.instagram.react.modules.product;

import com.facebook.fbreact.specs.NativeIGPurchaseProtectionSheetModuleSpec;
import com.facebook.react.module.annotations.ReactModule;
import p000X.A24;
import p000X.A44;
import p000X.AnonymousClass0C1;
import p000X.C05210Iq;
import p000X.C06590Pq;
import p000X.C228039ra;

@ReactModule(name = "IGPurchaseProtectionSheetNativeModule")
public class IgReactPurchaseProtectionSheetModule extends NativeIGPurchaseProtectionSheetModuleSpec {
    public static final String MODULE_NAME = "IGPurchaseProtectionSheetNativeModule";
    public final AnonymousClass0C1 mUserSession;

    public String getName() {
        return MODULE_NAME;
    }

    public void openBottomSheet(double d) {
        C228039ra.A01(new A24(this));
    }

    public IgReactPurchaseProtectionSheetModule(A44 a44, C06590Pq r3) {
        super(a44);
        this.mUserSession = C05210Iq.A02(r3);
    }
}
