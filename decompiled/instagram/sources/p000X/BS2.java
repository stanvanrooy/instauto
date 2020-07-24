package p000X;

import android.content.DialogInterface;
import com.facebook.C0003R;

/* renamed from: X.BS2 */
public final class BS2 implements C79583dh {
    public final /* synthetic */ C25616BRw A00;

    public BS2(C25616BRw bRw) {
        this.A00 = bRw;
    }

    public final boolean BRj(boolean z) {
        if (!z) {
            C25616BRw bRw = this.A00;
            AnonymousClass2OA r2 = new AnonymousClass2OA(bRw.getContext());
            r2.A07(C0003R.string.auto_updates_warning_dialog_title);
            r2.A06(C0003R.string.auto_updates_warning_dialog_description);
            r2.A0A(C0003R.string.auto_updates_warning_dialog_positive_button, new BS3(bRw));
            r2.A09(C0003R.string.cancel, (DialogInterface.OnClickListener) null);
            r2.A03().show();
        }
        return z;
    }
}
