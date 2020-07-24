package p000X;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* renamed from: X.BLD */
public final class BLD implements BME {
    public final C29792DAb AAZ(Looper looper, Handler.Callback callback) {
        return new BLC(new Handler(looper, callback));
    }

    public final long ACp() {
        return SystemClock.elapsedRealtime();
    }

    public final long Btc() {
        return SystemClock.uptimeMillis();
    }

    public final long now() {
        return System.currentTimeMillis();
    }
}
