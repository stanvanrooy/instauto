package p000X;

import com.facebook.android.instantexperiences.autofill.save.SaveAutofillDataJSBridgeCall;
import com.instagram.business.instantexperiences.IGInstantExperiencesParameters;
import java.util.List;

/* renamed from: X.B1S */
public final class B1S implements AnonymousClass2TQ {
    public final /* synthetic */ String A00;
    public final /* synthetic */ SaveAutofillDataJSBridgeCall A01;
    public final /* synthetic */ B1P A02;

    public final void B46(Throwable th) {
    }

    public B1S(B1P b1p, SaveAutofillDataJSBridgeCall saveAutofillDataJSBridgeCall, String str) {
        this.A02 = b1p;
        this.A01 = saveAutofillDataJSBridgeCall;
        this.A00 = str;
    }

    public final /* bridge */ /* synthetic */ void BPi(Object obj) {
        List list = (List) obj;
        if (list == null || list.isEmpty()) {
            C25116B1m.A01(this.A02.A02).A07(this.A01, Constants.A0H, new C25110B1e(this));
            return;
        }
        C25114B1k b1k = this.A02.A01;
        C25104B0w b0w = b1k.A02;
        IGInstantExperiencesParameters iGInstantExperiencesParameters = b1k.A00;
        AnonymousClass0Z9.A03(b0w.A04, new B0u(b0w, b1k.mView, list, iGInstantExperiencesParameters), -650699954);
    }
}
