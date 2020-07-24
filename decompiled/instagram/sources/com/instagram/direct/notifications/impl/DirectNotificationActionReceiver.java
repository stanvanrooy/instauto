package com.instagram.direct.notifications.impl;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import p000X.AnonymousClass0QD;
import p000X.AnonymousClass0Z0;
import p000X.C23453ANa;
import p000X.C59692i2;

public class DirectNotificationActionReceiver extends C59692i2 {
    public static Intent A00(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("ig").authority(str).appendQueryParameter("intended_recipient_user_id", str2).appendQueryParameter("thread_id", str3).appendQueryParameter("uuid", str4).appendQueryParameter("category", str5).appendQueryParameter("push_id", str6);
        if (str7 != null) {
            appendQueryParameter.appendQueryParameter("message_id", str7);
        }
        if (str8 != null) {
            appendQueryParameter.appendQueryParameter("message_client_context", str8);
        }
        return new Intent(context, DirectNotificationActionReceiver.class).setAction(str).setData(appendQueryParameter.build());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0041, code lost:
        if (r3.equals("direct_mark_as_read") == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008e, code lost:
        if (r3.equals("direct_inline_like") != false) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0098, code lost:
        if (r3.equals("direct_text_reply") == false) goto L_0x0043;
     */
    public final void onReceive(Context context, Intent intent) {
        CharSequence charSequence;
        String str;
        String str2;
        int A01 = AnonymousClass0Z0.A01(-480267960);
        String action = intent.getAction();
        Uri data = intent.getData();
        char c = 1;
        if (action == null) {
            str = "notification_action_clicked_no_action";
            str2 = "Receive an intent to notification action receiver but there is no action.";
        } else if (data == null) {
            str = "notification_action_clicked_no_data";
            str2 = "Receive an intent to notification action receiver but there is no data.";
        } else {
            int hashCode = action.hashCode();
            if (hashCode == -1540963474) {
                c = 0;
            } else if (hashCode != -1433869785) {
                if (hashCode == 1335989927) {
                    c = 2;
                }
            }
            c = 65535;
            if (c == 0) {
                Bundle A00 = C23453ANa.A00(intent);
                if (A00 == null) {
                    charSequence = null;
                } else {
                    charSequence = A00.getCharSequence("DirectNotificationConstants.DirectReply");
                }
                if (charSequence != null) {
                    data = data.buildUpon().appendQueryParameter("reply", charSequence.toString()).build();
                }
            }
            C59692i2.A01(context, new Intent(context, DirectNotificationActionService.class).setData(data).setAction(action).putExtra("IgSessionManager.SESSION_TOKEN_KEY", data.getQueryParameter("intended_recipient_user_id")));
            AnonymousClass0Z0.A0E(intent, -2136552611, A01);
        }
        AnonymousClass0QD.A03(str, str2, 1);
        AnonymousClass0Z0.A0E(intent, -2136552611, A01);
    }
}
