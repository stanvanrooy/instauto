package p000X;

import android.os.Handler;

/* renamed from: X.D39 */
public final class D39 {
    public int A00;
    public Handler A01;
    public Object A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final C29807DAr A06;
    public final C29742D7o A07;
    public final D4C A08;

    public final synchronized void A03(boolean z) {
        this.A03 = z | this.A03;
        this.A04 = true;
        notifyAll();
    }

    public final void A00() {
        D6U.A03(!this.A05);
        D6U.A02(true);
        this.A05 = true;
        this.A08.BfI(this);
    }

    public final void A01(int i) {
        D6U.A03(!this.A05);
        this.A00 = i;
    }

    public final void A02(Object obj) {
        D6U.A03(!this.A05);
        this.A02 = obj;
    }

    public D39(D4C d4c, C29807DAr dAr, C29742D7o d7o, Handler handler) {
        this.A08 = d4c;
        this.A06 = dAr;
        this.A07 = d7o;
        this.A01 = handler;
    }
}
