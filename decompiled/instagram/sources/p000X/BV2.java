package p000X;

import android.os.Build;
import java.util.regex.Pattern;

/* renamed from: X.BV2 */
public final class BV2 {
    public static final int A00;
    public static final Pattern A01 = Pattern.compile("%([A-Fa-f0-9]{2})");
    public static final Pattern A02 = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)(\\.(\\d+))?([Zz]|((\\+|\\-)(\\d\\d):(\\d\\d)))?");
    public static final Pattern A03 = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");

    public static boolean A00(char c) {
        return c == '\"' || c == '%' || c == '*' || c == '/' || c == ':' || c == '<' || c == '\\' || c == '|' || c == '>' || c == '?';
    }

    static {
        int i;
        if (Build.VERSION.SDK_INT == 23 && Build.VERSION.CODENAME.charAt(0) == 'N') {
            i = 24;
        } else {
            i = Build.VERSION.SDK_INT;
        }
        A00 = i;
    }
}
