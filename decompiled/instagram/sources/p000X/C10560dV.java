package p000X;

import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.debug.tracer.Tracer;
import com.facebook.profilo.core.TraceEvents;

/* renamed from: X.0dV  reason: invalid class name and case insensitive filesystem */
public final class C10560dV extends C05010Hm {
    public boolean A00;
    public final C04150Cq A01;
    public final AnonymousClass0SI A02;

    public static void A00(C10560dV r12, AnonymousClass0ID r13, int i) {
        long A012 = r12.A01(r13.A04, r13.A02);
        long j = 0;
        if (A012 != 0 && r12.A03 != null) {
            long j2 = 1;
            int i2 = 0;
            boolean z = false;
            if (r12.A00) {
                z = true;
            }
            while (true) {
                AnonymousClass0IG[] r4 = r12.A03;
                if (i2 < r4.length) {
                    if ((A012 & j2) != j) {
                        if (z) {
                            try {
                                String name = r4[i2].getClass().getName();
                                Integer valueOf = Integer.valueOf(r13.A04);
                                Integer valueOf2 = Integer.valueOf(i);
                                if (!TraceEvents.isEnabled(C09680bp.A06)) {
                                    Tracer.A00("QuickEventListenersList::notify [%s %d %d]", 3, name, valueOf, valueOf2);
                                } else {
                                    AnonymousClass0ZN.A02(StringFormatUtil.formatStrLocaleSafe("QuickEventListenersList::notify [%s %d %d]", name, valueOf, valueOf2), -2133951513);
                                }
                            } catch (Throwable th) {
                                if (z) {
                                    AnonymousClass0ZN.A00(-1037984516);
                                }
                                throw th;
                            }
                        }
                        r13.A06 = i2;
                        if (i == 1) {
                            r12.A03[i2].onMarkerStart(r13);
                        } else if (i == 2) {
                            r12.A03[i2].onMarkerStop(r13);
                        } else if (i == 3) {
                            r12.A03[i2].onMarkerRestart(r13);
                        } else if (i == 4) {
                            r12.A03[i2].onMarkerCancel(r13);
                        } else {
                            throw new IllegalArgumentException(AnonymousClass000.A05("Unknown listenerMethod: ", i));
                        }
                        if (z) {
                            AnonymousClass0ZN.A00(-1670938798);
                        }
                    }
                    i2++;
                    j2 <<= 1;
                    j = 0;
                } else {
                    return;
                }
            }
        }
    }

    public C10560dV(AnonymousClass0IG[] r2, C10200cp r3, C04150Cq r4, AnonymousClass0SI r5, C10910e4 r6) {
        super(r2, r6);
        this.A01 = r4;
        this.A02 = r5;
        if (r3 != null) {
            this.A00 = false;
        } else {
            this.A00 = true;
        }
    }

    public final int A02(AnonymousClass0IG r2) {
        AnonymousClass0IE listenerFlags = r2.getListenerFlags();
        if (listenerFlags == null) {
            return 0;
        }
        return listenerFlags.A00;
    }

    public final int[] A03(AnonymousClass0IG r2) {
        AnonymousClass0IF listenerMarkers = r2.getListenerMarkers();
        if (listenerMarkers == null) {
            return null;
        }
        return listenerMarkers.A00;
    }
}
