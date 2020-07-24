package p000X;

import java.util.Locale;

/* renamed from: X.0Nb  reason: invalid class name and case insensitive filesystem */
public final class C05940Nb {
    public static volatile String A00;

    public static String A00() {
        if (A00 == null) {
            Locale locale = Locale.getDefault();
            StringBuilder sb = new StringBuilder();
            String language = locale.getLanguage();
            if (language == null) {
                language = null;
            } else if ("iw".equals(language)) {
                language = "he";
            } else if ("in".equals(language)) {
                language = "id";
            } else if ("ji".equals(language)) {
                language = "yi";
            }
            if (language != null) {
                sb.append(language);
                String country = locale.getCountry();
                if (country != null) {
                    sb.append("-");
                    sb.append(country);
                }
            }
            if (!Locale.US.equals(locale)) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append("en-US");
            }
            A00 = sb.toString();
        }
        return A00;
    }
}
