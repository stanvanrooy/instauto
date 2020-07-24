package p000X;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: X.CBP */
public final class CBP implements AnonymousClass07L {
    public final /* synthetic */ CBO A00;

    public CBP(CBO cbo) {
        this.A00 = cbo;
    }

    public final void B2i(Object obj) {
        AnonymousClass07T r3 = this.A00.A00;
        int identityHashCode = System.identityHashCode(obj);
        synchronized (r3) {
            if (r3.A01.get(identityHashCode, (Object) null) != null) {
                r3.A01.remove(identityHashCode);
                r3.A02.delete(identityHashCode);
                r3.A00.remove(identityHashCode);
            }
        }
    }

    public final void BDI(Object obj) {
        AnonymousClass07T r5 = this.A00.A00;
        int identityHashCode = System.identityHashCode(obj);
        synchronized (r5) {
            Throwable th = new Throwable();
            r5.A01.append(identityHashCode, th);
            r5.A02.append(identityHashCode, true);
            r5.A00.append(identityHashCode, Long.valueOf(SystemClock.uptimeMillis()));
            if (r5.A03.AeA()) {
                r5.A04.Bp4("CameraLeakListener:ON_OPEN_IN_BACKGROUND", new AnonymousClass07R(Collections.unmodifiableList(new ArrayList(r5.A05)), Constants.ONE, th));
            }
        }
    }

    public final void BI7(Object obj) {
        AnonymousClass07T r6 = this.A00.A00;
        int identityHashCode = System.identityHashCode(obj);
        synchronized (r6) {
            if (r6.A02.get(identityHashCode, false)) {
                long uptimeMillis = SystemClock.uptimeMillis();
                if (r6.A00.get(identityHashCode, (Object) null) != null && uptimeMillis - ((Long) r6.A00.get(identityHashCode)).longValue() > 6000) {
                    r6.A04.Bp4("CameraLeakListener:RELEASE_WITHOUT_PREVIEW", new AnonymousClass07R(Collections.unmodifiableList(new ArrayList(r6.A05)), Constants.A0C, (Throwable) r6.A01.get(identityHashCode)));
                }
                r6.A02.delete(identityHashCode);
            }
            r6.A01.remove(identityHashCode);
            r6.A00.remove(identityHashCode);
        }
    }

    public final void BOb(Object obj) {
        AnonymousClass07T r2 = this.A00.A00;
        int identityHashCode = System.identityHashCode(obj);
        synchronized (r2) {
            r2.A02.delete(identityHashCode);
        }
    }

    public final void BPB(Object obj) {
    }
}
