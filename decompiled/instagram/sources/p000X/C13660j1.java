package p000X;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: X.0j1  reason: invalid class name and case insensitive filesystem */
public final class C13660j1 extends WeakReference implements C13560in {
    public final C13620ix A00;

    public final C13560in A9v(ReferenceQueue referenceQueue, C13620ix r4) {
        return new C13660j1(referenceQueue, get(), r4);
    }

    public final C13620ix ALD() {
        return this.A00;
    }

    public C13660j1(ReferenceQueue referenceQueue, Object obj, C13620ix r3) {
        super(obj, referenceQueue);
        this.A00 = r3;
    }
}
