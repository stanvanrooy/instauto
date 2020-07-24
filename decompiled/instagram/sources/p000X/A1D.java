package p000X;

import com.facebook.react.bridge.ReadableType;

/* renamed from: X.A1D */
public final class A1D {
    public static ThreadLocal A00 = new A1J();

    public static double A00(C23043A0y a0y, String str) {
        double d;
        boolean z = true;
        if (a0y.getType(str) == ReadableType.String) {
            String string = a0y.getString(str);
            if (string.endsWith("rad")) {
                string = string.substring(0, string.length() - 3);
            } else if (string.endsWith("deg")) {
                string = string.substring(0, string.length() - 3);
                z = false;
            }
            d = (double) Float.parseFloat(string);
        } else {
            d = a0y.getDouble(str);
        }
        if (!z) {
            return (d * 3.141592653589793d) / 180.0d;
        }
        return d;
    }
}
