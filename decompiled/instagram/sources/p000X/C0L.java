package p000X;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;

/* renamed from: X.C0L */
public abstract class C0L extends C3V implements Serializable, Type {
    public final Class A00;
    public final Object A01;
    public final Object A02;
    public final boolean A03;
    public final int A04;

    public int A02() {
        if (this instanceof C0w) {
            C0L[] c0lArr = ((C0w) this).A00;
            if (c0lArr == null) {
                return 0;
            }
            return c0lArr.length;
        } else if (!(this instanceof C27188C0m)) {
            return ((this instanceof C27193C0t) || (this instanceof C0b)) ? 1 : 0;
        } else {
            return 2;
        }
    }

    public C0L A03() {
        if (this instanceof C27188C0m) {
            return ((C27188C0m) this).A01;
        }
        if (this instanceof C27193C0t) {
            return ((C27193C0t) this).A00;
        }
        if (!(this instanceof C0b)) {
            return null;
        }
        return ((C0b) this).A00;
    }

    public C0L A04() {
        if (!(this instanceof C27188C0m)) {
            return null;
        }
        return ((C27188C0m) this).A00;
    }

    public C0L A05(int i) {
        C0L[] c0lArr;
        if (this instanceof C0w) {
            C0w c0w = (C0w) this;
            if (i < 0 || (c0lArr = c0w.A00) == null || i >= c0lArr.length) {
                return null;
            }
            return c0lArr[i];
        } else if (this instanceof C27188C0m) {
            C27188C0m c0m = (C27188C0m) this;
            if (i == 0) {
                return c0m.A00;
            }
            if (i == 1) {
                return c0m.A01;
            }
            return null;
        } else if (this instanceof C27193C0t) {
            C27193C0t c0t = (C27193C0t) this;
            if (i == 0) {
                return c0t.A00;
            }
            return null;
        } else if (!(this instanceof C0b)) {
            return null;
        } else {
            C0b c0b = (C0b) this;
            if (i == 0) {
                return c0b.A00;
            }
            return null;
        }
    }

    public C0L A06(Class cls) {
        Class cls2 = cls;
        if (this instanceof C0w) {
            C0w c0w = (C0w) this;
            return new C0w(cls2, c0w.A01, c0w.A00, c0w.A02, c0w.A01, c0w.A03);
        } else if (this instanceof C27188C0m) {
            C27188C0m c0m = (C27188C0m) this;
            if (!(c0m instanceof C11)) {
                return new C27188C0m(cls2, c0m.A00, c0m.A01, c0m.A02, c0m.A01, c0m.A03);
            }
            C11 c11 = (C11) c0m;
            return new C11(cls2, c11.A00, c11.A01, c11.A02, c11.A01, c11.A03);
        } else if (!(this instanceof C27193C0t)) {
            C0b c0b = (C0b) this;
            if (cls.isArray()) {
                return C0b.A00(C27173Bzl.A04.A05(cls.getComponentType(), (C27174Bzm) null));
            }
            throw new IllegalArgumentException(AnonymousClass000.A0N("Incompatible narrowing operation: trying to narrow ", c0b.toString(), " to class ", cls.getName()));
        } else {
            C27193C0t c0t = (C27193C0t) this;
            if (!(c0t instanceof C1B)) {
                return new C27193C0t(cls2, c0t.A00, c0t.A02, c0t.A01, c0t.A03);
            }
            C1B c1b = (C1B) c0t;
            return new C1B(cls2, c1b.A00, (Object) null, (Object) null, c1b.A03);
        }
    }

    public C0L A07(Class cls) {
        if (this instanceof C0w) {
            throw new IllegalArgumentException("Internal error: SimpleType.narrowContentsBy() should never be called");
        } else if (this instanceof C27188C0m) {
            C27188C0m c0m = (C27188C0m) this;
            if (!(c0m instanceof C11)) {
                C0L c0l = c0m.A01;
                if (cls != c0l.A00) {
                    return new C27188C0m(c0m.A00, c0m.A00, c0l.A09(cls), c0m.A02, c0m.A01, c0m.A03);
                }
            } else {
                c0m = (C11) c0m;
                C0L c0l2 = c0m.A01;
                if (cls != c0l2.A00) {
                    return new C11(c0m.A00, c0m.A00, c0l2.A09(cls), c0m.A02, c0m.A01, c0m.A03);
                }
            }
            return c0m;
        } else if (!(this instanceof C27193C0t)) {
            C0b c0b = (C0b) this;
            C0L c0l3 = c0b.A00;
            return cls != c0l3.A00 ? C0b.A00(c0l3.A09(cls)) : c0b;
        } else {
            C27193C0t c0t = (C27193C0t) this;
            if (!(c0t instanceof C1B)) {
                C0L c0l4 = c0t.A00;
                if (cls != c0l4.A00) {
                    return new C27193C0t(c0t.A00, c0l4.A09(cls), c0t.A02, c0t.A01, c0t.A03);
                }
            } else {
                c0t = (C1B) c0t;
                C0L c0l5 = c0t.A00;
                if (cls != c0l5.A00) {
                    return new C1B(c0t.A00, c0l5.A09(cls), c0t.A02, c0t.A01, c0t.A03);
                }
            }
            return c0t;
        }
    }

