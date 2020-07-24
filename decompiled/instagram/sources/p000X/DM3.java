package p000X;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.DM3 */
public final class DM3 extends AbstractSet<Map.Entry<K, V>> {
    public final /* synthetic */ DM0 A00;

    public DM3(DM0 dm0) {
        this.A00 = dm0;
    }

    public final void clear() {
        this.A00.clear();
    }

    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry) || this.A00.A05((Map.Entry) obj) == null) {
            return false;
        }
        return true;
    }

    public final Iterator iterator() {
        return new DM6(this);
    }

    public final boolean remove(Object obj) {
        DM1 A05;
        if (!(obj instanceof Map.Entry) || (A05 = this.A00.A05((Map.Entry) obj)) == null) {
            return false;
        }
        this.A00.A06(A05, true);
        return true;
    }

    public final int size() {
        return this.A00.A02;
    }
}
