package com.instagram.direct.messagethread.reactions.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape0S0000000_I0;
import com.instagram.common.typedurl.ImageUrl;
import java.util.Objects;
import p000X.C40381oZ;

public class ReactionViewModel implements Parcelable, C40381oZ {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape0S0000000_I0(33);
    public final int A00;
    public final ImageUrl A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    public final int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public final boolean Aep(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            ReactionViewModel reactionViewModel = (ReactionViewModel) obj;
            if (!this.A03.equals(reactionViewModel.A03) || !Objects.equals(Integer.valueOf(this.A00), Integer.valueOf(reactionViewModel.A00)) || !Objects.equals(this.A04, reactionViewModel.A04) || !this.A01.equals(reactionViewModel.A01) || !Objects.equals(this.A02, reactionViewModel.A02) || this.A05 != reactionViewModel.A05) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.A03, Integer.valueOf(this.A00), this.A04, this.A01, this.A02, Boolean.valueOf(this.A05)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A04);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A02);
        parcel.writeByte(this.A05 ? (byte) 1 : 0);
    }

    public ReactionViewModel(Parcel parcel) {
        this.A03 = parcel.readString();
        this.A01 = (ImageUrl) parcel.readParcelable(ImageUrl.class.getClassLoader());
        this.A04 = parcel.readString();
        this.A00 = parcel.readInt();
        this.A02 = parcel.readString();
        this.A05 = parcel.readByte() != 1 ? false : true;
    }

    public ReactionViewModel(String str, String str2, int i, ImageUrl imageUrl, String str3, boolean z) {
        this.A03 = str;
        this.A04 = str2;
        this.A00 = i;
        this.A01 = imageUrl;
        this.A02 = str3;
        this.A05 = z;
    }
}
