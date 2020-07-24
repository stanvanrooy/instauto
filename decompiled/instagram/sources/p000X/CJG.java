package p000X;

import android.content.Context;
import android.os.Bundle;

/* renamed from: X.CJG */
public final class CJG extends C17920r1 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ CJF A01;

    public CJG(CJF cjf, Context context) {
        this.A01 = cjf;
        this.A00 = context;
    }

    public final void onFinish() {
        int A03 = AnonymousClass0Z0.A03(182291674);
        AnonymousClass6NI.A03(this.A01.getActivity());
        AnonymousClass0Z0.A0A(1992654091, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0Z0.A03(-679017136);
        C27578CIx cIx = (C27578CIx) obj;
        int A032 = AnonymousClass0Z0.A03(-676211660);
        if (this.A00 == null) {
            AnonymousClass0Z0.A0A(-2073476503, A032);
        } else {
            if (cIx.A01 == Constants.ONE) {
                CJF cjf = this.A01;
                cjf.A05.B3X((String) null);
                cjf.A01.A03();
                AnonymousClass2TI r7 = cjf.A01;
                AnonymousClass2TH r4 = new AnonymousClass2TH(cjf.A02);
                r4.A0T = cjf.A0B;
                r4.A00 = cjf.A00;
                C27574CIt cIt = new C27574CIt();
                cIt.A02.putString("IgSessionManager.SESSION_TOKEN_KEY", cjf.A02.getToken());
                cIt.A00 = cjf.A03;
                cIt.A02.putString("ReportingConstants.ARG_CONTENT_ID", cjf.A08);
                cIt.A01 = cIx;
                r7.A08(r4, cIt.A00());
            } else {
                CJF cjf2 = this.A01;
                CJF cjf3 = new CJF();
                Bundle bundle = new Bundle();
                bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", cjf2.A02.getToken());
                bundle.putString("ReportingConstants.ARG_CONTENT_ID", cjf2.A08);
                bundle.putBoolean("ReportingConstants.ARG_IS_FULL_SCREEN_ENABLED", cjf2.A0B);
                bundle.putFloat("ReportingConstants.ARG_INITIAL_OPENING_HEIGHT_RATIO", cjf2.A00);
                cjf3.setArguments(bundle);
                cjf3.A03 = cjf2.A03;
                cjf3.A05 = cjf2.A05;
                cjf3.A01 = cjf2.A01;
                cjf3.A06 = cIx;
                CJC cjc = cIx.A00;
                cjf3.A09 = cjc.A0B;
                cjf3.A0A = cjc.A0D;
                cjf3.A07 = cIx.A01;
                AnonymousClass2TI r2 = cjf2.A01;
                AnonymousClass2TH r1 = new AnonymousClass2TH(cjf2.A02);
                r1.A0L = cjc.A07.A00;
                r1.A0T = cjf2.A0B;
                r1.A00 = cjf2.A00;
                r1.A0F = cjf3;
                r2.A08(r1, cjf3);
            }
            AnonymousClass0Z0.A0A(-1527477938, A032);
        }
        AnonymousClass0Z0.A0A(-1471865481, A03);
    }
}
