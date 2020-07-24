package p000X;

import java.lang.ref.WeakReference;

/* renamed from: X.1jh  reason: invalid class name and case insensitive filesystem */
public final class C37461jh {
    public WeakReference A00;
    public final C37631jy A01;
    public final Object A02;

    public final boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.A01.equals(((C37461jh) obj).A01);
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }

    public C37461jh(C37631jy r2, Object obj) {
        this(r2, obj, (C49152Az) null);
    }

    public C37461jh(C37631jy r2, Object obj, C49152Az r4) {
        this.A01 = r2;
        this.A02 = obj;
        this.A00 = r4 != null ? new WeakReference(r4) : null;
    }
}
