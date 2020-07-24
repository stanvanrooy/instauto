package p000X;

import android.content.Context;

/* renamed from: X.0Mz  reason: invalid class name and case insensitive filesystem */
public final class C05920Mz {
    public final C05900Mx A00(Context context) {
        C05900Mx r2;
        C13150hy.A02(context, "context");
        C05900Mx r22 = C05900Mx.A04;
        if (r22 != null) {
            return r22;
        }
        synchronized (this) {
            r2 = C05900Mx.A04;
            if (r2 == null) {
                Context applicationContext = context.getApplicationContext();
                C13150hy.A01(applicationContext, "context.applicationContext");
                r2 = new C05900Mx(applicationContext);
                C05900Mx.A04 = r2;
            }
        }
        return r2;
    }
}
