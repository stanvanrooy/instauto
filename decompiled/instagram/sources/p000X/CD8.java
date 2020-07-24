package p000X;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import java.util.Currency;
import java.util.List;
import org.json.JSONArray;

/* renamed from: X.CD8 */
public final class CD8 {
    public C27484CFa A00;
    public C27484CFa A01;
    public C27484CFa A02;
    public final FragmentActivity A03;
    public final CD3 A04;
    public final CDA A05;
    public final C17740qj A06 = new C17740qj();
    public final C17740qj A07 = new C17740qj();
    public final C17740qj A08 = new C17740qj();
    public final C28351Lj A09;
    public final AnonymousClass0PD A0A;
    public final AnonymousClass0PD A0B;
    public final AnonymousClass0PD A0C;
    public final AnonymousClass0C1 A0D;

    public final void A00(CGS cgs, C27398CBr cBr) {
        AnonymousClass0C1 r5 = this.A0D;
        CD3 cd3 = this.A04;
        String str = cd3.A0R;
        String str2 = cd3.A0Z;
        String str3 = cd3.A0T;
        C15890nh r2 = new C15890nh(r5);
        r2.A09 = Constants.ONE;
        r2.A0C = "ads/promote/init_promote/";
        r2.A09("fb_auth_token", str);
        r2.A09("media_id", str2);
        r2.A0A(AnonymousClass0C5.$const$string(81), str3);
        r2.A06(C27445CDn.class, false);
        C17850qu A032 = r2.A03();
        C28351Lj r1 = this.A09;
        A032.A00 = new CD7(this, cBr, cgs);
        r1.schedule(A032);
    }

    public final void A01(C17920r1 r23) {
        String str;
        String str2;
        CD3 cd3 = this.A04;
        Currency currency = cd3.A0f;
        AnonymousClass0C1 r13 = this.A0D;
        String str3 = cd3.A0R;
        String A012 = AnonymousClass2VV.A01();
        CD3 cd32 = this.A04;
        String str4 = cd32.A0Z;
        String str5 = cd32.A0Y;
        String str6 = cd32.A0S;
        CCN ccn = cd32.A0D;
        CCf A002 = C27411CCe.A00(cd32);
        CD3 cd33 = this.A04;
        int i = cd33.A06;
        int i2 = cd33.A05;
        boolean z = cd33.A0x;
        boolean z2 = cd33.A10;
        boolean z3 = cd33.A0u;
        String str7 = null;
        if (CDV.A05(cd33.A00())) {
            str = null;
        } else {
            str = this.A04.A0d;
        }
        CD3 cd34 = this.A04;
        String str8 = cd34.A0U;
        if (cd34.A0O == null) {
            str2 = null;
        } else {
            str2 = cd34.A00().A04;
        }
        CD3 cd35 = this.A04;
        CC7 cc7 = cd35.A0O;
        if (cc7 != null) {
            str7 = cc7.A01;
        }
        List A013 = cd35.A01();
        C15890nh r3 = new C15890nh(r13);
        r3.A09 = Constants.ONE;
        r3.A0C = "ads/promote/create_promotion/";
        r3.A09("fb_auth_token", str3);
        r3.A09("flow_id", A012);
        r3.A09("media_id", str4);
        r3.A09("page_id", str5);
        r3.A09("ad_account_id", str6);
        r3.A09("destination", ccn.toString());
        r3.A09("call_to_action", A002.toString());
        r3.A09("total_budget_with_offset", String.valueOf(i));
        r3.A09("duration_in_days", String.valueOf(i2));
        r3.A0C("is_political_ad", z);
        r3.A0C("is_story_placement_eligible", z2);
        r3.A0C("is_explore_placement_eligible", z3);
        r3.A0A("website_url", str8);
        r3.A0A("audience_id", str);
        r3.A0A("currency", currency.getCurrencyCode());
        r3.A0A("regulated_target_spec_string", str2);
        r3.A0A("regulated_category", str7);
        r3.A06(C27467CEj.class, false);
        if (A013 != null) {
            r3.A09("regulated_categories", new JSONArray(A013).toString());
        }
        C17850qu A032 = r3.A03();
        A032.A00 = r23;
        this.A09.schedule(A032);
    }

    public final void A02(C17920r1 r13) {
        String str;
        String str2;
        AnonymousClass0C1 r10 = this.A0D;
        CD3 cd3 = this.A04;
        String str3 = cd3.A0R;
        if (TextUtils.isEmpty(cd3.A0V)) {
            str = "";
        } else {
            str = this.A04.A0V;
        }
        CD3 cd32 = this.A04;
        String str4 = cd32.A0S;
        int i = cd32.A02;
        int i2 = cd32.A05;
        CCf A002 = C27411CCe.A00(cd32);
        CD3 cd33 = this.A04;
        CCN ccn = cd33.A0D;
        String str5 = cd33.A0U;
        if (CDV.A05(cd33.A00())) {
            str2 = null;
        } else {
            str2 = this.A04.A0d;
        }
        C15890nh r2 = new C15890nh(r10);
        r2.A09 = Constants.ONE;
        r2.A0C = "ads/promote/save_settings/";
        r2.A09("fb_auth_token", str3);
        r2.A09("draft_name", str);
        r2.A09("ad_account_id", str4);
        r2.A09("daily_budget_with_offset", String.valueOf(i));
        r2.A09("duration_in_days", String.valueOf(i2));
        r2.A09("call_to_action", A002.toString());
        r2.A09("destination", ccn.toString());
        r2.A0A("website_url", str5);
        r2.A0A("audience_id", str2);
        r2.A06(C23776Ab2.class, false);
        C17850qu A032 = r2.A03();
        A032.A00 = r13;
        this.A09.schedule(A032);
    }

