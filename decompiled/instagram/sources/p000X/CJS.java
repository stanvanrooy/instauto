package p000X;

import android.content.Context;
import java.util.List;

/* renamed from: X.CJS */
public final class CJS extends C689130g {
    public C13300iJ A00;
    public String A01;
    public List A02;
    public final Context A03;
    public final C29381Pr A04;
    public final AnonymousClass0C1 A05;
    public final C27601CJu A06;
    public final C27593CJm A07;
    public final C27564CIi A08;
    public final C27565CIj A09;
    public final C145866Ln A0A;

    public CJS(Context context, AnonymousClass0C1 r10, C27600CJt cJt, C145886Lp r12) {
        this.A03 = context;
        this.A05 = r10;
        C27601CJu cJu = new C27601CJu(context);
        this.A06 = cJu;
        C27565CIj cIj = new C27565CIj(context);
        this.A09 = cIj;
        C27564CIi cIi = new C27564CIi(context);
        this.A08 = cIi;
        C27593CJm cJm = new C27593CJm(context, cJt);
        this.A07 = cJm;
        C145866Ln r3 = new C145866Ln(context, r10, r12);
        this.A0A = r3;
        C29381Pr r2 = new C29381Pr();
        this.A04 = r2;
        init(cJu, cIj, cIi, cJm, r3, r2);
    }
}
