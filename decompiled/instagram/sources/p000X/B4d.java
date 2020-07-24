package p000X;

import android.app.ActivityManager;
import java.util.concurrent.TimeUnit;

/* renamed from: X.B4d */
public final class B4d implements C29337Cw6 {
    public static final long A01 = TimeUnit.MINUTES.toMillis(5);
    public final ActivityManager A00;

    public final /* bridge */ /* synthetic */ Object get() {
        int i;
        int min = Math.min(this.A00.getMemoryClass() * 1048576, Integer.MAX_VALUE);
        if (min < 33554432) {
            i = 4194304;
        } else {
            i = 6291456;
            if (min >= 67108864) {
                i = min >> 2;
            }
        }
        return new C29548Czf(i, 256, Integer.MAX_VALUE, Integer.MAX_VALUE, A01);
    }

    public B4d(ActivityManager activityManager) {
        this.A00 = activityManager;
    }
}
