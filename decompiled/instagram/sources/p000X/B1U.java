package p000X;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.facebook.android.instantexperiences.jscall.InstantExperienceGenericErrorResult;
import com.facebook.android.instantexperiences.jscall.InstantExperiencesCallResult;
import com.facebook.android.instantexperiences.jscall.InstantExperiencesJSBridgeCall;
import com.facebook.common.stringformat.StringFormatUtil;

/* renamed from: X.B1U */
public abstract class B1U {
    public final AV6 A00;
    public final C25116B1m A01;

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0059, code lost:
        if (r3.getAuthority().equals(r2.getAuthority()) == false) goto L_0x005b;
     */
    public static void A00(B1U b1u, InstantExperiencesJSBridgeCall instantExperiencesJSBridgeCall) {
        boolean z;
        String str = instantExperiencesJSBridgeCall.A02;
        String url = b1u.A00.getUrl();
        if (!AnonymousClass1BX.A00(str) && !AnonymousClass1BX.A00(url)) {
            Uri parse = Uri.parse(str);
            Uri parse2 = Uri.parse(url);
            if (parse != null && parse2 != null && !AnonymousClass1BX.A00(parse.getScheme()) && parse.getScheme().equals(parse2.getScheme()) && parse.getPort() == parse2.getPort() && !AnonymousClass1BX.A00(parse.getAuthority())) {
                z = true;
            }
        }
        z = false;
        if (z) {
            InstantExperiencesCallResult instantExperiencesCallResult = instantExperiencesJSBridgeCall.A00;
            if (AnonymousClass1BX.A00(instantExperiencesCallResult.A01)) {
                throw new RuntimeException("Invalid state: Missing or invalid callback handler name");
            } else if (!AnonymousClass1BX.A00(instantExperiencesCallResult.A00)) {
                String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("%s", instantExperiencesCallResult.A03.toArray());
                String str2 = instantExperiencesCallResult.A01;
                boolean z2 = false;
                if (instantExperiencesCallResult.A02 == null) {
                    z2 = true;
                }
                String A002 = new C180787ni(str2, z2, instantExperiencesCallResult.A00, formatStrLocaleSafe).A00();
                if (!AnonymousClass1BX.A00(A002)) {
                    b1u.A00.A00(A002);
                    return;
                }
                throw new RuntimeException("Could not construct JS callback string");
            } else {
                throw new RuntimeException("Invalid state: Missing callback id");
            }
        }
    }

    public void A01(InstantExperiencesJSBridgeCall instantExperiencesJSBridgeCall) {
        if (instantExperiencesJSBridgeCall.A00 == null) {
            instantExperiencesJSBridgeCall.A03(new InstantExperienceGenericErrorResult(C25109B1d.INTERNAL_ERROR, "Internal error"));
            AnonymousClass0DB.A0L("InstantExperiencesJSBridgeCallHandler", "Result missing for call id: %s", instantExperiencesJSBridgeCall.A01());
        }
        this.A01.A07(instantExperiencesJSBridgeCall, Constants.ONE, new B1X(this, instantExperiencesJSBridgeCall.A00.A02));
        if (Looper.myLooper() == Looper.getMainLooper()) {
            A00(this, instantExperiencesJSBridgeCall);
        } else {
            AnonymousClass0ZA.A0E(new Handler(Looper.getMainLooper()), new B2L(this, instantExperiencesJSBridgeCall), 810424190);
        }
    }

    public void A02(InstantExperiencesJSBridgeCall instantExperiencesJSBridgeCall) {
        this.A01.A06(instantExperiencesJSBridgeCall, Constants.ZERO);
        instantExperiencesJSBridgeCall.A02();
    }

    public B1U(C25116B1m b1m, AV6 av6) {
        this.A00 = av6;
        this.A01 = b1m;
    }
}
