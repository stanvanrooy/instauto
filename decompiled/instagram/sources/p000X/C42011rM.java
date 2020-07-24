package p000X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInstaller;
import android.os.Bundle;
import android.os.UserManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1rM  reason: invalid class name and case insensitive filesystem */
public class C42011rM {
    public static boolean A00;
    public static boolean A01;
    public static final AtomicBoolean A02 = new AtomicBoolean();
    public static final AtomicBoolean A03 = new AtomicBoolean();

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006a, code lost:
        if ("true".equals(r1.getString("restricted_profile")) == false) goto L_0x006c;
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    public static boolean A00(Context context) {
        boolean z;
        boolean equals = "com.google.android.gms".equals("com.google.android.gms");
        if (C42061rR.A01()) {
            try {
                for (PackageInstaller.SessionInfo appPackageName : context.getPackageManager().getPackageInstaller().getAllSessions()) {
                    if ("com.google.android.gms".equals(appPackageName.getAppPackageName())) {
                        return true;
                    }
                }
            } catch (Exception unused) {
            }
        }
        ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo("com.google.android.gms", 8192);
        if (equals) {
            return applicationInfo.enabled;
        }
        if (applicationInfo.enabled) {
            Bundle applicationRestrictions = ((UserManager) context.getSystemService("user")).getApplicationRestrictions(context.getPackageName());
            if (applicationRestrictions != null) {
                z = true;
            }
            z = false;
            if (!z) {
                return true;
            }
        }
        return false;
    }
}
