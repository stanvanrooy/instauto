package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.zza;
import p000X.AnonymousClass0C5;
import p000X.AnonymousClass0Z0;

public final class zzk extends zza implements zzi {
    public zzk(IBinder iBinder) {
        super(iBinder, AnonymousClass0C5.$const$string(206));
        AnonymousClass0Z0.A0A(-1652551307, AnonymousClass0Z0.A03(1967981305));
    }

    public final IObjectWrapper BvU() {
        int A03 = AnonymousClass0Z0.A03(1672897338);
        Parcel A01 = A01(1, A00());
        IObjectWrapper A012 = IObjectWrapper.Stub.A01(A01.readStrongBinder());
        A01.recycle();
        AnonymousClass0Z0.A0A(1198717969, A03);
        return A012;
    }

    public final int BvZ() {
        int A03 = AnonymousClass0Z0.A03(-1191239021);
        Parcel A01 = A01(2, A00());
        int readInt = A01.readInt();
        A01.recycle();
        AnonymousClass0Z0.A0A(2085020914, A03);
        return readInt;
    }
}
