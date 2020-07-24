package p000X;

import com.facebook.browser.lite.chrome.container.defaultchrome.DefaultBrowserLiteChrome;
import com.instagram.react.modules.navigator.IgReactNavigatorModule;
import java.util.HashMap;

/* renamed from: X.ATx */
public final class ATx implements AUS {
    public final /* synthetic */ DefaultBrowserLiteChrome A00;

    public ATx(DefaultBrowserLiteChrome defaultBrowserLiteChrome) {
        this.A00 = defaultBrowserLiteChrome;
    }

    public final void Avc(C23611ATs aTs) {
        DefaultBrowserLiteChrome defaultBrowserLiteChrome;
        String str;
        HashMap hashMap;
        int i;
        this.A00.A0F.A00();
        String str2 = aTs.A01;
        if ("SHARE_TIMELINE".equals(str2)) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("action", "SHARE_TIMELINE");
            hashMap2.put(IgReactNavigatorModule.URL, this.A00.A0G.A14());
            DefaultBrowserLiteChrome defaultBrowserLiteChrome2 = this.A00;
            defaultBrowserLiteChrome2.A0B.A05(hashMap2, defaultBrowserLiteChrome2.A02);
        } else {
            DefaultBrowserLiteChrome defaultBrowserLiteChrome3 = this.A00;
            aTs.A02(defaultBrowserLiteChrome3.A0E, defaultBrowserLiteChrome3.A0D, defaultBrowserLiteChrome3.A02, defaultBrowserLiteChrome3.A00);
        }
        if ("ACTION_GO_BACK".equals(str2)) {
            defaultBrowserLiteChrome = this.A00;
            str = "menu_back_btn_press";
        } else {
            if ("ACTION_GO_FORWARD".equals(str2)) {
                defaultBrowserLiteChrome = this.A00;
                str = "menu_forward_btn_press";
            }
            this.A00.A02();
        }
        if (defaultBrowserLiteChrome.A0H.containsKey(str)) {
            hashMap = defaultBrowserLiteChrome.A0H;
            i = Integer.valueOf(((Integer) hashMap.get(str)).intValue() + 1);
        } else {
            hashMap = defaultBrowserLiteChrome.A0H;
            i = 1;
        }
        hashMap.put(str, i);
        this.A00.A02();
    }
}
