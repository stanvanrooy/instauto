package p000X;

import android.os.Build;
import java.lang.reflect.Method;

/* renamed from: X.1wz  reason: invalid class name and case insensitive filesystem */
public final class C44921wz {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    public static void A00(String[] strArr) {
        if (Build.VERSION.SDK_INT >= 28) {
            Class<Class> cls = Class.class;
            try {
                Class cls2 = String.class;
                Method declaredMethod = cls.getDeclaredMethod("forName", new Class[]{cls2});
                Object[] objArr = {"setApiBlacklistExemptions", new Class[]{String[].class}};
                Method method = (Method) cls.getDeclaredMethod("getDeclaredMethod", new Class[]{cls2, Class[].class}).invoke((Class) declaredMethod.invoke((Object) null, new Object[]{"com.android.internal.os.ZygoteInit"}), objArr);
                if (method != null) {
                    method.invoke((Object) null, new Object[]{strArr});
                }
            } catch (Error | Exception e) {
                AnonymousClass0DB.A0G("ApiBlacklistExemption", "Enable api exemption failed:", e);
            }
        }
    }
}
