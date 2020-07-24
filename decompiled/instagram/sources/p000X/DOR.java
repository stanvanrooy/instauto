package p000X;

import com.google.common.collect.MapMakerInternalMap;
import java.lang.ref.ReferenceQueue;

/* renamed from: X.DOR */
public final class DOR extends DOS implements C13650j0 {
    public volatile C13560in A00 = MapMakerInternalMap.A07;

    public final Object getValue() {
        return this.A00.get();
    }

    public DOR(ReferenceQueue referenceQueue, Object obj, int i, DOR dor) {
        super(referenceQueue, obj, i, dor);
    }

    public final C13560in AZr() {
        return this.A00;
    }
}
