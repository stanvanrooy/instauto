package com.instagram.model.shopping.incentives.igfunded;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.instagram.shopping.model.destination.ShoppingExploreDeeplinkModel;
import p000X.C223769kK;
import p000X.C223819kR;

public class IgFundedIncentiveBannerButton implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(389);
    public ShoppingExploreDeeplinkModel A00;
    public Integer A01;
    public Integer A02;
    public String A03;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.A03);
        switch (this.A02.intValue()) {
            case 1:
                str = "secondary_button";
                break;
            case 2:
                str = "label_text";
                break;
            default:
                str = "primary_button";
                break;
        }
        parcel.writeString(str);
        parcel.writeString(C223769kK.A01(this.A01));
        if (this.A00 != null) {
            parcel.writeByte((byte) 1);
            parcel.writeParcelable(this.A00, i);
            return;
        }
        parcel.writeByte((byte) 0);
    }

    public IgFundedIncentiveBannerButton() {
    }

    public IgFundedIncentiveBannerButton(Parcel parcel) {
        this.A03 = parcel.readString();
        this.A02 = C223819kR.A00(parcel.readString());
        this.A01 = C223769kK.A00(parcel.readString());
        if (parcel.readByte() != 0) {
            this.A00 = (ShoppingExploreDeeplinkModel) parcel.readParcelable(ShoppingExploreDeeplinkModel.class.getClassLoader());
        }
    }
}
