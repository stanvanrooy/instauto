package p000X;

import android.content.DialogInterface;

/* renamed from: X.BRy */
public final class BRy implements DialogInterface.OnClickListener {
    public final /* synthetic */ C25616BRw A00;
    public final /* synthetic */ C1186457i A01;
    public final /* synthetic */ boolean A02;

    public BRy(C25616BRw bRw, C1186457i r2, boolean z) {
        this.A00 = bRw;
        this.A01 = r2;
        this.A02 = z;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C1186457i r1 = this.A01;
        boolean z = !this.A02;
        r1.A02(z);
        C25616BRw bRw = this.A00;
        int i2 = r1.A03;
        if (i2 == bRw.A07.A03) {
            bRw.A01.A00.edit().putBoolean("oxp_allow_app_updates", z).apply();
            C25616BRw.A02(bRw);
        }
        if (i2 == bRw.A05.A03) {
            bRw.A01.A0i(z);
        }
        if (i2 == bRw.A06.A03) {
            bRw.A01.A00.edit().putBoolean("oxp_show_app_update_installed_notifications", z).apply();
        }
        dialogInterface.dismiss();
        AnonymousClass0Z1.A00((C120125Dh) this.A00.mAdapter, -1413517588);
    }
}
