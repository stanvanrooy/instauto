package p000X;

import android.view.View;

/* renamed from: X.ALC */
public final class ALC implements View.OnClickListener {
    public final /* synthetic */ AL2 A00;

    public ALC(AL2 al2) {
        this.A00 = al2;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0Z0.A05(1800997955);
        if (this.A00.A05.isShowing()) {
            this.A00.A04.animate().rotationBy(-180.0f).start();
            this.A00.A0A.callOnClick();
        }
        AnonymousClass0Z0.A0C(-1637957163, A05);
    }
}
