package p000X;

import java.util.ArrayDeque;

/* renamed from: X.BCW */
public final class BCW {
    public static final String A00;
    public static final String A01;

    public static final int A00(StackTraceElement[] stackTraceElementArr, String str) {
        int length = stackTraceElementArr.length;
        for (int i = 0; i < length; i++) {
            if (C13150hy.A05(str, stackTraceElementArr[i].getClassName())) {
                return i;
            }
        }
        return -1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        String str;
        String str2;
        String str3 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        String str4 = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        try {
            str = Class.forName(str4).getCanonicalName();
        } catch (Throwable th) {
            str = AnonymousClass2I2.A00(th);
        }
        if (C50632Hb.A00(str) == null) {
            str4 = str;
        }
        A00 = str4;
        try {
            str2 = Class.forName(str3).getCanonicalName();
        } catch (Throwable th2) {
            str2 = AnonymousClass2I2.A00(th2);
        }
        if (C50632Hb.A00(str2) == null) {
            str3 = str2;
        }
        A01 = str3;
    }

    public static final Throwable A01(Throwable th) {
        Throwable A012;
        StackTraceElement stackTraceElement;
        if (!AnonymousClass2GE.A03 || (A012 = C25311BDd.A01(th)) == null) {
            return th;
        }
        StackTraceElement[] stackTrace = A012.getStackTrace();
        int length = stackTrace.length;
        int A002 = A00(stackTrace, A01);
        int i = A002 + 1;
        int A003 = A00(stackTrace, A00);
        int i2 = length - A003;
        if (A003 == -1) {
            i2 = 0;
        }
        int i3 = (length - A002) - i2;
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            if (i4 == 0) {
                stackTraceElement = new StackTraceElement(AnonymousClass000.A0E("\b\b\b(", "Coroutine boundary"), "\b", "\b", -1);
            } else {
                stackTraceElement = stackTrace[(i + i4) - 1];
            }
            stackTraceElementArr[i4] = stackTraceElement;
        }
        A012.setStackTrace(stackTraceElementArr);
        return A012;
    }

    public static final Throwable A02(Throwable th) {
        Throwable cause = th.getCause();
        if (cause != null) {
            boolean z = true;
            if (!(!C13150hy.A05(cause.getClass(), th.getClass()))) {
                StackTraceElement[] stackTrace = th.getStackTrace();
                int length = stackTrace.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        if (C63272pA.A0D(stackTrace[i].getClassName(), "\b\b\b")) {
                            break;
                        }
                        i++;
                    } else {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    return cause;
                }
            }
        }
        return th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00d7, code lost:
        if (p000X.C13150hy.A05(r10.getClassName(), r9.getClassName()) == false) goto L_0x00d9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007e  */
    public static final Throwable A03(Throwable th, C234010g r10) {
        C235010q A002;
        ArrayDeque<StackTraceElement> arrayDeque;
        StackTraceElement AWW;
        boolean z;
        boolean z2;
        Throwable cause = th.getCause();
        if (cause != null && C13150hy.A05(cause.getClass(), th.getClass())) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            int length = stackTrace.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z2 = false;
                    break;
                } else if (C63272pA.A0D(stackTrace[i].getClassName(), "\b\b\b")) {
                    z2 = true;
                    break;
                } else {
                    i++;
                }
            }
            if (z2) {
                A002 = C234910p.A00(cause, stackTrace);
                Throwable th2 = (Throwable) A002.A00;
                StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) A002.A01;
                Throwable A012 = C25311BDd.A01(th2);
                if (A012 != null && !(!C13150hy.A05(A012.getMessage(), th2.getMessage()))) {
                    arrayDeque = new ArrayDeque<>();
                    do {
                        AWW = r10.AWW();
                        if (AWW != null) {
                            arrayDeque.add(AWW);
                        }
                        if (!(r10 instanceof C234010g)) {
                            r10 = null;
                        }
                        if (r10 == null || (r10 = r10.AHe()) != null) {
                        }
                        AWW = r10.AWW();
                        if (AWW != null) {
                        }
                        if (!(r10 instanceof C234010g)) {
                        }
                        break;
                    } while ((r10 = r10.AHe()) != null);
                    if (!arrayDeque.isEmpty()) {
                        if (th2 != th) {
                            int length2 = stackTraceElementArr.length;
                            int i2 = 0;
                            while (true) {
                                if (i2 < length2) {
                                    if (C63272pA.A0D(stackTraceElementArr[i2].getClassName(), "\b\b\b")) {
                                        break;
                                    }
                                    i2++;
                                } else {
                                    i2 = -1;
                                    break;
                                }
                            }
                            int i3 = i2 + 1;
                            int i4 = length2 - 1;
                            if (i4 >= i3) {
                                while (true) {
                                    StackTraceElement stackTraceElement = stackTraceElementArr[i4];
                                    StackTraceElement stackTraceElement2 = (StackTraceElement) arrayDeque.getLast();
                                    if (stackTraceElement.getLineNumber() == stackTraceElement2.getLineNumber() && C13150hy.A05(stackTraceElement.getMethodName(), stackTraceElement2.getMethodName()) && C13150hy.A05(stackTraceElement.getFileName(), stackTraceElement2.getFileName())) {
                                        z = true;
                                    }
                                    z = false;
                                    if (z) {
                                        arrayDeque.removeLast();
                                    }
                                    arrayDeque.addFirst(stackTraceElementArr[i4]);
                                    if (i4 == i3) {
                                        break;
                                    }
                                    i4--;
                                }
                            }
                        }
                        arrayDeque.addFirst(new StackTraceElement(AnonymousClass000.A0E("\b\b\b(", "Coroutine boundary"), "\b", "\b", -1));
                        StackTraceElement[] stackTrace2 = th2.getStackTrace();
                        int A003 = A00(stackTrace2, A00);
                        int i5 = 0;
                        if (A003 == -1) {
                            Object[] array = arrayDeque.toArray(new StackTraceElement[0]);
                            if (array != null) {
                                A012.setStackTrace((StackTraceElement[]) array);
                                return A012;
                            }
                            throw new C183227s6("null cannot be cast to non-null type kotlin.Array<T>");
                        }
                        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[(arrayDeque.size() + A003)];
                        for (int i6 = 0; i6 < A003; i6++) {
                            stackTraceElementArr2[i6] = stackTrace2[i6];
                        }
                        for (StackTraceElement stackTraceElement3 : arrayDeque) {
                            stackTraceElementArr2[A003 + i5] = stackTraceElement3;
                            i5++;
                        }
                        A012.setStackTrace(stackTraceElementArr2);
                        return A012;
                    }
                }
                return th;
            }
        }
        A002 = C234910p.A00(th, new StackTraceElement[0]);
        Throwable th22 = (Throwable) A002.A00;
        StackTraceElement[] stackTraceElementArr3 = (StackTraceElement[]) A002.A01;
        Throwable A0122 = C25311BDd.A01(th22);
        arrayDeque = new ArrayDeque<>();
        do {
            AWW = r10.AWW();
            if (AWW != null) {
            }
            if (!(r10 instanceof C234010g)) {
            }
            break;
            break;
        } while ((r10 = r10.AHe()) != null);
        if (!arrayDeque.isEmpty()) {
        }
        return th;
    }
}
