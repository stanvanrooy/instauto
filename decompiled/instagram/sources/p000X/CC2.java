package p000X;

import android.content.Context;
import com.facebook.C0003R;

/* renamed from: X.CC2 */
public final class CC2 extends C17920r1 {
    public final /* synthetic */ CCQ A00;

    public CC2(CCQ ccq) {
        this.A00 = ccq;
    }

    public final void onFail(C43791v5 r6) {
        String str;
        int A03 = AnonymousClass0Z0.A03(-123527732);
        super.onFail(r6);
        Throwable th = r6.A01;
        if (th != null) {
            str = th.getMessage();
        } else {
            str = "";
        }
        CCZ.A0E(this.A00.A04, C27398CBr.CONNECT_FACEBOOK_PAGE, "connect_button", str);
        Context context = this.A00.getContext();
        if (context != null) {
            AnonymousClass5F9.A01(context, C0003R.string.error_msg_linked_page, 0);
        }
        AnonymousClass0Z0.A0A(-79237100, A03);
    }

    public final void onFinish() {
        int A03 = AnonymousClass0Z0.A03(-373392919);
        super.onFinish();
        this.A00.A02.A03(false);
        AnonymousClass0Z0.A0A(1433902442, A03);
    }

    public final void onStart() {
        int A03 = AnonymousClass0Z0.A03(1268926885);
        super.onStart();
        this.A00.A02.A03(true);
        AnonymousClass0Z0.A0A(-1772327140, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0Z0.A03(1495937947);
        int A032 = AnonymousClass0Z0.A03(773050697);
        super.onSuccess((AVB) obj);
        CCZ.A0A(this.A00.A04, C27398CBr.CONNECT_FACEBOOK_PAGE, "connect_button");
        C16310oO.A00.A02();
        CCI cci = new CCI();
        CCQ ccq = this.A00;
        C52362Om r2 = new C52362Om(ccq.getActivity(), ccq.A05);
        r2.A08 = false;
        r2.A02 = cci;
        r2.A02();
        AnonymousClass0Z0.A0A(-2015050198, A032);
        AnonymousClass0Z0.A0A(1709027660, A03);
    }
}
