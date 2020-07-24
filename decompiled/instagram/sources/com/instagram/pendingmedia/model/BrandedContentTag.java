package com.instagram.pendingmedia.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import java.util.Arrays;
import p000X.C13300iJ;

public class BrandedContentTag implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(444);
    public String A00;
    public String A01;
    public String A02;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BrandedContentTag)) {
            return false;
        }
        BrandedContentTag brandedContentTag = (BrandedContentTag) obj;
        return this.A01.equals(brandedContentTag.A01) && this.A02.equals(brandedContentTag.A02) && this.A00 == brandedContentTag.A00;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, this.A02, this.A00});
    }

    public final void A00(boolean z) {
        String str;
        if (z) {
            str = "true";
        } else {
            str = "false";
        }
        this.A00 = str;
    }

    public final boolean A01() {
        String str = this.A00;
        if (str == null || !str.equals("true")) {
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A00);
    }

    public BrandedContentTag() {
    }

    public BrandedContentTag(C13300iJ r2) {
        this.A01 = r2.getId();
        this.A02 = r2.AZn();
    }

    public BrandedContentTag(C13300iJ r2, boolean z) {
        String str;
        this.A01 = r2.getId();
        this.A02 = r2.AZn();
        if (z) {
            str = "true";
        } else {
            str = "false";
        }
        this.A00 = str;
    }

    public BrandedContentTag(Parcel parcel) {
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
        this.A00 = parcel.readString();
    }

    public BrandedContentTag(BrandedContentTag brandedContentTag) {
        this.A01 = brandedContentTag.A01;
        this.A02 = brandedContentTag.A02;
        this.A00 = brandedContentTag.A00;
    }
}
