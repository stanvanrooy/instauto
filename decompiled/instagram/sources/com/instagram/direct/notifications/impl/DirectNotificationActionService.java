package com.instagram.direct.notifications.impl;

import android.app.IntentService;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.instagram.model.direct.DirectThreadKey;
import java.util.concurrent.CountDownLatch;
import p000X.AnonymousClass000;
import p000X.AnonymousClass04H;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0DB;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0L6;
import p000X.AnonymousClass0L7;
import p000X.AnonymousClass0P4;
import p000X.AnonymousClass0QD;
import p000X.AnonymousClass0RN;
import p000X.AnonymousClass0RU;
import p000X.AnonymousClass0WN;
import p000X.AnonymousClass1A3;
import p000X.C06080Nr;
import p000X.C108484lt;
import p000X.C108524lz;
import p000X.C12670hC;
import p000X.C16620ot;
import p000X.C19290tE;
import p000X.C58012fA;
import p000X.C59692i2;
import p000X.C65882uZ;
import p000X.C66112uw;
import p000X.C940144u;
import p000X.C940244v;

public class DirectNotificationActionService extends IntentService implements AnonymousClass0RN {
    public final String getModuleName() {
        return "direct_notification_action_service";
    }

    public DirectNotificationActionService() {
        super("DirectNotificationActionService");
    }

    public static void A00(DirectNotificationActionService directNotificationActionService, String str, String str2) {
        C16620ot.A01().A05(str2, str);
        directNotificationActionService.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
    }

    public static void A01(Runnable runnable) {
        if (C12670hC.A08()) {
            runnable.run();
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        C12670hC.A05(new C108524lz(runnable, countDownLatch));
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            AnonymousClass0QD.A06("DirectNotificationActionService", "Error waiting for task to complete on UI thread", e);
        }
    }

    public final void onHandleIntent(Intent intent) {
        C58012fA r11;
        String str;
        try {
            String action = intent.getAction();
            boolean z = true;
            if (action == null) {
                AnonymousClass0QD.A03("notification_action_clicked_no_action", "No action is defined for the notification action.", 1);
            } else {
                Uri data = intent.getData();
                String queryParameter = data.getQueryParameter("thread_id");
                if (queryParameter == null) {
                    AnonymousClass0DB.A0E("DirectNotificationActionService", "No thread id found in notification action");
                } else {
                    Bundle extras = intent.getExtras();
                    if (extras == null) {
                        AnonymousClass0QD.A03("notification_action_clicked_no_extra", AnonymousClass000.A0J("The notification action ", intent.getAction(), " is triggered but there is intended user ID in the extra."), 1);
                    } else {
                        AnonymousClass0C1 A07 = AnonymousClass0J1.A07(extras);
                        if (A07 == null) {
                            AnonymousClass0QD.A03("notification_action_clicked_for_inactive_user", "Attempting to send from notification action when logged into a different account.", 1);
                        } else {
                            if (C06080Nr.A09(this) || ((Boolean) AnonymousClass0L6.A02(A07, AnonymousClass0L7.WAIT_FOR_APP_INITIALIZATION_ON_PUSH_ACTION, "enabled", false, (AnonymousClass04H) null)).booleanValue()) {
                                AnonymousClass1A3.A01.A00();
                            }
                            DirectThreadKey directThreadKey = new DirectThreadKey(queryParameter);
                            char c = 65535;
                            int hashCode = action.hashCode();
                            if (hashCode != -1540963474) {
                                if (hashCode != -1433869785) {
                                    if (hashCode == 1335989927 && action.equals("direct_mark_as_read")) {
                                        c = 2;
                                    }
                                } else if (action.equals("direct_inline_like")) {
                                    c = 1;
                                }
                            } else if (action.equals("direct_text_reply")) {
                                c = 0;
                            }
                            if (c == 0) {
                                String queryParameter2 = data.getQueryParameter("reply");
                                String queryParameter3 = data.getQueryParameter("uuid");
                                String queryParameter4 = data.getQueryParameter("category");
                                if (TextUtils.isEmpty(queryParameter2)) {
                                    AnonymousClass0QD.A01("DirectNotificationActionService", "Got notification reply action with no input");
                                    A00(this, queryParameter3, queryParameter4);
                                } else {
                                    A01(new C108484lt(this, A07, directThreadKey, queryParameter2, queryParameter4, queryParameter3));
                                }
                            } else if (c == 1) {
                                String queryParameter5 = data.getQueryParameter("message_id");
                                String queryParameter6 = data.getQueryParameter("message_client_context");
                                if (queryParameter6 == null) {
                                    if (queryParameter5 != null) {
                                        z = false;
                                    }
                                    AnonymousClass0QD.A01("notification_action_inline_like_null_client_context", AnonymousClass000.A0U("message client context should not be null (is messageId null?: ", z, ")"));
                                }
                                A01(new C940244v(this, A07, directThreadKey, data.getQueryParameter("message_id"), queryParameter6, data.getQueryParameter("uuid"), data.getQueryParameter("category")));
                            } else if (c != 2) {
                                AnonymousClass0QD.A01("DirectNotificationActionService", AnonymousClass000.A0E("Unknown intent action: ", intent.getAction()));
                            } else {
                                String queryParameter7 = data.getQueryParameter("uuid");
                                String queryParameter8 = data.getQueryParameter("category");
                                C65882uZ A00 = C19290tE.A00(A07);
                                A00.Aow();
                                C66112uw ALV = A00.ALV(directThreadKey);
                                if (ALV == null) {
                                    r11 = null;
                                } else {
                                    r11 = ALV.AOc();
                                }
                                if (r11 != null) {
                                    A01(new C940144u(this, A07, directThreadKey, r11, queryParameter7, queryParameter8));
                                } else {
                                    if (ALV == null) {
                                        str = "No thread found.";
                                    } else {
                                        str = "No last received message found.";
                                    }
                                    AnonymousClass0QD.A01("fail_to_mark_thread_as_read_in_notif", AnonymousClass000.A0E("Fail to mark thread as read using notification action: ", str));
                                }
                            }
                            AnonymousClass0RU A01 = AnonymousClass0WN.A01(A07);
                            AnonymousClass0P4 A002 = AnonymousClass0P4.A00("ig_push_notification_user_action", (AnonymousClass0RN) null);
                            A002.A0G("user_action_type", action);
                            A002.A0G("push_category", data.getQueryParameter("category"));
                            A002.A0G("push_identifier", data.getQueryParameter("push_id"));
                            A002.A0G("recipient_id", data.getQueryParameter("intended_recipient_user_id"));
                            A01.BcG(A002);
                        }
                    }
                }
            }
        } finally {
            C59692i2.A02(intent);
        }
    }
}
