package p000X;

import android.os.Handler;
import java.util.HashMap;

/* renamed from: X.D6G */
public abstract class D6G extends D6D {
    public Handler A00;
    public D3B A01;
    public final HashMap A02 = new HashMap();

    public void A08(Object obj, D6R d6r, C29742D7o d7o, Object obj2) {
        C29765D8s d8s;
        D69 d69 = (D69) this;
        if (d69.A02 == null) {
            if (d69.A00 == -1) {
                d69.A00 = d7o.A00();
            } else if (d7o.A00() != d69.A00) {
                d8s = new C29765D8s();
                d69.A02 = d8s;
            }
            d8s = null;
            d69.A02 = d8s;
        }
        if (d69.A02 == null) {
            d69.A05.remove(d6r);
            if (d6r == d69.A06[0]) {
                d69.A01 = d7o;
                d69.A03 = obj2;
            }
            if (d69.A05.isEmpty()) {
                d69.A05(d69.A01, d69.A03);
            }
        }
    }

    public void A06() {
        for (C29740D7g d7g : this.A02.values()) {
            d7g.A01.BaV(d7g.A00);
            d7g.A01.Baw(d7g.A02);
        }
        this.A02.clear();
        this.A01 = null;
    }

    public void A07(D3B d3b, boolean z) {
        this.A01 = d3b;
        this.A00 = new Handler();
    }

    public void Ap2() {
        for (C29740D7g d7g : this.A02.values()) {
            d7g.A01.Ap2();
        }
    }
}
