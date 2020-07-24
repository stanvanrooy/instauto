package p000X;

import androidx.fragment.app.FragmentActivity;

/* renamed from: X.BXB */
public final class BXB implements Runnable {
    public final /* synthetic */ BXA A00;

    public BXB(BXA bxa) {
        this.A00 = bxa;
    }

    public final void run() {
        FragmentActivity activity;
        BX6 bx6 = this.A00.A00;
        bx6.mFragmentManager.A0W();
        if (bx6.A07 && (activity = bx6.getActivity()) != null) {
            activity.finish();
        }
    }
}
