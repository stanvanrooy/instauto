package p000X;

import android.text.TextUtils;

/* renamed from: X.0jk  reason: invalid class name and case insensitive filesystem */
public final class C14090jk {
    public static boolean A02(AnonymousClass0C1 r2) {
        C13300iJ r0 = r2.A06;
        if (r0 == null || Constants.A0C != r0.A1o) {
            return false;
        }
        return true;
    }

    public static boolean A00(AnonymousClass0C1 r1) {
        if (A01(r1)) {
            return true;
        }
        return false;
    }

    public static boolean A01(AnonymousClass0C1 r4) {
        if (C14100jl.A02(r4) || ((Boolean) AnonymousClass0L6.A02(r4, AnonymousClass0L7.EMPLOYEE_OPTIONS, "is_enabled", false, (AnonymousClass04H) null)).booleanValue()) {
            return true;
        }
        return false;
    }

    public static boolean A03(AnonymousClass0C1 r2, AnonymousClass1NJ r3) {
        String A04 = r2.A04();
        if (TextUtils.isEmpty(A04) || !r3.A0c(r2).getId().equals(A04)) {
            return false;
        }
        return true;
    }

    public static boolean A04(AnonymousClass0C1 r1, AnonymousClass1NJ r2) {
        if (!r2.A1R() || !A05(r1, r2.A0b())) {
            return false;
        }
        return true;
    }

    public static boolean A05(AnonymousClass0C1 r1, C13310iK r2) {
        String A04 = r1.A04();
        String id = r2.getId();
        if (id == null || A04 == null || !A04.equals(id)) {
            return false;
        }
        return true;
    }

    public static boolean A06(AnonymousClass0C1 r1, String str) {
        String A04 = r1.A04();
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(A04) || !A04.equals(str)) {
            return false;
        }
        return true;
    }
}
