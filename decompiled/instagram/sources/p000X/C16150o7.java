package p000X;

import android.app.Activity;
import android.content.SharedPreferences;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0o7  reason: invalid class name and case insensitive filesystem */
public final class C16150o7 extends C16170o9 {
    public final C16220oE A00 = new C16220oE();
    public final C16210oD A01 = new C16210oD();

    public final void A01(Activity activity, AnonymousClass0C1 r3, String str) {
        A02(activity, r3, str, (Map) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00b4, code lost:
        if (r14 > (p000X.C147896Tu.A00(r9).getLong(p000X.AnonymousClass000.A0E(p000X.C147896Tu.A01, r6), 0) + r7)) goto L_0x00b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00b9, code lost:
        if (r0 != false) goto L_0x00bb;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00be A[Catch:{ IOException -> 0x017e, all -> 0x01c0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01b9  */
    /* JADX WARNING: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    public final void A02(Activity activity, AnonymousClass0C1 r18, String str, Map map) {
        boolean z;
        ArrayList arrayList;
        String str2;
        boolean z2;
        Map map2 = map;
        AnonymousClass0C1 r3 = r18;
        String str3 = str;
        Activity activity2 = activity;
        if (((Boolean) AnonymousClass0L6.A02(r3, AnonymousClass0L7.QP_SURVEYS_V1, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            ((C58512g4) r3.AVA(C58512g4.class, new C58522g5(r3))).A01(activity2, str3, map2, false);
            return;
        }
        try {
            if (C06530Pk.A00) {
                AnonymousClass0ZB.A01("tryShow", -369442750);
            }
            AnonymousClass0L7 r5 = AnonymousClass0L7.GRAPHQL_SURVEY_NEW_PROXY;
            long intValue = (long) ((Integer) AnonymousClass0L6.A02(r3, r5, "cooldown_time", 3600, (AnonymousClass04H) null)).intValue();
            String str4 = (String) AnonymousClass0L6.A02(r3, r5, "whitelist", "1750502288572541", (AnonymousClass04H) null);
            if (map == null) {
                map2 = new HashMap();
            }
            map2.put("ig_user_id", r3.A04());
            if (C147896Tu.A00(activity2).getBoolean(C147896Tu.A00, true)) {
                long currentTimeMillis = System.currentTimeMillis() / 1000;
                z = false;
                boolean z3 = false;
                if (currentTimeMillis > C147896Tu.A00(activity2).getLong(C147896Tu.A02, 0) + 86400) {
                    z3 = true;
                }
                if (str4.contains(str3)) {
                    z2 = false;
                }
                z2 = true;
                if (z3) {
                }
                if (z) {
                    if (str4.contains(str3)) {
                        SharedPreferences.Editor edit = C147896Tu.A00(activity2).edit();
                        edit.putLong(AnonymousClass000.A0E(C147896Tu.A01, str3), System.currentTimeMillis() / 1000);
                        edit.apply();
                    }
                    C26873Btx btx = new C26873Btx(activity2, r3, str3);
                    if (map2 == null || map2.isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList();
                        for (Map.Entry entry : map2.entrySet()) {
                            arrayList.add(new C24112AiM((String) entry.getKey(), (String) entry.getValue()));
                        }
                    }
                    C24085Ahi ahi = new C24085Ahi(str3, arrayList);
                    StringWriter stringWriter = new StringWriter();
                    C13460iZ A05 = C12890hY.A00.A05(stringWriter);
                    A05.A0T();
                    String str5 = ahi.A00;
                    if (str5 != null) {
                        A05.A0H("0", str5);
                    }
                    if (ahi.A01 != null) {
                        A05.A0d(RealtimeSubscription.GRAPHQL_MQTT_VERSION);
                        A05.A0S();
                        for (C24112AiM aiM : ahi.A01) {
                            if (aiM != null) {
                                A05.A0T();
                                String str6 = aiM.A00;
                                if (str6 != null) {
                                    A05.A0H("context_key", str6);
                                }
                                String str7 = aiM.A01;
                                if (str7 != null) {
                                    A05.A0H("context_value", str7);
                                }
                                A05.A0Q();
                            }
                        }
                        A05.A0P();
                    }
                    A05.A0Q();
                    A05.close();
                    str2 = stringWriter.toString();
                    B7R b7r = new B7R(str2);
                    AnonymousClass25V A002 = AnonymousClass25V.A00(r3);
                    A002.A03(b7r);
                    Integer num = Constants.ZERO;
                    A002.A04(num);
                    C17850qu A02 = A002.A02(num);
                    A02.A00 = btx;
                    C12810hQ.A03(A02, 220, 3, false, false);
                }
                if (!C06530Pk.A00) {
                    AnonymousClass0ZB.A00(-13291109);
                    return;
                }
                return;
            }
            z = true;
            if (z) {
            }
        } catch (IOException e) {
            AnonymousClass0DB.A0M("RapidFeedbackApiUtil", e, "Error serializing to JSON; use simple integration id as input");
            str2 = C06360Ot.formatString("{\"%s\":\"%s\"}", "0", str);
        } catch (Throwable th) {
            if (C06530Pk.A00) {
                AnonymousClass0ZB.A00(-1636720917);
            }
            throw th;
        }
        if (!C06530Pk.A00) {
        }
    }

    public final void A03(Activity activity, AnonymousClass0C1 r4, String str, Map map) {
        ((C58512g4) r4.AVA(C58512g4.class, new C58522g5(r4))).A01(activity, str, map, true);
    }
}
