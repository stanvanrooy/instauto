package p000X;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import java.util.UUID;

/* renamed from: X.0Qt  reason: invalid class name and case insensitive filesystem */
public final class C06860Qt {
    public static C06860Qt A03;
    public C17570qS A00;
    public final Context A01;
    public final SharedPreferences A02;

    public final synchronized C17570qS A01(C06590Pq r11) {
        boolean z;
        if (this.A00 == null) {
            synchronized (this) {
                String string = this.A02.getString("analytics_device_id", (String) null);
                long j = this.A02.getLong("analytic_device_timestamp", Long.MAX_VALUE);
                if (string == null || j == Long.MAX_VALUE) {
                    synchronized (this) {
                        z = this.A02.getBoolean("phone_id_synced", false);
                    }
                    if (z) {
                        string = UUID.randomUUID().toString();
                        j = System.currentTimeMillis();
                        this.A02.edit().putString("analytics_device_id", string).putBoolean("analytics_device_id_external", false).putLong("analytic_device_timestamp", j).apply();
                        if (r11 != null) {
                            AnonymousClass0P4 A002 = AnonymousClass0P4.A00("phoneid_update", (AnonymousClass0RN) null);
                            A002.A0G("custom_uuid", C05860Mt.A02.A04());
                            A002.A0G("new_id", string);
                            A002.A0F("new_ts", Long.valueOf(j));
                            A002.A0G("type", "initial_create");
                            AnonymousClass0ZA.A0E(new Handler(Looper.getMainLooper()), new C06880Qv(this, r11, A002), 1428376268);
                        }
                    }
                }
                String packageName = this.A01.getPackageName();
                if (C17580qT.A00().containsKey(packageName)) {
                    packageName = (String) C17580qT.A00().get(packageName);
                }
                this.A00 = new C17570qS(string, j, packageName);
            }
        }
        return this.A00;
    }

    public static synchronized C06860Qt A00(Context context) {
        C06860Qt r0;
        synchronized (C06860Qt.class) {
            if (A03 == null) {
                A03 = new C06860Qt(context);
            }
            r0 = A03;
        }
        return r0;
    }

    public C06860Qt(Context context) {
        this.A02 = context.getSharedPreferences("analyticsprefs", 0);
        this.A01 = context;
    }
}
