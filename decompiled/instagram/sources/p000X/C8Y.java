package p000X;

import com.instagram.business.insights.fragment.ProductCreatorsListFragment;

/* renamed from: X.C8Y */
public final class C8Y implements C29091Oo {
    public final /* synthetic */ ProductCreatorsListFragment A00;

    public C8Y(ProductCreatorsListFragment productCreatorsListFragment) {
        this.A00 = productCreatorsListFragment;
    }

    public final void A68() {
        C8I c8i = this.A00.A01;
        if (c8i != null) {
            synchronized (c8i) {
                Integer num = c8i.A01;
                if (!(num == Constants.ONE || num == Constants.A0Y)) {
                    C8I.A00(c8i);
                }
            }
        }
    }
}
