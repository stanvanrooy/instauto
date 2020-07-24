package com.google.android.gms.internal.location;

import com.google.android.gms.location.LocationSettingsResult;
import p000X.AnonymousClass0Z0;
import p000X.AnonymousClass0a2;
import p000X.C25398BHv;

public final class zzbc extends zzar {
    public C25398BHv A00;

    public zzbc(C25398BHv bHv) {
        int A03 = AnonymousClass0Z0.A03(1022152878);
        AnonymousClass0a2.A08(bHv != null, "listener can't be null.");
        this.A00 = bHv;
        AnonymousClass0Z0.A0A(-541101388, A03);
    }

    public final void BvP(LocationSettingsResult locationSettingsResult) {
        int A03 = AnonymousClass0Z0.A03(-1306953323);
        this.A00.BkF(locationSettingsResult);
        this.A00 = null;
        AnonymousClass0Z0.A0A(-1230297870, A03);
    }
}
