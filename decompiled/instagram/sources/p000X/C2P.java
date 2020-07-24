package p000X;

import java.io.Serializable;

/* renamed from: X.C2P */
public abstract class C2P implements Serializable {
    public C27168Bzg A00(Object obj) {
        if (!(this instanceof C1K)) {
            C25 c25 = (C25) this;
            return new C27168Bzg(c25.getClass(), c25.A00, obj);
        }
        C1K c1k = (C1K) this;
        return new C27168Bzg(c1k.getClass(), c1k.A00, obj);
    }

    public C2P A01(Class cls) {
        if (!(this instanceof C1K)) {
            C25 c25 = (C25) this;
            return cls != c25.A00 ? new C25(cls) : c25;
        }
        C1K c1k = (C1K) this;
        return cls == c1k.A00 ? c1k : new C1K(cls, c1k.A00);
    }

    public Class A02() {
        return ((C27215C2j) this).A00;
    }

    public abstract Object A03(Object obj);

    public boolean A04(C2P c2p) {
        C27215C2j c2j = (C27215C2j) this;
        if (!(c2j instanceof C1K)) {
            return c2p.getClass() == c2j.getClass() && c2p.A02() == c2j.A00;
        }
        C1K c1k = (C1K) c2j;
        if (c2p.getClass() != c1k.getClass()) {
            return false;
        }
        C1K c1k2 = (C1K) c2p;
        return c1k2.A02() == c1k.A00 && c1k2.A00 == c1k.A00;
    }
}
