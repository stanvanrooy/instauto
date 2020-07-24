package p000X;

import com.facebook.profilo.ipc.TraceContext;

/* renamed from: X.0bj  reason: invalid class name and case insensitive filesystem */
public abstract class C09630bj extends AnonymousClass0GW {
    public void A09(TraceContext traceContext, C09640bk r2) {
    }

    public final int getSupportedProviders() {
        return -1;
    }

    public final int getTracingProviders() {
        return 0;
    }

    public void logOnTraceEnd(TraceContext traceContext, C09640bk r2) {
    }

    public final void onTraceEnded(TraceContext traceContext, C09640bk r4) {
        if (traceContext.A00 != 2) {
            logOnTraceEnd(traceContext, r4);
        }
    }

    public final void disable() {
        AnonymousClass0Z0.A0A(-1885709404, AnonymousClass0Z0.A03(-507039351));
    }

    public final void enable() {
        AnonymousClass0Z0.A0A(286608778, AnonymousClass0Z0.A03(1361811259));
    }

    public C09630bj(String str) {
        super(str);
    }

    public final void onTraceStarted(TraceContext traceContext, C09640bk r2) {
        A09(traceContext, r2);
    }
}
