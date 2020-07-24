package com.instagram.user.recommended;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import java.util.UUID;
import p000X.AnonymousClass5DQ;

public class FollowListData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(478);
    public final AnonymousClass5DQ A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;

    public static FollowListData A00(AnonymousClass5DQ r7, String str) {
        return new FollowListData(r7, str, UUID.randomUUID().toString(), false, (String) null, false);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00.ordinal());
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A04 ? 1 : 0);
        String str = this.A01;
        if (str == null) {
            str = "";
        }
        parcel.writeString(str);
        parcel.writeInt(this.A05 ? 1 : 0);
    }

    public FollowListData(AnonymousClass5DQ r1, String str, String str2, boolean z, String str3, boolean z2) {
        this.A00 = r1;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = z;
        this.A01 = str3;
        this.A05 = z2;
    }
}
