package p000X;

import android.content.Context;

/* renamed from: X.05c  reason: invalid class name and case insensitive filesystem */
public final class C030305c implements C07030Rm, C07020Rl, C07040Rn, C07010Rk {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C06990Ri A01;
    public final /* synthetic */ AnonymousClass0RZ A02;
    public final /* synthetic */ String A03;

    public C030305c(AnonymousClass0RZ r1, Context context, String str, C06990Ri r4) {
        this.A02 = r1;
        this.A00 = context;
        this.A03 = str;
        this.A01 = r4;
    }

    public final C06960Rf A00() {
        C06960Rf r0;
        synchronized (C06960Rf.class) {
            if (C06960Rf.A00 == null) {
                C06960Rf.A00 = new C06960Rf();
            }
            r0 = C06960Rf.A00;
        }
        return r0;
    }

    public final AnonymousClass0RY A01() {
        C06930Ra r0;
        synchronized (C06930Ra.class) {
            if (C06930Ra.A00 == null) {
                C06930Ra.A00 = new C06930Ra();
            }
            r0 = C06930Ra.A00;
        }
        return r0;
    }

    public final C06990Ri AGd() {
        return this.A01;
    }

    public final AnonymousClass0RZ ALJ() {
        return this.A02;
    }

    public final String APR() {
        return this.A03;
    }

    public final AnonymousClass0R5 Aas(C06590Pq r2) {
        if (r2 instanceof AnonymousClass0MP) {
            return null;
        }
        return C22510yY.A00(r2);
    }

    public final Context getContext() {
        return this.A00;
    }

    public final C22800z1 AMR(C06590Pq r2) {
        return C22760yx.A00(r2).A00;
    }

    public final AnonymousClass0RV AR8() {
        return C22860z7.A00();
    }

    public final C06800Ql ARq(C06590Pq r2) {
        return AnonymousClass0OZ.A00(r2);
    }

    public final String AZj(C06590Pq r2) {
        return C05210Iq.A05(r2);
    }
}
