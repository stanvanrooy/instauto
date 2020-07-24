package p000X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.C29 */
public final class C29 implements Iterator {
    public int A00;
    public C27210C2b A01;
    public final C27210C2b[] A02;

    public final boolean hasNext() {
        if (this.A01 != null) {
            return true;
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        C27210C2b c2b = this.A01;
        if (c2b != null) {
            C27210C2b c2b2 = c2b.A02;
            while (c2b2 == null) {
                int i = this.A00;
                C27210C2b[] c2bArr = this.A02;
                if (i >= c2bArr.length) {
                    break;
                }
                this.A00 = i + 1;
                c2b2 = c2bArr[i];
            }
            this.A01 = c2b2;
            return c2b.A01;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public C29(C27210C2b[] c2bArr) {
        this.A02 = c2bArr;
        int length = c2bArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            int i2 = i + 1;
            C27210C2b c2b = c2bArr[i];
            if (c2b != null) {
                this.A01 = c2b;
                i = i2;
                break;
            }
            i = i2;
        }
        this.A00 = i;
    }
}
