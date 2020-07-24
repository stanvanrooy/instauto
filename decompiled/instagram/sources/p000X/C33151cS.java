package p000X;

import android.os.SystemClock;

/* renamed from: X.1cS  reason: invalid class name and case insensitive filesystem */
public final class C33151cS extends C33161cT implements Runnable {
    public final /* synthetic */ AnonymousClass1N1 A00;

    public C33151cS(AnonymousClass1N1 r1) {
        this.A00 = r1;
    }

    public final Object A00() {
        try {
            return this.A00.A08();
        } catch (C45481xx e) {
            if (this.A01.get()) {
                return null;
            }
            throw e;
        }
    }

    public final void A01(Object obj) {
        this.A00.A0A(this, obj);
    }

    public final void A02(Object obj) {
        AnonymousClass1N1 r1 = this.A00;
        if (r1.A01 != this) {
            r1.A0A(this, obj);
        } else if (r1.A02) {
            r1.A0B(obj);
        } else {
            r1.A04 = false;
            SystemClock.uptimeMillis();
            r1.A01 = null;
            r1.A05(obj);
        }
    }

    public final void run() {
        this.A00.A09();
    }
}
