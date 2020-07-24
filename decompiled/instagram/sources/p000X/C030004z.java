package p000X;

import java.io.File;
import java.util.Iterator;

/* renamed from: X.04z  reason: invalid class name and case insensitive filesystem */
public final class C030004z implements Iterator {
    public final /* synthetic */ C033406p A00;
    public final /* synthetic */ Iterator A01;

    public C030004z(C033406p r1, Iterator it) {
        this.A00 = r1;
        this.A01 = it;
    }

    public final boolean hasNext() {
        return this.A01.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return this.A00.A01((File) this.A01.next());
    }

    public final void remove() {
        this.A01.remove();
    }
}
