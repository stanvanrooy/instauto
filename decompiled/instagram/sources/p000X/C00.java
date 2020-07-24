package p000X;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: X.C00 */
public final class C00 extends C1c {
    public static final C1l[] A0C = new C1l[0];
    public C0Y A00;
    public C1I A01;
    public C1l A02;
    public List A03;
    public List A04;
    public List A05;
    public boolean A06 = false;
    public final C27179Bzx A07;
    public final C3Z A08;
    public final Class A09;
    public final Class A0A;
    public final List A0B;

    public C00(Class cls, List list, C27179Bzx bzx, C3Z c3z) {
        Class AEM;
        this.A09 = cls;
        this.A0B = list;
        this.A07 = bzx;
        this.A08 = c3z;
        if (c3z == null) {
            AEM = null;
        } else {
            AEM = c3z.AEM(cls);
        }
        this.A0A = AEM;
        this.A02 = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a5, code lost:
        if (r0 != false) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002a, code lost:
        if (r0 != false) goto L_0x002c;
     */
    public final Map A0J(Class cls) {
        Class AEM;
        boolean z;
        C0e c0e;
        boolean z2;
        C0e c0e2;
        Map map = null;
        Class superclass = cls.getSuperclass();
        if (superclass != null) {
            map = A0J(superclass);
            for (Field field : cls.getDeclaredFields()) {
                if (!field.isSynthetic()) {
                    int modifiers = field.getModifiers();
                    if (!Modifier.isStatic(modifiers)) {
                        boolean isTransient = Modifier.isTransient(modifiers);
                        z2 = true;
                    }
                }
                z2 = false;
                if (z2) {
                    if (map == null) {
                        map = new LinkedHashMap();
                    }
                    String name = field.getName();
                    if (this.A07 == null) {
                        c0e2 = new C0e(field, new C1l());
                    } else {
                        Annotation[] declaredAnnotations = field.getDeclaredAnnotations();
                        C1l c1l = new C1l();
                        A07(c1l, declaredAnnotations);
                        c0e2 = new C0e(field, c1l);
                    }
                    map.put(name, c0e2);
                }
            }
            C3Z c3z = this.A08;
            if (!(c3z == null || (AEM = c3z.AEM(cls)) == null)) {
                ArrayList<Class> arrayList = new ArrayList<>();
                arrayList.add(AEM);
                C26691Bpp.A04(AEM, superclass, arrayList, false);
                for (Class declaredFields : arrayList) {
                    for (Field field2 : declaredFields.getDeclaredFields()) {
                        if (!field2.isSynthetic()) {
                            int modifiers2 = field2.getModifiers();
                            if (!Modifier.isStatic(modifiers2)) {
                                boolean isTransient2 = Modifier.isTransient(modifiers2);
                                z = true;
                            }
                        }
                        z = false;
                        if (z && (c0e = (C0e) map.get(field2.getName())) != null) {
                            A06(c0e, field2.getDeclaredAnnotations());
                        }
                    }
                }
            }
        }
        return map;
    }

    public final C1l[] A0P(Annotation[][] annotationArr) {
        int length = annotationArr.length;
        C1l[] c1lArr = new C1l[length];
        for (int i = 0; i < length; i++) {
            Annotation[] annotationArr2 = annotationArr[i];
            C1l c1l = new C1l();
            A07(c1l, annotationArr2);
            c1lArr[i] = c1l;
        }
        return c1lArr;
    }

    public static C00 A00(Class cls, C27179Bzx bzx, C3Z c3z) {
        ArrayList arrayList = new ArrayList(8);
        C26691Bpp.A04(cls, (Class) null, arrayList, false);
        return new C00(cls, arrayList, bzx, c3z);
    }

    public static C00 A01(Class cls, C27179Bzx bzx, C3Z c3z) {
        return new C00(cls, Collections.emptyList(), bzx, c3z);
    }

    public static void A02(C00 c00) {
        C1l c1l = new C1l();
        c00.A02 = c1l;
        if (c00.A07 != null) {
            Class cls = c00.A0A;
            if (cls != null) {
                c00.A0K(c1l, c00.A09, cls);
            }
            c00.A07(c00.A02, c00.A09.getDeclaredAnnotations());
            for (Class cls2 : c00.A0B) {
                C1l c1l2 = c00.A02;
                C3Z c3z = c00.A08;
                if (c3z != null) {
                    c00.A0K(c1l2, cls2, c3z.AEM(cls2));
                }
                c00.A07(c00.A02, cls2.getDeclaredAnnotations());
            }
            C1l c1l3 = c00.A02;
            Class<Object> cls3 = Object.class;
            C3Z c3z2 = c00.A08;
            if (c3z2 != null) {
                c00.A0K(c1l3, cls3, c3z2.AEM(cls3));
            }
        }
    }

    public static void A03(C00 c00) {
        C0F c0f;
        C1l[] c1lArr;
        int size;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        for (Constructor constructor : c00.A09.getDeclaredConstructors()) {
            if (constructor.getParameterTypes().length == 0) {
                c00.A00 = c00.A0G(constructor, true);
            } else {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList(Math.max(10, r5));
                }
                arrayList2.add(c00.A0G(constructor, false));
            }
        }
        if (arrayList2 == null) {
            c00.A03 = Collections.emptyList();
        } else {
            c00.A03 = arrayList2;
        }
        if (c00.A0A != null && (c00.A00 != null || !c00.A03.isEmpty())) {
            Class cls = c00.A0A;
            List list = c00.A03;
            if (list == null) {
                size = 0;
            } else {
                size = list.size();
            }
            C27199C1j[] c1jArr = null;
            for (Constructor constructor2 : cls.getDeclaredConstructors()) {
                if (constructor2.getParameterTypes().length != 0) {
                    if (c1jArr == null) {
                        c1jArr = new C27199C1j[size];
                        for (int i = 0; i < size; i++) {
                            c1jArr[i] = new C27199C1j("", ((C0Y) c00.A03.get(i)).A00.getParameterTypes());
                        }
                    }
                    C27199C1j c1j = new C27199C1j("", constructor2.getParameterTypes());
                    int i2 = 0;
                    while (true) {
                        if (i2 < size) {
                            if (c1j.equals(c1jArr[i2])) {
                                c00.A0N(constructor2, (C0Y) c00.A03.get(i2), true);
                                break;
                            }
                            i2++;
                        } else {
                            break;
                        }
                    }
                } else {
                    C0Y c0y = c00.A00;
                    if (c0y != null) {
                        c00.A0N(constructor2, c0y, false);
                    }
                }
            }
        }
        C27179Bzx bzx = c00.A07;
        if (bzx != null) {
            C0Y c0y2 = c00.A00;
            if (c0y2 != null && bzx.A0o(c0y2)) {
                c00.A00 = null;
            }
            List list2 = c00.A03;
            if (list2 != null) {
                int size2 = list2.size();
                while (true) {
                    size2--;
                    if (size2 < 0) {
                        break;
                    } else if (c00.A07.A0o((C27200C1k) c00.A03.get(size2))) {
                        c00.A03.remove(size2);
                    }
                }
            }
        }
        for (Method method : c00.A09.getDeclaredMethods()) {
            if (Modifier.isStatic(method.getModifiers())) {
                if (arrayList == null) {
                    arrayList = new ArrayList(8);
                }
                if (c00.A07 == null) {
                    C1l c1l = new C1l();
                    int length = method.getParameterTypes().length;
                    if (length == 0) {
                        c1lArr = A0C;
                    } else {
                        c1lArr = new C1l[length];
                        for (int i3 = 0; i3 < length; i3++) {
                            c1lArr[i3] = new C1l();
                        }
                    }
                    c0f = new C0F(method, c1l, c1lArr);
                } else {
                    Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
                    C1l c1l2 = new C1l();
                    c00.A07(c1l2, declaredAnnotations);
                    c0f = new C0F(method, c1l2, c00.A0P(method.getParameterAnnotations()));
                }
                arrayList.add(c0f);
            }
        }
        if (arrayList == null) {
            c00.A04 = Collections.emptyList();
        } else {
            c00.A04 = arrayList;
            Class cls2 = c00.A0A;
            if (cls2 != null) {
                int size3 = arrayList.size();
                C27199C1j[] c1jArr2 = null;
                for (Method method2 : cls2.getDeclaredMethods()) {
                    if (Modifier.isStatic(method2.getModifiers()) && method2.getParameterTypes().length != 0) {
                        if (c1jArr2 == null) {
                            c1jArr2 = new C27199C1j[size3];
                            for (int i4 = 0; i4 < size3; i4++) {
                                c1jArr2[i4] = new C27199C1j(((C0F) c00.A04.get(i4)).A01);
                            }
                        }
                        C27199C1j c1j2 = new C27199C1j(method2);
                        int i5 = 0;
                        while (true) {
                            if (i5 < size3) {
                                if (c1j2.equals(c1jArr2[i5])) {
                                    c00.A0O(method2, (C0F) c00.A04.get(i5), true);
                                    break;
                                }
                                i5++;
                            } else {
                                break;
                            }
                        }
                    }
                }
            }
            if (c00.A07 != null) {
                int size4 = c00.A04.size();
                while (true) {
                    size4--;
                    if (size4 < 0) {
                        break;
                    } else if (c00.A07.A0o((C27200C1k) c00.A04.get(size4))) {
                        c00.A04.remove(size4);
                    }
                }
            }
        }
        c00.A06 = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0055, code lost:
        if (r1 == 0) goto L_0x0057;
     */
    public static void A04(C00 c00) {
        boolean z;
        Class AEM;
        Class AEM2;
        C1I c1i = new C1I();
        c00.A01 = c1i;
        C1I c1i2 = new C1I();
        c00.A0L(c00.A09, c1i, c00.A0A, c1i2);
        for (Class cls : c00.A0B) {
            C3Z c3z = c00.A08;
            if (c3z == null) {
                AEM2 = null;
            } else {
                AEM2 = c3z.AEM(cls);
            }
            c00.A0L(cls, c00.A01, AEM2, c1i2);
        }
        C3Z c3z2 = c00.A08;
        if (!(c3z2 == null || (AEM = c3z2.AEM(Object.class)) == null)) {
            c00.A0M(c00.A09, c00.A01, AEM, c1i2);
        }
        if (c00.A07 != null) {
            LinkedHashMap linkedHashMap = c1i2.A00;
            if (linkedHashMap != null) {
                int size = linkedHashMap.size();
                z = false;
            }
            z = true;
            if (!z) {
                Iterator it = c1i2.iterator();
                while (it.hasNext()) {
                    C0F c0f = (C0F) it.next();
                    try {
                        Method declaredMethod = Object.class.getDeclaredMethod(c0f.A0B(), c0f.A0T());
                        if (declaredMethod != null) {
                            C0F A0H = c00.A0H(declaredMethod);
                            c00.A0O(c0f.A01, A0H, false);
                            c00.A01.A00(A0H);
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        if (r1 == false) goto L_0x0014;
     */
    private void A05(C27200C1k c1k, Annotation[] annotationArr) {
        boolean z;
        if (annotationArr != null) {
            LinkedList<Annotation[]> linkedList = null;
            for (Annotation annotation : annotationArr) {
                C27179Bzx bzx = this.A07;
                if (bzx != null) {
                    boolean A0s = bzx.A0s(annotation);
                    z = true;
                }
                z = false;
                if (z) {
                    if (linkedList == null) {
                        linkedList = new LinkedList<>();
                    }
                    linkedList.add(annotation.annotationType().getDeclaredAnnotations());
                } else {
                    c1k.A00.A00(annotation);
                }
            }
            if (linkedList != null) {
                for (Annotation[] A052 : linkedList) {
                    A05(c1k, A052);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        if (r1 == false) goto L_0x0014;
     */
    private void A06(C27200C1k c1k, Annotation[] annotationArr) {
        boolean z;
        if (annotationArr != null) {
            LinkedList<Annotation[]> linkedList = null;
            for (Annotation annotation : annotationArr) {
                C27179Bzx bzx = this.A07;
                if (bzx != null) {
                    boolean A0s = bzx.A0s(annotation);
                    z = true;
                }
                z = false;
                if (z) {
                    if (linkedList == null) {
                        linkedList = new LinkedList<>();
                    }
                    linkedList.add(annotation.annotationType().getDeclaredAnnotations());
                } else {
                    C1l c1l = c1k.A00;
                    if (c1l.A00 == null) {
                        c1l.A00 = new HashMap();
                    }
                    c1l.A00.put(annotation.annotationType(), annotation);
                }
            }
            if (linkedList != null) {
                for (Annotation[] A062 : linkedList) {
                    A06(c1k, A062);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        if (r1 == false) goto L_0x0014;
     */
    private void A07(C1l c1l, Annotation[] annotationArr) {
        boolean z;
        if (annotationArr != null) {
            LinkedList<Annotation[]> linkedList = null;
            for (Annotation annotation : annotationArr) {
                C27179Bzx bzx = this.A07;
                if (bzx != null) {
                    boolean A0s = bzx.A0s(annotation);
                    z = true;
                }
                z = false;
                if (z) {
                    if (linkedList == null) {
                        linkedList = new LinkedList<>();
                    }
                    linkedList.add(annotation.annotationType().getDeclaredAnnotations());
                } else {
                    c1l.A00(annotation);
                }
            }
            if (linkedList != null) {
                for (Annotation[] A072 : linkedList) {
                    A07(c1l, A072);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0056, code lost:
        if (r7 == r0) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0058, code lost:
        r2 = new java.lang.annotation.Annotation[r0][];
        java.lang.System.arraycopy(r6, 0, r2, r1, r5);
        r4 = A0P(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0087, code lost:
        if (r7 == r0) goto L_0x0058;
     */
    public final C0Y A0G(Constructor constructor, boolean z) {
        int i;
        int i2;
        C1l[] c1lArr;
        if (this.A07 == null) {
            C1l c1l = new C1l();
            int length = constructor.getParameterTypes().length;
            if (length == 0) {
                c1lArr = A0C;
            } else {
                c1lArr = new C1l[length];
                for (int i3 = 0; i3 < length; i3++) {
                    c1lArr[i3] = new C1l();
                }
            }
            return new C0Y(constructor, c1l, c1lArr);
        }
        C1l[] c1lArr2 = null;
        if (z) {
            Annotation[] declaredAnnotations = constructor.getDeclaredAnnotations();
            C1l c1l2 = new C1l();
            A07(c1l2, declaredAnnotations);
            return new C0Y(constructor, c1l2, (C1l[]) null);
        }
        Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
        int length2 = constructor.getParameterTypes().length;
        int length3 = parameterAnnotations.length;
        if (length2 != length3) {
            Class declaringClass = constructor.getDeclaringClass();
            if (declaringClass.isEnum()) {
                i = 2;
                i2 = length3 + 2;
            }
            if (declaringClass.isMemberClass()) {
                i = 1;
                i2 = length3 + 1;
            }
            Annotation[][] annotationArr = parameterAnnotations;
            if (c1lArr2 == null) {
                throw new IllegalStateException(AnonymousClass000.A0M("Internal error: constructor for ", constructor.getDeclaringClass().getName(), " has mismatch: ", length2, " parameters; ", annotationArr.length, " sets of annotations"));
            }
        } else {
            c1lArr2 = A0P(parameterAnnotations);
        }
        Annotation[] declaredAnnotations2 = constructor.getDeclaredAnnotations();
        C1l c1l3 = new C1l();
        A07(c1l3, declaredAnnotations2);
        return new C0Y(constructor, c1l3, c1lArr2);
    }

    public final C0F A0H(Method method) {
        if (this.A07 == null) {
            return new C0F(method, new C1l(), (C1l[]) null);
        }
        Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
        C1l c1l = new C1l();
        A07(c1l, declaredAnnotations);
        return new C0F(method, c1l, (C1l[]) null);
    }

    public final Iterable A0I() {
        if (this.A05 == null) {
            Map A0J = A0J(this.A09);
            if (A0J == null || A0J.size() == 0) {
                this.A05 = Collections.emptyList();
            } else {
                ArrayList arrayList = new ArrayList(A0J.size());
                this.A05 = arrayList;
                arrayList.addAll(A0J.values());
            }
        }
        return this.A05;
    }

    public final void A0K(C1l c1l, Class cls, Class cls2) {
        if (cls2 != null) {
            A07(c1l, cls2.getDeclaredAnnotations());
            ArrayList<Class> arrayList = new ArrayList<>(8);
            C26691Bpp.A04(cls2, cls, arrayList, false);
            for (Class declaredAnnotations : arrayList) {
                A07(c1l, declaredAnnotations.getDeclaredAnnotations());
            }
        }
    }

    public final void A0L(Class cls, C1I c1i, Class cls2, C1I c1i2) {
        C0F c0f;
        C0F c0f2;
        if (cls2 != null) {
            A0M(cls, c1i, cls2, c1i2);
        }
        if (cls != null) {
            for (Method method : cls.getDeclaredMethods()) {
                if (A08(method)) {
                    LinkedHashMap linkedHashMap = c1i.A00;
                    if (linkedHashMap == null) {
                        c0f = null;
                    } else {
                        c0f = (C0F) linkedHashMap.get(new C27199C1j(method));
                    }
                    if (c0f == null) {
                        C0F A0H = A0H(method);
                        c1i.A00(A0H);
                        LinkedHashMap linkedHashMap2 = c1i2.A00;
                        if (linkedHashMap2 != null) {
                            c0f2 = (C0F) linkedHashMap2.remove(new C27199C1j(method));
                        } else {
                            c0f2 = null;
                        }
                        if (c0f2 != null) {
                            A0O(c0f2.A01, A0H, false);
                        }
                    } else {
                        A05(c0f, method.getDeclaredAnnotations());
                        if (c0f.A0G().isInterface() && !method.getDeclaringClass().isInterface()) {
                            c1i.A00(new C0F(method, c0f.A00, c0f.A00));
                        }
                    }
                }
            }
        }
    }

    public final void A0M(Class cls, C1I c1i, Class cls2, C1I c1i2) {
        C0F c0f;
        ArrayList<Class> arrayList = new ArrayList<>();
        arrayList.add(cls2);
        C26691Bpp.A04(cls2, cls, arrayList, false);
        for (Class declaredMethods : arrayList) {
            for (Method method : declaredMethods.getDeclaredMethods()) {
                if (A08(method)) {
                    LinkedHashMap linkedHashMap = c1i.A00;
                    if (linkedHashMap == null) {
                        c0f = null;
                    } else {
                        c0f = (C0F) linkedHashMap.get(new C27199C1j(method));
                    }
                    if (c0f != null) {
                        A05(c0f, method.getDeclaredAnnotations());
                    } else {
                        c1i2.A00(A0H(method));
                    }
                }
            }
        }
    }

    public final String toString() {
        return AnonymousClass000.A0J("[AnnotedClass ", this.A09.getName(), "]");
    }

    public static final boolean A08(Method method) {
        if (Modifier.isStatic(method.getModifiers()) || method.isSynthetic() || method.isBridge() || method.getParameterTypes().length > 2) {
            return false;
        }
        return true;
    }

    public final void A0N(Constructor constructor, C0Y c0y, boolean z) {
        A06(c0y, constructor.getDeclaredAnnotations());
        if (z) {
            Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
            int length = parameterAnnotations.length;
            for (int i = 0; i < length; i++) {
                for (Annotation A0Q : parameterAnnotations[i]) {
                    c0y.A0Q(i, A0Q);
                }
            }
        }
    }

    public final void A0O(Method method, C0F c0f, boolean z) {
        A06(c0f, method.getDeclaredAnnotations());
        if (z) {
            Annotation[][] parameterAnnotations = method.getParameterAnnotations();
            int length = parameterAnnotations.length;
            for (int i = 0; i < length; i++) {
                for (Annotation A0Q : parameterAnnotations[i]) {
                    c0f.A0Q(i, A0Q);
                }
            }
        }
    }
}
