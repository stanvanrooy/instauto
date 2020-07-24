package p000X;

import java.lang.reflect.Constructor;

/* renamed from: X.C0Y */
public final class C0Y extends C0M {
    public final Constructor A00;

    public final String toString() {
        return "[constructor for " + A0B() + ", annotations: " + this.A00 + "]";
    }

    public C0Y(Constructor constructor, C1l c1l, C1l[] c1lArr) {
        super(c1l, c1lArr);
        if (constructor != null) {
            this.A00 = constructor;
            return;
        }
        throw new IllegalArgumentException("Null constructor not allowed");
    }
}
