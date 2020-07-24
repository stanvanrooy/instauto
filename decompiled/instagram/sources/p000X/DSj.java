package p000X;

/* renamed from: X.DSj */
public enum DSj implements C26305BjB {
    ;

    public static String A00(String str) {
        String valueOf;
        StringBuilder sb = new StringBuilder();
        int i = 0;
        char charAt = str.charAt(0);
        int length = str.length();
        while (i < length - 1 && !Character.isLetter(charAt)) {
            sb.append(charAt);
            i++;
            charAt = str.charAt(i);
        }
        if (Character.isUpperCase(charAt)) {
            return str;
        }
        char upperCase = Character.toUpperCase(charAt);
        int i2 = i + 1;
        if (i2 < length) {
            valueOf = upperCase + str.substring(i2);
        } else {
            valueOf = String.valueOf(upperCase);
        }
        sb.append(valueOf);
        return sb.toString();
    }

    public static String A01(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt) && sb.length() != 0) {
                sb.append(str2);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }
}
