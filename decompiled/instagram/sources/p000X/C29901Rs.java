package p000X;

import android.os.Handler;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.1Rs  reason: invalid class name and case insensitive filesystem */
public final class C29901Rs implements AnonymousClass1E8 {
    public static final AnonymousClass1EA A07 = AnonymousClass1EA.A00(6.0d, 8.0d);
    public static final AnonymousClass1EA A08 = AnonymousClass1EA.A00(6.0d, 9.0d);
    public static final AnonymousClass1EA A09 = AnonymousClass1EA.A01(60.0d, 5.0d);
    public int A00 = -1;
    public C29891Rr A01;
    public WeakReference A02;
    public final AnonymousClass1EG A03;
    public final CopyOnWriteArraySet A04 = new CopyOnWriteArraySet();
    public final Handler A05;
    public final AnonymousClass1EG A06;

    public final void BOF(AnonymousClass1EG r1) {
    }

    public final void BOI(AnonymousClass1EG r1) {
    }

    public final void A00() {
        AnonymousClass1EG r3 = this.A06;
        r3.A06(A09);
        r3.A05(0.0d, true);
        r3.A03(1.0d);
    }

    public final void A01(WeakReference weakReference) {
        this.A02 = weakReference;
        AnonymousClass1EG r1 = this.A06;
        if (!r1.A09()) {
            BOK(r1);
        }
    }

    public final void BOH(AnonymousClass1EG r6) {
        AnonymousClass1EG r2 = this.A03;
        if (r6 == r2 && r2.A05 == A08 && r2.A0B(1.0d)) {
            AnonymousClass0ZA.A09(this.A05, new C163516yI(this), 300, -1030836697);
        } else if (r6 == r2 && r2.A05 == A07 && r2.A0B(0.0d)) {
            Iterator it = this.A04.iterator();
            while (it.hasNext()) {
                ((AnonymousClass1D7) it.next()).BEf(this.A00);
            }
            this.A00 = -1;
        }
    }

    public final void BOK(AnonymousClass1EG r6) {
        C29891Rr r1;
        AnonymousClass1EA r0;
        WeakReference weakReference;
        AnonymousClass1EA r4 = r6.A05;
        float A002 = (float) r6.A00();
        boolean z = true;
        if (r6 == this.A06 && (weakReference = this.A02) != null) {
            r1 = (C29891Rr) weakReference.get();
            if (r1 != null) {
                r0 = A09;
            } else {
                return;
            }
        } else if (r6 == this.A03 && (r1 = this.A01) != null) {
            r0 = A08;
        } else {
            return;
        }
        if (r4 != r0) {
            z = false;
        }
        r1.Art(A002, z);
    }

    public C29901Rs() {
        AnonymousClass1EB A002 = AnonymousClass0P2.A00();
        AnonymousClass1EG A003 = A002.A00();
        A003.A07(this);
        this.A06 = A003;
        AnonymousClass1EG A004 = A002.A00();
        A004.A07(this);
        this.A03 = A004;
        this.A05 = new Handler();
    }
}
