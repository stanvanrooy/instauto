package p000X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.PermissionInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;

/* renamed from: X.11w  reason: invalid class name and case insensitive filesystem */
public final class C238011w extends C237311p {
    public static final Uri A00 = C08480Xf.A00("content://com.transsion.hilauncher.unreadprovider");
    public static final Uri A01 = C08480Xf.A00("content://com.transsion.XOSLauncher.unreadprovider");

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0072 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    public final boolean A02(Context context, String str) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 24 && (str.equals("com.transsion.XOSLauncher") || str.equals("com.transsion.hilauncher"))) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                Intent intent = new Intent("android.intent.action.MAIN");
                intent.addCategory("android.intent.category.HOME");
                try {
                    ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
                    if (resolveActivity != null) {
                        PermissionInfo[] permissionInfoArr = packageManager.getPackageInfo(resolveActivity.activityInfo.packageName, 4096).permissions;
                        int length = permissionInfoArr.length;
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                z = true;
                                break;
                            }
                            String str2 = permissionInfoArr[i].name;
                            if ("com.transsion.hilauncher.permission.CHANGE_BADGE".equals(str2) || "com.transsion.XOSLauncher.permission.CHANGE_BADGE".equals(str2)) {
                                break;
                            }
                            i++;
                        }
                        if (!z || !((Boolean) C05640Lj.A00(AnonymousClass0L7.BADGING_ON_TRANSSION, "enable_badging", false)).booleanValue()) {
                            return false;
                        }
                        return true;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    z = false;
                }
            }
            z = false;
            if (!z || !((Boolean) C05640Lj.A00(AnonymousClass0L7.BADGING_ON_TRANSSION, "enable_badging", false)).booleanValue()) {
            }
        }
        return false;
    }

    public final void A01(int i, Context context) {
        String A02 = C06460Pd.A02(context);
        Bundle bundle = new Bundle();
        bundle.putString("package", context.getPackageName());
        bundle.putString("class", C237311p.A00(context).getClassName());
        bundle.putInt("badgenumber", i);
        try {
            if (A02.equals("com.transsion.XOSLauncher")) {
                context.getContentResolver().call(A01, "change_badge", (String) null, bundle);
            } else if (A02.equals("com.transsion.hilauncher")) {
                context.getContentResolver().call(A00, "change_badge", (String) null, bundle);
            }
        } catch (Exception e) {
            AnonymousClass0QD.A05(getClass().getName(), "unexpected exception", e);
        }
    }
}
