package p000X;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.0Zn  reason: invalid class name and case insensitive filesystem */
public final class C08990Zn {
    public static Set A00(Context context) {
        if (Build.VERSION.SDK_INT >= 21) {
            return A01(context);
        }
        return new HashSet();
    }

    public static Set A01(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            HashSet hashSet = new HashSet();
            if (packageInfo != null && packageInfo.splitNames != null) {
                int i = 0;
                while (true) {
                    String[] strArr = packageInfo.splitNames;
                    if (i >= strArr.length) {
                        break;
                    }
                    hashSet.add(strArr[i]);
                    if (!C09000Zp.A01(packageInfo.splitNames[i], context)) {
                        AnonymousClass0DB.A0L("InstalledSplitUtil", "Module %s is marked as installed through package manager but the split file does not exist at the expected location", packageInfo.splitNames[i]);
                    } else {
                        C09000Zp.A00(packageInfo.splitNames[i], context).toString();
                    }
                    i++;
                }
            }
            return hashSet;
        } catch (PackageManager.NameNotFoundException e) {
            AnonymousClass0DB.A0I("InstalledSplitUtil", "our package is not found in the package manager!", e);
            return new HashSet();
        }
    }
}
