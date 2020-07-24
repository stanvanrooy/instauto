package p000X;

import android.view.MenuItem;

/* renamed from: X.AHL */
public final class AHL implements Runnable {
    public final /* synthetic */ MenuItem A00;
    public final /* synthetic */ AHD A01;
    public final /* synthetic */ C23314AHp A02;
    public final /* synthetic */ C54042Vn A03;

    public AHL(AHD ahd, C23314AHp aHp, MenuItem menuItem, C54042Vn r4) {
        this.A01 = ahd;
        this.A02 = aHp;
        this.A00 = menuItem;
        this.A03 = r4;
    }

    public final void run() {
        C23314AHp aHp = this.A02;
        if (aHp != null) {
            this.A01.A00.A01 = true;
            aHp.A01.A0F(false);
            this.A01.A00.A01 = false;
        }
        if (this.A00.isEnabled() && this.A00.hasSubMenu()) {
            this.A03.A0K(this.A00, (C54092Vs) null, 4);
        }
    }
}
