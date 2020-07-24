package com.instagram.model.shopping;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape0S0000000_I0;
import com.instagram.tagging.model.Tag;
import com.instagram.tagging.model.TaggableModel;
import java.util.HashMap;
import java.util.Map;
import p000X.C27738CPh;

public class ProductTag extends Tag {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape0S0000000_I0(71);
    public int A00;
    public Product A01;

    public final String A04() {
        return "product_id";
    }

    public final PointF A00() {
        return this.A00;
    }

    public final C27738CPh A01() {
        return C27738CPh.PRODUCT;
    }

    public final /* bridge */ /* synthetic */ TaggableModel A02() {
        return this.A01;
    }

    public final String A05() {
        return this.A01.A0I;
    }

    public final Map A06() {
        HashMap hashMap = new HashMap(1);
        hashMap.put("merchant_id", this.A01.A02.A02);
        return hashMap;
    }

    public final /* bridge */ /* synthetic */ void A07(TaggableModel taggableModel) {
        this.A01 = (Product) taggableModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        return this.A01.equals(((ProductTag) obj).A01);
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }

    public void setPrice(String str, String str2) {
        this.A01.setPrice(str, str2);
    }

    public ProductTag(Parcel parcel) {
        super(parcel, Product.class.getClassLoader());
    }

    public ProductTag(Product product) {
        this.A01 = product;
    }

    public ProductTag(Product product, PointF pointF) {
        this.A00 = pointF;
        this.A01 = product;
    }
}
