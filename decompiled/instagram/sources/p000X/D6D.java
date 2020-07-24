package p000X;

import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.D6D */
public abstract class D6D implements D6R {
    public D3B A00;
    public C29742D7o A01;
    public Object A02;
    public final D6I A03 = new D6I(new CopyOnWriteArrayList(), 0, (C29791DAa) null, 0);
    public final ArrayList A04 = new ArrayList(1);

    public abstract void A06();

    public abstract void A07(D3B d3b, boolean z);

    public final D6I A04(C29791DAa dAa) {
        return new D6I(this.A03.A02, 0, dAa, 0);
    }

    public final void A05(C29742D7o d7o, Object obj) {
        this.A01 = d7o;
        this.A02 = obj;
        Iterator it = this.A04.iterator();
        while (it.hasNext()) {
            ((C29764D8r) it.next()).BO5(this, d7o, obj);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0005, code lost:
        if (r4 == null) goto L_0x0007;
     */
    public final void A32(Handler handler, C29724D6l d6l) {
        boolean z;
        D6I d6i = this.A03;
        if (handler != null) {
            z = true;
        }
        z = false;
        D6U.A02(z);
        d6i.A02.add(new D8L(handler, d6l));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0005, code lost:
        if (r1 == r3) goto L_0x0007;
     */
    public final void BY7(D3B d3b, boolean z, C29764D8r d8r) {
        boolean z2;
        D3B d3b2 = this.A00;
        if (d3b2 != null) {
            z2 = false;
        }
        z2 = true;
        D6U.A02(z2);
        this.A04.add(d8r);
        if (this.A00 == null) {
            this.A00 = d3b;
            A07(d3b, z);
            return;
        }
        C29742D7o d7o = this.A01;
        if (d7o != null) {
            d8r.BO5(this, d7o, this.A02);
        }
    }

    public final void BaV(C29764D8r d8r) {
        this.A04.remove(d8r);
        if (this.A04.isEmpty()) {
            this.A00 = null;
            this.A01 = null;
            this.A02 = null;
            A06();
        }
    }

    public final void Baw(C29724D6l d6l) {
        D6I d6i = this.A03;
        Iterator it = d6i.A02.iterator();
        while (it.hasNext()) {
            D8L d8l = (D8L) it.next();
            if (d8l.A01 == d6l) {
                d6i.A02.remove(d8l);
            }
        }
    }
}
