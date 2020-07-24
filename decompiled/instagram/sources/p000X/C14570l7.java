package p000X;

import android.content.Context;
import java.io.File;

/* renamed from: X.0l7  reason: invalid class name and case insensitive filesystem */
public final class C14570l7 extends C14580l9 {
    public static C14570l7 A01;
    public Context A00;

    public static synchronized C14570l7 A00(Context context) {
        C14570l7 r0;
        synchronized (C14570l7.class) {
            if (A01 == null) {
                A01 = new C14570l7(context);
            }
            r0 = A01;
        }
        return r0;
    }

    public static void A01(C14570l7 r5, C209248zm r6, String str) {
        long j;
        File AUV = r6.AUV("main.jsbundle");
        if (AUV == null || !AUV.isFile()) {
            j = -1;
        } else {
            j = AUV.length();
        }
        if (j == -1) {
            C22450yR A05 = r5.A01.A05();
            A05.A07(str);
            A05.A04();
            return;
        }
        C22450yR A052 = r5.A01.A05();
        A052.A09(str, j);
        A052.A04();
    }

    public final int A04() {
        return this.A01.A03("next", 0);
    }

    public final int A05() {
        return this.A01.A03("activated", 0);
    }

    public final void A06() {
        C22450yR A05 = this.A01.A05();
        A05.A07("activated");
        A05.A07("activated_js_file_size");
        A05.A04();
    }

    public final void A07() {
        C22450yR A05 = this.A01.A05();
        A05.A07("next");
        A05.A07("next_js_file_size");
        A05.A04();
    }

    public final void A08() {
        C22450yR A05 = this.A01.A05();
        A05.A0B("download_fail_reported", true);
        A05.A04();
    }

    public C14570l7(Context context) {
        super(context);
        this.A00 = context.getApplicationContext();
    }

    public final int A03() {
        if (A05() == 0) {
            return A02();
        }
        return A05();
    }
}
