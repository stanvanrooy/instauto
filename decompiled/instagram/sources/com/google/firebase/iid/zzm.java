package com.google.firebase.iid;

import android.os.Build;
import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import p000X.C25176B5c;

public class zzm implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C25176B5c();
    public Messenger A00;
    public zzu A01;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        IBinder asBinder;
        IBinder asBinder2;
        if (obj == null) {
            return false;
        }
        try {
            Messenger messenger = this.A00;
            if (messenger != null) {
                asBinder = messenger.getBinder();
            } else {
                asBinder = this.A01.asBinder();
            }
            zzm zzm = (zzm) obj;
            Messenger messenger2 = zzm.A00;
            if (messenger2 != null) {
                asBinder2 = messenger2.getBinder();
            } else {
                asBinder2 = zzm.A01.asBinder();
            }
            return asBinder.equals(asBinder2);
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        IBinder asBinder;
        Messenger messenger = this.A00;
        if (messenger != null) {
            asBinder = messenger.getBinder();
        } else {
            asBinder = this.A01.asBinder();
        }
        return asBinder.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder asBinder;
        Messenger messenger = this.A00;
        if (messenger != null) {
            asBinder = messenger.getBinder();
        } else {
            asBinder = this.A01.asBinder();
        }
        parcel.writeStrongBinder(asBinder);
    }

    public zzm(IBinder iBinder) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.A00 = new Messenger(iBinder);
        } else {
            this.A01 = new zzw(iBinder);
        }
    }
}
