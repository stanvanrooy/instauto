package p000X;

import com.facebook.react.modules.core.RCTNativeAppEventEmitter;

/* renamed from: X.0oL  reason: invalid class name and case insensitive filesystem */
public final class C16280oL extends C16290oM {
    public AnonymousClass6BT A00;

    public final AnonymousClass6BT A00() {
        if (this.A00 == null) {
            this.A00 = new AnonymousClass6BT();
        }
        return this.A00;
    }

    public final void A01(AnonymousClass0C1 r4, int i) {
        A3N A04 = C16940pQ.A00().A01(r4).A02().A04();
        C228259s1 A03 = C23041A0r.A03();
        A03.putInt("request_count", i);
        if (A04 != null) {
            ((RCTNativeAppEventEmitter) A04.A01(RCTNativeAppEventEmitter.class)).emit("IGUpdatePartnerRequestCount", A03);
        }
    }
}
