package com.instagram.model.shopping;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import p000X.Constants;
import p000X.AnonymousClass17M;
import p000X.C25658BTr;

public class ProductUntaggableReason implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(375);
    public ShoppingHelpLinkWithText A00;
    public ShoppingHelpLinkWithText A01;
    public Integer A02 = Constants.ZERO;
    public String A03;
    public String A04;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductUntaggableReason)) {
            return false;
        }
        ProductUntaggableReason productUntaggableReason = (ProductUntaggableReason) obj;
        return AnonymousClass17M.A00(this.A04, productUntaggableReason.A04) && AnonymousClass17M.A00(this.A03, productUntaggableReason.A03) && AnonymousClass17M.A00(this.A00, productUntaggableReason.A00) && AnonymousClass17M.A00(this.A01, productUntaggableReason.A01) && this.A02 == productUntaggableReason.A02;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        String str;
        String str2 = this.A04;
        int i5 = 0;
        if (str2 != null) {
            i = str2.hashCode();
        } else {
            i = 0;
        }
        int i6 = i * 31;
        String str3 = this.A03;
        if (str3 != null) {
            i2 = str3.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 31;
        ShoppingHelpLinkWithText shoppingHelpLinkWithText = this.A00;
        if (shoppingHelpLinkWithText != null) {
            i3 = shoppingHelpLinkWithText.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 31;
        ShoppingHelpLinkWithText shoppingHelpLinkWithText2 = this.A01;
        if (shoppingHelpLinkWithText2 != null) {
            i4 = shoppingHelpLinkWithText2.hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 31;
        Integer num = this.A02;
        if (num != null) {
            int intValue = num.intValue();
            if (1 != intValue) {
                str = "TAGGABLE";
            } else {
                str = "UNTAGGABLE";
            }
            i5 = str.hashCode() + intValue;
        }
        return i9 + i5;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A04);
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(C25658BTr.A01(this.A02));
    }

    public ProductUntaggableReason() {
    }

    public ProductUntaggableReason(Parcel parcel) {
        this.A04 = parcel.readString();
        this.A03 = parcel.readString();
        Class<ShoppingHelpLinkWithText> cls = ShoppingHelpLinkWithText.class;
        this.A01 = (ShoppingHelpLinkWithText) parcel.readParcelable(cls.getClassLoader());
        this.A00 = (ShoppingHelpLinkWithText) parcel.readParcelable(cls.getClassLoader());
        this.A02 = C25658BTr.A00(parcel.readString());
    }
}
