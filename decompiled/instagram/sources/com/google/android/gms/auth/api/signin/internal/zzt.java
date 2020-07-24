package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p026authapi.zzd;
import p000X.AnonymousClass0Z0;
import p000X.BAW;

public abstract class zzt extends zzd implements zzs {
    public zzt() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
        AnonymousClass0Z0.A0A(-323388744, AnonymousClass0Z0.A03(486641422));
    }

    public final boolean A01(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z;
        int i3;
        int A03 = AnonymousClass0Z0.A03(-1129124566);
        switch (i) {
            case 101:
                Bva((GoogleSignInAccount) BAW.A00(parcel, GoogleSignInAccount.CREATOR), (Status) BAW.A00(parcel, Status.CREATOR));
                break;
            case 102:
                Bvi((Status) BAW.A00(parcel, Status.CREATOR));
                break;
            case 103:
                Bvj((Status) BAW.A00(parcel, Status.CREATOR));
                break;
            default:
                z = false;
                i3 = -1498956939;
                break;
        }
        parcel2.writeNoException();
        z = true;
        i3 = 704315631;
        AnonymousClass0Z0.A0A(i3, A03);
        return z;
    }
}
