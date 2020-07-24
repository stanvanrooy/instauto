package com.instagram.model.shopping.productfeed;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.instagram.model.shopping.Merchant;
import p000X.AnonymousClass0C5;
import p000X.AnonymousClass17M;
import p000X.AnonymousClass9Q2;
import p000X.C120125Dh;

public class ButtonDestination implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(396);
    public Merchant A00;
    public Integer A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ButtonDestination)) {
            return false;
        }
        ButtonDestination buttonDestination = (ButtonDestination) obj;
        return AnonymousClass17M.A00(this.A05, buttonDestination.A05) && this.A01 == buttonDestination.A01 && AnonymousClass17M.A00(this.A00, buttonDestination.A00) && AnonymousClass17M.A00(this.A04, buttonDestination.A04) && AnonymousClass17M.A00(this.A03, buttonDestination.A03) && AnonymousClass17M.A00(this.A02, buttonDestination.A02);
    }

    public final int hashCode() {
        int hashCode;
        String str;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        String str2 = this.A05;
        int i = 0;
        if (str2 == null) {
            hashCode = 0;
        } else {
            hashCode = str2.hashCode();
        }
        int i2 = hashCode * 31;
        int intValue = this.A01.intValue();
        switch (intValue) {
            case 1:
                str = "CTA_WITH_DISMISS";
                break;
            case 2:
                str = "CTA";
                break;
            case 3:
                str = "VIEW_CHECKOUT_PRODUCT_FEED";
                break;
            case 4:
                str = "PROFILE_SHOP_PRODUCT_COLLECTIONS_FEED";
                break;
            case 5:
                str = "BAG_FROM_MERCHANT";
                break;
            case 6:
                str = "CHECKOUT_RECONSIDERATION";
                break;
            case 7:
                str = AnonymousClass0C5.$const$string(152);
                break;
            case 8:
                str = "DROPS_DESTINATION";
                break;
            case 9:
                str = "EDITORIAL";
                break;
            case 10:
                str = "PRODUCTS_FROM_FOLLOWED_BRANDS";
                break;
            case C120125Dh.VIEW_TYPE_BANNER:
                str = "PRODUCTS_FROM_SAVED_MEDIA";
                break;
            case C120125Dh.VIEW_TYPE_SPINNER:
                str = "PRODUCTS_FROM_LIKED_MEDIA";
                break;
            case C120125Dh.VIEW_TYPE_BADGE:
                str = "RECENTLY_VIEWED_FROM_MERCHANT";
                break;
            case C120125Dh.VIEW_TYPE_LINK:
                str = "SAVED";
                break;
            case 15:
                str = "SAVED_FROM_MERCHANT";
                break;
            case 16:
                str = "SAVED_FROM_MERCHANTS";
                break;
            case C120125Dh.VIEW_TYPE_CUSTOM_ITEM:
                str = "INCENTIVE_COLLECTION";
                break;
            default:
                str = "VIEW_SHOP";
                break;
        }
        int hashCode5 = (i2 + str.hashCode() + intValue) * 31;
        Merchant merchant = this.A00;
        if (merchant == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = merchant.hashCode();
        }
        int i3 = (hashCode5 + hashCode2) * 31;
        String str3 = this.A04;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str4 = this.A03;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        String str5 = this.A02;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return i5 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A05);
        parcel.writeString(AnonymousClass9Q2.A01(this.A01));
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A04);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
    }

    public ButtonDestination() {
    }

    public ButtonDestination(Parcel parcel) {
        this.A05 = parcel.readString();
        this.A01 = AnonymousClass9Q2.A00(parcel.readString());
        this.A00 = (Merchant) parcel.readParcelable(Merchant.class.getClassLoader());
        this.A04 = parcel.readString();
        this.A03 = parcel.readString();
        this.A02 = parcel.readString();
    }
}
