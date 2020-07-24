package com.instagram.bugreporter;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.JsonWriter;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;
import p000X.AnonymousClass000;
import p000X.Constants;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0C5;
import p000X.AnonymousClass0CJ;
import p000X.AnonymousClass0EY;
import p000X.AnonymousClass0J1;
import p000X.AnonymousClass0XS;
import p000X.AnonymousClass0XU;
import p000X.AnonymousClass2O4;
import p000X.C06360Ot;
import p000X.C06620Pt;
import p000X.C06630Pu;
import p000X.C12810hQ;
import p000X.C13300iJ;
import p000X.C15320mh;
import p000X.C156366m5;
import p000X.C156376m6;
import p000X.C156416mB;
import p000X.C156466mG;
import p000X.C156476mH;
import p000X.C16180oA;
import p000X.C16730p4;
import p000X.C17850qu;
import p000X.C18340rh;
import p000X.C22510yY;
import p000X.C254518v;
import p000X.C486028s;

public class BugReporterService extends AnonymousClass0EY {
    public static final Class A00 = BugReporterService.class;

    public static void A00(Context context, String str, String str2, int i, String str3, Intent intent, PendingIntent pendingIntent, int i2, boolean z) {
        String A06 = C254518v.A06("support_ticket");
        AnonymousClass0XS A002 = AnonymousClass0XU.A00();
        if (z) {
            A002.A0D = true;
        } else {
            A002.A04(intent, context.getClassLoader());
        }
        PendingIntent A01 = A002.A01(context, (int) System.currentTimeMillis(), 268435456);
        AnonymousClass2O4 r4 = new AnonymousClass2O4(context, A06);
        r4.A09(str);
        r4.A0E = AnonymousClass2O4.A00(str2);
        Notification notification = r4.A09;
        notification.icon = i;
        AnonymousClass2O4.A01(r4, 16, true);
        notification.tickerText = AnonymousClass2O4.A00(str3);
        long currentTimeMillis = System.currentTimeMillis();
        Notification notification2 = r4.A09;
        notification2.when = currentTimeMillis;
        r4.A0L = true;
        r4.A0A = A01;
        if (pendingIntent != null) {
            notification2.deleteIntent = pendingIntent;
        }
        new C16730p4(context).A02((String) null, i2, r4.A02());
    }

