package p000X;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* renamed from: X.10e  reason: invalid class name and case insensitive filesystem */
public abstract class C233810e implements C233910f, C234010g, Serializable {
    public final C233910f A00;

    public abstract Object A00(Object obj);

    public void A02() {
    }

    public final void Be0(Object obj) {
        C233810e r2 = this;
        while (true) {
            C13150hy.A02(r2, "frame");
            C233910f r1 = r2.A00;
            if (r1 == null) {
                C13150hy.A00();
            }
            try {
                obj = r2.A00(obj);
                if (obj == AnonymousClass2I1.COROUTINE_SUSPENDED) {
                    return;
                }
            } catch (Throwable th) {
                obj = AnonymousClass2I2.A00(th);
            }
            r2.A02();
            if (r1 instanceof C233810e) {
                r2 = (C233810e) r1;
            } else {
                r1.Be0(obj);
                return;
            }
        }
    }

    public C233910f A01(Object obj, C233910f r4) {
        C13150hy.A02(r4, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public final C234010g AHe() {
        C233910f r1 = this.A00;
        if (!(r1 instanceof C234010g)) {
            r1 = null;
        }
        return (C234010g) r1;
    }

    public final StackTraceElement AWW() {
        int i;
        int i2;
        String A03;
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        Object obj;
        int i3;
        C13150hy.A02(this, "$this$getStackTraceElementImpl");
        Class<?> cls = getClass();
        DebugMetadata debugMetadata = (DebugMetadata) cls.getAnnotation(DebugMetadata.class);
        if (debugMetadata == null) {
            return null;
        }
        int v = debugMetadata.mo50196v();
        if (v <= 1) {
            try {
                Field declaredField = cls.getDeclaredField("label");
                C13150hy.A01(declaredField, "field");
                declaredField.setAccessible(true);
                Object obj2 = declaredField.get(this);
                if (!(obj2 instanceof Integer)) {
                    obj2 = null;
                }
                Integer num = (Integer) obj2;
                if (num != null) {
                    i3 = num.intValue();
                } else {
                    i3 = 0;
                }
                i = i3 - 1;
            } catch (Exception unused) {
                i = -1;
            }
            if (i < 0) {
                i2 = -1;
            } else {
                i2 = debugMetadata.mo50194l()[i];
            }
            C13150hy.A02(this, "continuation");
            C28600Cje cje = C28599Cjd.A00;
            if (cje == null) {
                try {
                    cje = new C28600Cje(Class.class.getDeclaredMethod("getModule", new Class[0]), cls.getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), cls.getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
                    C28599Cjd.A00 = cje;
                } catch (Exception unused2) {
                    cje = C28599Cjd.A01;
                    C28599Cjd.A00 = cje;
                }
            }
            String str = null;
            if (!(cje == C28599Cjd.A01 || (method = cje.A01) == null || (invoke = method.invoke(cls, new Object[0])) == null || (method2 = cje.A00) == null || (invoke2 = method2.invoke(invoke, new Object[0])) == null)) {
                Method method3 = cje.A02;
                if (method3 != null) {
                    obj = method3.invoke(invoke2, new Object[0]);
                } else {
                    obj = null;
                }
                if (!(obj instanceof String)) {
                    obj = null;
                }
                str = (String) obj;
            }
            if (str == null) {
                A03 = debugMetadata.mo50192c();
            } else {
                A03 = AnonymousClass000.A03(str, '/', debugMetadata.mo50192c());
            }
            return new StackTraceElement(A03, debugMetadata.mo50195m(), debugMetadata.mo50193f(), i2);
        }
        throw new IllegalStateException(AnonymousClass000.A08("Debug metadata version mismatch. Expected: ", 1, ", got ", v, ". Please update the Kotlin standard library.").toString());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Serializable AWW = AWW();
        if (AWW == null) {
            AWW = getClass().getName();
        }
        sb.append(AWW);
        return sb.toString();
    }

    public C233810e(C233910f r1) {
        this.A00 = r1;
    }
}
