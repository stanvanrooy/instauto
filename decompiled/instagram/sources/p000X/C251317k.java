package p000X;

import com.facebook.quicklog.EventBuilder;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* renamed from: X.17k  reason: invalid class name and case insensitive filesystem */
public final class C251317k implements C251417l {
    public static final Random A04 = new Random();
    public ArrayList A00 = new ArrayList();
    public HashSet A01 = new HashSet();
    public HashSet A02 = new HashSet();
    public final QuickPerformanceLogger A03;

    public final void A2q(C251117i r12, Map map, List list) {
        EventBuilder markEventBuilder = this.A03.markEventBuilder(21364745, "periodic_info");
        AnonymousClass417 r5 = null;
        for (Map.Entry entry : map.entrySet()) {
            markEventBuilder.annotate((String) entry.getKey(), (String) entry.getValue());
            if ("asl_endpoint".equals(entry.getKey())) {
                entry.getValue();
                r5 = new AnonymousClass417(this, map, list);
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C181927pj r3 = (C181927pj) it.next();
            C181917pi r7 = r3.A02;
            markEventBuilder.annotate(r7.A00(), Long.toString(r3.A00));
            long j = r3.A01;
            if (j != -1) {
                markEventBuilder.annotate(r7.A01(), Long.toString(j));
            }
            if (r5 == null || r7 == C181917pi.A0E) {
            }
        }
        markEventBuilder.report();
    }

    public final void B2s(C935242t r4) {
        if (r4.A00 == Constants.ZERO) {
            this.A03.markEventBuilder(21364746, "trim").annotate("trim_type", r4.A01).report();
        }
    }

    public C251317k(QuickPerformanceLogger quickPerformanceLogger) {
        this.A03 = quickPerformanceLogger;
    }
}
