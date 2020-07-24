package p000X;

import android.content.DialogInterface;

/* renamed from: X.BS3 */
public final class BS3 implements DialogInterface.OnClickListener {
    public final /* synthetic */ C25616BRw A00;

    public BS3(C25616BRw bRw) {
        this.A00 = bRw;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C25616BRw bRw = this.A00;
        bRw.A07.A02(false);
        C25616BRw.A03(bRw, false);
        AnonymousClass0Z1.A00((C120125Dh) this.A00.mAdapter, -206459696);
    }
}
