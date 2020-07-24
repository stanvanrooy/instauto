package p000X;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.C0K */
public abstract class C0K {
    public final C0L A00;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r0 = r1.A00(r0.A09);
     */
    public C27126Byj A01(C27126Byj byj) {
        C27126Byj A002;
        C27180Bzy bzy = (C27180Bzy) this;
        C27179Bzx bzx = bzy.A07;
        return (bzx == null || A002 == null) ? byj : A002;
    }

    public C0L A02(Type type) {
        C27180Bzy bzy = (C27180Bzy) this;
        if (type == null) {
            return null;
        }
        C27174Bzm A0B = bzy.A0B();
        return A0B.A03.A05(type, A0B);
    }

    public C31 A03() {
        C27180Bzy bzy = (C27180Bzy) this;
        C27179Bzx bzx = bzy.A07;
        if (bzx == null) {
            return null;
        }
        return bzx.A06(bzy.A09);
    }

    public C00 A04() {
        return ((C27180Bzy) this).A09;
    }

    public C0Y A05() {
        C00 c00 = ((C27180Bzy) this).A09;
        if (!c00.A06) {
            C00.A03(c00);
        }
        return c00.A00;
    }

    public C27200C1k A06() {
        C27180Bzy bzy = (C27180Bzy) this;
        C27200C1k c1k = bzy.A00;
        if (c1k != null) {
            if (!Map.class.isAssignableFrom(c1k.A0A())) {
                throw new IllegalArgumentException(AnonymousClass000.A0J("Invalid 'any-getter' annotation on method ", bzy.A00.A0B(), "(): return type is not instance of java.util.Map"));
            }
        }
        return bzy.A00;
    }

    public C0F A07() {
        Class<Object> A0R;
        C27180Bzy bzy = (C27180Bzy) this;
        C0F c0f = bzy.A01;
        if (c0f == null || (A0R = c0f.A0R()) == String.class || A0R == Object.class) {
            return bzy.A01;
        }
        throw new IllegalArgumentException(AnonymousClass000.A0N("Invalid 'any-setter' annotation on method ", bzy.A01.A0B(), "(): first argument not of type String or Object, but ", A0R.getName()));
    }

    public C0F A08() {
        return ((C27180Bzy) this).A02;
    }

    public C0F A09(String str, Class[] clsArr) {
        C00 c00 = ((C27180Bzy) this).A09;
        if (c00.A01 == null) {
            C00.A04(c00);
        }
        LinkedHashMap linkedHashMap = c00.A01.A00;
        if (linkedHashMap == null) {
            return null;
        }
        return (C0F) linkedHashMap.get(new C27199C1j(str, clsArr));
    }

    public C21 A0A() {
        return ((C27180Bzy) this).A03;
    }

    public C27174Bzm A0B() {
        C27180Bzy bzy = (C27180Bzy) this;
        if (bzy.A04 == null) {
            C27173Bzl bzl = bzy.A08.A00.A04;
            C0L c0l = bzy.A00;
            bzy.A04 = new C27174Bzm(bzl, (C27174Bzm) null, c0l.A00, c0l);
        }
        return bzy.A04;
    }

    public C27225C3o A0C() {
        C00 c00 = ((C27180Bzy) this).A09;
        if (c00.A02 == null) {
            C00.A02(c00);
        }
        return c00.A02;
    }

    public C27107By8 A0D() {
        C27180Bzy bzy = (C27180Bzy) this;
        C27179Bzx bzx = bzy.A07;
        if (bzx == null) {
            return null;
        }
        return bzy.A0R(bzx.A0U(bzy.A09));
    }

    public C27107By8 A0E() {
        C27180Bzy bzy = (C27180Bzy) this;
        C27179Bzx bzx = bzy.A07;
        if (bzx == null) {
            return null;
        }
        return bzy.A0R(bzx.A0Y(bzy.A09));
    }

    public Class A0F() {
        C27180Bzy bzy = (C27180Bzy) this;
        C27179Bzx bzx = bzy.A07;
        if (bzx == null) {
            return null;
        }
        return bzx.A0P(bzy.A09);
    }

