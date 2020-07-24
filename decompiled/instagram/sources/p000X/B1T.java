package p000X;

import com.facebook.android.instantexperiences.jscall.InstantExperienceGenericErrorResult;
import com.facebook.android.instantexperiences.jscall.InstantExperiencesJSBridgeCall;
import java.util.concurrent.Executors;

/* renamed from: X.B1T */
public final class B1T {
    public final B12 A00;
    public final B1P A01;
    public final B1W A02;
    public final C25113B1j A03;
    public final C25112B1i A04;

    private B1U A00(InstantExperiencesJSBridgeCall instantExperiencesJSBridgeCall) {
        String A012 = instantExperiencesJSBridgeCall.A01();
        char c = 65535;
        switch (A012.hashCode()) {
            case -2010971576:
                if (A012.equals("canMakePayment")) {
                    c = 2;
                    break;
                }
                break;
            case -1167572077:
                if (A012.equals("paymentsCheckout")) {
                    c = 3;
                    break;
                }
                break;
            case -267636863:
                if (A012.equals("requestAutoFill")) {
                    c = 0;
                    break;
                }
                break;
            case -257417255:
                if (A012.equals("paymentsChargeRequst")) {
                    c = 4;
                    break;
                }
                break;
            case 1722704025:
                if (A012.equals("saveAutofillData")) {
                    c = 1;
                    break;
                }
                break;
        }
        if (c == 0) {
            return this.A00;
        }
        if (c == 1) {
            return this.A01;
        }
        if (c == 2) {
            return this.A02;
        }
        if (c == 3) {
            return this.A04;
        }
        if (c == 4) {
            return this.A03;
        }
        AnonymousClass0DB.A0J("InstantExperiencesCallHandler", "Unknown call code '%s'", A012);
        return null;
    }

    public B1T(AnonymousClass0C1 r12, C25114B1k b1k, AV6 av6, C25092B0c b0c, C25103B0q b0q) {
        this.A00 = new B12(r12, Executors.newSingleThreadExecutor(), b1k, av6, b0c);
        this.A01 = new B1P(r12, b1k, av6, Executors.newSingleThreadExecutor(), b0q);
        this.A04 = new C25112B1i(r12, b1k, av6);
        this.A02 = new B1W(r12, av6);
        this.A03 = new C25113B1j(r12, av6);
    }

    public final void A01(InstantExperiencesJSBridgeCall instantExperiencesJSBridgeCall) {
        try {
            B1U A002 = A00(instantExperiencesJSBridgeCall);
            if (A002 != null) {
                A002.A02(instantExperiencesJSBridgeCall);
            }
        } catch (C229249xC e) {
            instantExperiencesJSBridgeCall.A03(new InstantExperienceGenericErrorResult(e));
            B1U A003 = A00(instantExperiencesJSBridgeCall);
            if (A003 != null) {
                A003.A01(instantExperiencesJSBridgeCall);
            }
        }
    }
}
