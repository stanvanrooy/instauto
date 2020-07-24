package p000X;

import android.view.View;
import java.util.List;
import org.json.JSONArray;

/* renamed from: X.CC3 */
public final class CC3 implements View.OnClickListener {
    public final /* synthetic */ CC4 A00;

    public CC3(CC4 cc4) {
        this.A00 = cc4;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0Z0.A05(1816434862);
        CCZ.A07(this.A00.A0A, C27398CBr.AUDIENCE, "done_button");
        CC4 cc4 = this.A00;
        if (cc4.A0A.A0O != null) {
            CD8 cd8 = cc4.A06;
            CBW cbw = new CBW(this);
            CFW A002 = cd8.A04.A00();
            AnonymousClass0C1 r10 = cd8.A0D;
            CD3 cd3 = cd8.A04;
            String str = cd3.A0R;
            String str2 = cd3.A0Z;
            CC7 cc7 = cd3.A0O;
            AnonymousClass0a4.A06(cc7);
            String str3 = cc7.A01;
            List A01 = cd3.A01();
            String str4 = A002.A04;
            C15890nh r5 = new C15890nh(r10);
            r5.A09 = Constants.ONE;
            r5.A0C = "ads/promote/create_appeal/";
            r5.A09("media_id", str2);
            r5.A09("fb_auth_token", str);
            r5.A09("regulated_category", str3);
            r5.A0A("regulated_target_spec_string", str4);
            r5.A06(C23659AWw.class, false);
            if (A01 != null) {
                r5.A09("regulated_categories", new JSONArray(A01).toString());
            }
            C17850qu A03 = r5.A03();
            A03.A00 = cbw;
            cd8.A09.schedule(A03);
        }
        AnonymousClass0Z0.A0C(1300768548, A05);
    }
}
