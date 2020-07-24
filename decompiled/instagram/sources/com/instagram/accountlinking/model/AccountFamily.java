package com.instagram.accountlinking.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape0S0000000_I0;
import com.instagram.user.model.MicroUser;
import java.util.ArrayList;
import java.util.List;
import p000X.C51542Lc;

public class AccountFamily implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape0S0000000_I0(19);
    public C51542Lc A00;
    public MicroUser A01;
    public String A02;
    public List A03;
    public List A04;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeSerializable(this.A00);
        parcel.writeTypedList(this.A04);
        parcel.writeTypedList(this.A03);
    }

    public AccountFamily() {
    }

    public AccountFamily(String str) {
        this.A02 = str;
        this.A04 = new ArrayList();
        this.A03 = new ArrayList();
        this.A00 = C51542Lc.UNKNOWN;
    }

    public AccountFamily(String str, C51542Lc r3) {
        this.A02 = str;
        this.A04 = new ArrayList();
        this.A03 = new ArrayList();
        this.A00 = r3;
    }
}
