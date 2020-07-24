package p000X;

import android.content.Context;

/* renamed from: X.0xc  reason: invalid class name and case insensitive filesystem */
public abstract class C21960xc {
    public static C21960xc A00;

    public abstract void A01(Context context, AnonymousClass0RN r2, AnonymousClass0C1 r3, String str, String str2);

    public static C21960xc A00() {
        boolean z = false;
        if (A00 != null) {
            z = true;
        }
        AnonymousClass0a4.A0C(z, "Must call setInstance first");
        return A00;
    }
}
