package com.instagram.model.shopping.productfeed;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p000X.AnonymousClass17M;

public class BrandsHscroll implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(395);
    public ProductFeedHeader A00;
    public List A01;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BrandsHscroll)) {
            return false;
        }
        BrandsHscroll brandsHscroll = (BrandsHscroll) obj;
        return AnonymousClass17M.A00(this.A01, brandsHscroll.A01) && AnonymousClass17M.A00(this.A00, brandsHscroll.A00);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, this.A00});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.A01);
        parcel.writeParcelable(this.A00, i);
    }

    public BrandsHscroll() {
        this.A01 = new ArrayList();
    }

    public BrandsHscroll(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        this.A01 = arrayList;
        parcel.readList(arrayList, BrandItem.class.getClassLoader());
        this.A00 = (ProductFeedHeader) parcel.readParcelable(ProductFeedHeader.class.getClassLoader());
    }
}
