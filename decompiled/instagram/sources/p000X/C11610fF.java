package p000X;

/* renamed from: X.0fF  reason: invalid class name and case insensitive filesystem */
public final class C11610fF implements C11590fD {
    public Object A00;
    public volatile C11590fD A01;
    public volatile boolean A02;

    public final Object get() {
        if (!this.A02) {
            synchronized (this) {
                if (!this.A02) {
                    Object obj = this.A01.get();
                    this.A00 = obj;
                    this.A02 = true;
                    this.A01 = null;
                    return obj;
                }
            }
        }
        return this.A00;
    }

    public final String toString() {
        Object obj = this.A01;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (obj == null) {
            obj = "<supplier that returned " + this.A00 + ">";
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    public C11610fF(C11590fD r1) {
        AnonymousClass0a4.A06(r1);
        this.A01 = r1;
    }
}
