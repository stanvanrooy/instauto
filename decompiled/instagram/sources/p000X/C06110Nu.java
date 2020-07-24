package p000X;

import android.content.Context;
import android.os.Build;

/* renamed from: X.0Nu  reason: invalid class name and case insensitive filesystem */
public final class C06110Nu {
    public static Boolean A00;

    public static boolean A00(Context context) {
        if (Build.VERSION.SDK_INT >= 27) {
            AnonymousClass0NI.A01();
            if (AnonymousClass0NI.A00(context) > 1073741824) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static synchronized boolean A01(Context context) {
        boolean booleanValue;
        synchronized (C06110Nu.class) {
            if (A00 == null) {
                AnonymousClass0NI.A01();
                boolean z = false;
                if (AnonymousClass0NI.A00(context) <= 1610612736) {
                    z = true;
                }
                A00 = Boolean.valueOf(z);
            }
            booleanValue = A00.booleanValue();
        }
        return booleanValue;
    }

    public static synchronized void clearLowRam() {
        synchronized (C06110Nu.class) {
            A00 = null;
        }
    }
}
