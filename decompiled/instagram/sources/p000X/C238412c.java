package p000X;

import android.content.Context;

/* renamed from: X.12c  reason: invalid class name and case insensitive filesystem */
public final class C238412c extends C238512d {
    public C238712f A00;
    public AnonymousClass0Q6 A01;
    public final Context A02;
    public final AnonymousClass0C1 A03;

    public static C238712f A00(C238412c r12) {
        C14590lB A002 = C22440yQ.A00(r12.A02);
        Context context = r12.A02;
        AnonymousClass0C1 r2 = r12.A03;
        return new C238712f(A002, (C238812h) r2.AVA(C238812h.class, new C239012k(context, r2)), new AnonymousClass0OR(C05700Lp.A00(), 632, 3, true, false), C239112l.A00(r12.A02));
    }

    public C238412c(Context context, AnonymousClass0C1 r3) {
        this.A02 = context;
        this.A03 = r3;
        if (C05700Lp.A00() != null) {
            this.A00 = A00(this);
        }
        this.A01 = new AnonymousClass13H(this);
    }

    public final void onUserSessionStart(boolean z) {
        int A032 = AnonymousClass0Z0.A03(-29725106);
        AnonymousClass0Q7.A03().A0B(this.A01);
        AnonymousClass0Z0.A0A(-835935712, A032);
    }

    public final void onUserSessionWillEnd(boolean z) {
        AnonymousClass0Q7.A03().A0D(this.A01);
    }
}
