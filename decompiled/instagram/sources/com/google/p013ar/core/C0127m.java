package com.google.p013ar.core;

import android.os.Bundle;
import android.util.Log;
import com.google.p045a.p047b.p048a.p049a.p050a.C0111e;
import p000X.AnonymousClass0Z0;
import p000X.B82;
import p000X.C30179DUa;

/* renamed from: com.google.ar.core.m */
public final class C0127m extends C0111e {
    public final /* synthetic */ B82 A00;

    public C0127m(B82 b82) {
        this.A00 = b82;
        AnonymousClass0Z0.A0A(935663683, AnonymousClass0Z0.A03(318093302));
    }

    public final void A29() {
        AnonymousClass0Z0.A0A(1759174460, AnonymousClass0Z0.A03(1021893455));
    }

    public final void A2B(Bundle bundle) {
        int i;
        int A03 = AnonymousClass0Z0.A03(1078596221);
        int i2 = bundle.getInt("error.code", -100);
        if (i2 == -5) {
            Log.e("ARCore-InstallService", "The device is not supported.");
            this.A00.A00.A00(C30179DUa.A07);
            i = 2015239381;
        } else if (i2 == -3) {
            Log.e("ARCore-InstallService", "The Google Play application must be updated.");
            this.A00.A00.A00(C30179DUa.A06);
            i = -1305407816;
        } else if (i2 != 0) {
            StringBuilder sb = new StringBuilder(33);
            sb.append("requestInfo returned: ");
            sb.append(i2);
            Log.e("ARCore-InstallService", sb.toString());
            this.A00.A00.A00(C30179DUa.A06);
            i = -1875827410;
        } else {
            this.A00.A00.A00(C30179DUa.A04);
            i = -853348818;
        }
        AnonymousClass0Z0.A0A(i, A03);
    }

    public final void A6C() {
        AnonymousClass0Z0.A0A(2078120066, AnonymousClass0Z0.A03(-1622648594));
    }
}
