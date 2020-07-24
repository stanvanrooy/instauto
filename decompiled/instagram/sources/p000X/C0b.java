package p000X;

import java.lang.reflect.Array;

/* renamed from: X.C0b */
public final class C0b extends C1m {
    public final C0L A00;
    public final Object A01;

    public static C0b A00(C0L c0l) {
        return new C0b(c0l, Array.newInstance(c0l.A00, 0), (Object) null, (Object) null, false);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        return this.A00.equals(((C0b) obj).A00);
    }

    public final String toString() {
        return "[array type, component type: " + this.A00 + "]";
    }

    public C0b(C0L c0l, Object obj, Object obj2, Object obj3, boolean z) {
        super(obj.getClass(), c0l.hashCode(), obj2, obj3, z);
        this.A00 = c0l;
        this.A01 = obj;
    }
}
