package p000X;

import android.content.Context;
import com.facebook.C0003R;
import java.util.ArrayList;

/* renamed from: X.C7P */
public final class C7P implements C7C {
    public final /* synthetic */ C27301C7s A00;

    public final void AtO() {
    }

    public final void BG0(String str) {
    }

    public C7P(C27301C7s c7s) {
        this.A00 = c7s;
    }

    public final void B6W() {
        String string;
        String string2;
        String string3;
        C27301C7s c7s = this.A00;
        if (c7s.A03 != null) {
            C27301C7s.A03(c7s, Constants.A0C, Constants.A03, Constants.A0A, Constants.A0M, c7s.A0A);
            C27301C7s c7s2 = this.A00;
            Context context = c7s2.A00;
            AnonymousClass11J.A00(context);
            C22300yB A002 = C22290yA.A00.A00();
            String token = c7s2.getSession().getToken();
            AnonymousClass0C1 r8 = c7s2.A08;
            if (C71.A00(r8).booleanValue()) {
                string = (String) AnonymousClass0L6.A02(r8, AnonymousClass0L7.SELLER_INSIGHTS_CONTENT, "interactions_definition", "The total number of times someone interacted with your tagged product.", (AnonymousClass04H) null);
            } else {
                string = context.getString(C0003R.string.product_total_interactions_message);
            }
            C27300C7r c7r = this.A00.A03;
            ArrayList arrayList = new ArrayList();
            arrayList.add(c7r.A04.getString(C0003R.string.product_conversion_description));
            arrayList.add(c7r.A04.getString(C0003R.string.product_button_clicks_message));
            arrayList.add(c7r.A04.getString(C0003R.string.product_saves));
            AnonymousClass0C1 r11 = c7r.A06;
            Context context2 = c7r.A04;
            if (C71.A00(r11).booleanValue()) {
                string2 = (String) AnonymousClass0L6.A02(r11, AnonymousClass0L7.SELLER_INSIGHTS_CONTENT, "product_saves_description", "The number of times your product was saved.", (AnonymousClass04H) null);
            } else {
                string2 = context2.getString(C0003R.string.product_save_message);
            }
            arrayList.add(string2);
            if (BVC.A00(c7r.A06).booleanValue()) {
                arrayList.add(c7r.A04.getString(C0003R.string.product_shares));
                AnonymousClass0C1 r10 = c7r.A06;
                Context context3 = c7r.A04;
                if (C71.A00(r10).booleanValue()) {
                    string3 = (String) AnonymousClass0L6.A02(r10, AnonymousClass0L7.SELLER_INSIGHTS_CONTENT, "product_shares_description", "The number of times your product was shared.", (AnonymousClass04H) null);
                } else {
                    string3 = context3.getString(C0003R.string.product_share_message);
                }
                arrayList.add(string3);
            }
            C27301C7s.A00(c7s2, A002.A02(token, (String) null, string, (String[]) arrayList.toArray(new String[0])), this.A00.A00.getString(C0003R.string.interactions_help_title));
        }
    }
}