    public final void A03(C17920r1 r10) {
        String str;
        AnonymousClass0C1 r8 = this.A0D;
        CD3 cd3 = this.A04;
        String str2 = cd3.A0Z;
        String str3 = cd3.A0R;
        String str4 = cd3.A0S;
        String A012 = AnonymousClass2VV.A01();
        CD3 cd32 = this.A04;
        CC7 cc7 = cd32.A0O;
        if (cc7 != null) {
            str = cc7.A01;
        } else {
            str = CC7.A06.A01;
        }
        List A013 = cd32.A01();
        C15890nh r2 = new C15890nh(r8);
        r2.A09 = Constants.ONE;
        r2.A0C = "ads/promote/available_audiences/";
        r2.A09("media_id", str2);
        r2.A09("fb_auth_token", str3);
        r2.A0A("ad_account_id", str4);
        r2.A0A("flow_id", A012);
        r2.A0A("regulated_category", str);
        r2.A06(CEM.class, false);
        if (A013 != null) {
            r2.A09("regulated_categories", new JSONArray(A013).toString());
        }
        C17850qu A032 = r2.A03();
        A032.A00 = r10;
        this.A09.schedule(A032);
    }

    public final void A04(C17920r1 r7) {
        AnonymousClass0C1 r5 = this.A0D;
        String str = this.A04.A0R;
        String A012 = AnonymousClass2VV.A01();
        String str2 = this.A04.A0Z;
        C15890nh r2 = new C15890nh(r5);
        r2.A09 = Constants.ONE;
        r2.A0C = "ads/promote/review_screen_details/";
        r2.A09("fb_auth_token", str);
        r2.A09("flow_id", A012);
        r2.A09("media_id", str2);
        r2.A06(CET.class, false);
        C17850qu A032 = r2.A03();
        A032.A00 = r7;
        this.A09.schedule(A032);
    }

    public final void A05(String str, String str2) {
        AnonymousClass0C1 r4 = this.A0D;
        CD3 cd3 = this.A04;
        String str3 = cd3.A0R;
        boolean z = cd3.A0x;
        C15890nh r2 = new C15890nh(r4);
        r2.A09 = Constants.ONE;
        r2.A0C = "ads/promote/fetch_ad_preview_url/";
        r2.A09("instagram_media_id", str);
        r2.A09("fb_auth_token", str3);
        r2.A09("call_to_action", str2);
        r2.A0C("is_political_ad", z);
        r2.A06(AV8.class, false);
        C17850qu A032 = r2.A03();
        A032.A00 = new C27260C5t(this);
        this.A09.schedule(A032);
    }

    public final void A06(List list, C17920r1 r8) {
        AnonymousClass0C1 r5 = this.A0D;
        CD3 cd3 = this.A04;
        String str = cd3.A0S;
        String str2 = cd3.A0Y;
        String str3 = cd3.A0R;
        C15890nh r2 = new C15890nh(r5);
        r2.A09 = Constants.ONE;
        r2.A0C = "ads/promote/suggested_interests/";
        r2.A09("ad_account_id", str);
        r2.A09("page_id", str2);
        r2.A09("fb_auth_token", str3);
        r2.A09("detailed_targeting_items", list.toString());
        r2.A06(C27472CEo.class, false);
        C17850qu A032 = r2.A03();
        A032.A00 = r8;
        this.A09.schedule(A032);
    }

    public CD8(AnonymousClass0C1 r4, FragmentActivity fragmentActivity, C137125t6 r6) {
        C27484CFa cFa = C27484CFa.A02;
        this.A02 = cFa;
        this.A00 = cFa;
        this.A01 = cFa;
        this.A0C = new AnonymousClass0PD(new Handler(Looper.getMainLooper()), new C27439CDh(this));
        this.A0A = new AnonymousClass0PD(new Handler(Looper.getMainLooper()), new C27440CDi(this));
        this.A0B = new AnonymousClass0PD(new Handler(Looper.getMainLooper()), new C27441CDj(this));
        this.A0D = r4;
        this.A03 = fragmentActivity;
        this.A09 = new C28351Lj(fragmentActivity, AnonymousClass1L8.A00(r6));
        this.A04 = ((C945346y) fragmentActivity).AT6();
        this.A05 = ((CC9) fragmentActivity).AT7();
        this.A0C.A00 = new CGE(this);
        this.A0A.A00 = new CGF(this);
        this.A0B.A00 = new CGG(this);
    }
}
