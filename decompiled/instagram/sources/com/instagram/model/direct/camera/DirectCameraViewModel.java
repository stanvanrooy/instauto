package com.instagram.model.direct.camera;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.pendingmedia.model.GroupUserStoryTarget;
import p000X.AnonymousClass0a4;

public class DirectCameraViewModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(357);
    public final int A00;
    public final ImageUrl A01;
    public final ImageUrl A02;
    public final DirectShareTarget A03;
    public final GroupUserStoryTarget A04;
    public final String A05;
    public final String A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    public final int describeContents() {
        return 0;
    }

    public final String A00() {
        int i = this.A00;
        if (i != 0) {
            if (i == 1) {
                GroupUserStoryTarget groupUserStoryTarget = this.A04;
                AnonymousClass0a4.A06(groupUserStoryTarget);
                return groupUserStoryTarget.A00();
            } else if (i != 2) {
                throw new IllegalStateException("Illegal camera type");
            }
        }
        DirectShareTarget directShareTarget = this.A03;
        AnonymousClass0a4.A06(directShareTarget);
        return directShareTarget.A01();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A03, i);
        parcel.writeParcelable(this.A04, i);
        parcel.writeString(this.A05);
        parcel.writeParcelable(this.A02, i);
        parcel.writeParcelable(this.A01, i);
        parcel.writeByte(this.A08 ? (byte) 1 : 0);
        parcel.writeByte(this.A09 ? (byte) 1 : 0);
        parcel.writeString(this.A06);
        parcel.writeInt(this.A00);
        parcel.writeByte(this.A07 ? (byte) 1 : 0);
    }

    public DirectCameraViewModel(Parcel parcel) {
        this.A03 = (DirectShareTarget) parcel.readParcelable(DirectShareTarget.class.getClassLoader());
        this.A04 = (GroupUserStoryTarget) parcel.readParcelable(GroupUserStoryTarget.class.getClassLoader());
        this.A05 = parcel.readString();
        Class<ImageUrl> cls = ImageUrl.class;
        this.A02 = (ImageUrl) parcel.readParcelable(cls.getClassLoader());
        this.A01 = (ImageUrl) parcel.readParcelable(cls.getClassLoader());
        boolean z = true;
        this.A08 = parcel.readByte() != 0;
        this.A09 = parcel.readByte() != 0;
        this.A06 = parcel.readString();
        this.A00 = parcel.readInt();
        this.A07 = parcel.readByte() == 0 ? false : z;
    }

    public DirectCameraViewModel(DirectShareTarget directShareTarget, String str, ImageUrl imageUrl, ImageUrl imageUrl2, boolean z, boolean z2, String str2) {
        this.A03 = directShareTarget;
        this.A04 = null;
        this.A05 = str;
        this.A02 = imageUrl;
        this.A01 = imageUrl2;
        this.A08 = z;
        this.A09 = z2;
        this.A06 = str2;
        this.A00 = 0;
        this.A07 = false;
    }

    public DirectCameraViewModel(GroupUserStoryTarget groupUserStoryTarget, String str, ImageUrl imageUrl, ImageUrl imageUrl2, boolean z, boolean z2, String str2, boolean z3) {
        this.A03 = null;
        this.A04 = groupUserStoryTarget;
        this.A05 = str;
        this.A02 = imageUrl;
        this.A01 = imageUrl2;
        this.A08 = z;
        this.A09 = z2;
        this.A06 = str2;
        this.A00 = 1;
        this.A07 = z3;
    }
}
