package p000X;

import android.content.Context;
import android.os.Build;

/* renamed from: X.06k  reason: invalid class name and case insensitive filesystem */
public abstract class C032906k {
    public static C032906k A00;

    public abstract void A01(int i, String str, AnonymousClass06W r3, long j, long j2);

    public static synchronized C032906k A00(Context context) {
        C032906k r0;
        synchronized (C032906k.class) {
            if (A00 == null) {
                if (Build.VERSION.SDK_INT >= 21) {
                    A00 = new AnonymousClass04R(context);
                } else {
                    A00 = new C026103d(context);
                }
            }
            r0 = A00;
        }
        return r0;
    }
}
