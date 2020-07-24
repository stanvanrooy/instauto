package p000X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

/* renamed from: X.BJV */
public final class BJV {
    public final Context A00;

    public static BHD getClient(Context context) {
        return new C25365BGd(context);
    }

    public static Handler getMainThreadHandler() {
        return new Handler(Looper.getMainLooper());
    }

    public BJV(Context context) {
        this.A00 = context;
    }
}
