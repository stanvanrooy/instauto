package com.facebook.appcomponentmanager;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.io.File;
import p000X.AnonymousClass00Y;
import p000X.AnonymousClass016;
import p000X.AnonymousClass01Q;
import p000X.AnonymousClass0DB;
import p000X.B8O;
import p000X.BAs;
import p000X.C04410Dw;
import p000X.C11270eh;

public class AppComponentManagerService extends AnonymousClass00Y {
    public final void onHandleWork(Intent intent) {
        intent.getAction();
        if ("com.facebook.appcomponentmanager.ACTION_ENABLE_COMPONENTS".equals(intent.getAction())) {
            try {
                C11270eh.A03(this, "app_update");
                Intent intent2 = new Intent("com.facebook.appcomponentmanager.ENABLING_CMPS_DONE");
                intent2.setPackage(getPackageName());
                sendBroadcast(intent2);
            } catch (RuntimeException e) {
                e = e;
                AnonymousClass0DB.A0G("AppComponentManagerService", "Exception while enabling components. Aborting.", e);
                C04410Dw.A0B(AnonymousClass01Q.A00, e, (AnonymousClass016) null, 1);
            }
        } else if ("com.facebook.appcomponentmanager.ACTION_EFNORCE_MANIFEST_CONSISTENCY".equals(intent.getAction())) {
            PackageManager packageManager = getPackageManager();
            BAs bAs = new BAs();
            File file = new File(getApplicationInfo().sourceDir);
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(getPackageName(), 0);
                B8O A04 = bAs.A04(file);
                int i = packageInfo.versionCode;
                String num = Integer.toString(i);
                String str = A04.A01;
                if (!num.equals(str) || !packageInfo.versionName.equals(A04.A02) || !packageInfo.packageName.equals(A04.A00)) {
                    throw new IllegalStateException("PackageInfo{package=" + packageInfo.packageName + "," + "versionCode=" + i + "," + "versionName=" + packageInfo.versionName + "} ," + "Manifest{package=" + A04.A00 + ", " + "versionCode=" + str + ", " + "versionName=" + A04.A02 + ", " + "activities=" + A04.A03.size() + ", " + "receivers=" + A04.A05.size() + ", " + "services=" + A04.A06.size() + ", " + "providers=" + A04.A04.size() + "}");
                }
            } catch (Throwable th) {
                e = th;
                C04410Dw.A0B(AnonymousClass01Q.A00, e, (AnonymousClass016) null, 1);
            }
        }
    }
}
