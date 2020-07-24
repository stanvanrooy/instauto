package com.google.android.gms.internal.p026authapi;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import p000X.AnonymousClass0Z0;
import p000X.BAW;

/* renamed from: com.google.android.gms.internal.auth-api.zzx */
public final class zzx extends zzc implements zzw {
    public zzx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        AnonymousClass0Z0.A0A(-1613195132, AnonymousClass0Z0.A03(-1138252042));
    }

    public final void Bve(zzu zzu) {
        int A03 = AnonymousClass0Z0.A03(-302610939);
        Parcel A00 = A00();
        BAW.A01(A00, zzu);
        A01(4, A00);
        AnonymousClass0Z0.A0A(558651495, A03);
    }

    public final void Bvf(zzu zzu, CredentialRequest credentialRequest) {
        int A03 = AnonymousClass0Z0.A03(1743489755);
        Parcel A00 = A00();
        BAW.A01(A00, zzu);
        if (credentialRequest == null) {
            A00.writeInt(0);
        } else {
            A00.writeInt(1);
            credentialRequest.writeToParcel(A00, 0);
        }
        A01(1, A00);
        AnonymousClass0Z0.A0A(1973836751, A03);
    }

    public final void Bvg(zzu zzu, zzy zzy) {
        int A03 = AnonymousClass0Z0.A03(1976712687);
        Parcel A00 = A00();
        BAW.A01(A00, zzu);
        if (zzy == null) {
            A00.writeInt(0);
        } else {
            A00.writeInt(1);
            zzy.writeToParcel(A00, 0);
        }
        A01(2, A00);
        AnonymousClass0Z0.A0A(628136961, A03);
    }
}
