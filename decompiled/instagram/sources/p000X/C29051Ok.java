package p000X;

import java.io.Serializable;

/* renamed from: X.1Ok  reason: invalid class name and case insensitive filesystem */
public final class C29051Ok implements C18750sM, Serializable {
    public C18720sJ A00;
    public final Object A01 = this;
    public volatile Object A02 = C18790sQ.A00;

    public /* synthetic */ C29051Ok(C18720sJ r2) {
        C13150hy.A02(r2, "initializer");
        this.A00 = r2;
    }

    public final boolean Aft() {
        if (this.A02 != C18790sQ.A00) {
            return true;
        }
        return false;
    }

    public final Object getValue() {
        Object obj;
        Object obj2 = this.A02;
        C18790sQ r0 = C18790sQ.A00;
        if (obj2 != r0) {
            return obj2;
        }
        synchronized (this.A01) {
            obj = this.A02;
            if (obj == r0) {
                C18720sJ r02 = this.A00;
                if (r02 == null) {
                    C13150hy.A00();
                }
                obj = r02.invoke();
                this.A02 = obj;
                this.A00 = null;
            }
        }
        return obj;
    }

    public final String toString() {
        if (Aft()) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
