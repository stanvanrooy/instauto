package p000X;

import com.facebook.android.instantexperiences.jscall.InstantExperiencesJSBridgeCall;

/* renamed from: X.B2L */
public final class B2L implements Runnable {
    public final /* synthetic */ InstantExperiencesJSBridgeCall A00;
    public final /* synthetic */ B1U A01;

    public B2L(B1U b1u, InstantExperiencesJSBridgeCall instantExperiencesJSBridgeCall) {
        this.A01 = b1u;
        this.A00 = instantExperiencesJSBridgeCall;
    }

    public final void run() {
        B1U.A00(this.A01, this.A00);
    }
}
