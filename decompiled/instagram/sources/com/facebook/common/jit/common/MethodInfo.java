package com.facebook.common.jit.common;

import android.util.Log;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p000X.AnonymousClass000;

public class MethodInfo {
    public static final Map PRIMITIVE_TO_SIGNATURE;
    public static final Map SIGNATURE_TO_PRIMITIVE;
    public final Class cls;
    public final Constructor constructor;
    public final Method method;
    public final String name;
    public final String signature;

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MethodInfo)) {
            return false;
        }
        MethodInfo methodInfo = (MethodInfo) obj;
        return equal(this.cls, methodInfo.cls) && equal(this.method, methodInfo.method) && equal(this.constructor, methodInfo.constructor) && equal(this.name, methodInfo.name) && equal(this.signature, methodInfo.signature);
    }

    static {
        HashMap hashMap = new HashMap(9);
        PRIMITIVE_TO_SIGNATURE = hashMap;
        hashMap.put(Byte.TYPE, "B");
        Map map = PRIMITIVE_TO_SIGNATURE;
        map.put(Character.TYPE, "C");
        map.put(Short.TYPE, "S");
        map.put(Integer.TYPE, "I");
        map.put(Long.TYPE, "J");
        map.put(Float.TYPE, "F");
        map.put(Double.TYPE, "D");
        map.put(Void.TYPE, "V");
        map.put(Boolean.TYPE, "Z");
        HashMap hashMap2 = new HashMap(9);
        SIGNATURE_TO_PRIMITIVE = hashMap2;
        hashMap2.put('B', Byte.TYPE);
        Map map2 = SIGNATURE_TO_PRIMITIVE;
        map2.put('C', Character.TYPE);
        map2.put('S', Short.TYPE);
        map2.put('I', Integer.TYPE);
        map2.put('J', Long.TYPE);
        map2.put('F', Float.TYPE);
        map2.put('D', Double.TYPE);
        map2.put('V', Void.TYPE);
        map2.put('Z', Boolean.TYPE);
    }

    public static boolean addArrayType(List list, Class cls2, int i) {
        String str;
        Class<?> cls3;
        if (i > 0) {
            StringBuilder sb = new StringBuilder();
            for (int i2 = 0; i2 < i; i2++) {
                sb.append('[');
            }
            String sb2 = sb.toString();
            String str2 = (String) PRIMITIVE_TO_SIGNATURE.get(cls2);
            if (str2 != null) {
                str = AnonymousClass000.A0E(sb2, str2);
            } else {
                str = AnonymousClass000.A0N(sb2, "L", cls2.getName(), ";");
            }
            try {
                cls3 = Class.forName(str);
            } catch (ClassNotFoundException | NoClassDefFoundError e) {
                Log.w("JitMethodInfo", String.format("Cannot find array class: %s", new Object[]{str}), e);
                cls3 = null;
            }
            if (cls3 == null) {
                return false;
            }
            list.add(cls3);
            return true;
        }
        throw new IllegalArgumentException(AnonymousClass000.A06("Array count ", i, " is not valid"));
    }

    public static MethodInfo constructMethodInfoFrom(Class cls2, String str, Class[] clsArr, Constructor constructor2) {
        if (constructor2 != null) {
            return new MethodInfo(cls2, constructor2, str, getSignature(constructor2.getParameterTypes(), Void.TYPE));
        }
        String.format("Did NOT find constructor %s %s with types: %s", new Object[]{cls2.getName(), str, Arrays.toString(clsArr)});
        return null;
    }

    public static boolean equal(Object obj, Object obj2) {
        if (obj != null) {
            return obj.equals(obj2);
        }
        if (obj2 == null) {
            return true;
        }
        return false;
    }

    public static String getSignature(Class[] clsArr, Class cls2) {
        StringBuilder sb = new StringBuilder("(");
        for (Class signatureFromType : clsArr) {
            sb.append(getSignatureFromType(signatureFromType));
        }
        sb.append(')');
        sb.append(getSignatureFromType(cls2));
        return sb.toString();
    }

    public static String getSignatureFromType(Class cls2) {
        StringBuilder sb;
        String str;
        String str2 = (String) PRIMITIVE_TO_SIGNATURE.get(cls2);
        if (str2 != null) {
            return str2;
        }
        if (cls2.isArray()) {
            sb = new StringBuilder("[");
            str = getSignatureFromType(cls2.getComponentType());
        } else {
            sb = new StringBuilder("L");
            sb.append(cls2.getName().replace('.', '/'));
            str = ";";
        }
        sb.append(str);
        return sb.toString();
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int hashCode = this.cls.hashCode() * 31;
        Method method2 = this.method;
        int i4 = 0;
        if (method2 != null) {
            i = method2.hashCode();
        } else {
            i = 0;
        }
        int i5 = (hashCode + i) * 31;
        Constructor constructor2 = this.constructor;
        if (constructor2 != null) {
            i2 = constructor2.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        String str = this.name;
        if (str != null) {
            i3 = str.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 31;
        String str2 = this.signature;
        if (str2 != null) {
            i4 = str2.hashCode();
        }
        return i7 + i4;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("[ MethodInfo ");
        sb.append("cls: ");
        Class cls2 = this.cls;
        String str2 = "<null>";
        if (cls2 != null) {
            str = cls2.getName();
        } else {
            str = str2;
        }
        sb.append(str);
        sb.append(", ");
        Method method2 = this.method;
        if (method2 != null) {
            sb.append("method: ");
            if (method2 != null) {
                str2 = method2.getName();
            }
        } else {
            Constructor constructor2 = this.constructor;
            if (constructor2 != null) {
                sb.append("constructor: ");
                if (constructor2 != null) {
                    str2 = constructor2.getName();
                }
            }
            sb.append("name: ");
            sb.append(this.name);
            sb.append(", ");
            sb.append("signature: ");
            sb.append(this.signature);
            sb.append(']');
            return sb.toString();
        }
        sb.append(str2);
        sb.append(", ");
        sb.append("name: ");
        sb.append(this.name);
        sb.append(", ");
        sb.append("signature: ");
        sb.append(this.signature);
        sb.append(']');
        return sb.toString();
    }

    public MethodInfo() {
        this.cls = null;
        this.method = null;
        this.constructor = null;
        this.name = null;
        this.signature = null;
    }

    public MethodInfo(Class cls2, String str, String str2) {
        this.cls = cls2;
        this.method = null;
        this.constructor = null;
        this.name = str;
        this.signature = str2;
    }

    public MethodInfo(Class cls2, Constructor constructor2, String str, String str2) {
        this.cls = cls2;
        this.method = null;
        this.constructor = constructor2;
        this.name = str;
        this.signature = str2;
    }

    public MethodInfo(Class cls2, Method method2, String str, String str2) {
        this.cls = cls2;
        this.method = method2;
        this.constructor = null;
        this.name = str;
        this.signature = str2;
    }

    public static MethodInfo getMethod(Class cls2, String str, Class... clsArr) {
        Constructor constructor2;
        Method method2;
        Method method3;
        Method method4 = null;
        if (!(cls2 == null || str == null)) {
            if ("<clinit>".equals(str)) {
                return new MethodInfo(cls2, str, getSignature(clsArr, Void.TYPE));
            }
            if (!"<init>".equals(str)) {
                Class cls3 = cls2;
                Class cls4 = null;
                while (true) {
                    if (cls3 == null || cls3 == cls4) {
                        String.format("Did NOT find method (in chain) for class %s %s with types: %s", new Object[]{cls2.getName(), str, Arrays.toString(clsArr)});
                    } else {
                        try {
                            method3 = cls2.getDeclaredMethod(str, clsArr);
                            method2 = method3;
                        } catch (NoSuchMethodException unused) {
                            method3 = null;
                            method2 = null;
                        }
                        if (method3 != null) {
                            method4 = method2;
                            break;
                        }
                        cls4 = cls3;
                        cls3 = cls3.getSuperclass();
                    }
                }
                if (method4 != null) {
                    return new MethodInfo(cls2, method4, str, getSignature(method4.getParameterTypes(), method4.getReturnType()));
                }
                String.format("Did NOT find method (from reflect method) %s %s with types: %s", new Object[]{cls2.getName(), str, Arrays.toString(clsArr)});
                return null;
            }
            try {
                constructor2 = cls2.getDeclaredConstructor(clsArr);
            } catch (NoSuchMethodException unused2) {
                constructor2 = null;
            }
            if (constructor2 == null) {
                if (cls2.getEnclosingClass() != null) {
                    int length = clsArr.length;
                    int i = 1 + length;
                    if (i < i) {
                        throw new IllegalArgumentException("Dest array is not big enough");
                    } else if (length >= length) {
                        for (int i2 = 0; i2 < length; i2++) {
                        }
                        try {
                            constructor2 = cls2.getDeclaredConstructor(clsArr);
                        } catch (NoSuchMethodException unused3) {
                            constructor2 = null;
                        }
                    } else {
                        throw new IllegalArgumentException("Src array lacks the num of needed elements");
                    }
                }
            }
            return constructMethodInfoFrom(cls2, str, clsArr, constructor2);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00f2, code lost:
        java.lang.String.format("Signature %s is malformed. Cannot get array type for %s.", r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0135, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
        android.util.Log.w("JitMethodInfo", java.lang.String.format("Cannot find class: %s for method: %s sig: %s", new java.lang.Object[]{r18, r19, r20}), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0147, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0156, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0157, code lost:
        android.util.Log.w("JitMethodInfo", java.lang.String.format("Programming Error: class: %s for method: %s sig: %s", new java.lang.Object[]{r18, r19, r20}), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0168, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00c0 */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0135 A[ExcHandler: ClassNotFoundException | NoClassDefFoundError (r2v0 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:4:0x0013] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0156 A[ExcHandler: Error | RuntimeException (r2v1 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:64:0x0138] */
    public static MethodInfo getMethod(String str, String str2, String str3) {
        Class[] clsArr;
        Object[] objArr;
        Class<?> cls2;
        String str4 = str2;
        String str5 = str3;
        if (str == null || str2 == null || str3 == null) {
            String.format("Trying to get method but cant because some crucial information was null. class name: %s method name: %s method sig: %s", new Object[]{str, str2, str3});
            return null;
        }
        try {
            Class<?> cls3 = Class.forName(str);
            if (str3 != null) {
                if (str5.charAt(0) == '(') {
                    int indexOf = str5.indexOf(41);
                    if (indexOf >= 0) {
                        ArrayList arrayList = new ArrayList();
                        int i = 1;
                        while (true) {
                            if (i >= indexOf) {
                                clsArr = (Class[]) arrayList.toArray(new Class[arrayList.size()]);
                                break;
                            }
                            char charAt = str5.charAt(i);
                            int i2 = 0;
                            while (charAt == '[') {
                                i2++;
                                i++;
                                charAt = str5.charAt(i);
                            }
                            boolean z = false;
                            if (i2 > 0) {
                                z = true;
                            }
                            Map map = SIGNATURE_TO_PRIMITIVE;
                            Character valueOf = Character.valueOf(charAt);
                            Class cls4 = (Class) map.get(valueOf);
                            if (cls4 != null) {
                                if (z) {
                                    if (!addArrayType(arrayList, cls4, i2)) {
                                        objArr = new Object[]{str3, cls4.getName()};
                                        break;
                                    }
                                } else {
                                    arrayList.add(cls4);
                                }
                                i++;
                            } else if (charAt != 'L') {
                                String.format("Signature %s is malformed. Char %s not understood.", new Object[]{str3, valueOf});
                                break;
                            } else {
                                int indexOf2 = str5.indexOf(59, i);
                                if (indexOf2 < 0) {
                                    String.format("Signature %s is malformed. No end ';' at idx: %d", new Object[]{str3, Integer.valueOf(i)});
                                    break;
                                }
                                int i3 = i + 1;
                                if (indexOf2 <= i3) {
                                    String.format("Signature %s is malformed. Idxs [%d, %d] not valid", new Object[]{str3, Integer.valueOf(i3), Integer.valueOf(indexOf2)});
                                } else {
                                    String replace = str5.substring(i3, indexOf2).replace('/', '.');
                                    cls2 = Class.forName(replace);
                                    String.format("Signature %s is malformed. Class %s not found", new Object[]{str3, replace});
                                }
                                cls2 = null;
                                if (cls2 == null) {
                                    break;
                                }
                                if (z) {
                                    if (!addArrayType(arrayList, cls2, i2)) {
                                        objArr = new Object[]{str3, cls2.getName()};
                                        break;
                                    }
                                } else {
                                    arrayList.add(cls2);
                                }
                                i = indexOf2 + 1;
                            }
                        }
                    } else {
                        String.format("Signature %s is malformed. No ')'", new Object[]{str3});
                    }
                } else {
                    String.format("Signature %s is malformed. No '(' at the front", new Object[]{str3});
                }
            }
            clsArr = null;
            if (clsArr != null) {
                return getMethod((Class) cls3, str4, clsArr);
            }
            Log.w("JitMethodInfo", String.format("Cannot find class: %s for method: %s sig: %s. Cannot parse sig", new Object[]{str, str2, str3}));
            return null;
        } catch (ClassNotFoundException | NoClassDefFoundError e) {
        }
    }
}
