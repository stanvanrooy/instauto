package p000X;

import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.WritableNativeArray;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* renamed from: X.A3e */
public final class A3e implements InvocationHandler {
    public String A00;
    public final Class A01;
    public final CatalystInstance A02;

    public final Object invoke(Object obj, Method method, Object[] objArr) {
        WritableNativeArray writableNativeArray;
        if (objArr != null) {
            writableNativeArray = C23041A0r.A06(objArr);
        } else {
            writableNativeArray = new WritableNativeArray();
        }
        CatalystInstance catalystInstance = this.A02;
        if (this.A00 == null) {
            String simpleName = this.A01.getSimpleName();
            int lastIndexOf = simpleName.lastIndexOf(36);
            if (lastIndexOf != -1) {
                simpleName = simpleName.substring(lastIndexOf + 1);
            }
            this.A00 = simpleName;
        }
        catalystInstance.callFunction(this.A00, method.getName(), writableNativeArray);
        return null;
    }

    public A3e(CatalystInstance catalystInstance, Class cls) {
        this.A02 = catalystInstance;
        this.A01 = cls;
    }
}
