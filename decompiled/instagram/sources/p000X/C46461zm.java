package p000X;

import android.content.Context;

/* renamed from: X.1zm  reason: invalid class name and case insensitive filesystem */
public final class C46461zm implements C28111Kl {
    public final Context A00;

    public void onEntered(C36841ih r2) {
        if (r2.A13) {
            r2.A13 = false;
            r2.A09(this.A00);
        }
    }

    public C46461zm(Context context) {
        this.A00 = context.getApplicationContext();
    }

    public final void ADd(AnonymousClass1TY r3, C32761bo r4) {
        if (r4.A04(r3).intValue() == 0) {
            onEntered((C36841ih) r3.A02);
        }
    }
}
