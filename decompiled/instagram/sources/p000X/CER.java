package p000X;

import android.os.Bundle;
import android.view.View;

/* renamed from: X.CER */
public final class CER implements View.OnClickListener {
    public final /* synthetic */ CDC A00;
    public final /* synthetic */ String A01;

    public CER(CDC cdc, String str) {
        this.A00 = cdc;
        this.A01 = str;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0Z0.A05(822308684);
        C16310oO.A00.A02();
        CD9 cd9 = new CD9();
        Bundle bundle = new Bundle();
        bundle.putString("audienceID", this.A01);
        cd9.setArguments(bundle);
        CDC cdc = this.A00;
        C52362Om r2 = new C52362Om(cdc.A01, cdc.A03.A0Q);
        r2.A02 = cd9;
        r2.A02();
        AnonymousClass0Z0.A0C(-294597409, A05);
    }
}
