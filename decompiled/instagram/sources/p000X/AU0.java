package p000X;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import com.facebook.C0003R;
import com.facebook.browser.lite.chrome.container.defaultchrome.DefaultBrowserLiteChrome;
import com.facebook.iabeventlogging.model.IABEvent;
import com.facebook.iabeventlogging.model.IABOpenMenuEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/* renamed from: X.AU0 */
public final class AU0 implements View.OnClickListener {
    public final /* synthetic */ DefaultBrowserLiteChrome A00;
    public final /* synthetic */ ArrayList A01;

    public AU0(DefaultBrowserLiteChrome defaultBrowserLiteChrome, ArrayList arrayList) {
        this.A00 = defaultBrowserLiteChrome;
        this.A01 = arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0061, code lost:
        if (r1 != false) goto L_0x0063;
     */
    public final void onClick(View view) {
        IABEvent iABOpenMenuEvent;
        boolean z;
        int A05 = AnonymousClass0Z0.A05(787030095);
        ATL A002 = ATL.A00();
        DefaultBrowserLiteChrome defaultBrowserLiteChrome = this.A00;
        AQA AN7 = defaultBrowserLiteChrome.A0D.AN7();
        if (!AN7.A0R) {
            iABOpenMenuEvent = IABEvent.A04;
        } else {
            long now = AN7.A0P.now();
            iABOpenMenuEvent = new IABOpenMenuEvent(AN7.A0K, now, now);
        }
        A002.A04(iABOpenMenuEvent, defaultBrowserLiteChrome.A02);
        DefaultBrowserLiteChrome defaultBrowserLiteChrome2 = this.A00;
        ArrayList arrayList = this.A01;
        AQ8 aq8 = defaultBrowserLiteChrome2.A0G;
        if (aq8 != null && !TextUtils.isEmpty(aq8.A14())) {
            HashSet hashSet = new HashSet(Collections.singleton("OPEN_SAVED_LINKS"));
            defaultBrowserLiteChrome2.A01.getBundleExtra("BrowserLiteIntent.EXTRA_ACTION_BUTTON");
            C23611ATs aTs = new C23611ATs();
            C23615ATw aTw = new C23615ATw(defaultBrowserLiteChrome2.A00, defaultBrowserLiteChrome2.A0E, defaultBrowserLiteChrome2.A0D, hashSet);
            aTw.A00 = true;
            aTw.A00(aTs, arrayList);
            ArrayList arrayList2 = aTs.A03;
            if (arrayList2 != null) {
                boolean isEmpty = arrayList2.isEmpty();
                z = true;
            }
            z = false;
            if (z) {
                AUW auw = new AUW(defaultBrowserLiteChrome2.A00, aTs.A03, new ATx(defaultBrowserLiteChrome2), true);
                defaultBrowserLiteChrome2.A0C = auw;
                auw.A00(C0003R.C0004drawable.browser_menu_bg);
                defaultBrowserLiteChrome2.A0C.setAnchorView(defaultBrowserLiteChrome2.A06);
                defaultBrowserLiteChrome2.A0C.show();
                defaultBrowserLiteChrome2.A0C.getListView().setOverScrollMode(2);
                defaultBrowserLiteChrome2.A0C.getListView().setVerticalScrollBarEnabled(false);
                defaultBrowserLiteChrome2.A0C.getListView().setDivider((Drawable) null);
            }
        }
        AnonymousClass0Z0.A0C(285488700, A05);
    }
}
