package p000X;

import android.content.Context;
import android.os.Build;

/* renamed from: X.BQW */
public final class BQW {
    public static String A00(Context context) {
        if (Build.VERSION.SDK_INT < 26) {
            return Build.SERIAL;
        }
        if (C019000b.A01(context, "android.permission.READ_PHONE_STATE") == 0) {
            return Build.getSerial();
        }
        return AnonymousClass0C5.$const$string(170);
    }
}
