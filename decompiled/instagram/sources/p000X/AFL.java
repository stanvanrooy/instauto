package p000X;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

/* renamed from: X.AFL */
public final class AFL implements DialogInterface.OnDismissListener, DialogInterface.OnClickListener, C54122Vv, DialogInterface.OnKeyListener {
    public C26439BlW A00;
    public C54082Vr A01;
    public C54042Vn A02;

    public final void Awx(C54042Vn r2, boolean z) {
        C26439BlW blW;
        if ((z || r2 == this.A02) && (blW = this.A00) != null) {
            blW.dismiss();
        }
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C54042Vn r3 = this.A02;
        C54082Vr r1 = this.A01;
        if (r1.A05 == null) {
            r1.A05 = new C54102Vt(r1);
        }
        r3.A0K((AnonymousClass99I) r1.A05.getItem(i), (C54092Vs) null, 0);
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.A01.Awx(this.A02, true);
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.A00.getWindow();
                if (!(window2 == null || (decorView2 = window2.getDecorView()) == null || (keyDispatcherState2 = decorView2.getKeyDispatcherState()) == null)) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.A00.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.A02.A0F(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.A02.performShortcut(i, keyEvent, 0);
    }

    public AFL(C54042Vn r1) {
        this.A02 = r1;
    }

    public final boolean BDK(C54042Vn r2) {
        return false;
    }
}
