package p000X;

import com.facebook.common.util.TriState;
import com.facebook.quicklog.EventBuilder;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0gz  reason: invalid class name and case insensitive filesystem */
public final class C12580gz implements AnonymousClass0gN {
    public final C10550dU A00;
    public final QuickPerformanceLogger A01;

    public static int A00(int i) {
        switch (i) {
            case 1:
                return 27328525;
            case 5:
                return 27328516;
            case 10:
                return 27328518;
            case 15:
                return 27328517;
            case 20:
                return 27328524;
            case 25:
                return 27328519;
            case 30:
                return 27328522;
            case 35:
                return 27328520;
            case 40:
                return 27328526;
            case 45:
                return 27328527;
            case AMD.MAX_LIKES_PER_FETCH /*50*/:
                return 27328528;
            default:
                return 27328523;
        }
    }

    public C12580gz(QuickPerformanceLogger quickPerformanceLogger, C10550dU r2) {
        this.A01 = quickPerformanceLogger;
        this.A00 = r2;
    }

    public final void AlA(AnonymousClass29A r14) {
        Map emptyMap;
        Map emptyMap2;
        Map emptyMap3;
        Map emptyMap4;
        Map emptyMap5;
        Map emptyMap6;
        Map emptyMap7;
        Map emptyMap8;
        r14.toString();
        if (r14.A0A) {
            EventBuilder level = this.A01.markEventBuilder(A00(r14.A05), r14.A03).setLevel(7);
            C45121xK r0 = r14.A09;
            if (r0 != null) {
                emptyMap6 = r0.A02;
            } else {
                emptyMap6 = Collections.emptyMap();
            }
            for (Map.Entry entry : emptyMap6.entrySet()) {
                if (entry.getValue() != null) {
                    level.annotate((String) entry.getKey(), (String) entry.getValue());
                }
            }
            C45121xK r02 = r14.A09;
            if (r02 != null) {
                emptyMap7 = r02.A01;
            } else {
                emptyMap7 = Collections.emptyMap();
            }
            for (Map.Entry entry2 : emptyMap7.entrySet()) {
                if (entry2.getValue() != null) {
                    level.annotate((String) entry2.getKey(), ((Long) entry2.getValue()).longValue());
                }
            }
            C45121xK r03 = r14.A09;
            if (r03 != null) {
                emptyMap8 = r03.A00;
            } else {
                emptyMap8 = Collections.emptyMap();
            }
            for (Map.Entry entry3 : emptyMap8.entrySet()) {
                if (entry3.getValue() != null) {
                    level.annotate((String) entry3.getKey(), ((Double) entry3.getValue()).doubleValue());
                }
            }
            level.report();
            return;
        }
        int A002 = A00(r14.A05);
        if (this.A00 != null) {
            C45121xK r04 = r14.A09;
            if (r04 != null) {
                emptyMap4 = r04.A01;
            } else {
                emptyMap4 = Collections.emptyMap();
            }
            Long l = (Long) emptyMap4.get("trigger_source_id");
            if (l != null) {
                r14.A02("trigger_source_name", AnonymousClass0KW.A00(l.intValue()));
            }
            if (r14.A05 == 40) {
                C45121xK r05 = r14.A09;
                if (r05 != null) {
                    emptyMap5 = r05.A01;
                } else {
                    emptyMap5 = Collections.emptyMap();
                }
                Long l2 = (Long) emptyMap5.get("overlapping_id");
                if (l2 != null) {
                    r14.A02("overlapping_name", AnonymousClass0KW.A00(l2.intValue()));
                }
            }
        }
        this.A01.markerStart(A002, r14.A06, r14.A08, TimeUnit.NANOSECONDS);
        AnonymousClass0Hz withMarker = this.A01.withMarker(A002, r14.A06);
        C45121xK r06 = r14.A09;
        if (r06 != null) {
            emptyMap = r06.A02;
        } else {
            emptyMap = Collections.emptyMap();
        }
        for (Map.Entry entry4 : emptyMap.entrySet()) {
            if (entry4.getValue() != null) {
                withMarker.A06((String) entry4.getKey(), (String) entry4.getValue());
            }
        }
        C45121xK r07 = r14.A09;
        if (r07 != null) {
            emptyMap2 = r07.A01;
        } else {
            emptyMap2 = Collections.emptyMap();
        }
        for (Map.Entry entry5 : emptyMap2.entrySet()) {
            if (entry5.getValue() != null) {
                withMarker.A05((String) entry5.getKey(), ((Long) entry5.getValue()).longValue());
            }
        }
        C45121xK r08 = r14.A09;
        if (r08 != null) {
            emptyMap3 = r08.A00;
        } else {
            emptyMap3 = Collections.emptyMap();
        }
        for (Map.Entry entry6 : emptyMap3.entrySet()) {
            if (entry6.getValue() != null) {
                withMarker.A03((String) entry6.getKey(), ((Double) entry6.getValue()).doubleValue());
            }
        }
        withMarker.A05("duration_microseconds", (r14.A02 - r14.A08) / 1000);
        withMarker.Aoj();
        this.A01.markerEnd(A002, r14.A06, (short) r14.A00, r14.A02, TimeUnit.NANOSECONDS, TriState.NO);
    }
}
