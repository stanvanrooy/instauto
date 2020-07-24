package p000X;

/* renamed from: X.DE7 */
public class DE7 implements C29870DEf {
    public int A00;
    public float[] A01;

    public final /* bridge */ /* synthetic */ Object Ado(Object obj, Object obj2, float f) {
        DE7 de7 = (DE7) obj;
        DE7 de72 = (DE7) obj2;
        int i = this.A00;
        if (i == de7.A00) {
            de72.A00 = i;
            for (int i2 = 0; i2 < this.A00; i2++) {
                float[] fArr = de72.A01;
                float f2 = de7.A01[i2];
                float f3 = this.A01[i2];
                fArr[i2] = ((f2 - f3) * f) + f3;
            }
            return de72;
        }
        throw new IllegalArgumentException("cannot interpolate between mismatched lengths");
    }

    public DE7() {
    }

    public DE7(int i) {
        this.A01 = new float[i];
        this.A00 = i;
    }

    public DE7(float[] fArr) {
        this.A01 = fArr;
        this.A00 = fArr.length;
    }
}
