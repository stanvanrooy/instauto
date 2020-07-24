package p000X;

import android.widget.TextView;
import java.lang.ref.WeakReference;

/* renamed from: X.AON */
public final class AON {
    public AQ2 A00;
    public WeakReference A01;

    public final void A00() {
        AQ2 aq2 = this.A00;
        if (aq2 != null) {
            C72733Gu r4 = aq2.A00;
            if (r4.A02()) {
                C476624x.A08(true, r4.A01());
            }
        }
    }

    public final void A01() {
        AQ2 aq2 = this.A00;
        if (aq2 != null) {
            C476624x.A09(true, aq2.A00.A01());
            WeakReference weakReference = this.A01;
            if (weakReference != null && weakReference.get() != null) {
                AQ2 aq22 = this.A00;
                ((TextView) aq22.A00.A01()).setText(((C23724Aa8) this.A01.get()).A02());
            }
        }
    }
}
