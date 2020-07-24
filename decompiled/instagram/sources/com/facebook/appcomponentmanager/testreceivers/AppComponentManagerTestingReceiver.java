package com.facebook.appcomponentmanager.testreceivers;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import p000X.AnonymousClass0DB;
import p000X.AnonymousClass0Z0;

public class AppComponentManagerTestingReceiver extends BroadcastReceiver {
    public static void A00(PackageManager packageManager, ComponentInfo[] componentInfoArr) {
        for (ComponentInfo componentInfo : componentInfoArr) {
            int componentEnabledSetting = packageManager.getComponentEnabledSetting(new ComponentName(componentInfo.packageName, componentInfo.name));
            if (!(componentEnabledSetting == 0 || componentEnabledSetting == 1 || componentEnabledSetting == 2)) {
                AnonymousClass0DB.A0K("AppComponentManagerTestingReceiver", "%s is marked as currently in state %d, which is not an expected state. Conservatively assuming it's disabled.", componentInfo.name, Integer.valueOf(componentEnabledSetting));
            }
        }
    }

    public final void onReceive(Context context, Intent intent) {
        int i;
        String str;
        int A01 = AnonymousClass0Z0.A01(1663029907);
        String action = intent.getAction();
        if (action == null) {
            AnonymousClass0DB.A0E("AppComponentManagerTestingReceiver", "Intent Action was null. Please supply an action.");
            i = -486739972;
        } else {
            char c = 65535;
            int hashCode = action.hashCode();
            if (hashCode != -1618603518) {
                if (hashCode == -405873831 && action.equals("com.facebook.appcomponentmanager.ACTION_PRINT_COMPONENTS")) {
                    c = 0;
                }
            } else if (action.equals("com.facebook.appcomponentmanager.ACTION_GET_CURRENT_ENABLE_STAGE")) {
                c = 1;
            }
            if (c == 0) {
                PackageManager packageManager = context.getPackageManager();
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 33423);
                    A00(packageManager, packageInfo.activities);
                    A00(packageManager, packageInfo.receivers);
                    A00(packageManager, packageInfo.services);
                    A00(packageManager, packageInfo.providers);
                } catch (PackageManager.NameNotFoundException e) {
                    AnonymousClass0DB.A0M("AppComponentManagerTestingReceiver", e, "Ran into NameNotFoundException");
                }
            } else if (c != 1) {
                AnonymousClass0DB.A0K("AppComponentManagerTestingReceiver", "Intent Action %s is not a known action.", action);
            } else {
                PackageManager packageManager2 = context.getPackageManager();
                if (packageManager2 == null) {
                    AnonymousClass0DB.A0D("AppComponentManagerTestingReceiver", "PackageManager received from context was null. Aborting.");
                } else {
                    if (packageManager2.getComponentEnabledSetting(new ComponentName(context.getPackageName(), SecondEnableStageTestReceiver.class.getCanonicalName())) == 1) {
                        str = "Enable Stage: Warm Pre-TOS.";
                    } else {
                        str = "Enable Stage: Cold Pre-TOS.";
                    }
                    AnonymousClass0DB.A0E("AppComponentManagerTestingReceiver", str);
                }
            }
            i = -1666263287;
        }
        AnonymousClass0Z0.A0E(intent, i, A01);
    }
}
