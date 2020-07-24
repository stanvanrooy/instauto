package com.google.android.gms.flags;

import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.flags.zzb;
import p000X.AnonymousClass0Z0;

public abstract class zzd extends zzb implements zzc {
    public zzd() {
        AnonymousClass0Z0.A0A(908346635, AnonymousClass0Z0.A03(2060808163));
    }

    public final boolean A00(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        int A03 = AnonymousClass0Z0.A03(-1546929479);
        if (i != 1) {
            if (i == 2) {
                String readString = parcel.readString();
                boolean z = false;
                if (parcel.readInt() != 0) {
                    z = true;
                }
                i3 = getBooleanFlagValue(readString, z, parcel.readInt());
            } else if (i == 3) {
                i3 = getIntFlagValue(parcel.readString(), parcel.readInt(), parcel.readInt());
            } else if (i == 4) {
                long longFlagValue = getLongFlagValue(parcel.readString(), parcel.readLong(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeLong(longFlagValue);
            } else if (i != 5) {
                AnonymousClass0Z0.A0A(-1291390846, A03);
                return false;
            } else {
                String stringFlagValue = getStringFlagValue(parcel.readString(), parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeString(stringFlagValue);
            }
            parcel2.writeNoException();
            parcel2.writeInt(i3);
        } else {
            init(IObjectWrapper.Stub.A01(parcel.readStrongBinder()));
            parcel2.writeNoException();
        }
        AnonymousClass0Z0.A0A(-1492930898, A03);
        return true;
    }
}
