package p000X;

import com.facebook.quicklog.PerformanceLoggingEvent;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.0do  reason: invalid class name and case insensitive filesystem */
public final class C10750do implements C05060Hw {
    public final /* synthetic */ PerformanceLoggingEvent A00;
    public final /* synthetic */ C10780dr A01;
    public final /* synthetic */ String A02;

    public C10750do(C10780dr r1, PerformanceLoggingEvent performanceLoggingEvent, String str) {
        this.A01 = r1;
        this.A00 = performanceLoggingEvent;
        this.A02 = str;
    }

    public final void Btm(long j, long j2, int i, String str, AnonymousClass0I7 r21, AnonymousClass0SN r22) {
        String r1;
        AnonymousClass0ID r2 = this.A00.A02;
        int i2 = r2.A04;
        String A0J = AnonymousClass000.A0J(this.A02, ":", str);
        long j3 = r2.A0G + j;
        int i3 = (int) j;
        Map emptyMap = Collections.emptyMap();
        String[] strArr = new String[2];
        strArr[0] = "markerPointData";
        if (r21 == null) {
            r1 = null;
        } else {
            r1 = r21.toString();
        }
        strArr[1] = r1;
        AnonymousClass0SK r4 = new AnonymousClass0SK(i2, A0J, "", j3, i3, emptyMap, Arrays.asList(strArr), Collections.emptyList());
        synchronized (this.A01.A05) {
            this.A01.A05.add(r4);
        }
    }
}
