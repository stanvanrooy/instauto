package p000X;

import android.content.Context;

/* renamed from: X.18q  reason: invalid class name and case insensitive filesystem */
public final class C254018q {
    public static C92803zk A00;
    public static C92803zk A01;
    public static C253818o A02;
    public static final C92803zk A03 = AnonymousClass8AL.A00(new C254118r());
    public static final C92803zk A04 = AnonymousClass8AL.A00(new C254218s());

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000b, code lost:
        if (A02 == null) goto L_0x000d;
     */
    public static void A00() {
        boolean z;
        if (!(A00 == null || A01 == null)) {
            z = true;
        }
        z = false;
        AnonymousClass0a4.A0B(z, "Missing required call to FCMModule.initialize(context, options, delegate)");
    }

    public static void A01(Context context, C253718n r2, C253818o r3) {
        Context applicationContext = context.getApplicationContext();
        A01 = AnonymousClass8AL.A00(new C254318t(applicationContext, r2));
        A00 = AnonymousClass8AL.A00(new C254418u(applicationContext));
        A02 = r3;
    }
}
