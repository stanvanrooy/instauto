package p000X;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.CJY */
public final class CJY extends C689130g {
    public String A00;
    public String A01;
    public final C27601CJu A02;
    public final C27564CIi A03;
    public final C27565CIj A04;
    public final List A05 = new ArrayList();
    public final Context A06;

    public CJY(Context context) {
        this.A06 = context;
        C27601CJu cJu = new C27601CJu(context);
        this.A02 = cJu;
        C27565CIj cIj = new C27565CIj(context);
        this.A04 = cIj;
        C27564CIi cIi = new C27564CIi(context);
        this.A03 = cIi;
        init(cJu, cIj, cIi);
    }
}
