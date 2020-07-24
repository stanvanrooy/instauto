package p000X;

import java.io.Serializable;
import java.lang.reflect.Method;

/* renamed from: X.C0F */
public final class C0F extends C0M implements Serializable {
    public Class[] A00;
    public final transient Method A01;

    public final Class A0R() {
        Class[] A0T = A0T();
        if (0 >= A0T.length) {
            return null;
        }
        return A0T[0];
    }

    public final String A0S() {
        return A0G().getName() + "#" + A0B() + "(" + A0T().length + " params)";
    }

    public final Class[] A0T() {
        if (this.A00 == null) {
            this.A00 = this.A01.getParameterTypes();
        }
        return this.A00;
    }

    public final String toString() {
        return AnonymousClass000.A0J("[method ", A0S(), "]");
    }

    public C0F(Method method, C1l c1l, C1l[] c1lArr) {
        super(c1l, c1lArr);
        if (method != null) {
            this.A01 = method;
            return;
        }
        throw new IllegalArgumentException("Can not construct AnnotatedMethod with null Method");
    }
}
