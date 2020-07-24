package p000X;

import android.content.Context;
import com.facebook.react.views.webview.ReactWebViewManager;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.05u  reason: invalid class name and case insensitive filesystem */
public final class C031705u extends C10450dK {
    public final String A00() {
        return "com.facebook.rti.mqtt.ACTION_WORK_SWITCH";
    }

    public final String A01() {
        return "WorkConnectionConfigOverrides";
    }

    public final Set A02() {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{ReactWebViewManager.FACEBOOK_DOMAIN, "workplace.com"})));
    }

    public final void A03() {
    }

    public final void A05(String str, String str2) {
        C11000eG A00 = this.A04.A00(Constants.A07).A00();
        A00.A00.putString("work_last_host", str);
        A00.A00.putString("work_last_analytics_endpoint", str2);
        A00.A00.apply();
    }

    public C031705u(Context context, C07630Tv r6, Integer num, C10960eC r8) {
        super(context, r6, num, r8);
        C10980eE A00 = this.A04.A00(Constants.A07);
        this.A06 = A00.A00.getString("work_last_host", (String) null);
        this.A05 = A00.A00.getString("work_last_analytics_endpoint", (String) null);
    }
}
