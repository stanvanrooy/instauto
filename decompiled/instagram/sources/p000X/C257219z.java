package p000X;

import android.content.Context;
import android.os.Vibrator;

/* renamed from: X.19z  reason: invalid class name and case insensitive filesystem */
public final class C257219z {
    public static C257219z A01;
    public Vibrator A00;

    public final void A00() {
        A01(30);
    }

    public final void A01(long j) {
        Vibrator vibrator = this.A00;
        boolean z = false;
        if (vibrator != null) {
            z = true;
        }
        if (z) {
            try {
                vibrator.vibrate(j);
            } catch (NullPointerException unused) {
            }
        }
    }

    public C257219z(Context context) {
        if (context.getPackageManager().checkPermission("android.permission.VIBRATE", context.getPackageName()) == 0) {
            this.A00 = (Vibrator) context.getSystemService("vibrator");
        }
    }
}
