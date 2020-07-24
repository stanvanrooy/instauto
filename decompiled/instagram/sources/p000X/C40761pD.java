package p000X;

/* renamed from: X.1pD  reason: invalid class name and case insensitive filesystem */
public final class C40761pD {
    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "AUDIO_ONLY";
            case 2:
                return "VIDEO_ONLY";
            default:
                return "AUDIO_VIDEO";
        }
    }

    public static final int A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return 1;
            case 2:
                return 2;
            default:
                return 0;
        }
    }
}
