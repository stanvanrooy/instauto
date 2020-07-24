package p000X;

import android.os.Binder;
import android.os.Process;
import java.util.concurrent.Callable;

/* renamed from: X.1cU  reason: invalid class name and case insensitive filesystem */
public final class C33171cU implements Callable {
    public final /* synthetic */ C33161cT A00;

    public C33171cU(C33161cT r1) {
        this.A00 = r1;
    }

    public final Object call() {
        this.A00.A02.set(true);
        Object obj = null;
        try {
            Process.setThreadPriority(10);
            obj = this.A00.A00();
            Binder.flushPendingCommands();
            this.A00.A03(obj);
            return obj;
        } catch (Throwable th) {
            this.A00.A03(obj);
            throw th;
        }
    }
}
