package p000X;

import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.JavaModuleWrapper;
import com.facebook.systrace.SystraceMessage;
import java.lang.reflect.Method;

/* renamed from: X.A4D */
public final class A4D {
    public static final C23066A4i A09 = new C23064A4g();
    public static final C23066A4i A0A = new A4S();
    public static final C23066A4i A0B = new C23058A3n();
    public static final C23066A4i A0C = new A4R();
    public static final C23066A4i A0D = new A1g();
    public static final C23066A4i A0E = new A4P();
    public static final C23066A4i A0F = new A4T();
    public static final C23066A4i A0G = new A4b();
    public static final C23066A4i A0H = new A4O();
    public static final C23066A4i A0I = new C23063A4f();
    public int A00;
    public String A01;
    public String A02 = BaseJavaModule.METHOD_TYPE_ASYNC;
    public boolean A03 = false;
    public C23066A4i[] A04;
    public Object[] A05;
    public final JavaModuleWrapper A06;
    public final Method A07;
    public final Class[] A08;

    public static char A00(Class cls) {
        if (cls == Boolean.TYPE) {
            return 'z';
        }
        if (cls == Boolean.class) {
            return 'Z';
        }
        if (cls == Integer.TYPE) {
            return 'i';
        }
        if (cls == Integer.class) {
            return 'I';
        }
        if (cls == Double.TYPE) {
            return 'd';
        }
        if (cls == Double.class) {
            return 'D';
        }
        if (cls == Float.TYPE) {
            return 'f';
        }
        if (cls == Float.class) {
            return 'F';
        }
        if (cls == String.class) {
            return 'S';
        }
        return 0;
    }

    public static void A01(A4D a4d) {
        RuntimeException runtimeException;
        if (!a4d.A03) {
            C08750Yk A022 = SystraceMessage.A02(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED, "processArguments");
            A022.A01("method", AnonymousClass000.A0J(a4d.A06.mModuleHolder.mName, ".", a4d.A07.getName()));
            A022.A02();
            try {
                a4d.A03 = true;
                Class<A1k>[] clsArr = a4d.A08;
                int length = clsArr.length;
                C23066A4i[] a4iArr = new C23066A4i[length];
                int i = 0;
                while (true) {
                    if (i >= length) {
                        a4d.A04 = a4iArr;
                        Method method = a4d.A07;
                        Class<A1k>[] clsArr2 = a4d.A08;
                        boolean equals = a4d.A02.equals(BaseJavaModule.METHOD_TYPE_SYNC);
                        int length2 = clsArr2.length;
                        StringBuilder sb = new StringBuilder(length2 + 2);
                        if (equals) {
                            Class<?> returnType = method.getReturnType();
                            char A002 = A00(returnType);
                            if (A002 == 0) {
                                if (returnType == Void.TYPE) {
                                    A002 = 'v';
                                } else if (returnType == C228259s1.class) {
                                    A002 = 'M';
                                } else if (returnType == C206608tl.class) {
                                    A002 = 'A';
                                } else {
                                    runtimeException = new RuntimeException(AnonymousClass000.A0E("Got unknown return class: ", returnType.getSimpleName()));
                                }
                            }
                            sb.append(A002);
                            sb.append('.');
                        } else {
                            sb.append("v.");
                        }
                        for (int i2 = 0; i2 < length2; i2++) {
                            Class<A1k> cls = clsArr2[i2];
                            Class<C2102594w> cls2 = C2102594w.class;
                            if (cls == cls2) {
                                boolean z = true;
                                if (i2 != length2 - 1) {
                                    z = false;
                                }
                                AnonymousClass0FY.A03(z, "Promise must be used as last parameter only");
                            }
                            char A003 = A00(cls);
                            if (A003 == 0) {
                                if (cls == Callback.class) {
                                    A003 = 'X';
                                } else if (cls == cls2) {
                                    A003 = 'P';
                                } else if (cls == C23043A0y.class) {
                                    A003 = 'M';
                                } else if (cls == A1e.class) {
                                    A003 = 'A';
                                } else if (cls == A1k.class) {
                                    A003 = 'Y';
                                } else {
                                    runtimeException = new RuntimeException(AnonymousClass000.A0E("Got unknown param class: ", cls.getSimpleName()));
                                }
                            }
                            sb.append(A003);
                        }
                        a4d.A01 = sb.toString();
                        a4d.A05 = new Object[a4d.A08.length];
                        C23066A4i[] a4iArr2 = a4d.A04;
                        AnonymousClass0FY.A00(a4iArr2);
                        int i3 = 0;
                        for (C23066A4i A004 : a4iArr2) {
                            i3 += A004.A00();
                        }
                        a4d.A00 = i3;
                        return;
                    }
                    Class<A1k> cls3 = clsArr[i];
                    if (cls3 != Boolean.class && cls3 != Boolean.TYPE) {
                        if (cls3 != Integer.class && cls3 != Integer.TYPE) {
                            if (cls3 != Double.class && cls3 != Double.TYPE) {
                                if (cls3 != Float.class && cls3 != Float.TYPE) {
                                    if (cls3 != String.class) {
                                        if (cls3 != Callback.class) {
                                            if (cls3 != C2102594w.class) {
                                                if (cls3 != C23043A0y.class) {
                                                    if (cls3 != A1e.class) {
                                                        if (cls3 != A1k.class) {
                                                            runtimeException = new RuntimeException(AnonymousClass000.A0E("Got unknown argument class: ", cls3.getSimpleName()));
                                                            break;
                                                        }
                                                        a4iArr[i] = A0D;
                                                    } else {
                                                        a4iArr[i] = A09;
                                                    }
                                                } else {
                                                    a4iArr[i] = A0G;
                                                }
                                            } else {
                                                a4iArr[i] = A0H;
                                                boolean z2 = true;
                                                if (i != length - 1) {
                                                    z2 = false;
                                                }
                                                AnonymousClass0FY.A03(z2, "Promise must be used as last parameter only");
                                            }
                                        } else {
                                            a4iArr[i] = A0B;
                                        }
                                    } else {
                                        a4iArr[i] = A0I;
                                    }
                                } else {
                                    a4iArr[i] = A0E;
                                }
                            } else {
                                a4iArr[i] = A0C;
                            }
                        } else {
                            a4iArr[i] = A0F;
                        }
                    } else {
                        a4iArr[i] = A0A;
                    }
                    i += a4iArr[i].A00();
                }
                throw runtimeException;
            } finally {
                SystraceMessage.A00(OdexSchemeArtXdex.STATE_PGO_ATTEMPTED).A02();
            }
        }
    }

    public A4D(JavaModuleWrapper javaModuleWrapper, Method method, boolean z) {
        String str;
        this.A06 = javaModuleWrapper;
        this.A07 = method;
        method.setAccessible(true);
        Class<C2102594w>[] parameterTypes = this.A07.getParameterTypes();
        this.A08 = parameterTypes;
        int length = parameterTypes.length;
        if (z) {
            str = BaseJavaModule.METHOD_TYPE_SYNC;
        } else if (length > 0 && parameterTypes[length - 1] == C2102594w.class) {
            str = BaseJavaModule.METHOD_TYPE_PROMISE;
        } else {
            return;
        }
        this.A02 = str;
    }
}
