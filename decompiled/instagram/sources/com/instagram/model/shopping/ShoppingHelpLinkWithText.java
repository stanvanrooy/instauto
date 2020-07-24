package com.instagram.model.shopping;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import p000X.AnonymousClass17M;

public class ShoppingHelpLinkWithText implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(380);
    public String A00;
    public String A01;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShoppingHelpLinkWithText)) {
            return false;
        }
        ShoppingHelpLinkWithText shoppingHelpLinkWithText = (ShoppingHelpLinkWithText) obj;
        return AnonymousClass17M.A00(this.A00, shoppingHelpLinkWithText.A00) && AnonymousClass17M.A00(this.A01, shoppingHelpLinkWithText.A01);
    }

    public final int hashCode() {
        int i;
        String str = this.A00;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        String str2 = this.A01;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 + i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    public ShoppingHelpLinkWithText() {
    }

    public ShoppingHelpLinkWithText(Parcel parcel) {
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
    }
}
