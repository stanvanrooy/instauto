package p000X;

/* renamed from: X.1ju  reason: invalid class name and case insensitive filesystem */
public final class C37591ju {
    public static C37141jB A02(String str, C27371Ho r4) {
        return new C37141jB(AnonymousClass000.A0E("instagram_ad_", str), r4, (C37121j9) null);
    }

    public static C37141jB A03(String str, C27371Ho r3) {
        return new C37141jB(str, r3, (C37121j9) null);
    }

    public static String A04(String str, boolean z) {
        String str2;
        if (z) {
            str2 = "instagram_commerce";
        } else {
            str2 = "instagram_shopping";
        }
        return AnonymousClass000.A0J(str2, "_", str);
    }

    public static C37141jB A00(AnonymousClass0C1 r2, String str, AnonymousClass1I6 r4, AnonymousClass1NJ r5, C27371Ho r6, Integer num) {
        if (!C36901in.A0M(r5, r6)) {
            return null;
        }
        C37141jB A01 = A01(str, r5, r6);
        A01.A0B(r2, r5);
        if (num != null) {
            A01.A14 = num.intValue();
        }
        if (r4 != null) {
            A01.A4c = r4.AVo();
        }
        return A01;
    }

    public static C37141jB A01(String str, C249616t r2, C27371Ho r3) {
        String str2;
        if (C36901in.A0O(r2, r3)) {
            str2 = "instagram_ad_";
        } else {
            str2 = "instagram_organic_";
        }
        return new C37141jB(AnonymousClass000.A0E(str2, str), r3, (C37121j9) null);
    }
}
