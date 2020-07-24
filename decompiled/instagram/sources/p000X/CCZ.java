package p000X;

import java.util.HashMap;
import java.util.Set;

/* renamed from: X.CCZ */
public final class CCZ {
    public static void A0E(CD3 cd3, C27398CBr cBr, String str, String str2) {
        AnonymousClass0P4 A00 = AnonymousClass2VV.A00(Constants.A04);
        A00.A0G("step", cBr.toString());
        A00.A0G("action", str);
        A00.A0G("error_identifier", (String) null);
        A00.A0G("error_message", str2);
        A0G(cd3, A00);
    }

    public static void A00(C27398CBr cBr, String str, AnonymousClass0C1 r5) {
        AnonymousClass0P4 A00 = AnonymousClass2VV.A00(Constants.A0Y);
        A00.A0G("step", cBr.toString());
        A0H(A00, str, r5);
    }

    public static void A01(C27398CBr cBr, String str, AnonymousClass0C1 r5) {
        AnonymousClass0P4 A00 = AnonymousClass2VV.A00(Constants.A0j);
        A00.A0G("step", cBr.toString());
        A0H(A00, str, r5);
    }

    public static void A02(CD3 cd3, C27398CBr cBr) {
        HashMap hashMap = new HashMap();
        hashMap.put("is_story_placement_eligible", Boolean.toString(cd3.A10));
        AnonymousClass0P4 A00 = AnonymousClass2VV.A00(Constants.A05);
        A00.A0G("step", cBr.toString());
        A00.A0G("component", "ad_preview");
        C06270Ok A002 = C06270Ok.A00();
        A002.A0C(hashMap);
        A00.A08("configurations", A002);
        A0G(cd3, A00);
    }

    public static void A03(CD3 cd3, C27398CBr cBr) {
        CCN ccn;
        AnonymousClass0P4 A00 = AnonymousClass2VV.A00(Constants.A0u);
        A00.A0G("step", cBr.toString());
        if (cBr == C27398CBr.DESTINATION && (ccn = cd3.A0D) != null) {
            C06270Ok A002 = C06270Ok.A00();
            A002.A09("destination", ccn.toString());
            A00.A08("selected_values", A002);
        }
        A0G(cd3, A00);
    }

    public static void A04(CD3 cd3, C27398CBr cBr) {
        AnonymousClass0P4 A00 = AnonymousClass2VV.A00(Constants.A0Y);
        A00.A0G("step", cBr.toString());
        A0G(cd3, A00);
    }

    public static void A06(CD3 cd3, C27398CBr cBr, CC7 cc7) {
        HashMap hashMap = new HashMap();
        hashMap.put("regulated_category_type", cc7.A01);
        AnonymousClass0P4 A00 = AnonymousClass2VV.A00(Constants.A05);
        A00.A0G("step", cBr.toString());
        A00.A0G("component", "regulated_category_selection");
        C06270Ok A002 = C06270Ok.A00();
        A002.A0C(hashMap);
        A00.A08("configurations", A002);
        A0G(cd3, A00);
    }

    public static void A07(CD3 cd3, C27398CBr cBr, String str) {
        AnonymousClass0P4 A00 = AnonymousClass2VV.A00(Constants.A05);
        A00.A0G("step", cBr.toString());
        A00.A0G("component", str);
        A0G(cd3, A00);
    }

    public static void A08(CD3 cd3, C27398CBr cBr, String str) {
        AnonymousClass0P4 A00 = AnonymousClass2VV.A00(Constants.A06);
        A00.A0G("step", cBr.toString());
        A00.A0G("component", str);
        A0G(cd3, A00);
    }

    public static void A09(CD3 cd3, C27398CBr cBr, String str) {
        AnonymousClass0P4 A00 = AnonymousClass2VV.A00(Constants.A15);
        A00.A0G("step", cBr.toString());
        A00.A0G("action", str);
        A0G(cd3, A00);
    }

    public static void A0A(CD3 cd3, C27398CBr cBr, String str) {
        AnonymousClass0P4 A00 = AnonymousClass2VV.A00(Constants.A03);
        A00.A0G("step", cBr.toString());
        A00.A0G("action", str);
        A0G(cd3, A00);
    }

    public static void A0B(CD3 cd3, C27398CBr cBr, String str) {
        AnonymousClass0P4 A00 = AnonymousClass2VV.A00(Constants.A14);
        A00.A0G("step", cBr.toString());
        A00.A0G("error_message", str);
        A0G(cd3, A00);
    }

    public static void A0C(CD3 cd3, C27398CBr cBr, String str, String str2) {
        AnonymousClass0P4 A00 = AnonymousClass2VV.A00(Constants.A02);
        A00.A0G("step", cBr.toString());
        A00.A0G("action", str);
        A00.A0G("error_message", str2);
        A0G(cd3, A00);
    }

    public static void A0D(CD3 cd3, C27398CBr cBr, String str, String str2) {
        AnonymousClass0P4 A00 = AnonymousClass2VV.A00(Constants.A0C);
        A00.A0G("step", cBr.toString());
        A00.A0G("error_identifier", str);
        A00.A0G("error_message", str2);
        A0G(cd3, A00);
    }

    public static void A0F(CD3 cd3, C27398CBr cBr, Set set) {
        HashMap hashMap = new HashMap();
        hashMap.put("audience_identifiers", set.toString());
        AnonymousClass0P4 A00 = AnonymousClass2VV.A00(Constants.A15);
        A00.A0G("step", cBr.toString());
        A00.A0G("action", "audience_fetch");
        C06270Ok A002 = C06270Ok.A00();
        A002.A0C(hashMap);
        A00.A08("configurations", A002);
        A0G(cd3, A00);
    }

    public static void A0G(CD3 cd3, AnonymousClass0P4 r4) {
        r4.A0G("entry_point", cd3.A0W);
        r4.A0G("fb_user_id", cd3.A0X);
        r4.A0G("m_pk", cd3.A0Z);
        C06270Ok r2 = (C06270Ok) r4.A06.A00.A01("configurations");
        if (r2 == null) {
            r2 = C06270Ok.A00();
            r4.A08("configurations", r2);
        }
        r2.A05("is_business_user_access_token_enabled", Boolean.valueOf(cd3.A0r));
        r2.A05("is_business_user_access_token_enabled_and_cached", Boolean.valueOf(cd3.A0s));
        AnonymousClass0WN.A01(cd3.A0Q).BcG(r4);
    }

    public static void A05(CD3 cd3, C27398CBr cBr) {
        C06270Ok A00 = C06270Ok.A00();
        CCN ccn = cd3.A0D;
        AnonymousClass0a4.A07(ccn, "destination should not be null for submit success");
        A00.A09("destination", ccn.toString());
        C27408CCb cCb = cd3.A0L;
        if (cCb != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("lower_bound", String.valueOf(cCb.A00));
            hashMap.put("upper_bound", String.valueOf(cd3.A0L.A01));
            C06270Ok A002 = C06270Ok.A00();
            A002.A0C(hashMap);
            A00.A03("reach_estimate", A002);
        }
        AnonymousClass0P4 A003 = AnonymousClass2VV.A00(Constants.A12);
        A003.A0G("step", cBr.toString());
        A003.A08("selected_values", A00);
        A0G(cd3, A003);
    }

    public static void A0H(AnonymousClass0P4 r2, String str, AnonymousClass0C1 r4) {
        String A01 = C14100jl.A01(r4);
        r2.A0G("entry_point", str);
        r2.A0G("fb_user_id", A01);
        AnonymousClass0WN.A01(r4).BcG(r2);
    }
}
