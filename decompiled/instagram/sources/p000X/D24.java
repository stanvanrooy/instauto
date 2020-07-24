package p000X;

import android.util.LruCache;
import java.util.HashMap;

/* renamed from: X.D24 */
public final class D24 {
    public int A00 = 12;
    public int A01 = 120;
    public LruCache A02 = new D2A(this, 120);
    public HashMap A03 = new HashMap();

    public final synchronized D15 A00(D1W d1w) {
        D15 d15;
        LruCache lruCache;
        d15 = (D15) this.A02.get(d1w);
        if (!(d15 == null || (lruCache = (LruCache) this.A03.get(d1w.A01)) == null)) {
            lruCache.get(d1w);
        }
        return d15;
    }

    public final synchronized void A01(D1W d1w) {
        if (((D15) this.A02.remove(d1w)) != null) {
            ((LruCache) this.A03.get(d1w.A01)).remove(d1w);
        }
    }

    public final synchronized void A02(D1W d1w, D15 d15) {
        LruCache lruCache = (LruCache) this.A03.get(d1w.A01);
        if (lruCache == null) {
            lruCache = new D27(this, this.A00);
            this.A03.put(d1w.A01, lruCache);
        }
        lruCache.put(d1w, d15);
        this.A02.put(d1w, d15);
    }
}
