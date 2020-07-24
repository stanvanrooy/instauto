package p000X;

import java.util.NoSuchElementException;

/* renamed from: X.12o  reason: invalid class name and case insensitive filesystem */
public abstract class C239312o extends C239412p {
    public int A00;
    public final int A01;

    public abstract Object A00(int i);

    public final boolean hasNext() {
        if (this.A00 < this.A01) {
            return true;
        }
        return false;
    }

    public final boolean hasPrevious() {
        if (this.A00 > 0) {
            return true;
        }
        return false;
    }

    public final int nextIndex() {
        return this.A00;
    }

    public final int previousIndex() {
        return this.A00 - 1;
    }

    public C239312o(int i, int i2) {
        AnonymousClass0a4.A04(i2, i);
        this.A01 = i;
        this.A00 = i2;
    }

    public final Object next() {
        if (hasNext()) {
            int i = this.A00;
            this.A00 = i + 1;
            return A00(i);
        }
        throw new NoSuchElementException();
    }

    public final Object previous() {
        if (hasPrevious()) {
            int i = this.A00 - 1;
            this.A00 = i;
            return A00(i);
        }
        throw new NoSuchElementException();
    }
}
