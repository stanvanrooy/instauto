package com.instagram.model.keyword;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import java.util.Objects;

public class Keyword implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(361);
    public long A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Keyword keyword = (Keyword) obj;
            if (!Objects.equals(this.A02, keyword.A02) || !Objects.equals(this.A03, keyword.A03)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.A02, this.A03});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeLong(this.A00);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
    }

    public Keyword() {
    }

    public Keyword(Parcel parcel) {
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
        this.A00 = parcel.readLong();
        this.A04 = parcel.readString();
        this.A05 = parcel.readString();
    }
}
