package com.google.android.play.core.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p000X.AnonymousClass0Z0;

/* renamed from: com.google.android.play.core.internal.j */
public class C0120j extends Binder implements IInterface {
    public C0120j() {
        int A03 = AnonymousClass0Z0.A03(-566600314);
        attachInterface(this, "com.google.android.play.core.splitinstall.protocol.ISplitInstallServiceCallback");
        AnonymousClass0Z0.A0A(-1125610757, A03);
    }

    public boolean A00(int i, Parcel parcel) {
        AnonymousClass0Z0.A0A(1415948895, AnonymousClass0Z0.A03(-1374657813));
        throw null;
    }

    public final IBinder asBinder() {
        AnonymousClass0Z0.A0A(634065944, AnonymousClass0Z0.A03(-1991684467));
        return this;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z;
        int i3;
        int A03 = AnonymousClass0Z0.A03(2005680516);
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            z = true;
            i3 = -2018988687;
            AnonymousClass0Z0.A0A(i3, A03);
            return z;
        }
        z = A00(i, parcel);
        i3 = 1840659626;
        AnonymousClass0Z0.A0A(i3, A03);
        return z;
    }
}
