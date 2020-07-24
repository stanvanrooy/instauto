package p000X;

/* renamed from: X.1kt  reason: invalid class name and case insensitive filesystem */
public final class C38201kt {
    public static String A00(String str, String str2, String str3, String str4, C52992Rb... r9) {
        StringBuilder sb = new StringBuilder(str);
        if (str2 != null) {
            sb.append(str2);
            sb.append("_");
        }
        if (r9 != null) {
            for (C52992Rb r0 : r9) {
                if (r0 != null) {
                    sb.append("_");
                    r0.ApC(sb);
                }
            }
        }
        if (str3 != null) {
            sb.append("_");
            sb.append(str3);
        }
        if (str4 != null) {
            sb.append("_");
            sb.append(str4);
        }
        sb.append("_use_sectional_payload");
        return sb.toString();
    }
}
