package p000X;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1g3  reason: invalid class name and case insensitive filesystem */
public abstract class C35251g3 {
    public static AnonymousClass2WY A00(String[] strArr, Map map) {
        AnonymousClass2WY r5 = AnonymousClass2WY.GRANTED;
        for (String str : strArr) {
            AnonymousClass2WY r2 = (AnonymousClass2WY) map.get(str);
            if (r2 == null) {
                r2 = AnonymousClass2WY.DENIED;
            }
            AnonymousClass2WY r1 = AnonymousClass2WY.DENIED_DONT_ASK_AGAIN;
            if (r2 == r1 || (r2 == AnonymousClass2WY.DENIED && r5 != r1)) {
                r5 = r2;
            }
        }
        return r5;
    }

    public static boolean A01(Activity activity, C51742Ly r9, String[] strArr) {
        AnonymousClass2WZ r2;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (A07(activity, str)) {
                hashMap.put(str, AnonymousClass2WY.GRANTED);
            } else {
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            r9.BE9(hashMap);
            return false;
        }
        AnonymousClass2WZ r3 = (AnonymousClass2WZ) activity.getFragmentManager().findFragmentByTag("PermissionCallback");
        if (r3 != null) {
            r2 = r3;
        } else {
            r2 = new AnonymousClass2WZ();
        }
        AnonymousClass2Wa r0 = new AnonymousClass2Wa(hashMap, r9);
        r2.A01 = (String[]) arrayList.toArray(new String[0]);
        r2.A00 = r0;
        if (r3 != null) {
            return true;
        }
        activity.getFragmentManager().beginTransaction().add(r2, "PermissionCallback").commitAllowingStateLoss();
        return true;
    }

    public static boolean A02(Activity activity, C51742Ly r6, String... strArr) {
        if (Build.VERSION.SDK_INT >= 23) {
            return A01(activity, r6, strArr);
        }
        HashMap hashMap = new HashMap();
        for (String put : strArr) {
            hashMap.put(put, AnonymousClass2WY.GRANTED);
        }
        r6.BE9(hashMap);
        return false;
    }

    public static boolean A04(Activity activity, String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return A05(activity, str);
        }
        return false;
    }

    public static boolean A06(Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            return Settings.canDrawOverlays(context);
        }
        try {
            if (context.checkCallingOrSelfPermission("android.permission.SYSTEM_ALERT_WINDOW") == 0) {
                return true;
            }
            return false;
        } catch (RuntimeException unused) {
            return false;
        }
    }

    public static boolean A07(Context context, String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return A08(context, str);
        }
        return true;
    }

    public static boolean A09(Context context, String... strArr) {
        if (Build.VERSION.SDK_INT >= 23) {
            for (String A08 : strArr) {
                if (!A08(context, A08)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean A03(Activity activity, String str) {
        boolean A07 = A07(activity, str);
        boolean A04 = A04(activity, str);
        if (A07 || !A04) {
            return false;
        }
        return true;
    }

    public static boolean A05(Activity activity, String str) {
        return activity.shouldShowRequestPermissionRationale(str);
    }

    public static boolean A08(Context context, String str) {
        if (context.checkSelfPermission(str) == 0) {
            return true;
        }
        return false;
    }
}
