package p000X;

import java.lang.reflect.Method;

/* renamed from: X.1x1  reason: invalid class name and case insensitive filesystem */
public abstract class C44941x1 {
    public static final int A00(Method method, Object obj, Object... objArr) {
        Object obj2 = null;
        if (!(method == null || obj == null)) {
            try {
                obj2 = method.invoke(obj, objArr);
            } catch (Exception unused) {
            }
        }
        if (obj2 == null) {
            return -1;
        }
        try {
            return Integer.class.cast(obj2).intValue();
        } catch (Exception unused2) {
            return -1;
        }
    }

    public static boolean A01(Class cls, String str, Class... clsArr) {
        Method method = null;
        if (cls != null) {
            try {
                method = cls.getDeclaredMethod(str, clsArr);
            } catch (Exception unused) {
            }
        }
        if (method != null) {
            return true;
        }
        return false;
    }
}
