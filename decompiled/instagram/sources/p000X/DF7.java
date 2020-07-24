package p000X;

/* renamed from: X.DF7 */
public final class DF7 {
    public static final char[] A00 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ $%*+-./:".toCharArray();

    public static char A00(int i) {
        char[] cArr = A00;
        if (i < cArr.length) {
            return cArr[i];
        }
        throw DF9.A00();
    }
}
