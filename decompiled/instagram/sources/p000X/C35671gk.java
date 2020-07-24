package p000X;

import android.view.View;

/* renamed from: X.1gk  reason: invalid class name and case insensitive filesystem */
public final class C35671gk extends C35681gl {
    public final /* synthetic */ C35611ge A00;

    public C35671gk(C35611ge r1) {
        this.A00 = r1;
    }

    public final void BA5(View view) {
        String ATm;
        C35611ge r0 = this.A00;
        C35821gz AR7 = r0.AR7();
        if (AR7 != null && (ATm = r0.ATm()) != null) {
            AR7.BHe(ATm);
        }
    }

    public final boolean BR2(View view) {
        String ATm;
        C35611ge r0 = this.A00;
        C35821gz AR7 = r0.AR7();
        if (AR7 == null || (ATm = r0.ATm()) == null) {
            return false;
        }
        AR7.BHm(ATm);
        return true;
    }
}
