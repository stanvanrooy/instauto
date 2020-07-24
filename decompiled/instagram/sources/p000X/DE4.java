package p000X;

/* renamed from: X.DE4 */
public class DE4 implements C29870DEf {
    public int A00;
    public int A01;
    public byte[] A02;
    public float[] A03;

    public final /* bridge */ /* synthetic */ Object Ado(Object obj, Object obj2, float f) {
        int i;
        DE4 de4 = (DE4) obj;
        DE4 de42 = (DE4) obj2;
        int i2 = this.A00;
        if (i2 == de4.A00 && (i = this.A01) == de4.A01) {
            int i3 = 0;
            while (i3 < i2) {
                byte b = this.A02[i3];
                if (b == de4.A02[i3]) {
                    de42.A02[i3] = b;
                    i3++;
                }
            }
            de42.A00 = i2;
            for (int i4 = 0; i4 < i; i4++) {
                float[] fArr = de42.A03;
                float f2 = de4.A03[i4];
                float f3 = this.A03[i4];
                fArr[i4] = ((f2 - f3) * f) + f3;
            }
            return de42;
        }
        throw new IllegalArgumentException("paths must be equivalent for interpolation");
    }

    public DE4() {
    }

    public DE4(int i, int i2) {
        this.A02 = new byte[i];
        this.A00 = i;
        this.A03 = new float[i2];
        this.A01 = i2;
    }
}
