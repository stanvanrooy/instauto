package p000X;

import android.os.Looper;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0fx  reason: invalid class name and case insensitive filesystem */
public final class C11960fx {
    public C11980fz A00;
    public C11980fz A01;
    public C11980fz A02;
    public final AnonymousClass0Q7 A03;
    public final AnonymousClass0Q6 A04 = new C11970fy(this);
    public final C06180Ob A05;
    public final List A06 = new ArrayList();

    public static void A00(C11960fx r5) {
        while (true) {
            C11980fz r2 = r5.A00;
            C11980fz r1 = r5.A01;
            if (!r2.equals(r1)) {
                C11980fz r0 = r5.A02;
                C11980fz.A00(r0, r2);
                C11980fz.A00(r2, r1);
                if (r0.A00 != r2.A00) {
                    for (C6F A012 : r5.A06) {
                        A01(r5, A012);
                    }
                }
                if (r5.A00.A01 != -1) {
                    if (r5.A02.A01 == -1) {
                        Looper.myQueue().addIdleHandler(new C11990g0(r5));
                    }
                    C11980fz r12 = r5.A00;
                    if (r12.A04) {
                        if (r12.A00 != 0) {
                            r5.A01.A00 = 0;
                        }
                    } else if (r12.A00 == 0) {
                        C11980fz r22 = r5.A01;
                        int i = 1;
                        if (r5.A02.A03) {
                            i = 2;
                        }
                        r22.A00 = i;
                    }
                }
            } else {
                return;
            }
        }
    }

    public static void A01(C11960fx r4, C6F c6f) {
        long j;
        C11980fz r1 = r4.A00;
        int i = r1.A00;
        if (i == 0) {
            j = -1;
        } else if (i == 1) {
            j = r1.A01;
        } else if (i == 2) {
            j = r1.A02;
        } else {
            throw new IllegalStateException(AnonymousClass000.A05("Startup type not supported: ", i));
        }
        C6D c6d = c6f.A00;
        C6E c6e = c6d.A01;
        c6e.A00 = i;
        c6e.A06 = j;
        C6D.A01(c6d);
    }

    public C11960fx(C06180Ob r3, AnonymousClass0Q7 r4) {
        this.A05 = r3;
        this.A03 = r4;
        C11980fz r1 = new C11980fz();
        this.A00 = r1;
        this.A02 = new C11980fz(r1);
        this.A01 = new C11980fz(r1);
    }
}
