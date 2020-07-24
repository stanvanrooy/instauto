package com.instagram.shopping.model.destination.home;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import java.util.Arrays;
import java.util.List;
import p000X.AnonymousClass000;
import p000X.AnonymousClass0a4;
import p000X.AnonymousClass17M;
import p000X.AnonymousClass9Ws;

public class ShoppingHomeSection implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(466);
    public AnonymousClass9Ws A00;
    public ShoppingHomeSectionContent A01;
    public String A02;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShoppingHomeSection)) {
            return false;
        }
        ShoppingHomeSection shoppingHomeSection = (ShoppingHomeSection) obj;
        return AnonymousClass17M.A00(this.A00, shoppingHomeSection.A00) && AnonymousClass17M.A00(this.A02, shoppingHomeSection.A02) && AnonymousClass17M.A00(this.A01, shoppingHomeSection.A01);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, this.A02, this.A01});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00.toString());
        parcel.writeString(this.A02);
        parcel.writeParcelable(this.A01, i);
    }

    public static void A00(List list, List list2) {
        AnonymousClass9Ws r1;
        if (list.size() > 0 && list2.size() > 0) {
            ShoppingHomeSection shoppingHomeSection = (ShoppingHomeSection) list.get(list.size() - 1);
            ShoppingHomeSection shoppingHomeSection2 = (ShoppingHomeSection) list2.get(0);
            if (AnonymousClass17M.A00(shoppingHomeSection.A02, shoppingHomeSection2.A02) && shoppingHomeSection.A00 == (r1 = AnonymousClass9Ws.PRODUCT_SECTION) && shoppingHomeSection2.A00 == r1) {
                list2.remove(0);
                ProductSection productSection = shoppingHomeSection.A01.A02;
                AnonymousClass0a4.A06(productSection);
                List list3 = productSection.A01;
                ProductSection productSection2 = shoppingHomeSection2.A01.A02;
                AnonymousClass0a4.A06(productSection2);
                list3.addAll(productSection2.A01);
            }
        }
        list.addAll(list2);
    }

    public ShoppingHomeSection() {
    }

    public ShoppingHomeSection(Parcel parcel) {
        String readString = parcel.readString();
        if (AnonymousClass9Ws.A01.get(readString) != null) {
            this.A00 = (AnonymousClass9Ws) AnonymousClass9Ws.A01.get(readString);
            this.A02 = parcel.readString();
            this.A01 = (ShoppingHomeSectionContent) parcel.readParcelable(ShoppingHomeSectionContent.class.getClassLoader());
            return;
        }
        throw new IllegalArgumentException(AnonymousClass000.A0E("Cannot parse feed type = ", readString));
    }
}
