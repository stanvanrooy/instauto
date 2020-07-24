package p000X;

import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.07l  reason: invalid class name and case insensitive filesystem */
public final class C035607l {
    public static final AtomicReference A00 = new AtomicReference();

    public static void A00(String str, String str2, Throwable th) {
        if (((C035507k) A00.get()) == null) {
            Log.e(str, str2, th);
        }
    }
}
