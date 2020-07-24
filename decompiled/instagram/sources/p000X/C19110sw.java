package p000X;

import android.app.PendingIntent;
import android.content.Context;
import android.net.Uri;
import com.instagram.direct.notifications.impl.DirectNotificationActionReceiver;
import com.instagram.realtimeclient.RealtimeConstants;

/* renamed from: X.0sw  reason: invalid class name and case insensitive filesystem */
public final class C19110sw extends C19120sx {
    public final PendingIntent A00(Context context, AnonymousClass0C1 r14, String str, String str2, String str3, String str4, int i, String str5) {
        return PendingIntent.getBroadcast(context, i, DirectNotificationActionReceiver.A00(context, "direct_text_reply", str, str2, str3, str4, str5, (String) null, (String) null), 0);
    }

    public C19110sw(Context context, Uri uri) {
        C19130sy r1 = new C19130sy(context);
        C16670oy.A04("direct_v2_message", r1);
        C16670oy.A04("direct_v2_delete_item", r1);
        C16620ot.A01().A03(RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING, new C19150t0(context, uri));
    }
}
