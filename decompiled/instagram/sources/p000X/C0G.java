package p000X;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.C0G */
public final class C0G implements Iterable, Serializable {
    public int A00 = 0;
    public final int A01;
    public final C27210C2b[] A02;
    public final int A03;

    public final C0G A01(C27176Bzt bzt) {
        C27210C2b[] c2bArr = this.A02;
        int length = c2bArr.length;
        C27210C2b[] c2bArr2 = new C27210C2b[length];
        System.arraycopy(c2bArr, 0, c2bArr2, 0, length);
        String str = bzt.A07;
        if (A00(str) == null) {
            int hashCode = str.hashCode() & this.A03;
            C27210C2b c2b = c2bArr2[hashCode];
            int i = this.A00;
            int i2 = i + 1;
            this.A00 = i2;
            c2bArr2[hashCode] = new C27210C2b(c2b, str, bzt, i);
            return new C0G(c2bArr2, this.A01 + 1, i2);
        }
        C0G c0g = new C0G(c2bArr2, length, this.A00);
        c0g.A03(bzt);
        return c0g;
    }

    public final void A02() {
        int i = 0;
        for (C27210C2b c2b : this.A02) {
            while (c2b != null) {
                C27176Bzt bzt = c2b.A01;
                int i2 = i + 1;
                int i3 = bzt.A00;
                if (i3 == -1) {
                    bzt.A00 = i;
                    c2b = c2b.A02;
                    i = i2;
                } else {
                    throw new IllegalStateException("Property '" + bzt.A07 + "' already had index (" + i3 + "), trying to assign " + i);
                }
            }
        }
    }

    public final void A03(C27176Bzt bzt) {
        String str = bzt.A07;
        int hashCode = str.hashCode();
        C27210C2b[] c2bArr = this.A02;
        int length = hashCode & (c2bArr.length - 1);
        C27210C2b c2b = null;
        int i = -1;
        for (C27210C2b c2b2 = c2bArr[length]; c2b2 != null; c2b2 = c2b2.A02) {
            if (i >= 0 || !c2b2.A03.equals(str)) {
                c2b = new C27210C2b(c2b, c2b2.A03, c2b2.A01, c2b2.A00);
            } else {
                i = c2b2.A00;
            }
        }
        if (i >= 0) {
            c2bArr[length] = new C27210C2b(c2b, str, bzt, i);
            return;
        }
        throw new NoSuchElementException("No entry '" + bzt + "' found, can't replace");
    }

    public final C27176Bzt[] A04() {
        C27176Bzt[] bztArr = new C27176Bzt[this.A00];
        for (C27210C2b c2b : this.A02) {
            while (c2b != null) {
                bztArr[c2b.A00] = c2b.A01;
                c2b = c2b.A02;
            }
        }
        return bztArr;
    }

    public final Iterator iterator() {
        return new C29(this.A02);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Properties=[");
        int i = 0;
        for (C27176Bzt bzt : A04()) {
            if (bzt != null) {
                int i2 = i + 1;
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(bzt.A07);
                sb.append('(');
                sb.append(bzt.AZA());
                sb.append(')');
                i = i2;
            }
        }
        sb.append(']');
        return sb.toString();
    }

    public final C27176Bzt A00(String str) {
        C27210C2b c2b = this.A02[str.hashCode() & this.A03];
        if (c2b == null) {
            return null;
        }
        while (c2b.A03 != str) {
            c2b = c2b.A02;
            if (c2b == null) {
                for (C27210C2b c2b2 = c2b; c2b2 != null; c2b2 = c2b2.A02) {
                    if (str.equals(c2b2.A03)) {
                        return c2b2.A01;
                    }
                }
                return null;
            }
        }
        return c2b.A01;
    }

    public C0G(Collection collection) {
        int size = collection.size();
        this.A01 = size;
        int i = 2;
        while (i < (size > 32 ? (size >> 2) + size : size + size)) {
            i += i;
        }
        this.A03 = i - 1;
        C27210C2b[] c2bArr = new C27210C2b[i];
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C27176Bzt bzt = (C27176Bzt) it.next();
            String str = bzt.A07;
            int hashCode = str.hashCode() & this.A03;
            C27210C2b c2b = c2bArr[hashCode];
            int i2 = this.A00;
            this.A00 = i2 + 1;
            c2bArr[hashCode] = new C27210C2b(c2b, str, bzt, i2);
        }
        this.A02 = c2bArr;
    }

    public C0G(C27210C2b[] c2bArr, int i, int i2) {
        this.A02 = c2bArr;
        this.A01 = i;
        this.A03 = c2bArr.length - 1;
        this.A00 = i2;
    }
}
