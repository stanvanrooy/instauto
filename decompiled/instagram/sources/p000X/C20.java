package p000X;

import java.io.Serializable;

/* renamed from: X.C20 */
public final class C20 implements Serializable {
    public static final C20 A00 = new C20();

    public static boolean A00(C20 c20, Class cls) {
        while (cls != null) {
            if (cls.getName().equals("org.w3c.dom.Node") || c20.A02(cls)) {
                return true;
            }
            cls = cls.getSuperclass();
        }
        return false;
    }

    public static boolean A01(C20 c20, Class cls) {
        Class superclass = cls.getSuperclass();
        while (true) {
            if (superclass != null) {
                if (superclass.getName().startsWith("javax.xml.")) {
                    break;
                }
                superclass = superclass.getSuperclass();
            } else {
                while (cls != null) {
                    if (!c20.A03(cls)) {
                        cls = cls.getSuperclass();
                    }
                }
                return false;
            }
        }
        return true;
    }

    private boolean A02(Class cls) {
        Class[] interfaces = cls.getInterfaces();
        int length = interfaces.length;
        int i = 0;
        while (true) {
            if (i < length) {
                if (interfaces[i].getName().equals("org.w3c.dom.Node")) {
                    break;
                }
                i++;
            } else {
                int i2 = 0;
                while (i2 < length) {
                    if (!A02(interfaces[i2])) {
                        i2++;
                    }
                }
                return false;
            }
        }
        return true;
    }

    private boolean A03(Class cls) {
        Class[] interfaces = cls.getInterfaces();
        int length = interfaces.length;
        int i = 0;
        while (true) {
            if (i < length) {
                if (interfaces[i].getName().startsWith("javax.xml.")) {
                    break;
                }
                i++;
            } else {
                int i2 = 0;
                while (i2 < length) {
                    if (!A03(interfaces[i2])) {
                        i2++;
                    }
                }
                return false;
            }
        }
        return true;
    }
}
