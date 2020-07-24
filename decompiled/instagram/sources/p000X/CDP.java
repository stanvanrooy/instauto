package p000X;

import com.facebook.C0003R;

/* renamed from: X.CDP */
public final class CDP extends C17920r1 {
    public final /* synthetic */ CD9 A00;

    public CDP(CD9 cd9) {
        this.A00 = cd9;
    }

    public final void onFail(C43791v5 r6) {
        String str;
        int A03 = AnonymousClass0Z0.A03(1983871421);
        super.onFail(r6);
        if (this.A00.getContext() != null) {
            Throwable th = r6.A01;
            if (th != null) {
                str = th.getMessage();
            } else {
                str = "";
            }
            CCZ.A0E(this.A00.A0E, C27398CBr.CREATE_AUDIENCE, "create_audience", str);
            CD9 cd9 = this.A00;
            AnonymousClass5F9.A03(cd9.getContext(), cd9.getString(C0003R.string.promote_create_audience_error_alert), 0);
        }
        AnonymousClass0Z0.A0A(-944108158, A03);
    }

    public final void onFinish() {
        int A03 = AnonymousClass0Z0.A03(1798246615);
        super.onFinish();
        this.A00.A0C.A01.setIsLoading(false);
        AnonymousClass0Z0.A0A(241579634, A03);
    }

    public final void onStart() {
        int A03 = AnonymousClass0Z0.A03(-951992165);
        super.onStart();
        this.A00.A0C.A01.setIsLoading(true);
        AnonymousClass0Z0.A0A(1863972623, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0Z0.A03(-212905767);
        CG7 cg7 = (CG7) obj;
        int A032 = AnonymousClass0Z0.A03(-1985915909);
        super.onSuccess(cg7);
        if (C27500CFq.A00(this.A00.A0G).booleanValue()) {
            CGB cgb = cg7.A00;
            if (cgb != null) {
                CD3 cd3 = this.A00.A0E;
                C27398CBr cBr = C27398CBr.CREATE_AUDIENCE;
                String str = cgb.A03;
                String A02 = C27460CEc.A02(cgb.A01);
                AnonymousClass0P4 A002 = AnonymousClass2VV.A00(Constants.A04);
                A002.A0G("step", cBr.toString());
                A002.A0G("action", "create_audience");
                A002.A0G("error_identifier", A02);
                A002.A0G("error_message", str);
                CCZ.A0G(cd3, A002);
                AnonymousClass5F9.A03(this.A00.getContext(), cgb.A02, 0);
            }
            this.A00.A0F.A01();
            CCZ.A0A(this.A00.A0E, C27398CBr.CREATE_AUDIENCE, "create_audience");
            CD9 cd9 = this.A00;
            cd9.A0F.A0A(cd9.A0E, cg7.A01);
            this.A00.getActivity().onBackPressed();
        } else {
            if (!cg7.A02) {
                CCZ.A0E(this.A00.A0E, C27398CBr.CREATE_AUDIENCE, "create_audience", "");
            }
            this.A00.A0F.A01();
            CCZ.A0A(this.A00.A0E, C27398CBr.CREATE_AUDIENCE, "create_audience");
            CD9 cd92 = this.A00;
            cd92.A0F.A0A(cd92.A0E, cg7.A01);
            this.A00.getActivity().onBackPressed();
        }
        AnonymousClass0Z0.A0A(-754924988, A032);
        AnonymousClass0Z0.A0A(-17880030, A03);
    }
}
