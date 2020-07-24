package p000X;

/* renamed from: X.DED */
public class DED implements C29870DEf {
    public int A00;
    public int A01;
    public int A02;
    public int A03;

    public final void A00(DED ded, DED ded2, float f) {
        int i = ded.A03;
        int i2 = this.A03;
        ded2.A03 = (int) ((((float) (i - i2)) * f) + ((float) i2));
        int i3 = ded.A02;
        int i4 = this.A02;
        ded2.A02 = (int) ((((float) (i3 - i4)) * f) + ((float) i4));
        int i5 = ded.A01;
        int i6 = this.A01;
        ded2.A01 = (int) ((((float) (i5 - i6)) * f) + ((float) i6));
        int i7 = ded.A00;
        int i8 = this.A00;
        ded2.A00 = (int) ((((float) (i7 - i8)) * f) + ((float) i8));
    }

    public final /* bridge */ /* synthetic */ Object Ado(Object obj, Object obj2, float f) {
        DED ded = (DED) obj2;
        A00((DED) obj, ded, f);
        return ded;
    }
}
