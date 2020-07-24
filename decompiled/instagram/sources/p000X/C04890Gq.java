package p000X;

import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.core.TraceEvents;

/* renamed from: X.0Gq  reason: invalid class name and case insensitive filesystem */
public final class C04890Gq {
    public static volatile boolean A00;

    public static boolean A00() {
        C04850Gi r0;
        if (!A00 || (r0 = C04850Gi.A07) == null) {
            return false;
        }
        int i = r0.A01.get() & 65534;
        boolean z = false;
        if (i != 0) {
            z = true;
        }
        if (!z || !TraceEvents.isEnabled(ProvidersRegistry.A00.A01("frames"))) {
            return false;
        }
        return true;
    }

    public static boolean A01(int i) {
        C04850Gi r0;
        if (!A00 || (r0 = C04850Gi.A07) == null) {
            return false;
        }
        String A05 = r0.A05(i);
        boolean z = false;
        if (A05 != null) {
            z = true;
        }
        if (z) {
            return true;
        }
        return false;
    }
}
