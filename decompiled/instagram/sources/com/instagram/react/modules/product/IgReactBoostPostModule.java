package com.instagram.react.modules.product;

import android.app.Activity;
import android.content.IntentFilter;
import android.os.Build;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import androidx.fragment.app.FragmentActivity;
import com.facebook.fbreact.specs.NativeIGBoostPostReactModuleSpec;
import com.facebook.react.bridge.Callback;
import com.facebook.react.module.annotations.ReactModule;
import java.util.ArrayList;
import p000X.A44;
import p000X.AC6;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass1L8;
import p000X.AnonymousClass2VK;
import p000X.AnonymousClass2VV;
import p000X.AnonymousClass2VW;
import p000X.AnonymousClass60A;
import p000X.AnonymousClass60G;
import p000X.AnonymousClass6VY;
import p000X.C05210Iq;
import p000X.C06590Pq;
import p000X.C12800hP;
import p000X.C12810hQ;
import p000X.C14100jl;
import p000X.C14120jn;
import p000X.C16160o8;
import p000X.C18360rj;
import p000X.C227489qa;
import p000X.C228039ra;
import p000X.C23802AbW;
import p000X.C24307AlY;
import p000X.C24720AsN;
import p000X.C26899BuN;
import p000X.C26900BuP;
import p000X.C26901BuQ;
import p000X.C26903BuS;
import p000X.C26904BuT;
import p000X.C26905BuU;
import p000X.C26906BuV;
import p000X.C696433b;

@ReactModule(name = "IGBoostPostReactModule")
public class IgReactBoostPostModule extends NativeIGBoostPostReactModuleSpec {
    public static final String MODULE_NAME = "IGBoostPostReactModule";
    public A44 mReactContext;
    public final AnonymousClass0C1 mUserSession;

    public void addListener(String str) {
    }

    public void dismissModalWithReactTag(double d) {
    }

    public String getName() {
        return MODULE_NAME;
    }

    public void navigateToCampaignControls(String str, String str2) {
    }

    public void removeListeners(double d) {
    }

    public void clearTokenAndReLoginToFB(Callback callback, Callback callback2) {
        C12800hP.A0C(this.mUserSession, true);
        C227489qa A02 = AnonymousClass6VY.A02(getCurrentActivity());
        if (A02 == null) {
            callback2.invoke(new Object[0]);
            return;
        }
        A02.registerLifecycleListener(new C26901BuQ(this, callback, callback2, A02));
        C12800hP.A07(this.mUserSession, A02, C696433b.PUBLISH_AS_SELF_OR_MANAGED_PAGE);
    }

    public String getBusinessUserAccessToken() {
        return C24307AlY.A00(this.mUserSession).A00;
    }

    public String getFBAccessToken() {
        return C14100jl.A00(this.mUserSession);
    }

    public void refreshMediaAfterPromotion(String str) {
        C12810hQ.A02(C16160o8.A03(str, this.mUserSession));
    }

    public void showPromotePreview(String str, String str2, String str3, Boolean bool, Boolean bool2) {
        AnonymousClass2VK A01 = C18360rj.A00.A01(str, "promote_manager", this.mUserSession, getCurrentActivity());
        A01.A09 = str2;
        A01.A0F = str3;
        A01.A03 = C26905BuU.PROMOTE_MANAGER_PREVIEW;
        AnonymousClass0a4.A06(bool);
        A01.A0H = bool.booleanValue();
        AnonymousClass0a4.A06(bool2);
        A01.A0G = bool2.booleanValue();
        A01.A01();
    }

    public void warmUpBusinessUserAccessToken(Callback callback) {
        if (C24307AlY.A00(this.mUserSession).A01()) {
            callback.invoke(new Object[0]);
            return;
        }
        Activity currentActivity = getCurrentActivity();
        AnonymousClass0a4.A06(currentActivity);
        C23802AbW.A00(currentActivity, AnonymousClass1L8.A00((FragmentActivity) currentActivity), this.mUserSession, new C26906BuV(this, callback));
    }

    public IgReactBoostPostModule(A44 a44, C06590Pq r11) {
        super(a44);
        this.mReactContext = a44;
        C14120jn A00 = C14120jn.A00(a44);
        AC6 ac6 = new AC6(this);
        IntentFilter intentFilter = new IntentFilter("IGBoostPostSubmitSuccessNotification");
        synchronized (A00.A03) {
            C24720AsN asN = new C24720AsN(intentFilter, ac6);
            ArrayList arrayList = (ArrayList) A00.A03.get(ac6);
            if (arrayList == null) {
                arrayList = new ArrayList(1);
                A00.A03.put(ac6, arrayList);
            }
            arrayList.add(asN);
            for (int i = 0; i < intentFilter.countActions(); i++) {
                String action = intentFilter.getAction(i);
                ArrayList arrayList2 = (ArrayList) A00.A02.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList(1);
                    A00.A02.put(action, arrayList2);
                }
                arrayList2.add(asN);
            }
        }
        this.mUserSession = C05210Iq.A02(r11);
    }

    public void clearWebviewCookie() {
        CookieManager instance = CookieManager.getInstance();
        if (Build.VERSION.SDK_INT >= 21) {
            instance.removeAllCookies((ValueCallback) null);
        } else {
            instance.removeAllCookie();
        }
    }

    public void getFBAuth(Callback callback, Callback callback2) {
        C23802AbW.A00(getCurrentActivity(), AnonymousClass1L8.A00((FragmentActivity) getCurrentActivity()), this.mUserSession, new C26904BuT(this, callback, callback2));
    }

    public void navigateToAppealPostWithReactTag(double d, String str, String str2) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            C228039ra.A01(new C26899BuN(this, (FragmentActivity) currentActivity, str2, str));
        }
    }

    public void navigateToBoostPost(String str, String str2) {
        C228039ra.A01(new AnonymousClass60G(this, AnonymousClass6VY.A01(getCurrentActivity()), str, str2));
    }

    public void navigateToBoostPostHECAppealAudience(String str, String str2, String str3, String str4, double d) {
        C228039ra.A01(new C26900BuP(this, AnonymousClass6VY.A01(getCurrentActivity()), str, str2, str3, str4));
    }

    public void navigateToCreatePromotion() {
        AnonymousClass2VV.A02();
        AnonymousClass0C1 r3 = this.mUserSession;
        AnonymousClass2VW.A03(r3, "ads_manager", C14100jl.A01(r3), (String) null);
        C228039ra.A01(new AnonymousClass60A(this, AnonymousClass6VY.A00(getCurrentActivity())));
    }

    public void pushAdsPreviewForMediaID(String str, String str2, double d, String str3) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            C228039ra.A01(new C26903BuS(this, (FragmentActivity) currentActivity, str, str2, str3));
        }
    }
}
