package com.instagram.discovery.chaining.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.instagram.videofeed.intf.VideoFeedType;
import java.util.Arrays;
import java.util.Collections;
import p000X.AnonymousClass0a4;
import p000X.C149916bA;

public class DiscoveryChainingItem implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(321);
    public final int A00;
    public final VideoFeedType A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final boolean A0C;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A05);
        parcel.writeString(this.A09);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A08);
        parcel.writeInt(this.A0C ? 1 : 0);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A04);
        parcel.writeString(this.A06);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A07);
        parcel.writeString(this.A0B);
    }

    public DiscoveryChainingItem(C149916bA r7) {
        boolean z;
        String str = r7.A09;
        AnonymousClass0a4.A06(str);
        this.A09 = str;
        this.A00 = r7.A00;
        String str2 = r7.A08;
        AnonymousClass0a4.A06(str2);
        this.A08 = str2;
        String str3 = r7.A05;
        AnonymousClass0a4.A06(str3);
        this.A05 = str3;
        this.A0A = r7.A0A;
        this.A04 = r7.A04;
        this.A06 = r7.A06;
        this.A03 = r7.A03;
        this.A02 = r7.A02;
        VideoFeedType videoFeedType = r7.A01;
        this.A01 = videoFeedType;
        String str4 = r7.A07;
        this.A07 = str4;
        String str5 = r7.A0B;
        this.A0B = str5;
        int frequency = Collections.frequency(Arrays.asList(new Object[]{videoFeedType, str4, str5}), (Object) null);
        if (frequency == 0) {
            z = true;
        } else if (frequency == 3) {
            z = false;
        } else {
            throw new IllegalArgumentException("All channel-related arguments must be provided");
        }
        this.A0C = z;
    }

    public DiscoveryChainingItem(Parcel parcel) {
        this.A05 = parcel.readString();
        this.A09 = parcel.readString();
        this.A00 = parcel.readInt();
        this.A08 = parcel.readString();
        this.A0C = parcel.readInt() != 1 ? false : true;
        this.A0A = parcel.readString();
        this.A04 = parcel.readString();
        this.A06 = parcel.readString();
        this.A03 = parcel.readString();
        this.A02 = parcel.readString();
        this.A01 = (VideoFeedType) parcel.readParcelable(VideoFeedType.class.getClassLoader());
        this.A07 = parcel.readString();
        this.A0B = parcel.readString();
    }
}
