package p000X;

import android.view.Menu;
import android.view.View;

/* renamed from: X.AFf */
public final class AFf implements Runnable {
    public final /* synthetic */ AnonymousClass2W4 A00;

    public AFf(AnonymousClass2W4 r1) {
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass2W4 r5 = this.A00;
        if (!r5.A03) {
            r5.A02.Biv(new C23265AFh(r5), new C23264AFg(r5));
            r5.A03 = true;
        }
        Menu AQ3 = r5.A02.AQ3();
        C54042Vn r2 = null;
        if (AQ3 instanceof C54042Vn) {
            r2 = (C54042Vn) AQ3;
        }
        if (r2 != null) {
            r2.A08();
        }
        try {
            AQ3.clear();
            if (!r5.A01.onCreatePanelMenu(0, AQ3) || !r5.A01.onPreparePanel(0, (View) null, AQ3)) {
                AQ3.clear();
            }
        } finally {
            if (r2 != null) {
                r2.A07();
            }
        }
    }
}
