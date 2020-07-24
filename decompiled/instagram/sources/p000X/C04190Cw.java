package p000X;

/* renamed from: X.0Cw  reason: invalid class name and case insensitive filesystem */
public final class C04190Cw {
    public static final byte[] A00 = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    public static String A00(byte[] bArr) {
        StringBuilder sb = new StringBuilder(r4);
        for (byte b : bArr) {
            byte b2 = b & 255;
            byte[] bArr2 = A00;
            sb.append((char) bArr2[b2 >>> 4]);
            sb.append((char) bArr2[b2 & 15]);
        }
        return sb.toString();
    }
}
