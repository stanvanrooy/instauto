package p000X;

import android.content.Context;

/* renamed from: X.1rO  reason: invalid class name and case insensitive filesystem */
public final class C42031rO {
    public static C42031rO A01 = new C42031rO();
    public C42041rP A00 = null;

    public static C42041rP A00(Context context) {
        C42041rP r0;
        C42031rO r1 = A01;
        synchronized (r1) {
            if (r1.A00 == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                r1.A00 = new C42041rP(context);
            }
            r0 = r1.A00;
        }
        return r0;
    }
}
