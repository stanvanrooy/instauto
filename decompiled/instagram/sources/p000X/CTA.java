package p000X;

import android.content.DialogInterface;

/* renamed from: X.CTA */
public final class CTA implements DialogInterface.OnClickListener {
    public final /* synthetic */ CSA A00;

    public CTA(CSA csa) {
        this.A00 = csa;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C147806Tl.A03(this.A00.requireContext(), "https://www.facebook.com/help/instagram/518659859068596");
    }
}