    public C0L A08(Class cls) {
        if (this instanceof C0w) {
            throw new IllegalArgumentException("Internal error: SimpleType.widenContentsBy() should never be called");
        } else if (this instanceof C27188C0m) {
            C27188C0m c0m = (C27188C0m) this;
            if (!(c0m instanceof C11)) {
                C0L c0l = c0m.A01;
                if (cls != c0l.A00) {
                    return new C27188C0m(c0m.A00, c0m.A00, c0l.A0A(cls), c0m.A02, c0m.A01, c0m.A03);
                }
            } else {
                c0m = (C11) c0m;
                C0L c0l2 = c0m.A01;
                if (cls != c0l2.A00) {
                    return new C11(c0m.A00, c0m.A00, c0l2.A0A(cls), c0m.A02, c0m.A01, c0m.A03);
                }
            }
            return c0m;
        } else if (!(this instanceof C27193C0t)) {
            C0b c0b = (C0b) this;
            C0L c0l3 = c0b.A00;
            return cls != c0l3.A00 ? C0b.A00(c0l3.A0A(cls)) : c0b;
        } else {
            C27193C0t c0t = (C27193C0t) this;
            if (!(c0t instanceof C1B)) {
                C0L c0l4 = c0t.A00;
                if (cls != c0l4.A00) {
                    return new C27193C0t(c0t.A00, c0l4.A0A(cls), c0t.A02, c0t.A01, c0t.A03);
                }
            } else {
                c0t = (C1B) c0t;
                C0L c0l5 = c0t.A00;
                if (cls != c0l5.A00) {
                    return new C1B(c0t.A00, c0l5.A0A(cls), c0t.A02, c0t.A01, c0t.A03);
                }
            }
            return c0t;
        }
    }

    public C0L A0B(Object obj) {
        if (this instanceof C0w) {
            throw new IllegalArgumentException("Simple types have no content types; can not call withContenTypeHandler()");
        } else if (this instanceof C27188C0m) {
            C27188C0m c0m = (C27188C0m) this;
            if (!(c0m instanceof C11)) {
                return c0m.A0S(obj);
            }
            C11 c11 = (C11) c0m;
            return new C11(c11.A00, c11.A00, c11.A01.A0D(obj), c11.A02, c11.A01, c11.A03);
        } else if (!(this instanceof C27193C0t)) {
            C0b c0b = (C0b) this;
            C0L c0l = c0b.A00;
            return obj != c0l.A0F() ? new C0b(c0l.A0D(obj), c0b.A01, c0b.A02, c0b.A01, c0b.A03) : c0b;
        } else {
            C27193C0t c0t = (C27193C0t) this;
            if (!(c0t instanceof C1B)) {
                return c0t.A0R(obj);
            }
            C1B c1b = (C1B) c0t;
            return new C1B(c1b.A00, c1b.A00.A0D(obj), c1b.A02, c1b.A01, c1b.A03);
        }
    }

    public C0L A0C(Object obj) {
        if (this instanceof C0w) {
            throw new IllegalArgumentException("Simple types have no content types; can not call withContenValueHandler()");
        } else if (this instanceof C27188C0m) {
            C27188C0m c0m = (C27188C0m) this;
            if (!(c0m instanceof C11)) {
                return c0m.A0T(obj);
            }
            C11 c11 = (C11) c0m;
            return new C11(c11.A00, c11.A00, c11.A01.A0E(obj), c11.A02, c11.A01, c11.A03);
        } else if (!(this instanceof C27193C0t)) {
            C0b c0b = (C0b) this;
            C0L c0l = c0b.A00;
            return obj != c0l.A0G() ? new C0b(c0l.A0E(obj), c0b.A01, c0b.A02, c0b.A01, c0b.A03) : c0b;
        } else {
            C27193C0t c0t = (C27193C0t) this;
            if (!(c0t instanceof C1B)) {
                return c0t.A0S(obj);
            }
            C1B c1b = (C1B) c0t;
            return new C1B(c1b.A00, c1b.A00.A0E(obj), c1b.A02, c1b.A01, c1b.A03);
        }
    }

