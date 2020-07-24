package com.google.android.gms.internal.p026authapi;

import android.os.Parcel;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;
import p000X.AnonymousClass0Z0;
import p000X.BAW;

/* renamed from: com.google.android.gms.internal.auth-api.zzv */
public abstract class zzv extends zzd implements zzu {
    public zzv() {
        super("com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks");
        AnonymousClass0Z0.A0A(1889449616, AnonymousClass0Z0.A03(-392235434));
    }

    public final boolean A01(int i, Parcel parcel, Parcel parcel2, int i2) {
        int A03 = AnonymousClass0Z0.A03(274529110);
        if (i == 1) {
            Bvc((Status) BAW.A00(parcel, Status.CREATOR), (Credential) BAW.A00(parcel, Credential.CREATOR));
        } else if (i == 2) {
            Bvb((Status) BAW.A00(parcel, Status.CREATOR));
        } else if (i != 3) {
            AnonymousClass0Z0.A0A(1533887278, A03);
            return false;
        } else {
            Bvd((Status) BAW.A00(parcel, Status.CREATOR), parcel.readString());
        }
        parcel2.writeNoException();
        AnonymousClass0Z0.A0A(777023285, A03);
        return true;
    }
}
