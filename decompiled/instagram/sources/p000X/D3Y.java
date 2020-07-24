package p000X;

import android.util.LruCache;

/* renamed from: X.D3Y */
public final class D3Y extends LruCache {
    public final /* synthetic */ D2I A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public D3Y(D2I d2i, int i) {
        super(i);
        this.A00 = d2i;
    }

    public final void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        C29626D2j d2j = (C29626D2j) obj2;
        if (z) {
            d2j.A0P(z);
        }
    }
}
