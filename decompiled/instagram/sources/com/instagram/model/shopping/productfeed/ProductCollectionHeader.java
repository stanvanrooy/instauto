package com.instagram.model.shopping.productfeed;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.instagram.model.shopping.ProductCollectionDropsMetadata;
import java.util.ArrayList;
import p000X.C13150hy;
import p000X.C216269Uc;

public final class ProductCollectionHeader implements Parcelable {
    public static final C216269Uc A06 = new C216269Uc();
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(399);
    public ProductCollectionDropsMetadata A00;
    public CollectionTileCoverMedia A01;
    public String A02;
    public String A03;
    public String A04;
    public ArrayList A05;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C13150hy.A02(parcel, "parcel");
        CollectionTileCoverMedia collectionTileCoverMedia = this.A01;
        if (collectionTileCoverMedia == null) {
            C13150hy.A03("coverMedia");
        }
        parcel.writeParcelable(collectionTileCoverMedia, i);
        String str = this.A04;
        if (str == null) {
            C13150hy.A03(DialogModule.KEY_TITLE);
        }
        parcel.writeString(str);
        ArrayList arrayList = this.A05;
        if (arrayList == null) {
            C13150hy.A03("merchants");
        }
        parcel.writeTypedList(arrayList);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeParcelable(this.A00, i);
    }
}
