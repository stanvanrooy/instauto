package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.common.zzb;
import p000X.AnonymousClass0Z0;

public interface IGmsCallbacks extends IInterface {

    public abstract class zza extends zzb implements IGmsCallbacks {
        public zza() {
            super("com.google.android.gms.common.internal.IGmsCallbacks");
            AnonymousClass0Z0.A0A(-1564277526, AnonymousClass0Z0.A03(-1999163607));
        }

        public final boolean A02(int i, Parcel parcel, Parcel parcel2, int i2) {
            Parcelable parcelable;
            Parcelable parcelable2;
            Parcelable parcelable3;
            int A03 = AnonymousClass0Z0.A03(1939656697);
            if (i == 1) {
                int readInt = parcel.readInt();
                IBinder readStrongBinder = parcel.readStrongBinder();
                Parcelable.Creator creator = Bundle.CREATOR;
                if (parcel.readInt() == 0) {
                    parcelable = null;
                } else {
                    parcelable = (Parcelable) creator.createFromParcel(parcel);
                }
                BEu(readInt, readStrongBinder, (Bundle) parcelable);
            } else if (i == 2) {
                int readInt2 = parcel.readInt();
                Parcelable.Creator creator2 = Bundle.CREATOR;
                if (parcel.readInt() == 0) {
                    parcelable2 = null;
                } else {
                    parcelable2 = (Parcelable) creator2.createFromParcel(parcel);
                }
                BvD(readInt2, (Bundle) parcelable2);
            } else if (i != 3) {
                AnonymousClass0Z0.A0A(-548493785, A03);
                return false;
            } else {
                int readInt3 = parcel.readInt();
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                Parcelable.Creator creator3 = zzb.CREATOR;
                if (parcel.readInt() == 0) {
                    parcelable3 = null;
                } else {
                    parcelable3 = (Parcelable) creator3.createFromParcel(parcel);
                }
                BvE(readInt3, readStrongBinder2, (zzb) parcelable3);
            }
            parcel2.writeNoException();
            AnonymousClass0Z0.A0A(1064906314, A03);
            return true;
        }
    }

    void BEu(int i, IBinder iBinder, Bundle bundle);

    void BvD(int i, Bundle bundle);

    void BvE(int i, IBinder iBinder, zzb zzb);
}
