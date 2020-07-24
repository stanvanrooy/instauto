package p000X;

import com.facebook.android.instantexperiences.autofill.RequestAutofillJSBridgeCallResult;
import com.facebook.android.instantexperiences.autofill.model.BrowserExtensionsAutofillData;
import java.util.List;

/* renamed from: X.B1H */
public final class B1H implements B15 {
    public final /* synthetic */ B1F A00;

    public B1H(B1F b1f) {
        this.A00 = b1f;
    }

    public final void Asp(BrowserExtensionsAutofillData browserExtensionsAutofillData) {
        this.A00.A01.A03(new RequestAutofillJSBridgeCallResult((List) new B1L(this, browserExtensionsAutofillData)));
        C25116B1m.A01(this.A00.A02.A02).A06(this.A00.A01, Constants.A0D);
        this.A00.A01.A03(new RequestAutofillJSBridgeCallResult((List) new B1M(this, browserExtensionsAutofillData)));
        B1F b1f = this.A00;
        b1f.A02.A01(b1f.A01);
    }
}
