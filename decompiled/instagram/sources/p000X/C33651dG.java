package p000X;

import android.widget.FrameLayout;

/* renamed from: X.1dG  reason: invalid class name and case insensitive filesystem */
public final class C33651dG implements Runnable {
    public final /* synthetic */ C33251cc A00;

    public final synchronized void run() {
        C119625Bh A002;
        if (!this.A00.A05.isEmpty()) {
            C33251cc r1 = this.A00;
            if (!(r1.A01 == null || (A002 = C33251cc.A00(r1)) == null)) {
                C33251cc r3 = this.A00;
                FrameLayout frameLayout = r3.A01;
                r3.A00 = frameLayout;
                r3.A01 = null;
                C33251cc.A03(r3, frameLayout, A002.A01, A002.A00.top);
                C33251cc r0 = this.A00;
                AnonymousClass0ZA.A09(r0.A03, r0.A04, 4000, -1447591880);
            }
        }
    }

    public C33651dG(C33251cc r1) {
        this.A00 = r1;
    }
}
