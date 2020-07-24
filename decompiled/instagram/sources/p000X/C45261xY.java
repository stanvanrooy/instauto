package p000X;

import dalvik.system.PathClassLoader;
import java.io.File;
import java.lang.reflect.Method;

/* renamed from: X.1xY  reason: invalid class name and case insensitive filesystem */
public final class C45261xY {
    public final Class A00;
    public final Method A01;
    public final Method A02;
    public final Method A03;

    public C45261xY() {
        Class<?> cls;
        Method method;
        Method method2;
        if (new File("/system/framework/perfsdk.jar").exists()) {
            Method method3 = null;
            try {
                cls = new PathClassLoader("/system/framework/perfsdk.jar", ClassLoader.getSystemClassLoader()).loadClass("com.samsung.sdk.sperf.PerformanceManager");
            } catch (Exception unused) {
                cls = null;
            }
            this.A00 = cls;
            Class[] clsArr = new Class[0];
            if (cls == null) {
                method = null;
            } else {
                try {
                    method = cls.getDeclaredMethod("getInstance", clsArr);
                } catch (Exception unused2) {
                    method = null;
                }
            }
            this.A01 = method;
            Class cls2 = this.A00;
            Class cls3 = Integer.TYPE;
            Class[] clsArr2 = {cls3, cls3};
            if (cls2 == null) {
                method2 = null;
            } else {
                try {
                    method2 = cls2.getDeclaredMethod("start", clsArr2);
                } catch (Exception unused3) {
                    method2 = null;
                }
            }
            this.A02 = method2;
            Class cls4 = this.A00;
            Class[] clsArr3 = new Class[0];
            if (cls4 != null) {
                try {
                    method3 = cls4.getDeclaredMethod("stop", clsArr3);
                } catch (Exception unused4) {
                }
            }
            this.A03 = method3;
        }
    }
}
