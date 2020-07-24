package p000X;

import android.content.Context;

/* renamed from: X.CJX */
public final class CJX extends C689130g {
    public final Context A00;
    public final C13300iJ A01;
    public final C27564CIi A02;
    public final C27584CJd A03;
    public final C145866Ln A04;
    public final boolean A05;
    public final AnonymousClass0C1 A06;

    public CJX(Context context, AnonymousClass0C1 r7, C13300iJ r8, boolean z, C145886Lp r10, C27592CJl cJl) {
        this.A00 = context;
        this.A06 = r7;
        this.A01 = r8;
        this.A05 = z;
        C145866Ln r4 = new C145866Ln(context, r7, r10);
        this.A04 = r4;
        C27584CJd cJd = new C27584CJd(context, r7, cJl);
        this.A03 = cJd;
        C27564CIi cIi = new C27564CIi(context);
        this.A02 = cIi;
        init(r4, cJd, cIi);
    }
}
