package p000X;

import android.view.View;

/* renamed from: X.AI2 */
public final class AI2 implements AnonymousClass2WS {
    public int A00;
    public boolean A01 = false;
    public final /* synthetic */ AnonymousClass2WB A02;

    public final void Ard(View view) {
        this.A01 = true;
    }

    public AI2(AnonymousClass2WB r2) {
        this.A02 = r2;
    }

    public final void Arh(View view) {
        if (!this.A01) {
            AnonymousClass2WB r1 = this.A02;
            r1.A02 = null;
            AI2.super.setVisibility(this.A00);
        }
    }

    public final void Aro(View view) {
        AI2.super.setVisibility(0);
        this.A01 = false;
    }
}
