package com.google.android.exoplayer2.trackselection;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import p000X.C25948Bd0;

public class TrackSelectionParameters implements Parcelable {
    public static final TrackSelectionParameters A05;
    public static final TrackSelectionParameters A06;
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(153);
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            TrackSelectionParameters trackSelectionParameters = (TrackSelectionParameters) obj;
            if (!(TextUtils.equals(this.A02, trackSelectionParameters.A02) && TextUtils.equals(this.A03, trackSelectionParameters.A03) && this.A01 == trackSelectionParameters.A01 && this.A04 == trackSelectionParameters.A04 && this.A00 == trackSelectionParameters.A00)) {
                return false;
            }
        }
        return true;
    }

    static {
        TrackSelectionParameters trackSelectionParameters = new TrackSelectionParameters();
        A06 = trackSelectionParameters;
        A05 = trackSelectionParameters;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.A02;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode + 31) * 31;
        String str2 = this.A03;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((((((i2 + i) * 31) + this.A01) * 31) + (this.A04 ? 1 : 0)) * 31) + this.A00;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeInt(this.A00);
    }

    public TrackSelectionParameters() {
        this.A02 = C25948Bd0.A08((String) null);
        this.A03 = C25948Bd0.A08((String) null);
        this.A01 = 0;
        this.A04 = false;
        this.A00 = 0;
    }

    public TrackSelectionParameters(Parcel parcel) {
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
        this.A01 = parcel.readInt();
        this.A04 = C25948Bd0.A0C(parcel);
        this.A00 = parcel.readInt();
    }
}