    public Integer A0G(Integer num) {
        C27180Bzy bzy = (C27180Bzy) this;
        C27179Bzx bzx = bzy.A07;
        return bzx != null ? bzx.A0R(bzy.A09, num) : num;
    }

    public Object A0H(boolean z) {
        C27180Bzy bzy = (C27180Bzy) this;
        C00 c00 = bzy.A09;
        if (!c00.A06) {
            C00.A03(c00);
        }
        C0Y c0y = c00.A00;
        if (c0y == null) {
            return null;
        }
        if (z) {
            C26691Bpp.A07(c0y.A0I());
        }
        try {
            return c0y.A00.newInstance(new Object[0]);
        } catch (Exception e) {
            e = e;
            while (e.getCause() != null) {
                e = e.getCause();
            }
            if (e instanceof Error) {
                throw ((Error) e);
            } else if (e instanceof RuntimeException) {
                throw ((RuntimeException) e);
            } else {
                throw new IllegalArgumentException(AnonymousClass000.A0P("Failed to instantiate bean of type ", bzy.A09.A09.getName(), ": (", e.getClass().getName(), ") ", e.getMessage()), e);
            }
        }
    }

    public Constructor A0I(Class... clsArr) {
        C00 c00 = ((C27180Bzy) this).A09;
        if (!c00.A06) {
            C00.A03(c00);
        }
        for (C0Y c0y : c00.A03) {
            if (c0y.A00.getParameterTypes().length == 1) {
                Class[] parameterTypes = c0y.A00.getParameterTypes();
                Class cls = 0 >= parameterTypes.length ? null : parameterTypes[0];
                for (Class cls2 : clsArr) {
                    if (cls2 == cls) {
                        return c0y.A00;
                    }
                }
                continue;
            }
        }
        return null;
    }

    public Method A0J(Class... clsArr) {
        C27180Bzy bzy = (C27180Bzy) this;
        C00 c00 = bzy.A09;
        if (!c00.A06) {
            C00.A03(c00);
        }
        for (C0F c0f : c00.A04) {
            if (bzy.A0S(c0f)) {
                Class A0R = c0f.A0R();
                for (Class isAssignableFrom : clsArr) {
                    if (A0R.isAssignableFrom(isAssignableFrom)) {
                        return c0f.A01;
                    }
                }
                continue;
            }
        }
        return null;
    }

    public List A0K() {
        return ((C27180Bzy) this).A0A;
    }

    public List A0L() {
        C00 c00 = ((C27180Bzy) this).A09;
        if (!c00.A06) {
            C00.A03(c00);
        }
        return c00.A03;
    }

    public List A0M() {
        C27180Bzy bzy = (C27180Bzy) this;
        C00 c00 = bzy.A09;
        if (!c00.A06) {
            C00.A03(c00);
        }
        List<C0F> list = c00.A04;
        if (list.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (C0F c0f : list) {
            if (bzy.A0S(c0f)) {
                arrayList.add(c0f);
            }
        }
        return arrayList;
    }

    public Map A0N() {
        C3R A02;
        C27180Bzy bzy = (C27180Bzy) this;
        HashMap hashMap = null;
        for (C27194C0y A09 : bzy.A0A) {
            C27200C1k A092 = A09.A09();
            if (!(A092 == null || (A02 = bzy.A07.A02(A092)) == null)) {
                boolean z = false;
                if (A02.A00 == Constants.ONE) {
                    z = true;
                }
                if (!z) {
                    continue;
                } else {
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    String str = A02.A01;
                    if (hashMap.put(str, A092) != null) {
                        throw new IllegalArgumentException(AnonymousClass000.A0J("Multiple back-reference properties with name '", str, "'"));
                    }
                }
            }
        }
        return hashMap;
    }

    public Map A0O() {
        return ((C27180Bzy) this).A05;
    }

    public Set A0P() {
        Set set = ((C27180Bzy) this).A06;
        return set == null ? Collections.emptySet() : set;
    }

    public boolean A0Q() {
        C00 c00 = ((C27180Bzy) this).A09;
        if (c00.A02 == null) {
            C00.A02(c00);
        }
        HashMap hashMap = c00.A02.A00;
        return (hashMap == null ? 0 : hashMap.size()) > 0;
    }

    public C0K(C0L c0l) {
        this.A00 = c0l;
    }
}
