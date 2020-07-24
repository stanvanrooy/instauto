package p000X;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.facebook.C0003R;
import com.facebook.common.stringformat.StringFormatUtil;
import java.util.List;

/* renamed from: X.CDE */
public final class CDE {
    public final View A00;
    public final TextView A01;
    public final CD8 A02;
    public final CD3 A03;
    public final CDA A04;
    public final C17920r1 A05 = new CDF(this);

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0042, code lost:
        if (r4.A05 != r3) goto L_0x0044;
     */
    public static C27408CCb A00(CDE cde) {
        String str;
        boolean z;
        CD3 cd3 = cde.A03;
        CFT cft = cd3.A0M;
        String str2 = cd3.A0Z;
        String ccn = cd3.A0D.toString();
        String str3 = cd3.A0S;
        if (CDV.A05(cd3.A00())) {
            str = null;
        } else {
            str = cde.A03.A0d;
        }
        CD3 cd32 = cde.A03;
        boolean z2 = cd32.A10;
        int i = cd32.A06;
        if (TextUtils.equals(cft.A03, str2) && TextUtils.equals(cft.A02, ccn) && TextUtils.equals(cft.A00, str3) && TextUtils.equals(cft.A01, str)) {
            z = false;
        }
        z = true;
        if (z) {
            return null;
        }
        return (C27408CCb) cft.A04.get(Integer.valueOf(i));
    }

    public CDE(View view, CD3 cd3, CDA cda, CD8 cd8) {
        this.A00 = view.findViewById(C0003R.C0005id.reach_estimation_progress_bar);
        this.A01 = (TextView) view.findViewById(C0003R.C0005id.reach_estimation_text_view);
        this.A03 = cd3;
        this.A02 = cd8;
        this.A04 = cda;
        if (cd3.A0M == null) {
            cd3.A0M = new CFT();
        }
    }

    public final void A01() {
        List A012;
        String str;
        C27408CCb A002 = A00(this);
        if (A002 == null) {
            if (((Boolean) AnonymousClass0L6.A02(this.A03.A0Q, AnonymousClass0L7.PROMOTE_BUDGET_OPTIONS_FROM_SERVER, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
                A012 = AnonymousClass17A.A01(this.A03.A0i, new C27499CFp(this));
            } else {
                A012 = AnonymousClass17A.A01(CCH.A00, new C27495CFl(this));
            }
            CD8 cd8 = this.A02;
            C17920r1 r2 = this.A05;
            AnonymousClass0C1 r13 = cd8.A0D;
            AnonymousClass0a4.A06(r13);
            CD3 cd3 = cd8.A04;
            String str2 = cd3.A0Z;
            AnonymousClass0a4.A06(str2);
            String str3 = cd3.A0S;
            AnonymousClass0a4.A06(str3);
            CCN ccn = cd3.A0D;
            AnonymousClass0a4.A06(ccn);
            String str4 = cd3.A0R;
            AnonymousClass0a4.A06(str4);
            AnonymousClass0a4.A06(A012);
            int i = cd3.A05;
            if (CDV.A05(cd3.A00())) {
                str = null;
            } else {
                str = cd8.A04.A0d;
            }
            String A013 = AnonymousClass2VV.A01();
            CD3 cd32 = cd8.A04;
            Boolean valueOf = Boolean.valueOf(cd32.A10);
            Boolean valueOf2 = Boolean.valueOf(cd32.A0u);
            C15890nh r4 = new C15890nh(r13);
            r4.A09 = Constants.ONE;
            r4.A0C = "ads/promote/estimate_reach/";
            r4.A09("media_id", str2);
            r4.A09("ad_account_id", str3);
            r4.A09("destination", ccn.toString());
            r4.A09("fb_auth_token", str4);
            r4.A09("duration_in_days", String.valueOf(i));
            r4.A0A("audience_id", str);
            r4.A0A("flow_id", A013);
            if (valueOf != null) {
                r4.A0C("is_story_placement_eligible", valueOf.booleanValue());
            }
            if (valueOf2 != null) {
                r4.A0C("is_explore_placement_eligible", valueOf2.booleanValue());
            }
            r4.A0B("total_budgets_with_offset", A012.toString());
            r4.A06(CEQ.class, false);
            r4.A0G = true;
            C17850qu A032 = r4.A03();
            A032.A00 = r2;
            cd8.A09.schedule(A032);
            return;
        }
        this.A03.A0L = A002;
        this.A01.setText(StringFormatUtil.formatStrLocaleSafe("%,d - %,d", Integer.valueOf(A002.A00), Integer.valueOf(A002.A01)));
    }
}
