package p000X;

import com.facebook.profilo.ipc.TraceContext;
import com.facebook.proxygen.NetworkStatusMonitor;
import java.io.File;
import java.util.concurrent.Executors;

/* renamed from: X.1pg  reason: invalid class name and case insensitive filesystem */
public final class C41051pg extends AnonymousClass0L1 {
    public final /* synthetic */ C37531jo A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41051pg(C37531jo r3) {
        super("initTA", 364);
        this.A00 = r3;
    }

    public final void A00() {
        NetworkStatusMonitor networkStatusMonitor;
        synchronized (C14430kT.class) {
            networkStatusMonitor = C14430kT.A0R;
        }
        if (networkStatusMonitor != null) {
            C483427p r3 = new C483427p();
            C483827t r4 = new C483827t();
            AnonymousClass00B r5 = AnonymousClass00B.A01;
            C484027v r0 = new C484027v(Executors.newSingleThreadScheduledExecutor(), networkStatusMonitor, r3, r4, r5);
            C09870cF A002 = C09870cF.A00();
            synchronized (A002) {
                A002.A02 = r0;
                TraceContext traceContext = A002.A00;
                if (traceContext != null) {
                    File file = null;
                    boolean z = false;
                    if (C09640bk.A0D.get() != null) {
                        z = true;
                    }
                    if (z) {
                        file = C09640bk.A00().A03(traceContext, A002);
                    }
                    A002.A02.Bpa(file, false);
                }
            }
            AnonymousClass0Q7.A03().A0B(new AnonymousClass28V(r5));
            r5.markerStart(11862018, false);
        }
    }
}
