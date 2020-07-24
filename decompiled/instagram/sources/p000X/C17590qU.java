package p000X;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import com.facebook.C0003R;
import com.instagram.simplewebview.SimpleWebViewActivity;
import java.util.List;

/* renamed from: X.0qU  reason: invalid class name and case insensitive filesystem */
public final class C17590qU implements C16690p0 {
    public final Context A00;

    public final Object ABo(String str) {
        return C42861tN.A00(str, (String) null);
    }

    public final String AHw() {
        return "gdpr";
    }

    public final SharedPreferences AVy() {
        return C05750Lu.A00("insta_gdpr_notifications");
    }

    public final String BfS(Object obj) {
        return ((C42861tN) obj).A01();
    }

    public C17590qU(Context context) {
        this.A00 = context.getApplicationContext();
    }

    public final C59722i7 A71(AnonymousClass0C1 r9, String str, List list, boolean z) {
        PendingIntent A01;
        String AHw = AHw();
        AnonymousClass2O4 A03 = C59672hx.A03(this.A00, AHw, str, list);
        A03.A07 = 1;
        A03.A04(C019000b.A00(this.A00, C0003R.color.gdpr_notif_led_color));
        long[] jArr = C49462Ci.A01;
        Notification notification = A03.A09;
        notification.vibrate = jArr;
        AnonymousClass2O4.A01(A03, 16, true);
        notification.when = 0;
        C42861tN r4 = (C42861tN) list.get(list.size() - 1);
        String str2 = r4.A03;
        if ("gdpr_consent".equals(str2)) {
            Context context = this.A00;
            A03.A05(0, context.getString(C0003R.string.push_notification_action), C59672hx.A01(context, r4, (String) null));
        } else if ("underage_appeal".equals(str2)) {
            Context context2 = this.A00;
            String queryParameter = Uri.parse(r4.A06).getQueryParameter("redirect");
            if (queryParameter == null) {
                A01 = null;
            } else {
                C53742Uc r1 = new C53742Uc(queryParameter);
                r1.A0C = true;
                r1.A0B = false;
                Intent A012 = SimpleWebViewActivity.A01(context2, r9, r1.A00());
                AnonymousClass0XS A002 = AnonymousClass0XU.A00();
                A002.A04(A012, context2.getClassLoader());
                A01 = A002.A01(context2, 0, 134217728);
            }
            if (A01 != null) {
                A03.A0A = A01;
            }
        }
        Notification A02 = A03.A02();
        A02.flags |= 32;
        C237211o.A01(this.A00, A02, list);
        return new C59722i7(A02, AHw, C59672hx.A04(list, 10), r4.A06);
    }

    public final boolean A5l(Object obj, Object obj2) {
        return false;
    }
}
