package p000X;

/* renamed from: X.0Hf  reason: invalid class name and case insensitive filesystem */
public final class C04960Hf {
    public static String A00(double... dArr) {
        if (r5 == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (double append : dArr) {
            sb.append(append);
            sb.append(",,,");
        }
        int length = sb.length();
        if (r5 > 0) {
            i = 3;
        }
        sb.setLength(length - i);
        return sb.toString();
    }

    public static String A01(int... iArr) {
        if (r4 == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (int append : iArr) {
            sb.append(append);
            sb.append(",,,");
        }
        int length = sb.length();
        if (r4 > 0) {
            i = 3;
        }
        sb.setLength(length - i);
        return sb.toString();
    }

    public static String A02(long... jArr) {
        if (r5 == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (long append : jArr) {
            sb.append(append);
            sb.append(",,,");
        }
        int length = sb.length();
        if (r5 > 0) {
            i = 3;
        }
        sb.setLength(length - i);
        return sb.toString();
    }

    public static String A03(String... strArr) {
        if (r4 == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (String append : strArr) {
            sb.append(append);
            sb.append(",,,");
        }
        int length = sb.length();
        if (r4 > 0) {
            i = 3;
        }
        sb.setLength(length - i);
        return sb.toString();
    }

    public static String A04(boolean... zArr) {
        if (r4 == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (boolean append : zArr) {
            sb.append(append);
            sb.append(",,,");
        }
        int length = sb.length();
        if (r4 > 0) {
            i = 3;
        }
        sb.setLength(length - i);
        return sb.toString();
    }
}
