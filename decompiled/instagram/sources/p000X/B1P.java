package p000X;

import android.text.TextUtils;
import com.facebook.android.instantexperiences.autofill.save.SaveAutofillDataJSBridgeCall;
import com.facebook.android.instantexperiences.jscall.InstantExperienceGenericErrorResult;
import com.facebook.android.instantexperiences.jscall.InstantExperiencesJSBridgeCall;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* renamed from: X.B1P */
public final class B1P extends B1U {
    public C25103B0q A00;
    public C25114B1k A01;
    public AnonymousClass0C1 A02;
    public Executor A03;

    public final /* bridge */ /* synthetic */ void A02(InstantExperiencesJSBridgeCall instantExperiencesJSBridgeCall) {
        SaveAutofillDataJSBridgeCall saveAutofillDataJSBridgeCall = (SaveAutofillDataJSBridgeCall) instantExperiencesJSBridgeCall;
        super.A02(saveAutofillDataJSBridgeCall);
        String join = TextUtils.join(",", new ArrayList(saveAutofillDataJSBridgeCall.A04().keySet()));
        C25116B1m.A01(this.A02).A07(saveAutofillDataJSBridgeCall, Constants.A0F, new C25111B1h(this, join));
        if (!saveAutofillDataJSBridgeCall.A01.ALc().AeK()) {
            saveAutofillDataJSBridgeCall.A03(new InstantExperienceGenericErrorResult(C25109B1d.FEATURE_UNAVAILABLE, "This feature is not available at this time"));
            return;
        }
        C25103B0q b0q = this.A00;
        HashMap A04 = saveAutofillDataJSBridgeCall.A04();
        C14440kc r5 = new C14440kc();
        C25092B0c b0c = b0q.A00;
        C14440kc r3 = new C14440kc();
        AnonymousClass0Z9.A03(b0c.A03, new C25098B0i(b0c, new C25093B0d(b0c, r3)), 1347574424);
        AnonymousClass2MU.A03(r3, new C25095B0f(b0q, A04, r5), b0q.A03);
        AnonymousClass2MU.A03(r5, new B1S(this, saveAutofillDataJSBridgeCall, join), this.A03);
    }

    public B1P(AnonymousClass0C1 r2, C25114B1k b1k, AV6 av6, Executor executor, C25103B0q b0q) {
        super(C25116B1m.A01(r2), av6);
        this.A02 = r2;
        this.A01 = b1k;
        this.A03 = executor;
        this.A00 = b0q;
    }
}
