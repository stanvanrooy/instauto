package com.instagram.videofeed.intf;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.instagram.model.hashtag.Hashtag;
import java.util.HashMap;
import java.util.Map;
import p000X.AnonymousClass0a4;

public class VideoFeedFragmentConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(480);
    public final int A00;
    public final Hashtag A01;
    public final VideoFeedType A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final HashMap A0C;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A02, i);
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
        parcel.writeString(this.A09);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A0B);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeString(this.A06);
        parcel.writeString(this.A05);
        parcel.writeParcelable(this.A01, i);
        parcel.writeInt(this.A0C.size());
        for (Map.Entry entry : this.A0C.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }

    public VideoFeedFragmentConfig(Parcel parcel) {
        this.A02 = (VideoFeedType) parcel.readParcelable(VideoFeedType.class.getClassLoader());
        this.A07 = parcel.readString();
        this.A08 = parcel.readString();
        this.A09 = parcel.readString();
        this.A0A = parcel.readString();
        this.A0B = parcel.readString();
        this.A00 = parcel.readInt();
        this.A03 = parcel.readString();
        this.A04 = parcel.readString();
        this.A06 = parcel.readString();
        this.A05 = parcel.readString();
        this.A01 = (Hashtag) parcel.readParcelable(Hashtag.class.getClassLoader());
        int readInt = parcel.readInt();
        this.A0C = new HashMap(readInt);
        for (int i = 0; i < readInt; i++) {
            this.A0C.put(parcel.readString(), parcel.readString());
        }
    }

    public VideoFeedFragmentConfig(VideoFeedType videoFeedType, String str, String str2, String str3, String str4, String str5, int i, String str6, String str7, String str8, String str9, Hashtag hashtag, HashMap hashMap) {
        AnonymousClass0a4.A06(videoFeedType);
        AnonymousClass0a4.A06(str);
        AnonymousClass0a4.A06(str2);
        AnonymousClass0a4.A06(str3);
        AnonymousClass0a4.A06(str4);
        AnonymousClass0a4.A06(str5);
        this.A02 = videoFeedType;
        this.A07 = str;
        this.A08 = str2;
        this.A09 = str3;
        this.A0A = str4;
        this.A0B = str5;
        this.A00 = i;
        this.A03 = str6;
        this.A04 = str7;
        this.A06 = str8;
        this.A05 = str9;
        this.A01 = hashtag;
        this.A0C = hashMap;
    }
}
