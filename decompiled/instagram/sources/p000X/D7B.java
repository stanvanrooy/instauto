package p000X;

import android.os.Handler;
import android.view.Surface;

/* renamed from: X.D7B */
public final class D7B {
    public final Handler A00;
    public final C29752D7z A01;

    public final void A02(C29730D6u d6u) {
        synchronized (d6u) {
        }
        Handler handler = this.A00;
        if (handler != null) {
            AnonymousClass0ZA.A0E(handler, new D8E(this, d6u), 1543863534);
        }
    }

    public final void A00(int i, int i2, int i3, float f) {
        Handler handler = this.A00;
        if (handler != null) {
            AnonymousClass0ZA.A0E(handler, new D81(this, i, i2, i3, f), -1553791311);
        }
    }

    public final void A01(Surface surface) {
        Handler handler = this.A00;
        if (handler != null) {
            AnonymousClass0ZA.A0E(handler, new D80(this, surface), -1647395750);
        }
    }

    public D7B(Handler handler, C29752D7z d7z) {
        if (d7z != null) {
            D6U.A01(handler);
        } else {
            handler = null;
        }
        this.A00 = handler;
        this.A01 = d7z;
    }
}
