package com.instagram.model.shopping;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p000X.AnonymousClass17M;

public class ProductGroup implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(371);
    public HashMap A00;
    public List A01;
    public List A02;

    public class VariantKey implements Parcelable {
        public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(372);
        public String A00;
        public String A01;

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                VariantKey variantKey = (VariantKey) obj;
                if (!AnonymousClass17M.A00(this.A00, variantKey.A00) || !AnonymousClass17M.A00(this.A01, variantKey.A01)) {
                    return false;
                }
            }
            return true;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.A00, this.A01});
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.A00);
            parcel.writeString(this.A01);
        }

        public VariantKey(Parcel parcel) {
            this.A00 = parcel.readString();
            this.A01 = parcel.readString();
        }

        public VariantKey(String str, String str2) {
            this.A00 = str;
            this.A01 = str2;
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final List A00() {
        return Collections.unmodifiableList(this.A01);
    }

    public final List A01() {
        return Collections.unmodifiableList(this.A02);
    }

    public final List A02(ProductVariantDimension productVariantDimension, String str) {
        VariantKey variantKey = new VariantKey(productVariantDimension.A02, str);
        if (this.A00 == null) {
            this.A00 = new HashMap();
            for (Product product : this.A01) {
                for (ProductVariantValue productVariantValue : product.A07()) {
                    VariantKey variantKey2 = new VariantKey(productVariantValue.A01, productVariantValue.A03);
                    List list = (List) this.A00.get(variantKey2);
                    if (list == null) {
                        list = new ArrayList();
                        this.A00.put(variantKey2, list);
                    }
                    list.add(product);
                }
            }
        }
        List list2 = (List) this.A00.get(variantKey);
        if (list2 == null) {
            return Collections.emptyList();
        }
        return list2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.A01);
        parcel.writeList(this.A02);
        HashMap hashMap = this.A00;
        if (hashMap == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(hashMap.size());
        for (Map.Entry entry : this.A00.entrySet()) {
            parcel.writeParcelable((Parcelable) entry.getKey(), i);
            parcel.writeList((List) entry.getValue());
        }
    }

    public ProductGroup() {
    }

    public ProductGroup(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        this.A01 = arrayList;
        Class<Product> cls = Product.class;
        parcel.readList(arrayList, cls.getClassLoader());
        ArrayList arrayList2 = new ArrayList();
        this.A02 = arrayList2;
        parcel.readList(arrayList2, ProductVariantDimension.class.getClassLoader());
        int readInt = parcel.readInt();
        if (readInt == -1) {
            this.A00 = null;
            return;
        }
        HashMap hashMap = new HashMap(readInt);
        for (int i = 0; i < readInt; i++) {
            ArrayList arrayList3 = new ArrayList();
            parcel.readList(arrayList3, cls.getClassLoader());
            hashMap.put((VariantKey) parcel.readParcelable(VariantKey.class.getClassLoader()), arrayList3);
        }
        this.A00 = hashMap;
    }
}
