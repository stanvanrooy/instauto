package p000X;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import com.facebook.common.dextricks.DexStore;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.ADA */
public final class ADA {
    public static Boolean A00;
    public static final Set A01 = new HashSet(Arrays.asList(new String[]{AnonymousClass0C5.$const$string(333), "com.google.android.gms", "com.google.market"}));

    /* JADX WARNING: Can't wrap try/catch for region: R(6:3|4|(3:6|7|(1:10))|11|12|13) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
    public static boolean A01(Context context, Intent intent) {
        if (!(context == null || intent == null)) {
            try {
                String str = ADB.A00;
                if (str != null) {
                    Uri A002 = C08480Xf.A00(str);
                    String scheme = A002.getScheme();
                    String authority = A002.getAuthority();
                    if (!(scheme == null || authority == null)) {
                        Bundle bundle = new Bundle();
                        bundle.putString("Referer", AnonymousClass000.A0J(scheme, "://", authority));
                        intent.putExtra("com.android.browser.headers", bundle);
                    }
                }
                AnonymousClass0XM.A00().A05().A04(intent, context);
                return true;
            } catch (ActivityNotFoundException unused) {
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005c, code lost:
        if (r1.endsWith(p000X.AnonymousClass0C5.$const$string(138)) == false) goto L_0x005e;
     */
    public static boolean A00(Context context) {
        String str;
        boolean z;
        Boolean bool = A00;
        if (bool == null) {
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                try {
                    str = activity.getPackageManager().getActivityInfo(activity.getComponentName(), 0).processName;
                } catch (PackageManager.NameNotFoundException unused) {
                    ATK.A01("BrowserContextHelper", "Y U can't find the activity info!", new Object[0]);
                    str = null;
                }
            } else {
                int myPid = Process.myPid();
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
                if (runningAppProcesses != null) {
                    Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        ActivityManager.RunningAppProcessInfo next = it.next();
                        if (next.pid == myPid) {
                            str = next.processName;
                            break;
                        }
                    }
                }
                str = null;
            }
            if (str != null) {
                z = true;
            }
            z = false;
            bool = Boolean.valueOf(z);
            A00 = bool;
        }
        return bool.booleanValue();
    }

    public static boolean A02(Context context, Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addFlags(268435456);
        intent.setData(uri);
        for (ResolveInfo next : context.getPackageManager().queryIntentActivities(intent, DexStore.LOAD_RESULT_PGO_ATTEMPTED)) {
            String str = next.activityInfo.packageName;
            if (A01.contains(str)) {
                Intent intent2 = new Intent(intent);
                intent2.setComponent(new ComponentName(str, next.activityInfo.name));
                if (A01(context, intent2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean A03(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Intent parseUri = Intent.parseUri(str, 1);
            parseUri.addFlags(268435456);
            parseUri.addCategory(AnonymousClass0C5.$const$string(183));
            parseUri.setComponent((ComponentName) null);
            parseUri.setSelector((Intent) null);
            if (context.getPackageManager().resolveActivity(parseUri, 0) == null) {
                String str2 = parseUri.getPackage();
                if (!TextUtils.isEmpty(str2)) {
                    return A02(context, new Uri.Builder().scheme("market").authority("details").appendQueryParameter("id", str2).build());
                }
            }
            return A01(context, parseUri);
        } catch (URISyntaxException unused) {
            return false;
        }
    }
}
