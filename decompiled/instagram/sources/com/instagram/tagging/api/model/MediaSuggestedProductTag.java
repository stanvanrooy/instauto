package com.instagram.tagging.api.model;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape0S0000000_I0;
import com.instagram.model.shopping.Product;
import com.instagram.tagging.model.Tag;
import com.instagram.tagging.model.TaggableModel;
import java.util.ArrayList;
import java.util.List;
import p000X.C27738CPh;

public class MediaSuggestedProductTag extends Tag {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape0S0000000_I0(83);
    public PointF A00;
    public List A01;
    public boolean A02;

    public final String A04() {
        return "product_id";
    }

    public final PointF A00() {
        return this.A00;
    }

    public final C27738CPh A01() {
        return C27738CPh.SUGGESTED_PRODUCT;
    }

    public final String A03() {
        StringBuilder sb = new StringBuilder();
        if (A02() != null) {
            sb.append(A02().getId());
        }
        PointF A002 = A00();
        if (A002 != null) {
            sb.append(A002.toString());
        }
        return sb.toString();
    }

    public final String A05() {
        List list = this.A01;
        if (list == null || list.isEmpty() || ((MediaSuggestedProductTagProductItemContainer) this.A01.get(0)).A01 == null) {
            return null;
        }
        return ((MediaSuggestedProductTagProductItemContainer) this.A01.get(0)).A01.A0I;
    }

    /* renamed from: A08 */
    public final Product A02() {
        List list = this.A01;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return ((MediaSuggestedProductTagProductItemContainer) this.A01.get(0)).A01;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.A01);
        parcel.writeParcelable(this.A00, i);
        parcel.writeValue(Boolean.valueOf(this.A02));
    }

    public final void A07(TaggableModel taggableModel) {
    }

    public MediaSuggestedProductTag() {
    }

    public MediaSuggestedProductTag(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        this.A01 = arrayList;
        parcel.readList(arrayList, MediaSuggestedProductTagProductItemContainer.class.getClassLoader());
        this.A00 = (PointF) parcel.readParcelable(PointF.class.getClassLoader());
        this.A02 = ((Boolean) parcel.readValue(Boolean.class.getClassLoader())).booleanValue();
    }

    public MediaSuggestedProductTag(List list, PointF pointF, boolean z) {
        this.A01 = list;
        this.A00 = pointF;
        this.A02 = z;
    }
}
