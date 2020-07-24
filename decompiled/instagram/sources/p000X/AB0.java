package p000X;

/* renamed from: X.AB0 */
public final class AB0 extends ABP {
    public final AB3 A00;
    public final int[] A01;

    public AB0(C23043A0y a0y, AB3 ab3) {
        this.A00 = ab3;
        A1e array = a0y.getArray("input");
        this.A01 = new int[array.size()];
        int i = 0;
        while (true) {
            int[] iArr = this.A01;
            if (i < iArr.length) {
                iArr[i] = array.getInt(i);
                i++;
            } else {
                return;
            }
        }
    }
}
