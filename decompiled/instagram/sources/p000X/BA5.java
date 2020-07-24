package p000X;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.BA5 */
public final class BA5 implements DialogInterface.OnClickListener {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ AnonymousClass0RN A01;
    public final /* synthetic */ AnonymousClass0CL A02;

    public BA5(FragmentActivity fragmentActivity, AnonymousClass0RN r2, AnonymousClass0CL r3) {
        this.A00 = fragmentActivity;
        this.A01 = r2;
        this.A02 = r3;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        BA8.A00(this.A00);
        AnonymousClass0WN.A01(this.A02).BcG(AnonymousClass0P4.A00("tos_event_accepted", this.A01));
        dialogInterface.dismiss();
    }
}
