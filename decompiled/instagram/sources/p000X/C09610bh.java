package p000X;

import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.core.TriggerRegistry;
import com.facebook.profilo.ipc.TraceContext;
import java.util.TreeMap;

/* renamed from: X.0bh  reason: invalid class name and case insensitive filesystem */
public final class C09610bh implements AnonymousClass0Gm {
    public static final int A00 = TriggerRegistry.A00.A02("manual");
    public static final C09610bh A01 = new C09610bh();

    public final boolean A9h(long j, Object obj, long j2, Object obj2) {
        return obj == obj2;
    }

    public final boolean Aek() {
        return false;
    }

    public final TraceContext.TraceConfigExtras AYl(long j, Object obj, AnonymousClass0GE r7) {
        TreeMap treeMap = new TreeMap();
        treeMap.put("provider.stack_trace.cpu_sampling_rate_ms", 11);
        return new TraceContext.TraceConfigExtras(treeMap, (TreeMap) null, (TreeMap) null);
    }

    public final int ADR(long j, Object obj, AnonymousClass0GE r6) {
        AnonymousClass0GS r0 = AnonymousClass0GT.A00().A00;
        if (r0 == null) {
            return 0;
        }
        return ProvidersRegistry.A00.A00(r0.A00);
    }
}
