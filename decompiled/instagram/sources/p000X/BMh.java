package p000X;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.BMh */
public final class BMh extends BMi {
    public final Method A0B(Class cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), String.class, cls2, cls2});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    public final Typeface A0A(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.A04, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.A06.invoke((Object) null, new Object[]{newInstance, AnonymousClass40t.$const$string(34), -1, -1});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}
