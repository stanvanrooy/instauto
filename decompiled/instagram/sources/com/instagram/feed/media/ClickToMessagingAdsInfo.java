package com.instagram.feed.media;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape0S0000000_I0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClickToMessagingAdsInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape0S0000000_I0(40);
    public long A00;
    public OnFeedMessages A01;
    public boolean A02;

    public class IcebreakerMessage implements Parcelable {
        public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape0S0000000_I0(41);
        public String A00;
        public String A01;
        public String A02;

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.A02);
            parcel.writeString(this.A01);
            parcel.writeString(this.A00);
        }

        public IcebreakerMessage() {
        }

        public IcebreakerMessage(Parcel parcel) {
            this.A02 = parcel.readString();
            this.A01 = parcel.readString();
            this.A00 = parcel.readString();
        }
    }

    public class OnFeedMessages implements Parcelable {
        public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape0S0000000_I0(42);
        public int A00;
        public String A01;
        public String A02;
        public String A03;
        public List A04;

        public final int describeContents() {
            return 0;
        }

        public final List A00() {
            List list = this.A04;
            if (list != null) {
                return Collections.unmodifiableList(list);
            }
            return Collections.emptyList();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.A00);
            parcel.writeString(this.A02);
            parcel.writeString(this.A03);
            parcel.writeString(this.A01);
            parcel.writeList(this.A04);
        }

        public OnFeedMessages() {
        }

        public OnFeedMessages(Parcel parcel) {
            this.A00 = parcel.readInt();
            this.A02 = parcel.readString();
            this.A03 = parcel.readString();
            this.A01 = parcel.readString();
            ArrayList arrayList = new ArrayList();
            this.A04 = arrayList;
            parcel.readList(arrayList, IcebreakerMessage.class.getClassLoader());
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A00);
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeParcelable(this.A01, i);
    }

    public ClickToMessagingAdsInfo() {
    }

    public ClickToMessagingAdsInfo(Parcel parcel) {
        this.A00 = parcel.readLong();
        this.A02 = parcel.readInt() != 1 ? false : true;
        this.A01 = (OnFeedMessages) parcel.readParcelable(OnFeedMessages.class.getClassLoader());
    }
}
