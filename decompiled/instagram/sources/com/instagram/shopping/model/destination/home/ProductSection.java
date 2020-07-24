package com.instagram.shopping.model.destination.home;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.instagram.model.shopping.productfeed.ProductFeedHeader;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p000X.AnonymousClass17M;

public class ProductSection implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(465);
    public ProductFeedHeader A00;
    public List A01;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductSection)) {
            return false;
        }
        ProductSection productSection = (ProductSection) obj;
        return AnonymousClass17M.A00(this.A01, productSection.A01) && AnonymousClass17M.A00(this.A00, productSection.A00);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, this.A00});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.A01);
        parcel.writeParcelable(this.A00, i);
    }

    public ProductSection() {
        this.A01 = new ArrayList();
    }

    public ProductSection(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        this.A01 = arrayList;
        parcel.readList(arrayList, ProductFeedItem.class.getClassLoader());
        this.A00 = (ProductFeedHeader) parcel.readParcelable(ProductFeedHeader.class.getClassLoader());
    }
}
