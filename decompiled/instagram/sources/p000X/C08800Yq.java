package p000X;

import com.facebook.systrace.TraceDirect;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.0Yq  reason: invalid class name and case insensitive filesystem */
public final class C08800Yq {
    public static final C08840Yy A00 = new C08840Yy();
    public static volatile long A01;

    static {
        A02(false);
        C08790Yp r3 = new C08790Yp();
        if (AnonymousClass070.A04) {
            AnonymousClass070.A01(AnonymousClass070.A00, r3);
        }
    }

    public static void A00(AnonymousClass0Yw r3) {
        C08840Yy r2 = A00;
        synchronized (r2.A01) {
            r2.A02.add(r3);
            if (r2.A00) {
                r3.BSH();
            }
        }
    }

    public static void A01(AnonymousClass0Yw r3) {
        C08840Yy r2 = A00;
        synchronized (r2.A01) {
            r2.A02.remove(r3);
            if (r2.A00) {
                r3.BSJ();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    public static void A02(boolean z) {
        boolean z2;
        long A002;
        long j;
        boolean z3;
        long j2 = AnonymousClass072.A00;
        if (AnonymousClass072.A03) {
            Method method = AnonymousClass072.A01;
            AnonymousClass0FY.A00(method);
            Object obj = null;
            try {
                obj = method.invoke((Object) null, new Object[]{Long.valueOf(j2)});
            } catch (IllegalAccessException unused) {
                AnonymousClass072.A03 = false;
            } catch (InvocationTargetException e) {
                C034306y.A00(e);
            }
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                z2 = bool.booleanValue();
                A002 = AnonymousClass070.A00("debug.fbsystrace.tags");
                if (!z2 || A002 == 0) {
                    j = 0;
                } else {
                    j = A002 | 1;
                }
                if ((A01 != 0 || j == 0) && (j != 0 || A01 == 0)) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                A01 = j;
                if (!z3) {
                    if (TraceDirect.checkNative()) {
                        TraceDirect.nativeSetEnabledTags(j);
                    }
                    boolean z4 = false;
                    if (j > 0) {
                        z4 = true;
                    }
                    if (!z4) {
                        C08840Yy r2 = A00;
                        synchronized (r2.A01) {
                            try {
                                C08840Yy.A00(r2, false);
                            } catch (Throwable th) {
                                th = th;
                                throw th;
                            }
                        }
                        return;
                    } else if (!z) {
                        A00.A01();
                        return;
                    } else {
                        C08840Yy r6 = A00;
                        synchronized (r6.A01) {
                            try {
                                Thread thread = new Thread(new C08830Yx(r6, C08840Yy.A03.lastModified()), "fbsystrace notification thread");
                                thread.setPriority(10);
                                thread.start();
                            } catch (Throwable th2) {
                                th = th2;
                                throw th;
                            }
                        }
                        return;
                    }
                } else {
                    return;
                }
            }
        }
        z2 = false;
        A002 = AnonymousClass070.A00("debug.fbsystrace.tags");
        if (!z2 || A002 == 0) {
        }
        if ((A01 != 0 || j == 0) && (j != 0 || A01 == 0)) {
        }
        A01 = j;
        if (!z3) {
        }
    }
}
