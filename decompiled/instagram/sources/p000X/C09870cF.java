package p000X;

import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.ipc.TraceContext;
import java.io.File;

/* renamed from: X.0cF  reason: invalid class name and case insensitive filesystem */
public final class C09870cF extends AnonymousClass0GW {
    public static C09870cF A03;
    public static String A04;
    public static final int A05 = ProvidersRegistry.A00.A02("transient_network_data");
    public String A00 = "UNKNOWN_SESSIONID";
    public String A01 = "UNKNOWN_TRACEID";
    public C484127w A02;

    public C09870cF() {
        super((String) null);
    }

    public final synchronized String A09() {
        String str = this.A01;
        if (!str.equals("UNKNOWN_TRACEID")) {
            return str;
        }
        return this.A00;
    }

    public final synchronized void enable() {
        String str;
        int A032 = AnonymousClass0Z0.A03(-1366642477);
        TraceContext traceContext = this.A00;
        if (traceContext != null) {
            str = AnonymousClass000.A0J(traceContext.A0A, "-", A04);
        } else {
            str = "UNKNOWN_TRACEID";
        }
        this.A01 = str;
        if (!(traceContext == null || this.A02 == null)) {
            File file = null;
            boolean z = false;
            if (C09640bk.A0D.get() != null) {
                z = true;
            }
            if (z) {
                file = C09640bk.A00().A03(traceContext, this);
            }
            this.A02.Bpa(file, false);
        }
        AnonymousClass0Z0.A0A(-1545402783, A032);
    }

    public final synchronized void onTraceEnded(TraceContext traceContext, C09640bk r7) {
        TraceContext traceContext2 = this.A00;
        if (traceContext2 != null && traceContext.A05 == traceContext2.A05) {
            this.A01 = "UNKNOWN_TRACEID";
            this.A00 = "UNKNOWN_SESSIONID";
            C484127w r1 = this.A02;
            if (r1 != null) {
                r1.BqN(r7.A03(traceContext, this));
            }
        }
    }

    public static synchronized C09870cF A00() {
        C09870cF r0;
        synchronized (C09870cF.class) {
            if (A03 == null) {
                A03 = new C09870cF();
                A04 = AnonymousClass0CY.A00().A02();
            }
            r0 = A03;
        }
        return r0;
    }

    public final int getSupportedProviders() {
        return A05;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    public final int getTracingProviders() {
        File file;
        C484127w r0;
        TraceContext traceContext = this.A00;
        if (traceContext != null) {
            boolean z = false;
            if (C09640bk.A0D.get() != null) {
                z = true;
            }
            if (z) {
                file = C09640bk.A00().A03(traceContext, this);
                r0 = this.A02;
                if (r0 == null || !r0.AiB(file)) {
                    return 0;
                }
                return A05;
            }
        }
        file = null;
        r0 = this.A02;
        if (r0 == null || !r0.AiB(file)) {
        }
    }

    public final void disable() {
        AnonymousClass0Z0.A0A(408544169, AnonymousClass0Z0.A03(-1367152439));
    }
}
