package p000X;

import android.app.Activity;

/* renamed from: X.1Dd  reason: invalid class name and case insensitive filesystem */
public final class C26401Dd {
    public float A00;
    public boolean A01;
    public final AnonymousClass0IT A02;

    public C26401Dd(Activity activity, AnonymousClass0C1 r3) {
        this.A02 = AnonymousClass8AL.A00(new C26411De(this, activity, r3));
    }

    public static String A00(float f, AnonymousClass1DI r2, String str, String str2) {
        if (f == r2.A05()) {
            return str2;
        }
        if (!AnonymousClass1DN.A00() && f == r2.A03()) {
            return str;
        }
        if (AnonymousClass1DX.A02() && f == r2.A02()) {
            return str;
        }
        if (f == r2.A04()) {
            return "feed_timeline";
        }
        return "unknown";
    }
}
