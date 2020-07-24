package p000X;

/* renamed from: X.0hW  reason: invalid class name and case insensitive filesystem */
public abstract class C12870hW implements C11590fD {
    public Object A00;
    public boolean A01;

    public abstract Object A01();

    public static C12870hW A00(Object obj) {
        return new C226019oA(obj);
    }

    public final Object get() {
        if (!this.A01) {
            this.A00 = A01();
            this.A01 = true;
        }
        return this.A00;
    }
}
