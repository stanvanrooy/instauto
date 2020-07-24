package p000X;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.TimeUnit;

/* renamed from: X.18y  reason: invalid class name and case insensitive filesystem */
public final class C254818y {
    public static C254818y A01;
    public static final long A02 = TimeUnit.DAYS.toMillis(7);
    public final SharedPreferences A00;

    public C254818y(Context context) {
        this.A00 = context.getSharedPreferences("NOTIFICATION_CHANNELS", 0);
    }
}
