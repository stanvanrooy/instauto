package p000X;

import android.content.Context;
import android.os.Build;
import java.lang.reflect.Method;

/* renamed from: X.1xX  reason: invalid class name and case insensitive filesystem */
public final class C45251xX extends C44941x1 {
    public static final C45261xY A01 = new C45261xY();
    public Object A00;

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x005a, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        if (r1.A03 == null) goto L_0x001a;
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:38:? A[ExcHandler: Error | Exception (unused java.lang.Throwable), SYNTHETIC, Splitter:B:33:0x0047] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x005f  */
    public static C12430gj A02(Context context) {
        boolean z;
        Class<?> cls;
        Method method;
        boolean z2;
        if (Build.VERSION.SDK_INT > 28) {
            C45261xY r1 = A01;
            Class cls2 = r1.A00;
            if (!(cls2 == null || r1.A01 == null || r1.A02 == null)) {
                z = true;
            }
            z = false;
            if (z) {
                ClassLoader classLoader = cls2.getClassLoader();
                if (classLoader == null) {
                    cls = null;
                } else {
                    try {
                        cls = classLoader.loadClass("com.samsung.sdk.sperf.SPerf");
                    } catch (Exception unused) {
                        cls = null;
                    }
                }
                Class[] clsArr = {Context.class};
                if (cls == null) {
                    method = null;
                } else {
                    try {
                        method = cls.getDeclaredMethod("initialize", clsArr);
                    } catch (Exception unused2) {
                        method = null;
                    }
                }
                Object[] objArr = {context};
                if (method != null) {
                    try {
                        Object invoke = method.invoke((Object) null, objArr);
                        if (invoke != null) {
                            z2 = Boolean.class.cast(invoke).booleanValue();
                            if (z2) {
                                return new C30524De8();
                            }
                        }
                    } catch (Error | Exception unused3) {
                    }
                }
                z2 = false;
                if (z2) {
                }
            }
        }
        return null;
    }

    public C45251xX() {
        Method method = A01.A01;
        Object[] objArr = new Object[0];
        Object obj = null;
        if (method != null) {
            try {
                obj = method.invoke((Object) null, objArr);
            } catch (Exception unused) {
            }
        }
        this.A00 = obj;
    }
}
