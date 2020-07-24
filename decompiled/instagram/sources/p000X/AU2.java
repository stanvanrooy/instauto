package p000X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ListView;
import com.facebook.C0003R;
import com.facebook.browser.lite.chrome.container.DefaultBrowserLiteChrome;
import com.facebook.iabeventlogging.model.IABEvent;
import com.facebook.iabeventlogging.model.IABOpenMenuEvent;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: X.AU2 */
public final class AU2 implements View.OnClickListener {
    public final /* synthetic */ DefaultBrowserLiteChrome A00;
    public final /* synthetic */ ArrayList A01;

    public AU2(DefaultBrowserLiteChrome defaultBrowserLiteChrome, ArrayList arrayList) {
        this.A00 = defaultBrowserLiteChrome;
        this.A01 = arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x005a, code lost:
        if (r1 != false) goto L_0x005c;
     */
    public final void onClick(View view) {
        IABEvent iABOpenMenuEvent;
        boolean z;
        int A05 = AnonymousClass0Z0.A05(1042109791);
        ATL A002 = ATL.A00();
        DefaultBrowserLiteChrome defaultBrowserLiteChrome = this.A00;
        AQA AN7 = defaultBrowserLiteChrome.A03.AN7();
        if (!AN7.A0R) {
            iABOpenMenuEvent = IABEvent.A04;
        } else {
            long now = AN7.A0P.now();
            iABOpenMenuEvent = new IABOpenMenuEvent(AN7.A0K, now, now);
        }
        A002.A04(iABOpenMenuEvent, defaultBrowserLiteChrome.A0C);
        DefaultBrowserLiteChrome defaultBrowserLiteChrome2 = this.A00;
        ArrayList arrayList = this.A01;
        AQ8 AYf = defaultBrowserLiteChrome2.A04.AYf();
        if (AYf != null && !TextUtils.isEmpty(AYf.A14())) {
            C23611ATs aTs = new C23611ATs();
            Context context = defaultBrowserLiteChrome2.getContext();
            C23615ATw aTw = new C23615ATw(context, defaultBrowserLiteChrome2.A04, defaultBrowserLiteChrome2.A03, new HashSet());
            aTw.A00 = true;
            aTw.A00(aTs, arrayList);
            ArrayList arrayList2 = aTs.A03;
            if (arrayList2 != null) {
                boolean isEmpty = arrayList2.isEmpty();
                z = true;
            }
            z = false;
            if (z) {
                defaultBrowserLiteChrome2.getContext();
                AUW auw = new AUW(context, aTs.A03, new AU4(defaultBrowserLiteChrome2), false);
                defaultBrowserLiteChrome2.A02 = auw;
                defaultBrowserLiteChrome2.getContext();
                auw.A00(AnonymousClass1BA.A03(context, C0003R.attr.iabMenuBackgroundRes));
                defaultBrowserLiteChrome2.A02.setAnchorView(defaultBrowserLiteChrome2.A00);
                defaultBrowserLiteChrome2.A02.show();
                ListView listView = defaultBrowserLiteChrome2.A02.getListView();
                listView.setOverScrollMode(2);
                listView.setVerticalScrollBarEnabled(false);
                listView.setDivider((Drawable) null);
            }
        }
        AnonymousClass0Z0.A0C(-303897651, A05);
    }
}
