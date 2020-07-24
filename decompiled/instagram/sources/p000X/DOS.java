package p000X;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: X.DOS */
public abstract class DOS extends WeakReference implements C13620ix {
    public final C13620ix A00;
    public final int A01;

    public DOS(ReferenceQueue referenceQueue, Object obj, int i, C13620ix r4) {
        super(obj, referenceQueue);
        this.A01 = i;
        this.A00 = r4;
    }

    public final int AMk() {
        return this.A01;
    }

    public final C13620ix AQm() {
        return this.A00;
    }

    public final Object getKey() {
        return get();
    }
}
