package p000X;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.DM4 */
public abstract class DM4 implements Iterator {
    public int A00;
    public DM1 A01 = null;
    public DM1 A02;
    public final /* synthetic */ DM0 A03;

    public DM4(DM0 dm0) {
        this.A03 = dm0;
        this.A02 = dm0.A06.A01;
        this.A00 = dm0.A01;
    }

    public final DM1 A00() {
        DM1 dm1 = this.A02;
        DM0 dm0 = this.A03;
        if (dm1 == dm0.A06) {
            throw new NoSuchElementException();
        } else if (dm0.A01 == this.A00) {
            this.A02 = dm1.A01;
            this.A01 = dm1;
            return dm1;
        } else {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean hasNext() {
        if (this.A02 != this.A03.A06) {
            return true;
        }
        return false;
    }

    public final void remove() {
        DM1 dm1 = this.A01;
        if (dm1 != null) {
            DM0 dm0 = this.A03;
            dm0.A06(dm1, true);
            this.A01 = null;
            this.A00 = dm0.A01;
            return;
        }
        throw new IllegalStateException();
    }
}
