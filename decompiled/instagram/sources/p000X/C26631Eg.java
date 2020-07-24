package p000X;

import android.content.Context;
import java.io.File;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1Eg  reason: invalid class name and case insensitive filesystem */
public final class C26631Eg {
    public C26651Ei A00;
    public Context A01;
    public C15220mX A02;
    public C05450Ko A03;
    public String A04;

    public static synchronized C15220mX A00(C26631Eg r4) {
        C15220mX r0;
        synchronized (r4) {
            if (r4.A02 == null) {
                C15210mW r3 = new C15210mW();
                File A012 = C15020mC.A01(r4.A01, r4.A04, false);
                if (A012 != null) {
                    r3.A03 = A012;
                }
                r3.A01 = 5242880;
                AnonymousClass0O1 A002 = AnonymousClass0O1.A00();
                A002.A01 = C26631Eg.class.getName();
                r3.A02 = A002.A01();
                r4.A02 = r3.A00();
            }
            r0 = r4.A02;
        }
        return r0;
    }

    public final Object A01(String str, boolean z) {
        if (!z) {
            C12670hC.A01();
        }
        AnonymousClass1Es r4 = new AnonymousClass1Es(this);
        this.A03.ADc(new AnonymousClass1Ev(this, str, r4));
        try {
            r4.A01.await(500, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
        }
        return r4.A00;
    }

    public final void A03(String str) {
        this.A03.ADc(new C26741Fb(this, str));
    }

    public final void A04(String str, AnonymousClass1Et r4) {
        this.A03.ADc(new AnonymousClass1Ev(this, str, r4));
    }

    public final void A05(String str, Object obj) {
        this.A03.ADc(new AnonymousClass2LJ(this, str, obj, new AnonymousClass2LK(this)));
    }

    public final void A07(String str, Object obj, AnonymousClass2LL r5) {
        this.A03.ADc(new AnonymousClass2LJ(this, str, obj, r5));
    }

    public C26631Eg(Context context, String str, C26651Ei r5) {
        this.A01 = context;
        this.A00 = r5;
        this.A04 = str;
        AnonymousClass0O1 A002 = AnonymousClass0O1.A00();
        A002.A01 = this.A04;
        this.A03 = A002.A01();
    }

    public final void A06(String str, Object obj) {
        C12670hC.A01();
        new AnonymousClass2LJ(this, str, obj, new AnonymousClass2LK(this)).run();
    }

    public final void A02(String str) {
        A03(str);
    }
}
