package p000X;

import android.os.Bundle;

/* renamed from: X.0ns  reason: invalid class name and case insensitive filesystem */
public final class C16000ns {
    public static final String A00(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return bundle.getString("DynamicFlowPlugin.extraFlowId");
    }

    public final boolean A04(Bundle bundle) {
        if (bundle == null || A00(bundle) == null) {
            return false;
        }
        return true;
    }

    public final String A01(Bundle bundle) {
        AnonymousClass0a4.A06(bundle);
        AnonymousClass0a4.A06(A00(bundle));
        return C15870nf.A00().A06(A00(bundle));
    }

    public final void A02(Bundle bundle, Object obj) {
        AnonymousClass0a4.A06(bundle);
        AnonymousClass0a4.A06(A00(bundle));
        C15870nf.A00().A0C(A00(bundle), obj);
    }

    public final void A03(Bundle bundle, Object obj) {
        AnonymousClass0a4.A06(bundle);
        AnonymousClass0a4.A06(A00(bundle));
        C15870nf.A00().A0A(A00(bundle), obj);
    }
}
