package p000X;

import android.app.AppOpsManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.0p4  reason: invalid class name and case insensitive filesystem */
public final class C16730p4 {
    public static String A02;
    public static Set A03 = new HashSet();
    public static AnonymousClass2Vh A04;
    public static final Object A05 = new Object();
    public static final Object A06 = new Object();
    public final NotificationManager A00;
    public final Context A01;

    private void A00(C53982Vg r4) {
        synchronized (A06) {
            if (A04 == null) {
                A04 = new AnonymousClass2Vh(this.A01.getApplicationContext());
            }
            A04.A02.obtainMessage(0, r4).sendToTarget();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r1.getBoolean("android.support.useSideChannel") == false) goto L_0x000d;
     */
    public final void A02(String str, int i, Notification notification) {
        boolean z;
        Bundle bundle = notification.extras;
        if (bundle != null) {
            z = true;
        }
        z = false;
        if (z) {
            A00(new C54002Vj(this.A01.getPackageName(), i, str, notification));
            this.A00.cancel(str, i);
            return;
        }
        this.A00.notify(str, i, notification);
    }

    public final boolean A03() {
        if (Build.VERSION.SDK_INT >= 24) {
            return this.A00.areNotificationsEnabled();
        }
        AppOpsManager appOpsManager = (AppOpsManager) this.A01.getSystemService("appops");
        ApplicationInfo applicationInfo = this.A01.getApplicationInfo();
        String packageName = this.A01.getApplicationContext().getPackageName();
        int i = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class cls2 = Integer.TYPE;
            if (((Integer) cls.getMethod("checkOpNoThrow", new Class[]{cls2, cls2, String.class}).invoke(appOpsManager, new Object[]{Integer.valueOf(((Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)).intValue()), Integer.valueOf(i), packageName})).intValue() != 0) {
                return false;
            }
            return true;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }

    public C16730p4(Context context) {
        this.A01 = context;
        this.A00 = (NotificationManager) context.getSystemService("notification");
    }

    public final void A01(String str) {
        this.A00.cancel(str, 64278);
        if (Build.VERSION.SDK_INT <= 19) {
            A00(new C53992Vi(this.A01.getPackageName(), str));
        }
    }
}
