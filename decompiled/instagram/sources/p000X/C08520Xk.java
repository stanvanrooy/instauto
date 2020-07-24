package p000X;

import android.content.Context;

/* renamed from: X.0Xk  reason: invalid class name and case insensitive filesystem */
public final class C08520Xk implements C05110Id {
    public final /* synthetic */ AnonymousClass05I A00;

    public C08520Xk(AnonymousClass05I r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ Object AF7(AnonymousClass0C1 r4) {
        Context context = this.A00.A00;
        C241113i A01 = C241113i.A01(r4);
        if (A01 != null) {
            AnonymousClass0QD.A01("RageShakeSensorHelper2_duplicateAccountSwitch", "Should only call initInstance once per session");
            return A01;
        }
        C241113i r2 = new C241113i(context, r4);
        r4.BYi(C241113i.class, r2);
        return r2;
    }
}
