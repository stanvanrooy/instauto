package p000X;

import java.util.Iterator;

/* renamed from: X.DRM */
public final class DRM extends DRO {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public final C27841Jk A03;
    public final Iterator A04;
    public volatile boolean A05;

    public final int BdM(int i) {
        if ((i & 1) == 0) {
            return 0;
        }
        this.A02 = true;
        return 1;
    }

    public final void clear() {
        this.A01 = true;
    }

    public final void dispose() {
        this.A05 = true;
    }

    public final Object poll() {
        if (this.A01) {
            return null;
        }
        if (!this.A00) {
            this.A00 = true;
        } else if (!this.A04.hasNext()) {
            this.A01 = true;
            return null;
        }
        Object next = this.A04.next();
        AnonymousClass1J6.A01(next, "The iterator returned a null value");
        return next;
    }

    public DRM(C27841Jk r1, Iterator it) {
        this.A03 = r1;
        this.A04 = it;
    }

    public final boolean isEmpty() {
        return this.A01;
    }
}
