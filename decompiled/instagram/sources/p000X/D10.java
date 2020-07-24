package p000X;

import android.os.Trace;

/* renamed from: X.D10 */
public final class D10 {
    public static void A00() {
        if (BV2.A00 >= 18) {
            Trace.endSection();
        }
    }

    public static void A01(String str) {
        if (BV2.A00 >= 18) {
            Trace.beginSection(str);
        }
    }
}
