package p000X;

import java.io.Serializable;

/* renamed from: X.0fG  reason: invalid class name and case insensitive filesystem */
public final class C11620fG implements C11590fD, Serializable {
    public final C11590fD A00;
    public transient Object A01;
    public volatile transient boolean A02;

    public final Object get() {
        if (!this.A02) {
            synchronized (this) {
                if (!this.A02) {
                    Object obj = this.A00.get();
                    this.A01 = obj;
                    this.A02 = true;
                    return obj;
                }
            }
        }
        return this.A01;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (this.A02) {
            obj = "<supplier that returned " + this.A01 + ">";
        } else {
            obj = this.A00;
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    public C11620fG(C11590fD r1) {
        AnonymousClass0a4.A06(r1);
        this.A00 = r1;
    }
}
