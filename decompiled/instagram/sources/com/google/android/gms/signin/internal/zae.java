package com.google.android.gms.signin.internal;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zab;
import p000X.AnonymousClass0Z0;
import p000X.BAQ;

public abstract class zae extends zab implements zad {
    public zae() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
        AnonymousClass0Z0.A0A(1533272553, AnonymousClass0Z0.A03(-43131746));
    }

    public final boolean A00(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z;
        int i3;
        int A03 = AnonymousClass0Z0.A03(-431967162);
        if (i != 3) {
            if (i == 4) {
                Bv1((Status) BAQ.A00(parcel, Status.CREATOR));
            } else if (i == 6) {
                Bv2((Status) BAQ.A00(parcel, Status.CREATOR));
            } else if (i == 7) {
                Bum((Status) BAQ.A00(parcel, Status.CREATOR), (GoogleSignInAccount) BAQ.A00(parcel, GoogleSignInAccount.CREATOR));
            } else if (i != 8) {
                z = false;
                i3 = 842251760;
            } else {
                Buv((zaj) BAQ.A00(parcel, zaj.CREATOR));
            }
            parcel2.writeNoException();
            z = true;
            i3 = -560292484;
        } else {
            Bul((ConnectionResult) BAQ.A00(parcel, ConnectionResult.CREATOR), (zaa) BAQ.A00(parcel, zaa.CREATOR));
            parcel2.writeNoException();
            z = true;
            i3 = -560292484;
        }
        AnonymousClass0Z0.A0A(i3, A03);
        return z;
    }
}
