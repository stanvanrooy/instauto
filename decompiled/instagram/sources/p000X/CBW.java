package p000X;

import android.content.Context;
import android.os.Handler;
import com.facebook.C0003R;

/* renamed from: X.CBW */
public final class CBW extends C17920r1 {
    public final /* synthetic */ CC3 A00;

    public CBW(CC3 cc3) {
        this.A00 = cc3;
    }

    public final void onFail(C43791v5 r6) {
        String str;
        int A03 = AnonymousClass0Z0.A03(689122615);
        super.onFail(r6);
        Throwable th = r6.A01;
        if (th != null) {
            str = th.getMessage();
        } else {
            str = "";
        }
        CCZ.A0E(this.A00.A00.A0A, C27398CBr.AUDIENCE, "hec_appeal", str);
        CC4 cc4 = this.A00.A00;
        Context context = cc4.getContext();
        if (context != null) {
            C53642Tq.A01(context, cc4.getString(C0003R.string.error_msg), 0).show();
        }
        AnonymousClass0Z0.A0A(-1083603168, A03);
    }

    public final void onFinish() {
        int A03 = AnonymousClass0Z0.A03(1863061279);
        super.onFinish();
        this.A00.A00.A07.A01.setIsLoading(false);
        AnonymousClass0Z0.A0A(-1336850707, A03);
    }

    public final void onStart() {
        int A03 = AnonymousClass0Z0.A03(-658684411);
        super.onStart();
        this.A00.A00.A07.A01.setIsLoading(true);
        AnonymousClass0Z0.A0A(-654856713, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0Z0.A03(-144146492);
        C23660AWx aWx = (C23660AWx) obj;
        int A032 = AnonymousClass0Z0.A03(1747309462);
        super.onSuccess(aWx);
        if (aWx.A00) {
            CCZ.A0A(this.A00.A00.A0A, C27398CBr.AUDIENCE, "hec_appeal");
            this.A00.A00.getActivity().finish();
            CC4 cc4 = this.A00.A00;
            AnonymousClass0ZA.A09(new Handler(), new AnonymousClass6PR(cc4, cc4.getString(C0003R.string.promote_hec_appeal_promotion_submit_notification)), 500, 1027963486);
        } else {
            CCZ.A0E(this.A00.A00.A0A, C27398CBr.AUDIENCE, "hec_appeal", "");
        }
        AnonymousClass0Z0.A0A(-282663066, A032);
        AnonymousClass0Z0.A0A(-1276224952, A03);
    }
}
