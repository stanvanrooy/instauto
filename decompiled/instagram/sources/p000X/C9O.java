package p000X;

import android.content.Context;
import com.facebook.C0003R;
import java.util.ArrayList;

/* renamed from: X.C9O */
public final class C9O implements C7C {
    public final /* synthetic */ C9L A00;

    public final void BG0(String str) {
    }

    public C9O(C9L c9l) {
        this.A00 = c9l;
    }

    public final void AtO() {
        C9L.A00(this.A00);
    }

    public final void B6W() {
        C9L c9l = this.A00;
        if (c9l.A03 != null) {
            C22300yB A002 = C22290yA.A00.A00();
            String token = c9l.getSession().getToken();
            String string = this.A00.getString(C0003R.string.discovery_info_title);
            String string2 = this.A00.getString(C0003R.string.discovery_info_message);
            String string3 = this.A00.getString(C0003R.string.discovery_reach_title);
            String string4 = this.A00.getString(C0003R.string.discovery_reach_estimate);
            String string5 = this.A00.getString(C0003R.string.story_discovery_reach_message);
            C9L c9l2 = this.A00;
            C9M c9m = c9l2.A03;
            Context context = c9l2.getContext();
            ArrayList arrayList = new ArrayList();
            arrayList.add(context.getString(C0003R.string.discovery_impressions_title));
            arrayList.add(context.getString(C0003R.string.story_discovery_impressions_message));
            arrayList.add(context.getString(C0003R.string.discovery_follows_title));
            arrayList.add(context.getString(C0003R.string.discovery_follows_message));
            C9Q c9q = c9m.A03;
            if (c9q != null) {
                C9S c9s = c9q.A01;
                if (c9s.A01 > 0) {
                    arrayList.add(context.getString(C0003R.string.story_discovery_back_story_title));
                    arrayList.add(context.getString(C0003R.string.story_discovery_back_story_message));
                }
                if (c9s.A04 > 0) {
                    arrayList.add(context.getString(C0003R.string.story_discovery_forward_story_title));
                    arrayList.add(context.getString(C0003R.string.story_discovery_forward_story_message));
                }
                if (c9s.A00 > 0) {
                    arrayList.add(context.getString(C0003R.string.story_discovery_next_story_title));
                    arrayList.add(context.getString(C0003R.string.story_discovery_next_story_message));
                }
                if (c9s.A02 > 0) {
                    arrayList.add(context.getString(C0003R.string.story_discovery_exited_story_title));
                    arrayList.add(context.getString(C0003R.string.story_discovery_exited_story_message));
                }
            }
            C9L.A01(this.A00, Constants.A06, (C100864Xl) A002.A01(token, string, string2, string3, string4, string5, "https://www.prod.facebook.com/business/help/181058782494426?helpref=search&sr=4&query=estimated", (String[]) arrayList.toArray(new String[0])));
        }
    }
}
