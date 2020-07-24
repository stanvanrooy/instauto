package p000X;

import android.os.HandlerThread;
import android.os.Looper;

/* renamed from: X.0nS  reason: invalid class name and case insensitive filesystem */
public final class C15740nS {
    public static Looper A00;

    public static synchronized Looper A00() {
        Looper looper;
        synchronized (C15740nS.class) {
            if (A00 == null) {
                HandlerThread handlerThread = new HandlerThread("IgLooper.backgroundLooper", 9);
                handlerThread.start();
                A00 = handlerThread.getLooper();
            }
            looper = A00;
        }
        return looper;
    }
}
