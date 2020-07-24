package p000X;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Type;
import java.util.HashMap;

/* renamed from: X.C1c */
public abstract class C1c {
    public Class A0A() {
        if (!(this instanceof C27182C0c)) {
            return !(this instanceof C0e) ? !(this instanceof C0F) ? !(this instanceof C0Y) ? ((C00) this).A09 : ((C0Y) this).A00.getDeclaringClass() : ((C0F) this).A01.getReturnType() : ((C0e) this).A00.getType();
        }
        Type type = ((C27182C0c) this).A02;
        return type instanceof Class ? (Class) type : C27173Bzl.A04.A05(type, (C27174Bzm) null).A00;
    }

    public String A0B() {
        return !(this instanceof C27182C0c) ? !(this instanceof C0e) ? !(this instanceof C0F) ? !(this instanceof C0Y) ? ((C00) this).A09.getName() : ((C0Y) this).A00.getName() : ((C0F) this).A01.getName() : ((C0e) this).A00.getName() : "";
    }

    public Annotation A0C(Class cls) {
        C1l c1l;
        if (this instanceof C0M) {
            c1l = ((C0M) this).A00;
        } else if (this instanceof C27182C0c) {
            c1l = ((C27182C0c) this).A00;
            if (c1l == null) {
                return null;
            }
        } else if (!(this instanceof C0e)) {
            C00 c00 = (C00) this;
            if (c00.A02 == null) {
                C00.A02(c00);
            }
            c1l = c00.A02;
        } else {
            c1l = ((C0e) this).A00;
            if (c1l == null) {
                return null;
            }
        }
        HashMap hashMap = c1l.A00;
        if (hashMap != null) {
            return (Annotation) hashMap.get(cls);
        }
        return null;
    }

    public AnnotatedElement A0D() {
        if (!(this instanceof C27182C0c)) {
            return !(this instanceof C0e) ? !(this instanceof C0F) ? !(this instanceof C0Y) ? ((C00) this).A09 : ((C0Y) this).A00 : ((C0F) this).A01 : ((C0e) this).A00;
        }
        return null;
    }

    public Type A0E() {
        return !(this instanceof C27182C0c) ? !(this instanceof C0e) ? !(this instanceof C0F) ? !(this instanceof C0Y) ? ((C00) this).A09 : ((C0Y) this).A0A() : ((C0F) this).A01.getGenericReturnType() : ((C0e) this).A00.getGenericType() : ((C27182C0c) this).A02;
    }

    public C0L A09(C27174Bzm bzm) {
        if (this instanceof C0F) {
            C0F c0f = (C0F) this;
            return c0f.A0K(bzm, c0f.A01.getTypeParameters());
        } else if (!(this instanceof C0Y)) {
            return bzm.A03.A05(A0E(), bzm);
        } else {
            C0Y c0y = (C0Y) this;
            return c0y.A0K(bzm, c0y.A00.getTypeParameters());
        }
    }

    public final boolean A0F(Class cls) {
        if (A0C(cls) != null) {
            return true;
        }
        return false;
    }
}
