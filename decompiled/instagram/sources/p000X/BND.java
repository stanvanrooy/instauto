package p000X;

import android.content.Context;
import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: X.BND */
public final class BND extends BOA {
    public static Class A01;
    public static Method A02;
    public final Context A00;

    public BND(Context context, BQH bqh) {
        super(context, bqh);
        Class<?> cls;
        this.A00 = context;
        try {
            cls = context.getClassLoader().loadClass("android.os.SystemProperties");
        } catch (ClassNotFoundException e) {
            Log.e("SystemPropertiesSignalCollector", "Error fetching System Class", e);
            cls = null;
        }
        A01 = cls;
        Method method = null;
        try {
            Class[] clsArr = {String.class};
            if (cls != null) {
                method = cls.getMethod("get", clsArr);
            }
        } catch (NoSuchMethodException e2) {
            Log.e("SystemPropertiesSignalCollector", "Error fetching System Method", e2);
        }
        A02 = method;
    }
}
