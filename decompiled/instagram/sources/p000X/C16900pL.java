package p000X;

import android.os.SystemClock;
import com.facebook.profilo.core.TraceEvents;
import com.facebook.profilo.logger.Logger;
import com.facebook.profilo.logger.api.ProfiloLogger;

/* renamed from: X.0pL  reason: invalid class name and case insensitive filesystem */
public final class C16900pL implements C14250k8 {
    public C16910pM A00 = new C16910pM();
    public final C14250k8 A01;

    public final C26211Cc startRequest(AnonymousClass1C4 r13, C256019m r14, AnonymousClass1CB r15) {
        int i;
        int i2;
        String str;
        AnonymousClass1CD r0 = new AnonymousClass1CD();
        r13.A06.put("enqueue_time", Long.valueOf(SystemClock.uptimeMillis()));
        long j = (long) r13.A00;
        if (ProfiloLogger.sHasProfilo) {
            i = Logger.writeStandardEntry(C09680bp.A05, 6, 5, 0, 0, 0, 0, j);
        } else {
            i = -1;
        }
        if (i != -1) {
            long j2 = (long) r13.A00;
            String str2 = r14.A08;
            if (!ProfiloLogger.sHasProfilo || !TraceEvents.isEnabled(C09680bp.A05)) {
                i2 = -1;
            } else {
                int writeStandardEntry = Logger.writeStandardEntry(C09680bp.A05, 7, 5, 0, 0, 0, i, j2);
                int i3 = C09680bp.A05;
                i2 = Logger.writeBytesEntry(i3, 1, 57, Logger.writeBytesEntry(i3, 1, 56, writeStandardEntry, "network_request_name"), str2);
            }
            int writeLigerMetadata = ProfiloLogger.writeLigerMetadata(ProfiloLogger.writeLigerMetadata(ProfiloLogger.writeLigerMetadata(ProfiloLogger.writeLigerMetadata(i2, "uri", r13.A04.toString()), "method", C36831ig.A00(r13.A03)), "requestType", r14.A05.name()), "behavior", C26191Ca.A00(r14.A00()));
            switch (r14.A07.intValue()) {
                case 1:
                    str = "SkipCache";
                    break;
                case 2:
                    str = "UseCache";
                    break;
                case 3:
                    str = "UseCacheWithTimeout";
                    break;
                default:
                    str = "Undefined";
                    break;
            }
            ProfiloLogger.writeLigerMetadata(ProfiloLogger.writeLigerMetadata(writeLigerMetadata, "cachePolicy", str), "sourceModule", r14.A09);
        }
        r15.A04(r0);
        if (r14.A05 == C15920nk.Video) {
            String uri = r13.A04.toString();
            AnonymousClass17R A002 = AnonymousClass17R.A00();
            int hashCode = uri.hashCode();
            boolean z = false;
            if (r14.A00() == Constants.A0C) {
                z = true;
            }
            AnonymousClass1GO r2 = new AnonymousClass1GO(A002, hashCode, uri, "VIDEO", z, (String) null, -1);
            if (C05630Li.A03(AnonymousClass1GQ.A00())) {
                C05700Lp.A00().ADc(r2);
            } else {
                AnonymousClass0ZA.A0E(A002.A02, r2, -5758729);
            }
            r15.A04(this.A00);
        }
        return this.A01.startRequest(r13, r14, r15);
    }

    public C16900pL(C14250k8 r2) {
        this.A01 = r2;
    }
}
