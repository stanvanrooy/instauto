package p000X;

import com.facebook.C0003R;

/* renamed from: X.CBY */
public final class CBY extends C17920r1 {
    public final /* synthetic */ CD9 A00;

    public CBY(CD9 cd9) {
        this.A00 = cd9;
    }

    public final void onFail(C43791v5 r6) {
        String str;
        int A03 = AnonymousClass0Z0.A03(-1819734185);
        super.onFail(r6);
        if (this.A00.getContext() != null) {
            Throwable th = r6.A01;
            if (th != null) {
                str = th.getMessage();
            } else {
                str = "";
            }
            CCZ.A0E(this.A00.A0E, C27398CBr.EDIT_AUDIENCE, "edit_audience", str);
            CD9 cd9 = this.A00;
            AnonymousClass5F9.A03(cd9.getContext(), cd9.getString(C0003R.string.promote_edit_audience_error_alert), 0);
        }
        AnonymousClass0Z0.A0A(-1781567489, A03);
    }

    public final void onFinish() {
        int A03 = AnonymousClass0Z0.A03(137077162);
        super.onFinish();
        this.A00.A0C.A01.setIsLoading(false);
        AnonymousClass0Z0.A0A(-1647716073, A03);
    }

    public final void onStart() {
        int A03 = AnonymousClass0Z0.A03(-899714045);
        super.onStart();
        this.A00.A0C.A01.setIsLoading(true);
        AnonymousClass0Z0.A0A(-1913018859, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0Z0.A03(841318548);
        C23654AWr aWr = (C23654AWr) obj;
        int A032 = AnonymousClass0Z0.A03(-2028763324);
        super.onSuccess(aWr);
        if (aWr.A00) {
            this.A00.A0F.A01();
            this.A00.getActivity().onBackPressed();
        } else {
            CCZ.A0E(this.A00.A0E, C27398CBr.EDIT_AUDIENCE, "edit_audience", "");
        }
        AnonymousClass0Z0.A0A(-850463904, A032);
        AnonymousClass0Z0.A0A(207430896, A03);
    }
}
