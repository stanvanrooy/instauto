package p000X;

import android.content.DialogInterface;

/* renamed from: X.BS1 */
public final class BS1 implements DialogInterface.OnClickListener {
    public final /* synthetic */ C25616BRw A00;

    public BS1(C25616BRw bRw) {
        this.A00 = bRw;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C25616BRw bRw = this.A00;
        bRw.A05.A02(false);
        bRw.A01.A0i(false);
        bRw.A00.A04 = false;
        C12810hQ.A02(new C25597BRd(bRw, bRw.A05, false, true));
        AnonymousClass0Z1.A00((C120125Dh) this.A00.mAdapter, -982500165);
    }
}
