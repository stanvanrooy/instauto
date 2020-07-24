package p000X;

import android.content.Context;
import android.os.Build;

/* renamed from: X.07u  reason: invalid class name and case insensitive filesystem */
public abstract class C036407u {
    public abstract boolean A02();

    public abstract boolean A03(long[] jArr);

    public static C036407u A01(Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return new AnonymousClass014(context);
        }
        AnonymousClass013 r1 = new AnonymousClass013();
        if (r1.A03(new long[8])) {
            return r1;
        }
        return new C019900n(context);
    }
}
