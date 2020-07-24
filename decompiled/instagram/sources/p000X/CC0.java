package p000X;

import android.content.Context;
import com.facebook.C0003R;

/* renamed from: X.CC0 */
public final class CC0 extends C17920r1 {
    public final /* synthetic */ CC1 A00;

    public CC0(CC1 cc1) {
        this.A00 = cc1;
    }

    public final void onFail(C43791v5 r6) {
        String str;
        int A03 = AnonymousClass0Z0.A03(-1584284304);
        super.onFail(r6);
        Throwable th = r6.A01;
        if (th != null) {
            str = th.getMessage();
        } else {
            str = "";
        }
        CCZ.A0E(this.A00.A00.A04, C27398CBr.CONNECT_FACEBOOK_PAGE, "skip_page_connection", str);
        Context context = this.A00.A00.getContext();
        if (context != null) {
            AnonymousClass5F9.A01(context, C0003R.string.error_msg_skip_page, 0);
        }
        AnonymousClass0Z0.A0A(663876922, A03);
    }

    public final void onFinish() {
        int A03 = AnonymousClass0Z0.A03(-13500809);
        super.onFinish();
        CCQ.A00(this.A00.A00, false);
        AnonymousClass0Z0.A0A(-1465759644, A03);
    }

    public final void onStart() {
        int A03 = AnonymousClass0Z0.A03(137920316);
        super.onStart();
        CCQ.A00(this.A00.A00, true);
        AnonymousClass0Z0.A0A(41820753, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0Z0.A03(-358321196);
        C23662AWz aWz = (C23662AWz) obj;
        int A032 = AnonymousClass0Z0.A03(-197311681);
        super.onSuccess(aWz);
        if (aWz.A00) {
            CCZ.A0A(this.A00.A00.A04, C27398CBr.CONNECT_FACEBOOK_PAGE, "skip_page_connection");
            C16310oO.A00.A02();
            CCI cci = new CCI();
            CCQ ccq = this.A00.A00;
            C52362Om r2 = new C52362Om(ccq.getActivity(), ccq.A05);
            r2.A08 = false;
            r2.A02 = cci;
            r2.A02();
        } else {
            CCZ.A0E(this.A00.A00.A04, C27398CBr.CONNECT_FACEBOOK_PAGE, "skip_page_connection", "");
            Context context = this.A00.A00.getContext();
            if (context != null) {
                AnonymousClass5F9.A01(context, C0003R.string.error_msg_skip_page, 0);
            }
        }
        AnonymousClass0Z0.A0A(1301625060, A032);
        AnonymousClass0Z0.A0A(1125665177, A03);
    }
}
