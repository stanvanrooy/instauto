package p000X;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.HashMap;

/* renamed from: X.C0M */
public abstract class C0M extends C27200C1k {
    public final C1l[] A00;

    public Object A0M() {
        return !(this instanceof C0F) ? ((C0Y) this).A00.newInstance(new Object[0]) : ((C0F) this).A01.invoke((Object) null, new Object[0]);
    }

    public Object A0N(Object obj) {
        if (!(this instanceof C0F)) {
            return ((C0Y) this).A00.newInstance(new Object[]{obj});
        }
        return ((C0F) this).A01.invoke((Object) null, new Object[]{obj});
    }

    public Object A0O(Object[] objArr) {
        return !(this instanceof C0F) ? ((C0Y) this).A00.newInstance(objArr) : ((C0F) this).A01.invoke((Object) null, objArr);
    }

    public Type A0P(int i) {
        Type[] genericParameterTypes = !(this instanceof C0F) ? ((C0Y) this).A00.getGenericParameterTypes() : ((C0F) this).A01.getGenericParameterTypes();
        if (i >= genericParameterTypes.length) {
            return null;
        }
        return genericParameterTypes[i];
    }

    public final C0L A0K(C27174Bzm bzm, TypeVariable[] typeVariableArr) {
        C0L A05;
        if (typeVariableArr != null && (r5 = typeVariableArr.length) > 0) {
            bzm = new C27174Bzm(bzm.A03, bzm, bzm.A04, bzm.A02);
            for (TypeVariable typeVariable : typeVariableArr) {
                bzm.A02(typeVariable.getName());
                Type type = typeVariable.getBounds()[0];
                if (type == null) {
                    A05 = new C0w(Object.class);
                } else {
                    A05 = bzm.A03.A05(type, bzm);
                }
                bzm.A03(typeVariable.getName(), A05);
            }
        }
        return bzm.A03.A05(A0E(), bzm);
    }

    public final C27182C0c A0L(int i) {
        C1l c1l;
        Type A0P = A0P(i);
        C1l[] c1lArr = this.A00;
        if (c1lArr == null || i < 0 || i > c1lArr.length) {
            c1l = null;
        } else {
            c1l = c1lArr[i];
        }
        return new C27182C0c(this, A0P, c1l, i);
    }

    public final void A0Q(int i, Annotation annotation) {
        C1l[] c1lArr = this.A00;
        C1l c1l = c1lArr[i];
        if (c1l == null) {
            c1l = new C1l();
            c1lArr[i] = c1l;
        }
        if (c1l.A00 == null) {
            c1l.A00 = new HashMap();
        }
        c1l.A00.put(annotation.annotationType(), annotation);
    }

    public C0M(C1l c1l, C1l[] c1lArr) {
        super(c1l);
        this.A00 = c1lArr;
    }
}
