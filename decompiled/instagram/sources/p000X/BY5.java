package p000X;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.facebook.C0003R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.business.payments.PaymentsWebViewActivity;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/* renamed from: X.BY5 */
public final class BY5 {
    public static final String A00 = C06360Ot.formatString(AnonymousClass40t.$const$string(39), C147866Tr.A00());

    public static void A00(Activity activity, int i, AnonymousClass0C1 r12) {
        AnonymousClass0C1 r4 = r12;
        String A05 = C06360Ot.formatString("/ads/billing?ig_user_id=%s&entry_point=%s", r12.A06.getId(), "promoted_posts");
        try {
            A05 = AnonymousClass000.A0E(A00, URLEncoder.encode(A05, "utf-8"));
        } catch (UnsupportedEncodingException e) {
            AnonymousClass0QD.A09("Couldn't encode payment url", e);
            A05 = AnonymousClass000.A0E(C147866Tr.A00(), A05);
        }
        A01(activity);
        Activity activity2 = activity;
        AnonymousClass1BH.A0A(PaymentsWebViewActivity.A01(activity2, r4, AnonymousClass910.A03(A05, activity), activity.getString(C0003R.string.payments), "promoted_posts".equals("PROMOTE"), AnonymousClass000.A0E("access_token=", C14100jl.A00(r12)), false), i, activity);
    }

    public static void A01(Context context) {
        if (Build.VERSION.SDK_INT < 21) {
            CookieSyncManager.createInstance(context);
        }
        CookieManager instance = CookieManager.getInstance();
        String cookie = instance.getCookie("https://.facebook.com");
        if (cookie != null) {
            String[] split = cookie.split(";");
            for (String split2 : split) {
                instance.setCookie("https://.facebook.com", AnonymousClass000.A0E(split2.split("=")[0].trim(), "=; Max-Age=-1"));
            }
        }
    }

    public static void A03(BaseFragmentActivity baseFragmentActivity, String str, AnonymousClass0C1 r6) {
        if (((String) AnonymousClass0L6.A02(r6, AnonymousClass0L7.SMB_ADS_GROWTH_HOLDOUT_2020_H1, "group_type", "test", (AnonymousClass04H) null)).equals("control") || !((Boolean) AnonymousClass0L6.A02(r6, AnonymousClass0L7.PROMOTE_PAYMENT_SETTING_QUALITY, "is_rn_payments_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            String A05 = C06360Ot.formatString("/ads/billing?ig_user_id=%s&entry_point=%s", r6.A06.getId(), str);
            try {
                A05 = AnonymousClass000.A0E(A00, URLEncoder.encode(A05, "utf-8"));
            } catch (UnsupportedEncodingException e) {
                AnonymousClass0QD.A09("Couldn't encode payment url", e);
                A05 = AnonymousClass000.A0E(C147866Tr.A00(), A05);
            }
            A01(baseFragmentActivity);
            C23802AbW.A00(baseFragmentActivity, AnonymousClass1L8.A00(baseFragmentActivity), r6, new AnonymousClass5A2(baseFragmentActivity, r6, A05, str));
            return;
        }
        A04(baseFragmentActivity, str, r6);
    }

    public static void A04(BaseFragmentActivity baseFragmentActivity, String str, AnonymousClass0C1 r5) {
        Bundle bundle = new Bundle();
        bundle.putString("entryPoint", str);
        bundle.putString("igUserID", r5.A04());
        bundle.putString("waterfallID", AnonymousClass2VV.A01());
        C53832Un newReactNativeLauncher = C16920pO.getInstance().newReactNativeLauncher(r5);
        newReactNativeLauncher.Bjt(bundle);
        newReactNativeLauncher.BkI("BillingNexusIGRoute");
        newReactNativeLauncher.BrT(baseFragmentActivity).A02();
    }

    public static void A02(BaseFragmentActivity baseFragmentActivity, String str, C27398CBr cBr, AnonymousClass0C1 r5) {
        C23802AbW.A00(baseFragmentActivity, AnonymousClass1L8.A00(baseFragmentActivity), r5, new C26909BuY(cBr, str, r5, baseFragmentActivity));
    }
}
