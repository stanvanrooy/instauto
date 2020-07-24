package p000X;

import java.io.File;
import java.io.FileFilter;
import java.util.Comparator;
import java.util.Iterator;

/* renamed from: X.06p  reason: invalid class name and case insensitive filesystem */
public abstract class C033406p extends AnonymousClass051 {
    public FileFilter A00;
    public Comparator A01;

    public abstract AnonymousClass051 A01(File file);

    public final Iterator A00() {
        return new C030004z(this, new AnonymousClass052(this.A00, this.A00, this.A01).iterator());
    }

    public C033406p(File file) {
        super(file);
    }
}
