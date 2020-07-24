package com.instagram.p009ui.slidecardpageadapter;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: com.instagram.ui.slidecardpageadapter.SlideCardViewModel */
public class SlideCardViewModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(476);
    public final int A00;
    public final int A01;
    public final SpannableString A02;
    public final View.OnClickListener A03;
    public final ImageUrl A04;
    public final ImageUrl A05;
    public final String A06;
    public final String A07;
    public final String A08;

    public final int describeContents() {
        return 0;
    }

    public static SlideCardViewModel A00(int i, String str, String str2) {
        return new SlideCardViewModel(i, 0, (ImageUrl) null, str, str2, (String) null, (View.OnClickListener) null);
    }

    public static SlideCardViewModel A01(int i, String str, String str2) {
        return new SlideCardViewModel(0, i, (ImageUrl) null, str, str2, (String) null, (View.OnClickListener) null);
    }

    public static SlideCardViewModel A02(int i, String str, String str2, String str3, View.OnClickListener onClickListener) {
        return new SlideCardViewModel(0, i, (ImageUrl) null, str, str2, str3, onClickListener);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeParcelable(this.A05, i);
        parcel.writeParcelable(this.A04, i);
        parcel.writeString(this.A08);
        parcel.writeString(this.A07);
        parcel.writeString(this.A06);
        TextUtils.writeToParcel(this.A02, parcel, i);
    }

    public SlideCardViewModel(int i, int i2, ImageUrl imageUrl, String str, String str2, String str3, View.OnClickListener onClickListener) {
        this.A00 = i;
        this.A01 = i2;
        this.A05 = null;
        this.A04 = imageUrl;
        this.A08 = str;
        this.A07 = str2;
        this.A06 = str3;
        this.A02 = null;
        this.A03 = onClickListener;
    }

    public SlideCardViewModel(Parcel parcel) {
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
        Class<ImageUrl> cls = ImageUrl.class;
        this.A05 = (ImageUrl) parcel.readParcelable(cls.getClassLoader());
        this.A04 = (ImageUrl) parcel.readParcelable(cls.getClassLoader());
        this.A08 = parcel.readString();
        this.A07 = parcel.readString();
        this.A06 = parcel.readString();
        this.A02 = (SpannableString) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.A03 = null;
    }
}
