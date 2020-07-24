package p000X;

import android.widget.AbsListView;

/* renamed from: X.AHF */
public final class AHF implements AbsListView.OnScrollListener {
    public final /* synthetic */ AH5 A00;

    public AHF(AH5 ah5) {
        this.A00 = ah5;
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        AnonymousClass0Z0.A0A(814672774, AnonymousClass0Z0.A03(986079129));
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int A03 = AnonymousClass0Z0.A03(-1726867918);
        if (i == 1) {
            boolean z = false;
            if (this.A00.A0A.getInputMethodMode() == 2) {
                z = true;
            }
            if (!z && this.A00.A0A.getContentView() != null) {
                AH5 ah5 = this.A00;
                AnonymousClass0ZA.A08(ah5.A0K, ah5.A0L);
                this.A00.A0L.run();
            }
        }
        AnonymousClass0Z0.A0A(-2093652853, A03);
    }
}
