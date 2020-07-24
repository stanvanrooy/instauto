package p000X;

import java.util.AbstractSet;
import java.util.Iterator;

/* renamed from: X.DM2 */
public final class DM2 extends AbstractSet<K> {
    public final /* synthetic */ DM0 A00;

    public DM2(DM0 dm0) {
        this.A00 = dm0;
    }

    public final void clear() {
        this.A00.clear();
    }

    public final boolean contains(Object obj) {
        return this.A00.containsKey(obj);
    }

    public final Iterator iterator() {
        return new DM5(this);
    }

    public final boolean remove(Object obj) {
        DM0 dm0 = this.A00;
        DM1 dm1 = null;
        if (obj != null) {
            try {
                dm1 = dm0.A04(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        if (dm1 != null) {
            dm0.A06(dm1, true);
        }
        if (dm1 != null) {
            return true;
        }
        return false;
    }

    public final int size() {
        return this.A00.A02;
    }
}
