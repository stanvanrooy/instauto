package p000X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import com.instagram.react.modules.navigator.IgReactNavigatorModule;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.1Dg  reason: invalid class name and case insensitive filesystem */
public final class C26431Dg {
    public static final C05450Ko A00;
    public static final SecureRandom A01 = new SecureRandom();
    public static final Set A02 = new HashSet(Arrays.asList(new String[]{"com.facebook.katana", "com.facebook.wakizashi", "com.facebook.orca", "com.whatsapp"}));

    static {
        AnonymousClass0O1 A002 = AnonymousClass0O1.A00();
        A002.A01 = "FamilyBridgesLogger";
        A00 = A002.A01();
    }

    public static String A00() {
        StringBuilder sb = new StringBuilder(16);
        for (int i = 0; i < 16; i++) {
            sb.append("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".charAt(A01.nextInt(62)));
        }
        return sb.toString();
    }

    public static void A01(Context context) {
        String A002 = C05760Lv.A01.A00();
        String A012 = C05760Lv.A01.A01();
        if (A002 == null || A012 == null) {
            C486328v A003 = C486328v.A00(context);
            if (A003 == null) {
                AnonymousClass0QD.A02("family-bridges", "failed to fetch AttributionIdentifiers");
                return;
            }
            String str = A003.A02;
            if (str != null) {
                C05760Lv.A01.A00.edit().putString("fb_attribution_id", str).apply();
            }
            String str2 = A003.A01;
            if (str2 != null) {
                C05760Lv.A01.A02(str2);
            }
            C05760Lv.A01.A04(A003.A03);
        }
    }

    public static void A02(C06590Pq r11, AnonymousClass0RN r12, Activity activity, Intent intent) {
        Uri uri;
        if (intent != null) {
            if (Build.VERSION.SDK_INT >= 22) {
                uri = activity.getReferrer();
            } else {
                uri = (Uri) intent.getParcelableExtra("android.intent.extra.REFERRER");
            }
            if (uri != null && "android-app".equals(uri.getScheme()) && A02.contains(uri.getAuthority())) {
                String authority = uri.getAuthority();
                String dataString = intent.getDataString();
                String stringExtra = intent.getStringExtra("funlid");
                String stringExtra2 = intent.getStringExtra("source_surface");
                String stringExtra3 = intent.getStringExtra("dest_intended_surface");
                AnonymousClass0P4 A002 = AnonymousClass0P4.A00("opened_from_family_app", r12);
                A002.A0G("source_package", authority);
                A002.A0H("funnel_id", stringExtra);
                A002.A0H("source_surface", stringExtra2);
                A002.A0H("dest_intended_surface", stringExtra3);
                if (dataString != null) {
                    A002.A0G(IgReactNavigatorModule.URL, dataString);
                    A002.A0H("funnel_id_from_url", Uri.parse(dataString).getQueryParameter("funlid"));
                }
                AnonymousClass0WN.A01(r11).BcG(A002);
                C35041fi A003 = C35041fi.A00(r11);
                String authority2 = uri.getAuthority();
                String stringExtra4 = intent.getStringExtra("source_surface");
                String stringExtra5 = intent.getStringExtra("dest_intended_surface");
                C22800z1 r0 = A003.A00;
                C35071fl r1 = C35041fi.A01;
                r0.Bpg(r1);
                A003.A00.A3C(r1, authority2);
                if (stringExtra4 != null) {
                    A003.A00.A3C(C35041fi.A01, stringExtra4);
                }
                if (stringExtra5 != null) {
                    A003.A00.A3C(C35041fi.A01, stringExtra5);
                }
            }
        }
    }
}
