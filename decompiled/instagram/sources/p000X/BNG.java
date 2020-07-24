package p000X;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;

/* renamed from: X.BNG */
public final class BNG extends BOA {
    public final Context A00;
    public final PackageInfo A01;
    public final PackageManager A02;
    public final BQH A03;
    public final ActivityInfo[] A04;
    public final ServiceInfo[] A05;
    public final String[] A06;

    public BNG(Context context, BQH bqh) {
        super(context, bqh);
        PackageInfo packageInfo;
        ActivityInfo[] activityInfoArr;
        ServiceInfo[] serviceInfoArr;
        String[] strArr;
        this.A00 = context;
        this.A03 = bqh;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
        } catch (Throwable th) {
            C54802Yz.A00(th);
            packageInfo = null;
        }
        this.A01 = packageInfo;
        this.A02 = context.getPackageManager();
        try {
            activityInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 1).activities;
        } catch (Throwable th2) {
            C54802Yz.A00(th2);
            activityInfoArr = null;
        }
        this.A04 = activityInfoArr;
        try {
            serviceInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 4).services;
        } catch (Throwable th3) {
            C54802Yz.A00(th3);
            serviceInfoArr = null;
        }
        this.A05 = serviceInfoArr;
        try {
            strArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
        } catch (Throwable th4) {
            C54802Yz.A00(th4);
            strArr = null;
        }
        this.A06 = strArr;
    }
}
