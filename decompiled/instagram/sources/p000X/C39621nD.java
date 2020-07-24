package p000X;

import android.content.Context;

/* renamed from: X.1nD  reason: invalid class name and case insensitive filesystem */
public final class C39621nD {
    public static boolean A00(Context context, AnonymousClass0C1 r1) {
        if (AnonymousClass0NT.A08(context) || (!A01(r1))) {
            return true;
        }
        return false;
    }

    public static boolean A01(AnonymousClass0C1 r3) {
        boolean z;
        if (!AnonymousClass1YN.A00(r3)) {
            C26171By A01 = C26171By.A01(r3);
            boolean z2 = true;
            if (!C26171By.A01 && ((!(!AnonymousClass0NT.A08(StoredPreferences.A00)) || !C26171By.A02) && (!A01.A03() || !z))) {
                z2 = false;
            }
            if (z2) {
                return true;
            }
            return false;
        }
        return true;
    }
}