    public final void onHandleWork(Intent intent) {
        String str;
        String str2;
        Context applicationContext = getApplicationContext();
        Intent intent2 = intent;
        BugReport bugReport = (BugReport) intent2.getParcelableExtra("BugReporterActivity.INTENT_EXTRA_BUGREPORT");
        BugReportComposerViewModel bugReportComposerViewModel = (BugReportComposerViewModel) intent2.getParcelableExtra("BugReporterActivity.INTENT_EXTRA_VIEWMODEL");
        String string = intent2.getExtras().getString("IgSessionManager.SESSION_TOKEN_KEY");
        Bundle bundle = new Bundle();
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", string);
        AnonymousClass0C1 A06 = AnonymousClass0J1.A06(bundle);
        String string2 = C16180oA.A00(A06).A00.getString("fbns_token", "");
        C156476mH r6 = new C156476mH(applicationContext);
        HashMap hashMap = bugReport.A09;
        HashMap hashMap2 = hashMap;
        if (hashMap != null) {
            for (String str3 : hashMap.keySet()) {
                r6.A0D.put(str3, (String) hashMap2.get(str3));
            }
        }
        String str4 = bugReport.A04;
        if (!str4.equals("")) {
            r6.A0D.put("latest_reel_loading_error", str4);
        }
        C156466mG A002 = C18340rh.A00.A00();
        if (A002 != null) {
            r6.A0D.put(A002.A01, new JSONObject(A002.A02).toString());
        }
        r6.A0D.put("fbns_token", string2);
        r6.A07 = A06.A04();
        C13300iJ r1 = A06.A06;
        r6.A08 = r1.AZn();
        String str5 = bugReport.A01;
        if (str5 == null) {
            str5 = "493186350727442";
        }
        r6.A01 = str5;
        r6.A0B = r1.AeV();
        String str6 = bugReport.A02;
        if (str6 == null) {
            str6 = "161101191344941";
        }
        r6.A02 = str6;
        r6.A00 = bugReport.A00;
        r6.A03 = bugReport.A03;
        r6.A0A = bugReport.A08;
        r6.A09 = bugReport.A07;
        r6.A06 = bugReport.A05;
        String Aar = C22510yY.A00(A06).Aar();
        Context context = r6.A0C;
        String str7 = r6.A03;
        String str8 = r6.A07;
        String str9 = r6.A08;
        String str10 = r6.A01;
        String str11 = r6.A02;
        String str12 = r6.A00;
        List list = r6.A0A;
        List list2 = r6.A09;
        Map map = r6.A0D;
        String str13 = r6.A04;
        String str14 = r6.A05;
        boolean z = r6.A0B;
        String str15 = r6.A06;
        List list3 = list;
        List list4 = list2;
        C486028s r62 = new C486028s();
        r62.A02 = Constants.ONE;
        r62.A04(C156376m6.class);
        r62.A09("user_identifier", str8);
        r62.A09(OptSvcAnalyticsStore.LOGGING_KEY_CLIENT_TIME, Long.toString(System.currentTimeMillis() / 1000));
        r62.A09("config_id", str11);
        r62.A09("locale", C15320mh.A01(Locale.getDefault()));
        if (z) {
            str = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        } else {
            str = "0";
        }
        r62.A09("is_business", str);
        if (Aar != null) {
            r62.A09("claim", Aar);
        }
        try {
            StringWriter stringWriter = new StringWriter();
            JsonWriter name = new JsonWriter(stringWriter).beginObject().name("IG_UserId").value(str8).name("last_seen_ad_id").value(str12).name("IG_Username").value(str9).name("Git_Hash").value(C156416mB.A00(context).A01).name("Build_Num").value((long) C06630Pu.A00(context)).name("Branch");
            AnonymousClass0CJ r14 = new AnonymousClass0CJ(context.getApplicationContext());
            String A003 = r14.A00("com.facebook.versioncontrol.branch", r14.A00.getPackageName());
            if (A003 == null) {
                A003 = "";
            }
            JsonWriter value = name.value(A003).name("OS_Version").value(Build.VERSION.RELEASE).name("Manufacturer").value(Build.MANUFACTURER).name("Model").value(Build.MODEL).name("Locale").value(Locale.getDefault().getDisplayName(Locale.US)).name("Build_Type").value(C06620Pt.A00().toString());
            if (str15 != null) {
                value.name("source").value(str15);
            }
            for (String str16 : map.keySet()) {
                value.name(str16).value((String) map.get(str16));
            }
            value.endObject().close();
            StringWriter stringWriter2 = new StringWriter();
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            JsonWriter name2 = new JsonWriter(stringWriter2).beginObject().name("description").value(str7).name("category_id").value(str10).name("misc_info").value(stringWriter.toString()).name(TraceFieldType.NetworkType);
            String str17 = "null";
            if (activeNetworkInfo == null) {
                str2 = str17;
            } else {
                str2 = activeNetworkInfo.getTypeName();
            }
            JsonWriter name3 = name2.value(str2).name("network_subtype");
            if (activeNetworkInfo != null) {
                str17 = activeNetworkInfo.getSubtypeName();
            }
            name3.value(str17).endObject().close();
            r62.A09("metadata", stringWriter2.toString());
        } catch (IOException unused) {
        }
        if (list != null) {
            for (int i = 0; i < list3.size(); i++) {
                String str18 = (String) list3.get(i);
                if (!TextUtils.isEmpty(str18)) {
                    File file = new File(str18);
                    if (file.exists()) {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(str18, options);
                        String str19 = options.outMimeType;
                        if (str19 == null) {
                            str19 = AnonymousClass0C5.$const$string(27);
                        }
                        r62.A08(AnonymousClass000.A05("screenshot", i), file, str19);
                    }
                }
            }
        }
        if (list2 != null) {
            for (int i2 = 0; i2 < list4.size(); i2++) {
                String str20 = (String) list4.get(i2);
                if (!TextUtils.isEmpty(str20)) {
                    File file2 = new File(str20);
                    if (file2.exists()) {
                        r62.A08(AnonymousClass000.A05("attachment", i2), file2, "text/plain");
                    }
                }
            }
        }
        r62.A03 = C06360Ot.formatString("%s|%s", str13, str14);
        r62.A05 = C06360Ot.formatString("%s/bugs", str13);
        C17850qu A01 = r62.A01();
        A01.A00 = new C156366m5(applicationContext, A06, bugReport, bugReportComposerViewModel);
        C12810hQ.A01(A01);
    }
}
