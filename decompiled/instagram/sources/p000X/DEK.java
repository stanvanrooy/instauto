package p000X;

/* renamed from: X.DEK */
public class DEK implements C29870DEf {
    public float A00;
    public float A01;

    public final /* bridge */ /* synthetic */ Object Ado(Object obj, Object obj2, float f) {
        DEK dek = (DEK) obj;
        DEK dek2 = (DEK) obj2;
        float f2 = dek.A00;
        float f3 = this.A00;
        dek2.A00 = ((f2 - f3) * f) + f3;
        float f4 = dek.A01;
        float f5 = this.A01;
        dek2.A01 = ((f4 - f5) * f) + f5;
        return dek2;
    }
}
