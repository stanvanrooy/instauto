package p000X;

import java.io.Serializable;

/* renamed from: X.0sP  reason: invalid class name and case insensitive filesystem */
public final class C18780sP implements C18750sM, Serializable {
    public Object A00 = C18790sQ.A00;
    public C18720sJ A01;

    public C18780sP(C18720sJ r2) {
        C13150hy.A02(r2, "initializer");
        this.A01 = r2;
    }

    public final boolean Aft() {
        if (this.A00 != C18790sQ.A00) {
            return true;
        }
        return false;
    }

    public final Object getValue() {
        if (this.A00 == C18790sQ.A00) {
            C18720sJ r0 = this.A01;
            if (r0 == null) {
                C13150hy.A00();
            }
            this.A00 = r0.invoke();
            this.A01 = null;
        }
        return this.A00;
    }

    public final String toString() {
        if (Aft()) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
