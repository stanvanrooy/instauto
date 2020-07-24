package p000X;

import android.content.Context;
import com.facebook.C0003R;

/* renamed from: X.CIs */
public final class CIs extends C17920r1 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C27570CIo A01;

    public CIs(C27570CIo cIo, Context context) {
        this.A01 = cIo;
        this.A00 = context;
    }

    public final void onFail(C43791v5 r5) {
        int A03 = AnonymousClass0Z0.A03(-128715780);
        C53642Tq.A00(this.A01.getRootActivity(), C0003R.string.something_went_wrong, 0).show();
        AnonymousClass0Z0.A0A(1053263689, A03);
    }

    public final void onFinish() {
        int A03 = AnonymousClass0Z0.A03(1807047697);
        AnonymousClass6NI.A03(this.A01.getActivity());
        AnonymousClass0Z0.A0A(-887703044, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0Z0.A03(924074111);
        C27578CIx cIx = (C27578CIx) obj;
        int A032 = AnonymousClass0Z0.A03(1974470380);
        if (this.A00 == null) {
            AnonymousClass0Z0.A0A(-1878217894, A032);
        } else {
            if (cIx.A01 == Constants.ONE) {
                C27570CIo cIo = this.A01;
                cIo.A07.B3X((String) null);
                cIo.A02.A03();
                AnonymousClass2TI r7 = cIo.A02;
                AnonymousClass2TH r4 = new AnonymousClass2TH(cIo.A03);
                r4.A0T = cIo.A0B;
                r4.A00 = cIo.A00;
                C27574CIt cIt = new C27574CIt();
                cIt.A02.putString("IgSessionManager.SESSION_TOKEN_KEY", cIo.A03.getToken());
                cIt.A00 = cIo.A04;
                cIt.A02.putString("ReportingConstants.ARG_CONTENT_ID", cIo.A09);
                cIt.A01 = cIx;
                r7.A08(r4, cIt.A00());
            }
            AnonymousClass0Z0.A0A(-1335515050, A032);
        }
        AnonymousClass0Z0.A0A(1182057756, A03);
    }
}
