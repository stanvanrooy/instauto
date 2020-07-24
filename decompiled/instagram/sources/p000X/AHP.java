package p000X;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.AHP */
public final class AHP {
    public long A00 = -1;
    public Interpolator A01;
    public AnonymousClass2WS A02;
    public boolean A03;
    public final ArrayList A04 = new ArrayList();
    public final AnonymousClass2WR A05 = new C23301AHb(this);

    public final void A00() {
        if (this.A03) {
            Iterator it = this.A04.iterator();
            while (it.hasNext()) {
                ((AnonymousClass23i) it.next()).A00();
            }
            this.A03 = false;
        }
    }

    public final void A01() {
        View view;
        if (!this.A03) {
            Iterator it = this.A04.iterator();
            while (it.hasNext()) {
                AnonymousClass23i r5 = (AnonymousClass23i) it.next();
                long j = this.A00;
                if (j >= 0) {
                    r5.A03(j);
                }
                Interpolator interpolator = this.A01;
                if (!(interpolator == null || (view = (View) r5.A00.get()) == null)) {
                    view.animate().setInterpolator(interpolator);
                }
                if (this.A02 != null) {
                    r5.A04(this.A05);
                }
                View view2 = (View) r5.A00.get();
                if (view2 != null) {
                    view2.animate().start();
                }
            }
            this.A03 = true;
        }
    }
}
