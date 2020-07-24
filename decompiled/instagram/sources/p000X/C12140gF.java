package p000X;

import android.os.HandlerThread;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.lang.reflect.Proxy;

/* renamed from: X.0gF  reason: invalid class name and case insensitive filesystem */
public class C12140gF {
    public final HandlerThread A00 = new HandlerThread("BaseDependencyManager", 10);
    public final C12170gI A01 = new C12160gH(this);
    public final QuickPerformanceLogger A02 = ((QuickPerformanceLogger) Proxy.newProxyInstance(C12140gF.class.getClassLoader(), new Class[]{QuickPerformanceLogger.class}, new C12150gG(this)));

    public C12170gI A00() {
        return this.A01;
    }

    public C12190gK A01() {
        if (C12190gK.A05 == null) {
            C12190gK.A05 = new C12190gK((AnonymousClass0Ba) null);
        }
        return C12190gK.A05;
    }

    public QuickPerformanceLogger A02() {
        return this.A02;
    }

    public C12140gF() {
        this.A00.start();
    }
}
