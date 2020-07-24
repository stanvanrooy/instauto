package p000X;

import android.os.Looper;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1Iz  reason: invalid class name and case insensitive filesystem */
public final class C27731Iz {
    public static final AnonymousClass1J1 A00 = new AnonymousClass1J1(new AnonymousClass1J2(new ThreadPoolExecutor(5, 128, 1, TimeUnit.SECONDS, new LinkedBlockingDeque(100), A02)));
    public static final AnonymousClass1J1 A01;
    public static final ThreadFactory A02 = new AnonymousClass1J0();

    static {
        AnonymousClass1J3 r0 = AnonymousClass1JY.A00;
        if (r0 != null) {
            A01 = new AnonymousClass1J1(r0);
            return;
        }
        throw new NullPointerException("scheduler == null");
    }

    public static AnonymousClass1J1 A00(Looper looper) {
        return new AnonymousClass1J1(AnonymousClass1JY.A00(looper));
    }
}
