package p000X;

/* renamed from: X.0Xv  reason: invalid class name and case insensitive filesystem */
public final class C08620Xv {
    public static final String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "x86";
            case 2:
                return "armeabi-v7a";
            case 3:
                return "x86_64";
            case 4:
                return "arm64-v8a";
            case 5:
                return "others";
            default:
                return "not_so";
        }
    }
}
