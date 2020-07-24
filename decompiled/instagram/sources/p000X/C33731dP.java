package p000X;

import android.view.View;

/* renamed from: X.1dP  reason: invalid class name and case insensitive filesystem */
public final class C33731dP implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass1IH A00;

    public C33731dP(AnonymousClass1IH r1) {
        this.A00 = r1;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0Z0.A05(-1153000288);
        C27321Hj A002 = AnonymousClass1IH.A00(this.A00);
        if (A002 != null) {
            A002.A0C.A00.BE0();
            C27541Ig.A04(A002.A08(), "camera_action_bar_button_main_feed");
        } else {
            AnonymousClass0QD.A01("MainFeedFragment:getLeftClickListener", "MainFeedFragmentIsNull");
        }
        AnonymousClass0Z0.A0C(96915969, A05);
    }
}
