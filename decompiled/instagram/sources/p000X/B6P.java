package p000X;

import android.content.Context;
import android.os.Build;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: X.B6P */
public final class B6P {
    public static final B6O A00 = new B6O("SplitInstallHelper");

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    public static void A00(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (i > 25 && i < 28) {
            A00.A02("Calling dispatchPackageBroadcast", new Object[0]);
            try {
                Class<?> cls = Class.forName("android.app.ActivityThread");
                Method method = cls.getMethod("currentActivityThread", new Class[0]);
                method.setAccessible(true);
                Object invoke = method.invoke((Object) null, new Object[0]);
                Field declaredField = cls.getDeclaredField("mAppThread");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(invoke);
                obj.getClass().getMethod("dispatchPackageBroadcast", new Class[]{Integer.TYPE, String[].class}).invoke(obj, new Object[]{3, new String[]{context.getPackageName()}});
                A00.A02("Called dispatchPackageBroadcast", new Object[0]);
            } catch (Exception e) {
                A00.A03(e, "Update app info with dispatchPackageBroadcast failed!", new Object[0]);
            }
        }
    }
}
