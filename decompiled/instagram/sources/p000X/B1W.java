package p000X;

import com.facebook.android.instantexperiences.jscall.InstantExperiencesJSBridgeCall;
import com.facebook.android.instantexperiences.payment.CanMakePaymentJSBridgeCall;
import com.facebook.android.instantexperiences.payment.CanMakePaymentJSBridgeCallResult;

/* renamed from: X.B1W */
public final class B1W extends B1U {
    public final /* bridge */ /* synthetic */ void A01(InstantExperiencesJSBridgeCall instantExperiencesJSBridgeCall) {
        super.A01((CanMakePaymentJSBridgeCall) instantExperiencesJSBridgeCall);
    }

    public final /* bridge */ /* synthetic */ void A02(InstantExperiencesJSBridgeCall instantExperiencesJSBridgeCall) {
        CanMakePaymentJSBridgeCall canMakePaymentJSBridgeCall = (CanMakePaymentJSBridgeCall) instantExperiencesJSBridgeCall;
        super.A02(canMakePaymentJSBridgeCall);
        boolean Agv = canMakePaymentJSBridgeCall.A01.ALc().Agv();
        canMakePaymentJSBridgeCall.A03(new CanMakePaymentJSBridgeCallResult(Agv));
        canMakePaymentJSBridgeCall.A03(new CanMakePaymentJSBridgeCallResult(Agv));
        super.A01(canMakePaymentJSBridgeCall);
    }

    public B1W(AnonymousClass0C1 r2, AV6 av6) {
        super(C25116B1m.A01(r2), av6);
    }
}
