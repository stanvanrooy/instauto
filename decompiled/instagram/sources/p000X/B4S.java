package p000X;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.B4S */
public final class B4S implements DialogInterface.OnCancelListener {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ C11520f6 A01;

    public B4S(C11520f6 r1, FragmentActivity fragmentActivity) {
        this.A01 = r1;
        this.A00 = fragmentActivity;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        C11520f6.A05(this.A01, "dialog_cancelled");
        C11520f6.A02(this.A01, this.A00);
    }
}
