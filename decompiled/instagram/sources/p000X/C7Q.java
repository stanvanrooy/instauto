package p000X;

import com.facebook.C0003R;
import java.util.ArrayList;

/* renamed from: X.C7Q */
public final class C7Q implements C7C {
    public final /* synthetic */ C27301C7s A00;

    public final void AtO() {
    }

    public final void BG0(String str) {
    }

    public C7Q(C27301C7s c7s) {
        this.A00 = c7s;
    }

    public final void B6W() {
        C27301C7s c7s = this.A00;
        if (c7s.A03 != null) {
            C27301C7s.A03(c7s, Constants.A0C, Constants.A03, Constants.A0A, Constants.A0O, c7s.A0A);
            C27301C7s c7s2 = this.A00;
            C22300yB A002 = C22290yA.A00.A00();
            String token = c7s2.getSession().getToken();
            String string = c7s2.A00.getString(C0003R.string.product_discovery_info_message);
            C27300C7r c7r = this.A00.A03;
            ArrayList arrayList = new ArrayList();
            arrayList.add(c7r.A04.getString(C0003R.string.product_discovery_description));
            arrayList.add(c7r.A04.getString(C0003R.string.product_views_message));
            arrayList.add(c7r.A04.getString(C0003R.string.product_discovery_by_post));
            arrayList.add(c7r.A04.getString(C0003R.string.product_views_posts_message));
            arrayList.add(c7r.A04.getString(C0003R.string.product_discovery_by_story));
            arrayList.add(c7r.A04.getString(C0003R.string.product_views_stories_message));
            arrayList.add(c7r.A04.getString(C0003R.string.product_discovery_by_creators));
            arrayList.add(c7r.A04.getString(C0003R.string.product_views_creators_message));
            C27301C7s.A00(c7s2, A002.A02(token, (String) null, string, (String[]) arrayList.toArray(new String[0])), this.A00.A00.getString(C0003R.string.product_discovery_info_title));
        }
    }
}
