package p000X;

import android.os.Build;

/* renamed from: X.1Vv  reason: invalid class name and case insensitive filesystem */
public final class C30941Vv {
    public static final StringBuilder A03 = new StringBuilder();
    public int A00 = -1;
    public String A01;
    public String A02;

    public static String A02(String str) {
        StringBuilder sb = A03;
        sb.setLength(0);
        sb.append("emoji");
        for (int i = 0; i < str.length(); i++) {
            sb.append("-u");
            sb.append(Integer.toHexString(str.charAt(i)));
        }
        return sb.toString();
    }

    public static String A03(String str, String str2) {
        return AnonymousClass000.A0N("emoji:/", AnonymousClass000.A0G(str, "-api", Build.VERSION.SDK_INT), "//", str2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C30941Vv) || !this.A02.equals(((C30941Vv) obj).A02)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A02.hashCode();
    }

    public static C30941Vv A00(String str) {
        int i;
        if (AnonymousClass19g.A02() || (i = Build.VERSION.SDK_INT) >= 26) {
            return C30971Vy.A00(str);
        }
        if (i >= 25) {
            return C51212Jq.A00(str);
        }
        if (i >= 24) {
            return AnonymousClass2A3.A00(str);
        }
        if (i >= 23) {
            return AnonymousClass21I.A00(str);
        }
        if (i >= 21) {
            return AnonymousClass2WX.A00(str);
        }
        if (C29232CuI.A01 == null) {
            C29232CuI.A00();
        }
        return (C30941Vv) C29232CuI.A00.get(str);
    }

    public static String A01(String str) {
        return A03(A02(str), str);
    }

    public static C30941Vv[] A04() {
        int i;
        if (AnonymousClass19g.A02() || (i = Build.VERSION.SDK_INT) >= 26) {
            return C30971Vy.A01();
        }
        if (i >= 25) {
            return C51212Jq.A01();
        }
        if (i >= 24) {
            return AnonymousClass2A3.A01();
        }
        if (i >= 23) {
            return AnonymousClass21I.A01();
        }
        if (i >= 21) {
            return AnonymousClass2WX.A01();
        }
        return C29232CuI.A00();
    }

    public C30941Vv() {
    }

    public C30941Vv(String str, int i) {
        this.A01 = A02(str);
        this.A02 = str;
        this.A00 = i;
    }
}
