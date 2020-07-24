package p000X;

import android.content.Context;
import dalvik.system.PathClassLoader;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* renamed from: X.1x2  reason: invalid class name and case insensitive filesystem */
public final class C44951x2 {
    public final Class A00;
    public final Constructor A01;
    public final Method A02;
    public final Method A03;

    public C44951x2() {
        Class<?> cls;
        Constructor<?> constructor;
        Method method;
        if (new File("/system/framework/QPerformance.jar").exists()) {
            Method method2 = null;
            try {
                cls = new PathClassLoader("/system/framework/QPerformance.jar", ClassLoader.getSystemClassLoader()).loadClass("com.qualcomm.qti.Performance");
            } catch (Exception unused) {
                cls = null;
            }
            this.A00 = cls;
            boolean z = true;
            Class[] clsArr = {Context.class};
            if (cls == null) {
                constructor = null;
            } else {
                try {
                    constructor = cls.getConstructor(clsArr);
                } catch (Exception unused2) {
                    constructor = null;
                }
            }
            this.A01 = constructor;
            Class cls2 = this.A00;
            Class[] clsArr2 = {Integer.TYPE, int[].class};
            if (cls2 == null) {
                method = null;
            } else {
                try {
                    method = cls2.getDeclaredMethod("perfLockAcquire", clsArr2);
                } catch (Exception unused3) {
                    method = null;
                }
            }
            this.A02 = method;
            Class cls3 = this.A00;
            Class[] clsArr3 = new Class[0];
            if (cls3 != null) {
                try {
                    method2 = cls3.getDeclaredMethod("perfLockRelease", clsArr3);
                } catch (Exception unused4) {
                }
            }
            this.A03 = method2;
            C44931x0.A02 = this.A01 == null ? false : z;
        }
    }
}
