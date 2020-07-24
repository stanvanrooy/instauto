package p000X;

import android.content.Context;
import java.lang.reflect.Constructor;

/* renamed from: X.1x0  reason: invalid class name and case insensitive filesystem */
public final class C44931x0 extends C44941x1 {
    public static C44951x2 A01 = new C44951x2();
    public static boolean A02;
    public Object A00 = null;

    public C44931x0() {
        Class cls = A01.A00;
        Object obj = null;
        if (cls != null) {
            try {
                obj = cls.newInstance();
            } catch (Exception unused) {
            }
        }
        this.A00 = obj;
    }

    public C44931x0(Context context) {
        Constructor constructor = A01.A01;
        Object[] objArr = {context};
        Object obj = null;
        if (constructor != null) {
            try {
                obj = constructor.newInstance(objArr);
            } catch (Exception unused) {
            }
        }
        this.A00 = obj;
    }
}
