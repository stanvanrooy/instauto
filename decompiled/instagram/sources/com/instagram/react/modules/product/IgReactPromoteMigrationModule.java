package com.instagram.react.modules.product;

import android.text.TextUtils;
import com.facebook.fbreact.specs.NativeIGPromoteMigrationReactModuleSpec;
import com.facebook.react.module.annotations.ReactModule;
import com.instagram.business.promote.activity.PromoteActivity;
import p000X.A44;
import p000X.AnonymousClass0a4;
import p000X.C945346y;
import p000X.CC9;
import p000X.CCN;
import p000X.CCf;
import p000X.CD3;
import p000X.CDA;

@ReactModule(name = "IGPromoteMigrationReactModule")
public class IgReactPromoteMigrationModule extends NativeIGPromoteMigrationReactModuleSpec {
    public static final String MODULE_NAME = "IGPromoteMigrationReactModule";

    public String getName() {
        return MODULE_NAME;
    }

    public IgReactPromoteMigrationModule(A44 a44) {
        super(a44);
    }

    public void postDataFromCreateEditAudienceScreen(double d, String str) {
        if (!TextUtils.isEmpty(str)) {
            AnonymousClass0a4.A0B(getCurrentActivity() instanceof PromoteActivity, "module must be managed by PromoteActivity to get current PromoteState");
            CD3 AT6 = ((C945346y) getCurrentActivity()).AT6();
            CDA AT7 = ((CC9) getCurrentActivity()).AT7();
            AT7.A0A(AT6, str);
            AT7.A01();
        }
    }

    public void postDataFromDestinationWebsiteScreen(double d, String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            AnonymousClass0a4.A0B(getCurrentActivity() instanceof PromoteActivity, "module must be managed by PromoteActivity to get current PromoteState");
            CD3 AT6 = ((C945346y) getCurrentActivity()).AT6();
            ((CC9) getCurrentActivity()).AT7().A06(AT6, CCN.WEBSITE_CLICK);
            AT6.A0A = CCf.valueOf(str2);
            AT6.A0U = str;
        }
    }
}
