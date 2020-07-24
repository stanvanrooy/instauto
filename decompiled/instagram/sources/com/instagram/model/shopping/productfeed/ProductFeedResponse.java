package com.instagram.model.shopping.productfeed;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.instagram.model.shopping.Product;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p000X.C28691Ms;
import p000X.C28721Mv;

public class ProductFeedResponse extends C28691Ms implements Parcelable, C28721Mv {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(405);
    public int A00;
    public String A01;
    public List A02 = new ArrayList();
    public boolean A03;

    public final boolean AeH() {
        return true;
    }

    public final int describeContents() {
        return 0;
    }

    public final List A00() {
        return Collections.unmodifiableList(this.A02);
    }

    public final List A01() {
        ArrayList arrayList = new ArrayList();
        for (ProductFeedItem productFeedItem : this.A02) {
            Product product = productFeedItem.A00;
            if (product != null) {
                arrayList.add(product);
            }
        }
        return arrayList;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeList(this.A02);
    }

    public final String AQs() {
        return this.A01;
    }

    public ProductFeedResponse() {
    }

    public ProductFeedResponse(Parcel parcel) {
        this.A03 = parcel.readInt() != 1 ? false : true;
        this.A01 = parcel.readString();
        this.A00 = parcel.readInt();
        parcel.readList(this.A02, ProductFeedItem.class.getClassLoader());
    }

    public ProductFeedResponse(List list) {
        this.A02 = list;
    }
}
