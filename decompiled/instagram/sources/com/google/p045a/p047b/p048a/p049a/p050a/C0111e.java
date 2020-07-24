package com.google.p045a.p047b.p048a.p049a.p050a;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.p045a.p046a.C0107a;
import p000X.AnonymousClass0Z0;

/* renamed from: com.google.a.b.a.a.a.e */
public abstract class C0111e extends C0107a implements C0109c {
    public C0111e() {
        super("com.google.android.play.core.install.protocol.IInstallServiceCallback");
        AnonymousClass0Z0.A0A(395227049, AnonymousClass0Z0.A03(-388918512));
    }

    public final boolean A00(int i, Parcel parcel, Parcel parcel2, int i2) {
        Parcelable parcelable;
        int A03 = AnonymousClass0Z0.A03(1705355703);
        if (i == 1) {
            Parcelable.Creator creator = Bundle.CREATOR;
            if (parcel.readInt() != 0) {
                creator.createFromParcel(parcel);
            }
            A29();
        } else if (i == 2) {
            Parcelable.Creator creator2 = Bundle.CREATOR;
            if (parcel.readInt() == 0) {
                parcelable = null;
            } else {
                parcelable = (Parcelable) creator2.createFromParcel(parcel);
            }
            A2B((Bundle) parcelable);
        } else if (i != 3) {
            AnonymousClass0Z0.A0A(348254192, A03);
            return false;
        } else {
            Parcelable.Creator creator3 = Bundle.CREATOR;
            if (parcel.readInt() != 0) {
                creator3.createFromParcel(parcel);
            }
            A6C();
        }
        AnonymousClass0Z0.A0A(1223545717, A03);
        return true;
    }
}
