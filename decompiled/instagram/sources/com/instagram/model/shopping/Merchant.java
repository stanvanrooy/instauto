package com.instagram.model.shopping;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape0S0000000_I0;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import p000X.AnonymousClass17M;
import p000X.C13300iJ;
import p000X.C44841wq;

public class Merchant implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape0S0000000_I0(65);
    public ImageUrl A00;
    public C44841wq A01;
    public String A02;
    public String A03;
    public boolean A04;
    public boolean A05;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Merchant)) {
            return false;
        }
        Merchant merchant = (Merchant) obj;
        return AnonymousClass17M.A00(this.A02, merchant.A02) && AnonymousClass17M.A00(this.A03, merchant.A03) && AnonymousClass17M.A00(this.A00, merchant.A00) && this.A05 == merchant.A05 && this.A01 == merchant.A01 && AnonymousClass17M.A00(Boolean.valueOf(this.A04), Boolean.valueOf(merchant.A04));
    }

    public final boolean A00() {
        if (this.A01 != C44841wq.NONE) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        String str = this.A02;
        int i4 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i5 = i * 31;
        String str2 = this.A03;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        ImageUrl imageUrl = this.A00;
        if (imageUrl != null) {
            i3 = imageUrl.hashCode();
        } else {
            i3 = 0;
        }
        int hashCode = (((i6 + i3) * 31) + Boolean.valueOf(this.A05).hashCode()) * 31;
        C44841wq r0 = this.A01;
        if (r0 != null) {
            i4 = r0.hashCode();
        }
        return ((hashCode + i4) * 31) + Boolean.valueOf(this.A04).hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A00, i);
        parcel.writeInt(this.A05 ? 1 : 0);
        C44841wq r0 = this.A01;
        if (r0 != null) {
            str = r0.A00;
        } else {
            str = null;
        }
        parcel.writeString(str);
        parcel.writeInt(this.A04 ? 1 : 0);
    }

    public Merchant() {
    }

    public Merchant(C13300iJ r6) {
        String id = r6.getId();
        String AZn = r6.AZn();
        ImageUrl ASv = r6.ASv();
        C44841wq r1 = r6.A06;
        boolean A0s = r6.A0s();
        this.A02 = id;
        this.A03 = AZn;
        this.A00 = ASv;
        this.A01 = r1 == null ? C44841wq.NONE : r1;
        this.A04 = A0s;
    }

    public Merchant(Parcel parcel) {
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
        this.A00 = (ImageUrl) parcel.readParcelable(ImageUrl.class.getClassLoader());
        boolean z = false;
        this.A05 = parcel.readInt() == 1;
        this.A01 = (C44841wq) C44841wq.A01.get(parcel.readString());
        this.A04 = parcel.readInt() == 1 ? true : z;
    }

    public Merchant(String str, String str2, String str3) {
        SimpleImageUrl simpleImageUrl = new SimpleImageUrl(str3);
        this.A02 = str;
        this.A03 = str2;
        this.A00 = simpleImageUrl;
        this.A01 = C44841wq.NONE;
        this.A04 = false;
    }
}
