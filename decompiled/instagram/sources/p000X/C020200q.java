package p000X;

import com.facebook.forker.Process;
import com.facebook.profilo.core.TriggerRegistry;
import com.facebook.profilo.ipc.TraceContext;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.io.File;
import java.util.TreeMap;

/* renamed from: X.00q  reason: invalid class name and case insensitive filesystem */
public final class C020200q extends AnonymousClass06D {
    public final QuickPerformanceLogger A00;

    public final void BSF(int i, int i2, int i3, int i4) {
        while (i > 0) {
            this.A00.markerGenerate(8126471, 3, 0);
            i--;
        }
        while (i2 > 0) {
            this.A00.markerGenerate(8126472, 2, 0);
            i2--;
        }
        while (i3 > 0) {
            this.A00.markerGenerate(8126473, 2, 0);
            i3--;
        }
        while (i4 > 0) {
            this.A00.markerGenerate(8126474, 2, 0);
            i4--;
        }
    }

    public final void BTf(File file, int i) {
        A01(3, file, i);
    }

    public final void BTi(File file) {
        A01(2, file, 0);
    }

    public static void A00(TraceContext traceContext, TreeMap treeMap) {
        for (String put : TriggerRegistry.A00.A03(traceContext.A01)) {
            treeMap.put("controller", put);
        }
        int i = traceContext.A01;
        if (i == C09600bg.A01 || i == C09570bd.A01 || i == C09590bf.A01) {
            treeMap.put("markerid", Long.toString(traceContext.A04 & 4294967295L));
        }
        AnonymousClass0GC r0 = traceContext.A06;
        if (r0 != null) {
            treeMap.put("config_id", Long.toString(r0.AIb()));
        }
    }

    public final void A01(short s, File file, int i) {
        String str;
        TreeMap treeMap = new TreeMap();
        treeMap.put("filename", file.getName());
        if (i == 1) {
            str = "request_failed";
        } else if (i == 2) {
            str = "no_connection";
        } else if (i != 3) {
            str = null;
        } else {
            str = "no_bytes_remaining";
        }
        if (str != null) {
            treeMap.put("reason", str);
        }
        this.A00.markerGenerateWithAnnotations(8126469, s, 0, treeMap);
    }

    public final void Axt() {
        this.A00.updateListenerMarkers();
    }

    public final void B9E() {
        C04850Gi r0 = C04850Gi.A07;
        if (r0 != null) {
            for (TraceContext traceContext : r0.A06()) {
                if (traceContext.A01 == C09590bf.A01) {
                    BSG(traceContext);
                }
            }
        }
    }

    public final void BSD(TraceContext traceContext) {
        short s;
        TreeMap treeMap = new TreeMap();
        A00(traceContext, treeMap);
        int i = traceContext.A00;
        int i2 = i & Integer.MAX_VALUE;
        boolean z = false;
        if ((i & Process.WAIT_RESULT_TIMEOUT) == Integer.MIN_VALUE) {
            z = true;
        }
        if (!z) {
            switch (i2) {
                case 1:
                    s = 51;
                    break;
                case 2:
                    return;
                case 3:
                    s = 112;
                    break;
                case 4:
                    s = 113;
                    break;
                case 5:
                    s = 111;
                    break;
                case 6:
                    s = 719;
                    break;
                default:
                    s = 2;
                    break;
            }
        } else {
            s = 509;
            treeMap.put("abort_reason", C04790Ga.A00(i2));
        }
        treeMap.put("trace_id", traceContext.A0A);
        this.A00.markerGenerateWithAnnotations(8126466, s, 0, treeMap);
    }

    public final void BSE(File file, long j) {
        TreeMap treeMap = new TreeMap();
        treeMap.put("trace_id", AnonymousClass0FO.A00(j));
        this.A00.markerGenerateWithAnnotations(8126465, 2, 0, treeMap);
    }

    public final void BSG(TraceContext traceContext) {
        TreeMap treeMap = new TreeMap();
        A00(traceContext, treeMap);
        treeMap.put("trace_id", traceContext.A0A);
        QuickPerformanceLogger quickPerformanceLogger = this.A00;
        int i = 8126523;
        if ((traceContext.A03 & 2) == 0) {
            i = 8126512;
        }
        quickPerformanceLogger.markerGenerateWithAnnotations(i, 2, 0, treeMap);
    }

    public final void BSI(TraceContext traceContext) {
        TreeMap treeMap = new TreeMap();
        A00(traceContext, treeMap);
        treeMap.put("trace_id", traceContext.A0A);
        this.A00.markerGenerateWithAnnotations(8126516, 2, 0, treeMap);
    }

    public C020200q(QuickPerformanceLogger quickPerformanceLogger) {
        this.A00 = quickPerformanceLogger;
    }
}
