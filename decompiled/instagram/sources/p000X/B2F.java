package p000X;

import androidx.fragment.app.FragmentActivity;

/* renamed from: X.B2F */
public final class B2F implements C25128B2e {
    public final /* synthetic */ C25114B1k A00;

    public B2F(C25114B1k b1k) {
        this.A00 = b1k;
    }

    public final void A8t() {
        FragmentActivity activity = this.A00.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }
}
