package com.instagram.model.shopping.productfeed;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.instagram.model.shopping.ProductCollectionDropsMetadata;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.webrtc.ScreenCapturerAndroid;
import p000X.AnonymousClass17M;
import p000X.C13300iJ;
import p000X.C215709Rk;

public class ProductCollectionTile implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI);
    public ProductCollectionDropsMetadata A00;
    public CollectionTileCoverMedia A01;
    public ProductCollectionTileCustomization A02;
    public C215709Rk A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public List A08 = new ArrayList();

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductCollectionTile)) {
            return false;
        }
        ProductCollectionTile productCollectionTile = (ProductCollectionTile) obj;
        return AnonymousClass17M.A00(this.A05, productCollectionTile.A05) && AnonymousClass17M.A00(this.A03, productCollectionTile.A03) && AnonymousClass17M.A00(this.A07, productCollectionTile.A07) && AnonymousClass17M.A00(this.A06, productCollectionTile.A06) && AnonymousClass17M.A00(this.A01, productCollectionTile.A01) && AnonymousClass17M.A00(this.A08, productCollectionTile.A08) && AnonymousClass17M.A00(this.A00, productCollectionTile.A00) && AnonymousClass17M.A00(this.A02, productCollectionTile.A02) && AnonymousClass17M.A00(this.A04, productCollectionTile.A04);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A05, this.A03, this.A07, this.A06, this.A01, this.A08, this.A00, this.A02, this.A04});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A05);
        parcel.writeString(this.A03.toString());
        parcel.writeString(this.A07);
        parcel.writeString(this.A06);
        parcel.writeParcelable(this.A01, i);
        parcel.writeList(this.A08);
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A02, i);
        parcel.writeString(this.A04);
    }

    public ProductCollectionTile() {
    }

    public ProductCollectionTile(Parcel parcel) {
        this.A05 = parcel.readString();
        this.A03 = C215709Rk.A00(parcel.readString());
        this.A07 = parcel.readString();
        this.A06 = parcel.readString();
        this.A01 = (CollectionTileCoverMedia) parcel.readParcelable(CollectionTileCoverMedia.class.getClassLoader());
        parcel.readList(this.A08, C13300iJ.class.getClassLoader());
        this.A00 = (ProductCollectionDropsMetadata) parcel.readParcelable(ProductCollectionDropsMetadata.class.getClassLoader());
        this.A02 = (ProductCollectionTileCustomization) parcel.readParcelable(ProductCollectionTileCustomization.class.getClassLoader());
        this.A04 = parcel.readString();
    }
}
