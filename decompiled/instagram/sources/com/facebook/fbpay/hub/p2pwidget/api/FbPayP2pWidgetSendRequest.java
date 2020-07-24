package com.facebook.fbpay.hub.p2pwidget.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.google.common.collect.ImmutableList;
import p000X.C239512q;
import p000X.C26626Boi;

public class FbPayP2pWidgetSendRequest implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(71);
    public final ImmutableList A00;
    public final String A01;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FbPayP2pWidgetSendRequest) {
                FbPayP2pWidgetSendRequest fbPayP2pWidgetSendRequest = (FbPayP2pWidgetSendRequest) obj;
                if (!C26626Boi.A03(this.A00, fbPayP2pWidgetSendRequest.A00) || !C26626Boi.A03(this.A01, fbPayP2pWidgetSendRequest.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C26626Boi.A00(C26626Boi.A00(1, this.A00), this.A01);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00.size());
        C239512q A0I = this.A00.iterator();
        while (A0I.hasNext()) {
            parcel.writeParcelable((FbPayP2pFriend) A0I.next(), i);
        }
        if (this.A01 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeString(this.A01);
    }

    public FbPayP2pWidgetSendRequest(Parcel parcel) {
        int readInt = parcel.readInt();
        FbPayP2pFriend[] fbPayP2pFriendArr = new FbPayP2pFriend[readInt];
        for (int i = 0; i < readInt; i++) {
            fbPayP2pFriendArr[i] = (FbPayP2pFriend) parcel.readParcelable(FbPayP2pFriend.class.getClassLoader());
        }
        this.A00 = ImmutableList.A0C(fbPayP2pFriendArr);
        if (parcel.readInt() != 0) {
            this.A01 = parcel.readString();
        }
    }
}
