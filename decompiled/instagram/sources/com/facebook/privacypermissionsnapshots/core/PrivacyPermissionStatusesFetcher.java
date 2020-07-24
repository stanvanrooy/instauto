package com.facebook.privacypermissionsnapshots.core;

import android.content.Context;
import android.content.pm.PackageInfo;
import java.util.HashMap;
import p000X.AnonymousClass0DB;

public final class PrivacyPermissionStatusesFetcher {
    public static final HashMap A02 = new HashMap();
    public Context A00;
    public String A01;

    public HashMap getAppPermissionsAndStatuses(PackageInfo packageInfo) {
        String str;
        A02.clear();
        try {
            if (packageInfo.requestedPermissionsFlags.length != packageInfo.requestedPermissions.length) {
                return A02;
            }
            int i = 0;
            while (true) {
                String[] strArr = packageInfo.requestedPermissions;
                if (i >= strArr.length) {
                    break;
                }
                boolean z = false;
                if ((packageInfo.requestedPermissionsFlags[i] & 2) != 0) {
                    z = true;
                }
                HashMap hashMap = A02;
                String str2 = strArr[i];
                if (z) {
                    str = "GRANTED";
                } else {
                    str = "DENIED";
                }
                hashMap.put(str2, str);
                i++;
            }
            return A02;
        } catch (NullPointerException e) {
            AnonymousClass0DB.A0O("com.facebook.privacypermissionsnapshots.core.PrivacyPermissionStatusesFetcher", e, "Error while trying to get statuses");
        }
    }

    public PrivacyPermissionStatusesFetcher(Context context) {
        this.A00 = context;
        this.A01 = context.getPackageName();
    }
}
