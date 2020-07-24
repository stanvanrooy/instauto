package p000X;

import android.app.Activity;
import android.content.DialogInterface;
import android.view.KeyEvent;

/* renamed from: X.A6T */
public final class A6T implements DialogInterface.OnKeyListener {
    public final /* synthetic */ A6P A00;

    public A6T(A6P a6p) {
        this.A00 = a6p;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1) {
            return false;
        }
        if (i == 4) {
            AnonymousClass0FY.A01(this.A00.A02, "setOnRequestCloseListener must be called by the manager");
            this.A00.A02.BIu(dialogInterface);
            return true;
        }
        Activity A002 = ((A3N) this.A00.getContext()).A00();
        if (A002 != null) {
            return A002.onKeyUp(i, keyEvent);
        }
        return false;
    }
}
