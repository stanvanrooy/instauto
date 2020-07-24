package p000X;

import com.facebook.profilo.core.TraceEvents;
import com.facebook.profilo.logger.Logger;
import com.facebook.systrace.Systrace;
import com.facebook.systrace.TraceDirect;

/* renamed from: X.0bt  reason: invalid class name and case insensitive filesystem */
public final class C09720bt implements C08760Yl {
    public final void AEb(long j, String str, C08740Yj r19) {
        if (Systrace.A08(j)) {
            C08740Yj r0 = r19;
            String[] strArr = r0.A01;
            int i = r0.A00;
            String str2 = str;
            if (TraceEvents.isEnabled(C09680bp.A06)) {
                int i2 = C09680bp.A06;
                int writeStandardEntry = Logger.writeStandardEntry(i2, 7, 22, 0, 0, -1591418627, 0, 0);
                Logger.writeBytesEntry(i2, 1, 83, writeStandardEntry, str2);
                for (int i3 = 1; i3 < i; i3 += 2) {
                    String str3 = strArr[i3 - 1];
                    String str4 = strArr[i3];
                    if (!(str3 == null || str4 == null)) {
                        int i4 = C09680bp.A06;
                        Logger.writeBytesEntry(i4, 1, 57, Logger.writeBytesEntry(i4, 1, 56, writeStandardEntry, str3), str4);
                    }
                }
            } else if (!Systrace.A08(j)) {
            } else {
                if (TraceDirect.checkNative()) {
                    TraceDirect.nativeBeginSectionWithArgs(str2, strArr, i);
                    return;
                }
                AnonymousClass0Yu r02 = new AnonymousClass0Yu('B');
                r02.A00();
                r02.A03(str2);
                r02.A04(strArr, i);
                C08820Yv.A00(r02.toString());
            }
        }
    }
}
