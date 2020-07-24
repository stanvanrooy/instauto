package p000X;

import com.facebook.profilo.core.TraceEvents;
import com.facebook.profilo.logger.Logger;
import com.facebook.systrace.Systrace;
import com.facebook.systrace.TraceDirect;

/* renamed from: X.0bi  reason: invalid class name and case insensitive filesystem */
public final class C09620bi implements C08760Yl {
    public final void AEb(long j, String str, C08740Yj r18) {
        if (Systrace.A08(j)) {
            C08740Yj r0 = r18;
            String[] strArr = r0.A01;
            int i = r0.A00;
            if (i == 0) {
                Logger.writeStandardEntry(C09680bp.A06, 6, 23, 0, 0, -1606012197, 0, 0);
            } else if (TraceEvents.isEnabled(C09680bp.A06)) {
                int i2 = C09680bp.A06;
                int writeStandardEntry = Logger.writeStandardEntry(i2, 7, 23, 0, 0, -1606012197, 0, 0);
                Logger.writeBytesEntry(i2, 1, 83, writeStandardEntry, str);
                for (int i3 = 1; i3 < i; i3 += 2) {
                    String str2 = strArr[i3 - 1];
                    String str3 = strArr[i3];
                    if (!(str2 == null || str3 == null)) {
                        Logger.writeBytesEntry(i2, 1, 57, Logger.writeBytesEntry(i2, 1, 56, writeStandardEntry, str2), str3);
                    }
                }
            }
            if (!TraceEvents.isEnabled(C09680bp.A06) && Systrace.A08(j)) {
                if (TraceDirect.checkNative()) {
                    TraceDirect.nativeEndSectionWithArgs(strArr, i);
                    return;
                }
                AnonymousClass0Yu r4 = new AnonymousClass0Yu('E');
                StringBuilder sb = r4.A00;
                sb.append('|');
                sb.append('|');
                r4.A04(strArr, i);
                C08820Yv.A00(r4.toString());
            }
        }
    }
}
