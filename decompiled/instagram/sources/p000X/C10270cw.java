package p000X;

import com.facebook.quicklog.EventBuilder;
import com.facebook.quicklog.PerformanceLoggingEvent;

/* renamed from: X.0cw  reason: invalid class name and case insensitive filesystem */
public final class C10270cw implements EventBuilder {
    public static final ThreadLocal A02 = new ThreadLocal();
    public AnonymousClass0ID A00;
    public AnonymousClass066 A01;

    public final void report() {
        AnonymousClass066 r7 = this.A01;
        AnonymousClass0ID r6 = this.A00;
        C10560dV r5 = r7.A0K.A03;
        int i = r6.A04;
        AnonymousClass0SM r4 = r5.A02;
        long j = 0;
        if (!(r4 == null || r5.A03 == null)) {
            j = r4.get(i, 0) | r5.A01;
        }
        if (j != 0 && r5.A03 != null) {
            long j2 = 1;
            int i2 = 0;
            while (true) {
                AnonymousClass0IG[] r8 = r5.A03;
                if (i2 >= r8.length) {
                    break;
                }
                if ((j & j2) != 0) {
                    r8[i2].onMarkEvent(r6);
                }
                i2++;
                j2 <<= 1;
            }
        }
        PerformanceLoggingEvent performanceLoggingEvent = new PerformanceLoggingEvent(r6);
        performanceLoggingEvent.A01 = r7.A04;
        performanceLoggingEvent.A03 = (C06160Nz) r7.A09.get();
        AnonymousClass0OL r0 = r7.A06;
        AnonymousClass0Z9.A03(r0.A00, new AnonymousClass0IL(r7, performanceLoggingEvent), -553723934);
        this.A00 = null;
        this.A01 = null;
        A02.set(this);
    }

    public final EventBuilder setLevel(int i) {
        this.A00.A01 = i;
        return this;
    }

    public final EventBuilder annotate(String str, double d) {
        this.A00.A06(str, d);
        return this;
    }

    public final EventBuilder annotate(String str, long j) {
        this.A00.A07(str, j);
        return this;
    }

    public final EventBuilder annotate(String str, String str2) {
        this.A00.A08(str, str2);
        return this;
    }
}
