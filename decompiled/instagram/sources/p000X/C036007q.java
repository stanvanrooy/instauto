package p000X;

import android.os.Build;
import android.system.Os;
import android.system.OsConstants;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.07q  reason: invalid class name and case insensitive filesystem */
public final class C036007q {
    public static long A00() {
        long j;
        if (Build.VERSION.SDK_INT >= 21) {
            j = Os.sysconf(OsConstants._SC_CLK_TCK);
        } else {
            try {
                int i = Class.forName("libcore.io.OsConstants").getField("_SC_CLK_TCK").getInt((Object) null);
                Class<?> cls = Class.forName("libcore.io.Libcore");
                Class<?> cls2 = Class.forName("libcore.io.Os");
                Object obj = cls.getField("os").get((Object) null);
                j = ((Long) cls2.getMethod("sysconf", new Class[]{Integer.TYPE}).invoke(obj, new Object[]{Integer.valueOf(i)})).longValue();
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException e) {
                C035607l.A00("Sysconf", "Unable to read _SC_CLK_TCK by reflection", e);
                j = 100;
            }
        }
        if (j > 0) {
            return j;
        }
        return 100;
    }
}
