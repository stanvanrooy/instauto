package p000X;

/* renamed from: X.CL8 */
public final class CL8 implements C64602rk {
    public final CLS A00;

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        Object[] objArr = (Object[]) obj;
        int length = objArr.length;
        if (length == 3) {
            CLS cls = this.A00;
            return cls.A00.apply(objArr[0], objArr[1], objArr[2]);
        }
        throw new IllegalArgumentException(AnonymousClass000.A05("Array of size 3 expected but got ", length));
    }

    public CL8(CLS cls) {
        this.A00 = cls;
    }
}
