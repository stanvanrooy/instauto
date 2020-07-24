package com.instagram.model.shopping;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import p000X.AnonymousClass17M;

public class ProductArEffectMetadata implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(369);
    public ThumbnailImage A00;
    public String A01;
    public String A02;
    public HashMap A03;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            ProductArEffectMetadata productArEffectMetadata = (ProductArEffectMetadata) obj;
            if (!AnonymousClass17M.A00(this.A02, productArEffectMetadata.A02) || !AnonymousClass17M.A00(this.A01, productArEffectMetadata.A01) || !AnonymousClass17M.A00(this.A00, productArEffectMetadata.A00) || !AnonymousClass17M.A00(this.A03, productArEffectMetadata.A03)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A02, this.A01, this.A00, this.A03});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A00, i);
        int i2 = 1;
        if (this.A03 == null) {
            i2 = 0;
        }
        parcel.writeInt(i2);
        HashMap hashMap = this.A03;
        if (hashMap != null) {
            Bundle bundle = new Bundle(hashMap.size());
            for (Map.Entry entry : hashMap.entrySet()) {
                bundle.putString((String) entry.getKey(), (String) entry.getValue());
            }
            parcel.writeBundle(bundle);
        }
    }

    public ProductArEffectMetadata() {
    }

    public ProductArEffectMetadata(Parcel parcel) {
        Bundle readBundle;
        this.A02 = parcel.readString();
        this.A01 = parcel.readString();
        this.A00 = (ThumbnailImage) parcel.readParcelable(ThumbnailImage.class.getClassLoader());
        if (parcel.readInt() == 1 && (readBundle = parcel.readBundle(getClass().getClassLoader())) != null) {
            HashMap hashMap = new HashMap(readBundle.size());
            for (String str : readBundle.keySet()) {
                hashMap.put(str, readBundle.getString(str));
            }
            this.A03 = hashMap;
        }
    }
}