    public C0L A0D(Object obj) {
        Object obj2 = obj;
        if (this instanceof C0w) {
            C0w c0w = (C0w) this;
            return new C0w(c0w.A00, c0w.A01, c0w.A00, c0w.A02, obj2, c0w.A03);
        } else if (this instanceof C27188C0m) {
            C27188C0m c0m = (C27188C0m) this;
            if (!(c0m instanceof C11)) {
                return c0m.A0V(obj);
            }
            C11 c11 = (C11) c0m;
            return new C11(c11.A00, c11.A00, c11.A01, c11.A02, obj2, c11.A03);
        } else if (!(this instanceof C27193C0t)) {
            C0b c0b = (C0b) this;
            return obj != c0b.A01 ? new C0b(c0b.A00, c0b.A01, c0b.A02, obj2, c0b.A03) : c0b;
        } else {
            C27193C0t c0t = (C27193C0t) this;
            if (!(c0t instanceof C1B)) {
                return c0t.A0T(obj);
            }
            C1B c1b = (C1B) c0t;
            return new C1B(c1b.A00, c1b.A00, c1b.A02, obj2, c1b.A03);
        }
    }

    public C0L A0E(Object obj) {
        Object obj2 = obj;
        if (this instanceof C0w) {
            C0w c0w = (C0w) this;
            return obj != c0w.A02 ? new C0w(c0w.A00, c0w.A01, c0w.A00, obj2, c0w.A01, c0w.A03) : c0w;
        } else if (this instanceof C27188C0m) {
            C27188C0m c0m = (C27188C0m) this;
            if (!(c0m instanceof C11)) {
                return c0m.A0W(obj);
            }
            C11 c11 = (C11) c0m;
            return new C11(c11.A00, c11.A00, c11.A01, obj2, c11.A01, c11.A03);
        } else if (!(this instanceof C27193C0t)) {
            C0b c0b = (C0b) this;
            return obj != c0b.A02 ? new C0b(c0b.A00, c0b.A01, obj2, c0b.A01, c0b.A03) : c0b;
        } else {
            C27193C0t c0t = (C27193C0t) this;
            if (!(c0t instanceof C1B)) {
                return c0t.A0U(obj);
            }
            C1B c1b = (C1B) c0t;
            return new C1B(c1b.A00, c1b.A00, obj2, c1b.A01, c1b.A03);
        }
    }

    public String A0H(int i) {
        String[] strArr;
        if (this instanceof C0w) {
            C0w c0w = (C0w) this;
            if (i < 0 || (strArr = c0w.A01) == null || i >= strArr.length) {
                return null;
            }
            return strArr[i];
        } else if (!(this instanceof C27188C0m)) {
            if (((this instanceof C27193C0t) || (this instanceof C0b)) && i == 0) {
                return "E";
            }
            return null;
        } else if (i == 0) {
            return "K";
        } else {
            if (i == 1) {
                return "V";
            }
            return null;
        }
    }

    public boolean A0L() {
        return this instanceof C0b;
    }

    public boolean A0M() {
        return this instanceof C27193C0t;
    }

    public boolean A0O() {
        if (this instanceof C0w) {
            return false;
        }
        if (this instanceof C27188C0m) {
            return true;
        }
        boolean z = this instanceof C27193C0t;
        return true;
    }

    public boolean A0P() {
        return this instanceof C27188C0m;
    }

    public abstract boolean equals(Object obj);

    public abstract String toString();

    public final C0L A09(Class cls) {
        if (cls == this.A00) {
            return this;
        }
        A0I(cls);
        C0L A06 = A06(cls);
        Object obj = this.A02;
        if (obj != A06.A0G()) {
            A06 = A06.A0E(obj);
        }
        Object obj2 = this.A01;
        if (obj2 != A06.A0F()) {
            return A06.A0D(obj2);
        }
        return A06;
    }

    public final C0L A0A(Class cls) {
        Class cls2 = this.A00;
        if (cls == cls2) {
            return this;
        }
        A0I(cls2);
        return A06(cls);
    }

    public Object A0F() {
        if (!(this instanceof C1m)) {
            return this.A01;
        }
        return ((C1m) this).A01;
    }

    public Object A0G() {
        if (!(this instanceof C1m)) {
            return this.A02;
        }
        return ((C1m) this).A02;
    }

    public final void A0I(Class cls) {
        if (!this.A00.isAssignableFrom(cls)) {
            throw new IllegalArgumentException(AnonymousClass000.A0N("Class ", cls.getName(), " is not assignable to ", this.A00.getName()));
        }
    }

    public boolean A0J() {
        if (this instanceof C0b) {
            return ((C0b) this).A00.A0J();
        }
        if (A02() > 0) {
            return true;
        }
        return false;
    }

    public boolean A0K() {
        if (!(this instanceof C0b)) {
            return Modifier.isAbstract(this.A00.getModifiers());
        }
        return false;
    }

    public boolean A0N() {
        if ((this instanceof C0b) || (this.A00.getModifiers() & 1536) == 0 || this.A00.isPrimitive()) {
            return true;
        }
        return false;
    }

    public C0L(Class cls, int i, Object obj, Object obj2, boolean z) {
        this.A00 = cls;
        this.A04 = cls.getName().hashCode() + i;
        this.A02 = obj;
        this.A01 = obj2;
        this.A03 = z;
    }

    public final int hashCode() {
        return this.A04;
    }
}
