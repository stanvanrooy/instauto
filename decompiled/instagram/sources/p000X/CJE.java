package p000X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.C0003R;

/* renamed from: X.CJE */
public final class CJE extends C17920r1 {
    public final Context A00;
    public final C12830hS A01;
    public final C27586CJf A02;
    public final /* synthetic */ CJ5 A03;

    public CJE(CJ5 cj5, C12830hS r2, Context context, C27586CJf cJf) {
        this.A03 = cj5;
        this.A01 = r2;
        this.A02 = cJf;
        this.A00 = context;
    }

    public final void onFail(C43791v5 r5) {
        String str;
        Object obj;
        int A032 = AnonymousClass0Z0.A03(-1438789562);
        super.onFail(r5);
        String str2 = null;
        if (r5.A02()) {
            str = r5.A01.getMessage();
        } else if (!r5.A03() || (obj = r5.A00) == null) {
            str = null;
        } else {
            str = ((C27578CIx) obj).getErrorMessage();
        }
        CJ5.A04(this.A03, str);
        C27588CJh cJh = this.A03.A0B;
        C27586CJf cJf = this.A02;
        if (cJf != null) {
            str2 = cJf.A03;
        }
        cJh.B3U(str2);
        C53642Tq.A00(this.A03.A06.getRootActivity(), C0003R.string.something_went_wrong, 0).show();
        AnonymousClass0Z0.A0A(851273453, A032);
    }

    public final void onFinish() {
        int A032 = AnonymousClass0Z0.A03(-215769511);
        CJ5.A00(this.A03);
        this.A03.A06.A00(true);
        AnonymousClass0Z0.A0A(1944405958, A032);
    }

