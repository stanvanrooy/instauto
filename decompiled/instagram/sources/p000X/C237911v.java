package p000X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import java.util.List;

/* renamed from: X.11v  reason: invalid class name and case insensitive filesystem */
public final class C237911v extends C237311p {
    public final Intent A00 = new Intent("launcher.action.CHANGE_APPLICATION_NOTIFICATION_NUM");

    public final void A01(int i, Context context) {
        try {
            this.A00.putExtra("notificationNum", i);
            this.A00.putExtra("packageName", context.getPackageName());
            this.A00.putExtra("className", C237311p.A00(context).getClassName());
            this.A00.addFlags(16777216);
            context.sendBroadcast(this.A00);
        } catch (Exception e) {
            AnonymousClass0QD.A05(getClass().getName(), "unexpected exception", e);
        }
    }

    public final boolean A02(Context context, String str) {
        List<ResolveInfo> queryBroadcastReceivers;
        if (str.equals("com.bbk.launcher2") && (queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(this.A00, 0)) != null) {
            for (ResolveInfo resolveInfo : queryBroadcastReceivers) {
                if ("com.bbk.launcher2".equals(resolveInfo.activityInfo.packageName)) {
                    return true;
                }
            }
        }
        return false;
    }
}
