package p000X;

import android.content.Context;

/* renamed from: X.CHC */
public final class CHC implements CH9 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass1AM A01;

    public CHC(Context context, AnonymousClass1AM r2) {
        this.A00 = context;
        this.A01 = r2;
    }

    public final C27873CUn AH9() {
        Context context = this.A00;
        AnonymousClass1AM r2 = this.A01;
        int A06 = (int) (((float) C06220Of.A06(context)) * 0.7f);
        C27873CUn cUn = new C27873CUn();
        cUn.A00 = A06;
        cUn.A07 = C31201Wx.A01(context);
        cUn.A05 = r2;
        return cUn;
    }

    public final C27533CGx AaS() {
        Context context = this.A00;
        AnonymousClass1AM r2 = this.A01;
        C27533CGx cGx = new C27533CGx();
        cGx.A05 = C31201Wx.A01(context);
        cGx.A03 = r2;
        return cGx;
    }
}
