package p000X;

import android.graphics.Bitmap;

/* renamed from: X.D07 */
public abstract class D07 {
    public void A00(C29563Czu czu) {
        C29550Czh czh = (C29550Czh) this;
        if (czu.A06()) {
            C29488Cyh cyh = (C29488Cyh) czu.A03();
            Bitmap bitmap = null;
            if (cyh != null && (cyh.A06() instanceof C29467CyM)) {
                bitmap = ((C29467CyM) cyh.A06()).A04();
            }
            try {
                czh.A03(bitmap);
            } finally {
                C29488Cyh.A03(cyh);
            }
        }
    }

    public void A01(C29563Czu czu) {
    }

    public abstract void A02(C29563Czu czu);
}
