package com.google.android.gms.auth.api.signin.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.internal.p026authapi.zzc;
import p000X.AnonymousClass0Z0;
import p000X.BAW;
import p000X.C193418Ps;

public final class zzv extends zzc implements zzu {
    public zzv(IBinder iBinder) {
        super(iBinder, C193418Ps.$const$string(89));
        AnonymousClass0Z0.A0A(1236322641, AnonymousClass0Z0.A03(-574130192));
    }

    public final void Bvh(zzs zzs, GoogleSignInOptions googleSignInOptions) {
        int A03 = AnonymousClass0Z0.A03(93278083);
        Parcel A00 = A00();
        BAW.A01(A00, zzs);
        if (googleSignInOptions == null) {
            A00.writeInt(0);
        } else {
            A00.writeInt(1);
            googleSignInOptions.writeToParcel(A00, 0);
        }
        A01(103, A00);
        AnonymousClass0Z0.A0A(2032226055, A03);
    }
}
