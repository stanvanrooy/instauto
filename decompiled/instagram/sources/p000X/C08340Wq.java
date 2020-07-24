package p000X;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.facebook.rti.push.service.FbnsService;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0Wq  reason: invalid class name and case insensitive filesystem */
public final class C08340Wq {
    public static void A02(Context context, boolean z, String str) {
        ComponentName componentName = new ComponentName(context, str);
        PackageManager packageManager = context.getPackageManager();
        int i = 2;
        if (z) {
            i = 1;
        }
        packageManager.setComponentEnabledSetting(componentName, i, 1);
        componentName.getShortClassName();
    }

    public static void A00(Context context) {
        List<ActivityManager.RunningServiceInfo> list;
        boolean z;
        String A01 = FbnsService.A01(context.getPackageName());
        boolean z2 = false;
        try {
            int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, A01));
            if (componentEnabledSetting == 1 || componentEnabledSetting == 0) {
                z2 = true;
            }
        } catch (Exception unused) {
        }
        if (z2) {
            String packageName = context.getPackageName();
            try {
                list = ((ActivityManager) AnonymousClass0TU.A00.A00(context, "activity", ActivityManager.class)).getRunningServices(Integer.MAX_VALUE);
            } catch (NullPointerException e) {
                AnonymousClass0DB.A0M("RtiGracefulSystemMethodHelper", e, "Failed to getRunningServices");
                list = null;
            }
            if (list != null) {
                Iterator<ActivityManager.RunningServiceInfo> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ActivityManager.RunningServiceInfo next = it.next();
                    String className = next.service.getClassName();
                    String packageName2 = next.service.getPackageName();
                    if (A01.equals(className) && packageName.equals(packageName2)) {
                        z = next.started;
                        break;
                    }
                }
            }
            z = false;
            if (z) {
                Intent intent = new Intent("Orca.STOP");
                intent.setComponent(new ComponentName(context.getPackageName(), A01));
                new AnonymousClass0UR(context).A03(intent);
            }
            A02(context, false, A01);
        }
    }

    public static void A01(Context context, String str, String str2, String str3, String str4, AnonymousClass0VA r11) {
        if (context.getPackageName().equals(str3)) {
            A02(context, true, str);
        }
        ComponentName componentName = new ComponentName(str3, str);
        Intent intent = new Intent(str4);
        intent.setComponent(componentName);
        if (str2 != null) {
            intent.putExtra("caller", str2);
        }
        if (r11 != null) {
            String str5 = r11.A03;
            if (str5 != null) {
                intent.putExtra("caller", str5);
            }
            long j = r11.A00;
            if (j != 0) {
                intent.putExtra("EXPIRED_SESSION", j);
            }
            Boolean bool = r11.A01;
            if (bool != null) {
                intent.putExtra("EXPLICIT_DELIVERY_ACK", bool);
            }
            Integer num = r11.A02;
            if (num != null) {
                intent.putExtra("DELIVERY_RETRY_INTERVAL", num);
            }
        }
        new AnonymousClass0UR(context).A03(intent);
    }
}
