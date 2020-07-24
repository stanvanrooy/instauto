package p000X;

import android.content.DialogInterface;
import android.view.KeyEvent;

/* renamed from: X.ADH */
public final class ADH implements DialogInterface.OnKeyListener {
    public final /* synthetic */ ADG A00;

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        return i == 4;
    }

    public ADH(ADG adg) {
        this.A00 = adg;
    }
}
