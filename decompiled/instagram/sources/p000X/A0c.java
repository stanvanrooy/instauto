package p000X;

/* renamed from: X.A0c */
public final class A0c {
    public static long A00(float f, float f2) {
        int floatToRawIntBits = Float.floatToRawIntBits(f);
        return ((long) Float.floatToRawIntBits(f2)) | (((long) floatToRawIntBits) << 32);
    }
}
