package com.instagram.tagging.activity;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.model.mediatype.MediaType;
import com.instagram.model.people.PeopleTag;
import com.instagram.model.shopping.ProductMention;
import com.instagram.model.shopping.ProductTag;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.tagging.api.model.MediaSuggestedProductTag;
import java.util.ArrayList;

public class MediaTaggingInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(473);
    public float A00;
    public int A01;
    public ImageUrl A02;
    public MediaType A03;
    public ClipInfo A04;
    public String A05;
    public String A06;
    public ArrayList A07;
    public ArrayList A08;
    public ArrayList A09;
    public ArrayList A0A;
    public boolean A0B;
    public String A0C;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A05);
        parcel.writeParcelable(this.A02, i);
        parcel.writeString(this.A0C);
        parcel.writeTypedList(this.A07);
        parcel.writeInt(this.A01);
        parcel.writeFloat(this.A00);
        parcel.writeTypedList(this.A09);
        parcel.writeTypedList(this.A0A);
        parcel.writeTypedList(this.A08);
        parcel.writeInt(this.A0B ? 1 : 0);
        parcel.writeSerializable(this.A03);
        parcel.writeString(this.A06);
        parcel.writeValue(this.A04);
    }

    public MediaTaggingInfo(Parcel parcel) {
        this.A07 = new ArrayList();
        this.A09 = new ArrayList();
        this.A0A = new ArrayList();
        this.A08 = new ArrayList();
        this.A00 = 1.0f;
        this.A05 = parcel.readString();
        this.A02 = (ImageUrl) parcel.readParcelable(SimpleImageUrl.class.getClassLoader());
        this.A0C = parcel.readString();
        this.A07 = parcel.createTypedArrayList(PeopleTag.CREATOR);
        this.A01 = parcel.readInt();
        this.A00 = parcel.readFloat();
        this.A09 = parcel.createTypedArrayList(ProductTag.CREATOR);
        this.A0A = parcel.createTypedArrayList(MediaSuggestedProductTag.CREATOR);
        this.A08 = parcel.createTypedArrayList(ProductMention.CREATOR);
        this.A0B = parcel.readInt() != 1 ? false : true;
        this.A03 = (MediaType) parcel.readSerializable();
        this.A06 = parcel.readString();
        this.A04 = (ClipInfo) parcel.readValue(ClipInfo.class.getClassLoader());
    }

    public MediaTaggingInfo(String str, ImageUrl imageUrl, String str2, MediaType mediaType, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, String str3, ClipInfo clipInfo) {
        ArrayList arrayList5 = new ArrayList();
        this.A07 = arrayList5;
        this.A09 = new ArrayList();
        this.A0A = new ArrayList();
        this.A08 = new ArrayList();
        this.A00 = 1.0f;
        this.A05 = str;
        this.A02 = imageUrl;
        this.A0C = str2;
        this.A03 = mediaType;
        if (arrayList != null) {
            arrayList5.addAll(arrayList);
        }
        if (arrayList2 != null) {
            this.A09.addAll(arrayList2);
        }
        if (arrayList3 != null) {
            this.A0A.addAll(arrayList3);
        }
        if (arrayList4 != null) {
            this.A08.addAll(arrayList4);
        }
        this.A06 = str3;
        this.A04 = clipInfo;
    }
}
