package p000X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.1jO  reason: invalid class name and case insensitive filesystem */
public final class C37271jO implements Iterator {
    public int A00 = -1;
    public final /* synthetic */ C28031Kd A01;

    public C37271jO(C28031Kd r2) {
        this.A01 = r2;
    }

    public final boolean hasNext() {
        if (this.A00 + 1 >= this.A01.A01.size() + this.A01.A00.A01.size()) {
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        List list;
        this.A00++;
        int size = this.A01.A01.size();
        int size2 = this.A01.A00.A01.size();
        int i = size + size2;
        int i2 = this.A00;
        if (i > i2) {
            if (i2 < size) {
                list = this.A01.A01;
            } else {
                i2 -= size;
                list = this.A01.A00.A01;
            }
            return (C32781bq) list.get(i2);
        }
        throw new ArrayIndexOutOfBoundsException("index " + i2 + "is greater than " + size + size2);
    }

    public final void remove() {
        throw new IllegalStateException("not implemented");
    }
}
