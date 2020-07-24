package com.google.android.gms.common;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C0003R;
import p000X.AnonymousClass0ZA;
import p000X.AnonymousClass0a2;
import p000X.AnonymousClass1AM;
import p000X.AnonymousClass2O4;
import p000X.AnonymousClass2O5;
import p000X.C42001rL;
import p000X.C42011rM;
import p000X.C42051rQ;
import p000X.C42061rR;
import p000X.C54152Wc;
import p000X.C54162Wd;
import p000X.C54172We;
import p000X.C54182Wf;
import p000X.C54192Wg;
import p000X.C54212Wi;
import p000X.C54222Wj;

public final class GoogleApiAvailability extends C42001rL {
    public static final GoogleApiAvailability A00 = new GoogleApiAvailability();
    public static final Object A01 = new Object();
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";

    public static Dialog A00(Context context, int i, C54162Wd r7, DialogInterface.OnCancelListener onCancelListener) {
        int i2;
        AlertDialog.Builder builder = null;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        }
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(C54172We.A01(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = context.getResources();
        if (i == 1) {
            i2 = C0003R.string.common_google_play_services_install_button;
        } else if (i != 2) {
            i2 = C0003R.string.common_google_play_services_enable_button;
            if (i != 3) {
                i2 = 17039370;
            }
        } else {
            i2 = C0003R.string.common_google_play_services_update_button;
        }
        String string = resources.getString(i2);
        if (string != null) {
            builder.setPositiveButton(string, r7);
        }
        String A02 = C54172We.A02(context, i);
        if (A02 != null) {
            builder.setTitle(A02);
        }
        return builder.create();
    }

    public static void A01(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        if (activity instanceof FragmentActivity) {
            AnonymousClass1AM A05 = ((FragmentActivity) activity).A05();
            C54152Wc r1 = new C54152Wc();
            AnonymousClass0a2.A03(dialog, "Cannot display null dialog");
            dialog.setOnCancelListener((DialogInterface.OnCancelListener) null);
            dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
            r1.A00 = dialog;
            if (onCancelListener != null) {
                r1.A01 = onCancelListener;
            }
            r1.A06(A05, str);
            return;
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        C54182Wf r12 = new C54182Wf();
        AnonymousClass0a2.A03(dialog, "Cannot display null dialog");
        dialog.setOnCancelListener((DialogInterface.OnCancelListener) null);
        dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
        r12.A00 = dialog;
        if (onCancelListener != null) {
            r12.A01 = onCancelListener;
        }
        r12.show(fragmentManager, str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x010e, code lost:
        if (r10 == 3) goto L_0x0110;
     */
    public static final void A02(GoogleApiAvailability googleApiAvailability, Context context, int i, PendingIntent pendingIntent) {
        String A02;
        String A012;
        int i2;
        if (i == 18) {
            AnonymousClass0ZA.A03(new C54192Wg(googleApiAvailability, context), 1, 120000);
        } else if (pendingIntent != null) {
            if (i == 6) {
                A02 = C54172We.A03(context, "common_google_play_services_resolution_required_title");
            } else {
                A02 = C54172We.A02(context, i);
            }
            if (A02 == null) {
                A02 = context.getResources().getString(C0003R.string.common_google_play_services_notification_ticker);
            }
            if (i == 6) {
                A012 = C54172We.A04(context, "common_google_play_services_resolution_required_text", C54172We.A00(context));
            } else {
                A012 = C54172We.A01(context, i);
            }
            Resources resources = context.getResources();
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            AnonymousClass2O4 r3 = new AnonymousClass2O4(context, (String) null);
            r3.A0J = true;
            AnonymousClass2O4.A01(r3, 16, true);
            r3.A09(A02);
            AnonymousClass2O5 r1 = new AnonymousClass2O5();
            r1.A00 = AnonymousClass2O4.A00(A012);
            r3.A08(r1);
            if (C42051rQ.A00(context)) {
                AnonymousClass0a2.A07(C42061rR.A00());
                r3.A09.icon = context.getApplicationInfo().icon;
                r3.A07 = 2;
                if (C42051rQ.A01(context)) {
                    r3.A05(C0003R.C0004drawable.common_full_open_on_phone, resources.getString(C0003R.string.common_open_on_phone), pendingIntent);
                } else {
                    r3.A0A = pendingIntent;
                }
            } else {
                r3.A09.icon = 17301642;
                String string = resources.getString(C0003R.string.common_google_play_services_notification_ticker);
                r3.A09.tickerText = AnonymousClass2O4.A00(string);
                r3.A09.when = System.currentTimeMillis();
                r3.A0A = pendingIntent;
                r3.A0E = AnonymousClass2O4.A00(A012);
            }
            boolean A03 = C42061rR.A03();
            if (A03) {
                AnonymousClass0a2.A07(A03);
                synchronized (A01) {
                }
                NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                String string2 = context.getResources().getString(C0003R.string.common_google_play_services_notification_channel_name);
                if (notificationChannel == null) {
                    notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string2, 4));
                } else if (!string2.equals(notificationChannel.getName())) {
                    notificationChannel.setName(string2);
                    notificationManager.createNotificationChannel(notificationChannel);
                }
                r3.A0G = "com.google.android.gms.availability";
            }
            Notification A022 = r3.A02();
            if (!(i == 1 || i == 2)) {
                i2 = 39789;
            }
            i2 = 10436;
            C42011rM.A02.set(false);
            notificationManager.notify(i2, A022);
        } else if (i == 6) {
            Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
        }
    }

    public static GoogleApiAvailability getInstance() {
        return A00;
    }

    public final C54222Wj A06(Context context, C54212Wi r5) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        C54222Wj r1 = new C54222Wj(r5);
        context.registerReceiver(r1, intentFilter);
        r1.A00 = context;
        if (C42011rM.A00(context)) {
            return r1;
        }
        r5.A00();
        r1.A00();
        return null;
    }
}
