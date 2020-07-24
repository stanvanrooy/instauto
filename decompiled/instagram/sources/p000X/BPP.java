package p000X;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ConfigurationInfo;

/* renamed from: X.BPP */
public final class BPP extends BOA {
    public ConfigurationInfo A00;
    public final ActivityManager.RunningAppProcessInfo A01;
    public final ActivityManager A02;
    public final Context A03;

    public BPP(Context context, BQH bqh) {
        super(context, bqh);
        this.A03 = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.A02 = activityManager;
        if (activityManager != null) {
            this.A00 = activityManager.getDeviceConfigurationInfo();
        }
        this.A01 = new ActivityManager.RunningAppProcessInfo();
    }
}
