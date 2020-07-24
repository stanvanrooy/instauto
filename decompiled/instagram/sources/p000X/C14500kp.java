package p000X;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* renamed from: X.0kp  reason: invalid class name and case insensitive filesystem */
public final class C14500kp extends C14510kq {
    public static final long A00;
    public static final long A01;
    public static final long A02;
    public static final long A03;
    public static final long A04;
    public static final Unsafe A05;

    public final void A00(C14530ku r4, C14530ku r5) {
        A05.putObject(r4, A03, r5);
    }

    public final void A01(C14530ku r4, Thread thread) {
        A05.putObject(r4, A04, thread);
    }

    public final boolean A02(C14460kf r7, C14540kv r8, C14540kv r9) {
        return A05.compareAndSwapObject(r7, A00, r8, r9);
    }

    public final boolean A03(C14460kf r7, C14530ku r8, C14530ku r9) {
        return A05.compareAndSwapObject(r7, A02, r8, r9);
    }

    public final boolean A04(C14460kf r7, Object obj, Object obj2) {
        return A05.compareAndSwapObject(r7, A01, obj, obj2);
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x0005 */
    static {
        Unsafe unsafe = Unsafe.getUnsafe();
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new C14520ks());
            Class<C14460kf> cls = C14460kf.class;
            try {
                A02 = unsafe.objectFieldOffset(cls.getDeclaredField("waiters"));
                A00 = unsafe.objectFieldOffset(cls.getDeclaredField("listeners"));
                A01 = unsafe.objectFieldOffset(cls.getDeclaredField("value"));
                Class<C14530ku> cls2 = C14530ku.class;
                A04 = unsafe.objectFieldOffset(cls2.getDeclaredField("thread"));
                A03 = unsafe.objectFieldOffset(cls2.getDeclaredField("next"));
                A05 = unsafe;
            } catch (Exception e) {
                C2098092v.A01(e);
                throw new RuntimeException(e);
            }
        } catch (PrivilegedActionException e2) {
            throw new RuntimeException("Could not initialize intrinsics", e2.getCause());
        }
    }
}
