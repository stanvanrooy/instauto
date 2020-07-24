package p000X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0Nr  reason: invalid class name and case insensitive filesystem */
public final class C06080Nr {
    public static final Uri A00 = new Uri.Builder().scheme("market").authority("details").build();
    public static final String[] A01 = {"com.android.vending", "com.google.android.gms", "com.google.market"};
    public static final Uri A02 = new Uri.Builder().scheme("https").authority("play.google.com").path("store/apps/details").build();
    public static final Comparator A03 = new C06090Ns();

    public static void A04(AnonymousClass1HD r3, Uri uri) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setPackage("com.instagram.layout");
        intent.putExtra("android.intent.extra.STREAM", uri);
        intent.setType("image/*");
        AnonymousClass1BH.A01(intent, 1, r3);
    }

    public static boolean A0B(PackageManager packageManager, String str) {
        if (packageManager == null) {
            return false;
        }
        try {
            return packageManager.getApplicationInfo(str, 0).enabled;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static Uri A01(String str) {
        return A00.buildUpon().appendQueryParameter("id", str).build();
    }

    public static void A02(Context context, String str, String str2) {
        String A0E = AnonymousClass000.A0E("market://details?id=", str);
        if (str2 != null) {
            A0E = AnonymousClass000.A0J(A0E, "&referrer=utm_source%3D", str2);
        }
        Uri parse = Uri.parse(A0E);
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setFlags(268435456);
        intent.setData(parse);
        if (!AnonymousClass1BH.A0F(intent, context)) {
            AnonymousClass1BH.A0H(A02.buildUpon().appendQueryParameter("id", str).build(), context);
        }
    }

    public static void A03(Context context, String str, boolean z) {
        ComponentName componentName = new ComponentName(context.getPackageName(), str);
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        Intent intent = new Intent();
        intent.setComponent(componentName);
        if (packageManager.resolveActivity(intent, 131584) != null) {
            int i = 2;
            if (z) {
                i = 1;
            }
            packageManager.setComponentEnabledSetting(componentName, i, 1);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0013  */
    public static int A00(Context context, Intent intent) {
        boolean z;
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        for (ResolveInfo resolveInfo : queryIntentActivities) {
            String str = resolveInfo.activityInfo.packageName;
            if (context.getPackageName().equals(str)) {
                return 0;
            }
            if ("com.instagram.android".equals(str) || "com.instagram.android.preload".equals(str)) {
                return 3;
            }
            while (r2.hasNext()) {
            }
        }
        List<ResolveInfo> queryIntentActivities2 = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse("https://www.example.com")), 0);
        for (ResolveInfo next : queryIntentActivities) {
            Comparator comparator = A03;
            Iterator<ResolveInfo> it = queryIntentActivities2.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (comparator.compare(it.next(), next) == 0) {
                        z = true;
                        continue;
                        break;
                    }
                } else {
                    z = false;
                    continue;
                    break;
                }
            }
            if (!z) {
                return 1;
            }
        }
        return 2;
    }

    public static boolean A05(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (A0B(packageManager, "com.facebook.katana") || A0B(packageManager, "com.facebook.wakizashi")) {
            return true;
        }
        return false;
    }

    public static boolean A06(Context context) {
        return "com.instagram.igtv".equals(context.getPackageName());
    }

    public static boolean A07(Context context) {
        String packageName = context.getPackageName();
        if (packageName.equals("com.instagram.android") || packageName.equals("com.instagram.android.preload")) {
            return true;
        }
        return false;
    }

    public static boolean A08(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null || packageManager.getLaunchIntentForPackage("com.android.vending") == null) {
            return false;
        }
        try {
            return packageManager.getApplicationInfo("com.android.vending", 0).enabled;
        } catch (PackageManager.NameNotFoundException e) {
            AnonymousClass0QD.A01("PackageUtil", e.getMessage());
            return false;
        }
    }

    public static boolean A09(Context context) {
        return "com.instagram.threadsapp".equals(context.getPackageName());
    }

    public static boolean A0A(Context context) {
        return A0B(context.getPackageManager(), "com.instagram.threadsapp");
    }
}
