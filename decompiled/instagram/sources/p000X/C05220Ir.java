package p000X;

/* renamed from: X.0Ir  reason: invalid class name and case insensitive filesystem */
public final class C05220Ir {
    public static boolean A00(String str, String str2) {
        if (str == null) {
            return false;
        }
        String[] split = str.split(":");
        String str3 = split[split.length - 1];
        String[] split2 = str2.split(":");
        String str4 = split2[split2.length - 1];
        if (str.contains(":")) {
            return str.equals(str2);
        }
        AnonymousClass0QD.A01("incorrect_usersession_token_format_error", AnonymousClass000.A0E(str, " passed in follows old format."));
        return str3.equals(str4);
    }
}
