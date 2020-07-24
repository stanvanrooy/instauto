package p000X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.AIC */
public final class AIC implements Iterator {
    public int A00 = -1;
    public boolean A01;
    public final /* synthetic */ C11710fQ A02;

    public AIC(C11710fQ r2) {
        this.A02 = r2;
    }

    public final boolean hasNext() {
        if (this.A00 + 1 >= this.A02.size()) {
            return false;
        }
        return true;
    }

    public final void remove() {
        if (!this.A01) {
            this.A02.A00.A07(this.A00);
            this.A01 = true;
            this.A00--;
            return;
        }
        throw new IllegalStateException();
    }

    public final Object next() {
        if (hasNext()) {
            this.A01 = false;
            int i = this.A00 + 1;
            this.A00 = i;
            return this.A02.A00.A06(i);
        }
        throw new NoSuchElementException();
    }
}
