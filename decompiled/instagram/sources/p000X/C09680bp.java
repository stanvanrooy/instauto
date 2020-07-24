package p000X;

import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.core.TraceEvents;
import com.facebook.react.bridge.BaseJavaModule;

/* renamed from: X.0bp  reason: invalid class name and case insensitive filesystem */
public final class C09680bp extends AnonymousClass0GW {
    public static final int A00 = ((((((A01 | A04) | A06) | A07) | A02) | A03) | ProvidersRegistry.A00.A02("multiprocess"));
    public static final int A01;
    public static final int A02;
    public static final int A03;
    public static final int A04;
    public static final int A05 = ProvidersRegistry.A00.A02("liger");
    public static final int A06;
    public static final int A07;

    public C09680bp() {
        super((String) null);
    }

    public final boolean A08() {
        return true;
    }

    static {
        AnonymousClass0GY r1 = ProvidersRegistry.A00;
        A01 = r1.A02(BaseJavaModule.METHOD_TYPE_ASYNC);
        A04 = r1.A02("lifecycle");
        A06 = r1.A02("other");
        A07 = r1.A02("user_counters");
        A02 = r1.A02("class_load");
        A03 = r1.A02("fbsystrace");
        AnonymousClass0GY r0 = ProvidersRegistry.A00;
        r0.A02("liger_http2");
        r0.A02("liger_http2_egress");
    }

    public final int getSupportedProviders() {
        return A00;
    }

    public final int getTracingProviders() {
        return A00 & TraceEvents.sProviders;
    }

    public final void disable() {
        AnonymousClass0Z0.A0A(-1715218956, AnonymousClass0Z0.A03(643833786));
    }

    public final void enable() {
        AnonymousClass0Z0.A0A(-253787373, AnonymousClass0Z0.A03(-1427059542));
    }
}
