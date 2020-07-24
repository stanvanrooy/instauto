package com.instagram.model.shopping.incentives.igfunded;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import java.util.ArrayList;
import java.util.List;

public class IgFundedIncentive implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(387);
    public IgFundedIncentiveBannerButton A00;
    public IgFundedIncentiveBannerButton A01;
    public String A02;
    public String A03;
    public String A04;
    public List A05 = new ArrayList();

    public class Detail implements Parcelable {
        public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(388);
        public String A00;
        public String A01;

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.A01);
            parcel.writeString(this.A00);
        }

        public Detail() {
        }

        public Detail(Parcel parcel) {
            this.A01 = parcel.readString();
            this.A00 = parcel.readString();
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeString(this.A02);
        parcel.writeParcelable(this.A00, i);
        if (this.A01 != null) {
            parcel.writeByte((byte) 1);
            parcel.writeParcelable(this.A01, i);
        } else {
            parcel.writeByte((byte) 0);
        }
        parcel.writeList(this.A05);
    }

    public IgFundedIncentive() {
    }

    public IgFundedIncentive(Parcel parcel) {
        this.A03 = parcel.readString();
        this.A04 = parcel.readString();
        this.A02 = parcel.readString();
        Class<IgFundedIncentiveBannerButton> cls = IgFundedIncentiveBannerButton.class;
        this.A00 = (IgFundedIncentiveBannerButton) parcel.readParcelable(cls.getClassLoader());
        if (parcel.readByte() != 0) {
            this.A01 = (IgFundedIncentiveBannerButton) parcel.readParcelable(cls.getClassLoader());
        }
        parcel.readList(this.A05, Detail.class.getClassLoader());
    }
}