    public final void onStart() {
        int A032 = AnonymousClass0Z0.A03(-832768771);
        CJ5.A01(this.A03);
        AnonymousClass0Z0.A0A(931089071, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        int A032 = AnonymousClass0Z0.A03(836909231);
        C27578CIx cIx = (C27578CIx) obj;
        int A033 = AnonymousClass0Z0.A03(574276668);
        CJ5 cj5 = this.A03;
        AnonymousClass0a4.A06(cj5.A07);
        CJ5.A02(cj5);
        switch (cIx.A01.intValue()) {
            case 1:
                C27588CJh cJh = this.A03.A0B;
                C27586CJf cJf = this.A02;
                if (cJf != null) {
                    str = cJf.A03;
                } else {
                    str = null;
                }
                cJh.B3X(str);
                CJW cjw = this.A03.A07;
                cjw.A01.A03();
                AnonymousClass2TI r5 = cjw.A01;
                AnonymousClass2TH r4 = new AnonymousClass2TH(cjw.A02);
                r4.A0T = cjw.A0B;
                r4.A00 = cjw.A00;
                C27574CIt cIt = new C27574CIt();
                cIt.A02.putString("IgSessionManager.SESSION_TOKEN_KEY", cjw.A02.getToken());
                cIt.A00 = cjw.A03;
                cIt.A02.putString("ReportingConstants.ARG_CONTENT_ID", cjw.A08);
                cIt.A01 = cIx;
                r5.A08(r4, cIt.A00());
                break;
            case 3:
                CJW cjw2 = this.A03.A07;
                C27570CIo cIo = new C27570CIo();
                Bundle bundle = new Bundle();
                bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", cjw2.A02.getToken());
                bundle.putString("ReportingConstants.ARG_CONTENT_ID", cjw2.A08);
                bundle.putBoolean("ReportingConstants.ARG_IS_FULL_SCREEN_ENABLED", cjw2.A0B);
                bundle.putFloat("ReportingConstants.ARG_INITIAL_OPENING_HEIGHT_RATIO", cjw2.A00);
                cIo.setArguments(bundle);
                cIo.A04 = cjw2.A03;
                cIo.A07 = cjw2.A07;
                AnonymousClass2TI r3 = cjw2.A01;
                cIo.A02 = r3;
                cIo.A08 = cIx;
                CJC cjc = cIx.A00;
                cIo.A0A = cjc.A0B;
                AnonymousClass2TH r1 = new AnonymousClass2TH(cjw2.A02);
                r1.A0L = cjc.A07.A00;
                r1.A0T = cjw2.A0B;
                r1.A00 = cjw2.A00;
                r1.A0F = cIo;
                r3.A08(r1, cIo);
                break;
            case 4:
                CJW cjw3 = this.A03.A07;
                CJF cjf = new CJF();
                Bundle bundle2 = new Bundle();
                bundle2.putString("IgSessionManager.SESSION_TOKEN_KEY", cjw3.A02.getToken());
                bundle2.putString("ReportingConstants.ARG_CONTENT_ID", cjw3.A08);
                bundle2.putBoolean("ReportingConstants.ARG_IS_FULL_SCREEN_ENABLED", cjw3.A0B);
                bundle2.putFloat("ReportingConstants.ARG_INITIAL_OPENING_HEIGHT_RATIO", cjw3.A00);
                cjf.setArguments(bundle2);
                cjf.A03 = cjw3.A03;
                cjf.A05 = cjw3.A07;
                AnonymousClass2TI r32 = cjw3.A01;
                cjf.A01 = r32;
                cjf.A06 = cIx;
                CJC cjc2 = cIx.A00;
                cjf.A09 = cjc2.A0B;
                cjf.A0A = cjc2.A0D;
                cjf.A07 = cIx.A01;
                AnonymousClass2TH r12 = new AnonymousClass2TH(cjw3.A02);
                r12.A0L = cjc2.A07.A00;
                r12.A0T = cjw3.A0B;
                r12.A00 = cjw3.A00;
                r12.A0F = cjf;
                r32.A08(r12, cjf);
                break;
            case 5:
                CJW cjw4 = this.A03.A07;
                CJU cju = new CJU(this, cIx);
                CJD cjd = new CJD();
                Bundle bundle3 = new Bundle();
                bundle3.putString("IgSessionManager.SESSION_TOKEN_KEY", cjw4.A02.getToken());
                bundle3.putString("ReportingConstants.ARG_CONTENT_ID", cjw4.A08);
                cjd.setArguments(bundle3);
                cjd.A02 = cjw4.A03;
                AnonymousClass2TI r33 = cjw4.A01;
                cjd.A01 = r33;
                cjd.A03 = cIx;
                CJC cjc3 = cIx.A00;
                cjd.A04 = cjc3.A0B;
                cjd.A00 = cju;
                AnonymousClass2TH r13 = new AnonymousClass2TH(cjw4.A02);
                r13.A0L = cjc3.A07.A00;
                r13.A0T = cjw4.A0B;
                r13.A00 = cjw4.A00;
                r13.A0F = cjd;
                r33.A08(r13, cjd);
                break;
            default:
                CJW cjw5 = this.A03.A07;
                CJH cjh = new CJH();
                cjh.A02 = cjw5.A02;
                cjh.A03 = cjw5.A03;
                cjh.A09 = cjw5.A08;
                cjh.A0B = cjw5.A0A;
                cjh.A07 = cjw5.A07;
                cjh.A04 = cjw5.A04;
                cjh.A05 = cjw5.A05;
                cjh.A06 = cjw5.A06;
                cjh.A0C = cjw5.A0B;
                cjh.A00 = cjw5.A00;
                cjh.A01 = cjw5.A01;
                cjh.A08 = cIx;
                cjh.A0A = cjw5.A09;
                CJ4 A002 = cjh.A00();
                AnonymousClass2TI r2 = cjw5.A01;
                AnonymousClass2TH r14 = new AnonymousClass2TH(cjw5.A02);
                r14.A0L = cIx.A00.A07.A00;
                r14.A0T = cjw5.A0B;
                r14.A00 = cjw5.A00;
                r14.A0F = A002;
                r2.A08(r14, A002);
                break;
        }
        AnonymousClass0Z0.A0A(-1285566440, A033);
        AnonymousClass0Z0.A0A(-987621604, A032);
    }
}
