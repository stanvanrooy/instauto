package p000X;

import android.view.View;

/* renamed from: X.CHW */
public final class CHW implements CHX {
    public CHX A00;
    public final /* synthetic */ CHQ A01;

    public CHW(CHQ chq, CHX chx) {
        this.A01 = chq;
        this.A00 = chx;
    }

    public final C27541CHg AVg() {
        return this.A00.AVg();
    }

    public final void BR4(AnonymousClass1ZK r8, C155936lE r9, boolean z, CI0 ci0, int i, String str) {
        this.A00.BR4(r8, r9, z, ci0, i, str);
    }

    public final void BR8(C13300iJ r5) {
        View view;
        CHQ chq = this.A01;
        if (chq.A01.A04() && (view = (View) chq.A02.get()) != null) {
            this.A01.A01.A01(true, (float) view.getHeight());
        }
        this.A00.BR8(r5);
    }
}
