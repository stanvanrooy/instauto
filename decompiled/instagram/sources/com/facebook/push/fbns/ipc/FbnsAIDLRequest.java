package com.facebook.push.fbns.ipc;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p000X.C04950Hb;

public class FbnsAIDLRequest extends FbnsAIDLResult {
    public static final Parcelable.Creator CREATOR = new C04950Hb();
    public int A00;

    public final void A00(Parcel parcel, int i) {
        super.A00(parcel, i);
        parcel.writeInt(this.A00);
    }

    public FbnsAIDLRequest(Bundle bundle, int i) {
        super(bundle);
        this.A00 = i;
    }

    public FbnsAIDLRequest(Parcel parcel) {
        super(parcel);
        this.A00 = parcel.readInt();
    }
}
