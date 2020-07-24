package com.google.android.gms.common.internal.service;

import android.os.Parcel;
import com.google.android.gms.internal.base.zab;
import p000X.AnonymousClass0Z0;

public abstract class zak extends zab implements zaj {
    public zak() {
        super("com.google.android.gms.common.internal.service.ICommonCallbacks");
        AnonymousClass0Z0.A0A(-1621605880, AnonymousClass0Z0.A03(2097305342));
    }

    public final boolean A00(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        int A03 = AnonymousClass0Z0.A03(1775244677);
        boolean z = true;
        if (i == 1) {
            Bv3(parcel.readInt());
            parcel2.writeNoException();
            i3 = 1717085327;
        } else {
            z = false;
            i3 = 718923302;
        }
        AnonymousClass0Z0.A0A(i3, A03);
        return z;
    }
}
