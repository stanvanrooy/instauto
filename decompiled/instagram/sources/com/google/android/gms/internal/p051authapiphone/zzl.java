package com.google.android.gms.internal.p051authapiphone;

import com.google.android.gms.common.api.Status;
import p000X.AnonymousClass0Z0;
import p000X.B57;
import p000X.BGS;
import p000X.C229239x9;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzl */
public final class zzl extends zzh {
    public final /* synthetic */ BGS A00;

    public zzl(BGS bgs) {
        this.A00 = bgs;
        AnonymousClass0Z0.A0A(1828667964, AnonymousClass0Z0.A03(-947156965));
    }

    public final void BvF(Status status) {
        int A03 = AnonymousClass0Z0.A03(933848100);
        B57 b57 = this.A00.A00;
        if (status.A01()) {
            b57.A01((Object) null);
        } else {
            b57.A00.A0H(new C229239x9(status));
        }
        AnonymousClass0Z0.A0A(1202454828, A03);
    }
}
