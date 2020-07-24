package p000X;

import java.lang.reflect.Field;
import java.util.EnumMap;
import java.util.EnumSet;

/* renamed from: X.C0D */
public class C0D extends C2W {
    public final String A00(Object obj, Class cls) {
        Class cls2;
        Class cls3;
        Class<Enum> cls4 = Enum.class;
        if (cls4.isAssignableFrom(cls) && !cls.isEnum()) {
            cls = cls.getSuperclass();
        }
        String name = cls.getName();
        if (name.startsWith("java.util")) {
            if (obj instanceof EnumSet) {
                EnumSet enumSet = (EnumSet) obj;
                if (!enumSet.isEmpty()) {
                    cls3 = ((Enum) enumSet.iterator().next()).getClass();
                    if (cls3.getSuperclass() != cls4) {
                        cls3 = cls3.getSuperclass();
                    }
                } else {
                    Field field = C26329BjZ.A02.A01;
                    if (field != null) {
                        try {
                            cls3 = (Class) field.get(enumSet);
                        } catch (Exception e) {
                            throw new IllegalArgumentException(e);
                        }
                    } else {
                        throw new IllegalStateException("Can not figure out type for EnumSet (odd JDK platform?)");
                    }
                }
                return C1B.A00(EnumSet.class, C27173Bzl.A04.A05(cls3, (C27174Bzm) null)).A01();
            } else if (obj instanceof EnumMap) {
                EnumMap enumMap = (EnumMap) obj;
                if (!enumMap.isEmpty()) {
                    cls2 = ((Enum) enumMap.keySet().iterator().next()).getClass();
                    if (cls2.getSuperclass() != cls4) {
                        cls2 = cls2.getSuperclass();
                    }
                } else {
                    Field field2 = C26329BjZ.A02.A00;
                    if (field2 != null) {
                        cls2 = (Class) field2.get(enumMap);
                    } else {
                        throw new IllegalStateException("Can not figure out type for EnumMap (odd JDK platform?)");
                    }
                }
                C27173Bzl bzl = C27173Bzl.A04;
                return C11.A00(EnumMap.class, bzl.A05(cls2, (C27174Bzm) null), bzl.A05(Object.class, (C27174Bzm) null)).A01();
            } else {
                String substring = name.substring(9);
                if ((substring.startsWith(".Arrays$") || substring.startsWith(".Collections$")) && name.indexOf("List") >= 0) {
                    return "java.util.ArrayList";
                }
                return name;
            }
        } else if (name.indexOf(36) < 0 || C26691Bpp.A00(cls) == null || C26691Bpp.A00(this.A00.A00) != null) {
            return name;
        } else {
            return this.A00.A00.getName();
        }
    }

    public String Acp(Object obj) {
        if (!(this instanceof C1F)) {
            return A00(obj, obj.getClass());
        }
        String name = obj.getClass().getName();
        String str = ((C1F) this).A00;
        if (name.startsWith(str)) {
            return name.substring(str.length() - 1);
        }
        return name;
    }

    public C0L Brw(String str) {
        if (str.indexOf(60) > 0) {
            C04 c04 = this.A01.A00;
            C2O c2o = new C2O(str.trim());
            C0L A01 = c04.A01(c2o);
            if (!c2o.hasMoreTokens()) {
                return A01;
            }
            throw C04.A00(c2o, "Unexpected tokens after complete type");
        }
        try {
            return this.A01.A03(this.A00, C26691Bpp.A01(str));
        } catch (ClassNotFoundException unused) {
            throw new IllegalArgumentException(AnonymousClass000.A0J("Invalid type id '", str, "' (for id type 'Id.class'): no such class found"));
        } catch (Exception e) {
            throw new IllegalArgumentException(AnonymousClass000.A0N("Invalid type id '", str, "' (for id type 'Id.class'): ", e.getMessage()), e);
        }
    }

    public C0D(C0L c0l, C27173Bzl bzl) {
        super(c0l, bzl);
    }

    public final String Acq(Object obj, Class cls) {
        return A00(obj, cls);
    }
}
