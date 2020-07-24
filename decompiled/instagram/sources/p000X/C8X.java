package p000X;

import com.instagram.business.insights.fragment.BaseGridInsightsFragment;

/* renamed from: X.C8X */
public final class C8X implements C29091Oo {
    public final /* synthetic */ BaseGridInsightsFragment A00;

    public C8X(BaseGridInsightsFragment baseGridInsightsFragment) {
        this.A00 = baseGridInsightsFragment;
    }

    public final void A68() {
        C8R c8r = this.A00.A01;
        if (c8r != null) {
            synchronized (c8r) {
                Integer num = c8r.A01;
                if (!(num == Constants.ONE || num == Constants.A0Y)) {
                    c8r.A04();
                }
            }
        }
    }
}
