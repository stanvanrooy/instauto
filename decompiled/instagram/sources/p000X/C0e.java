package p000X;

import java.io.Serializable;
import java.lang.reflect.Field;

/* renamed from: X.C0e */
public final class C0e extends C27200C1k implements Serializable {
    public final transient Field A00;

    public final String toString() {
        return AnonymousClass000.A0J("[field ", A0K(), "]");
    }

    public C0e(Field field, C1l c1l) {
        super(c1l);
        this.A00 = field;
    }

    public final String A0K() {
        return AnonymousClass000.A0J(A0G().getName(), "#", A0B());
    }
}
