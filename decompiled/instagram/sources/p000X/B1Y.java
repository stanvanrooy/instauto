package p000X;

import com.facebook.android.instantexperiences.payment.PaymentsJSBridgeCall;

/* renamed from: X.B1Y */
public abstract class B1Y extends B1U {
    /* renamed from: A03 */
    public void A02(PaymentsJSBridgeCall paymentsJSBridgeCall) {
        if (!(this instanceof C25112B1i)) {
            super.A02(paymentsJSBridgeCall);
            if (!paymentsJSBridgeCall.A01.ALc().Agv()) {
                throw new C229249xC(C25109B1d.UNSUPPORTED_CALL, (String) null);
            }
        }
    }

    public B1Y(AnonymousClass0C1 r2, AV6 av6) {
        super(C25116B1m.A01(r2), av6);
    }
}
