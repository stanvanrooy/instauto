package com.instagram.model.shopping.productfeed;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass17M;
import p000X.AnonymousClass9Q3;
import p000X.AnonymousClass9RP;
import p000X.C215309Ps;
import p000X.C215629Rc;

public class MultiProductComponent implements C215309Ps, Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(398);
    public int A00;
    public ButtonDestination A01;
    public C215629Rc A02 = C215629Rc.GRID;
    public ProductFeedResponse A03;
    public AnonymousClass9Q3 A04;
    public String A05;
    public String A06;
    public String A07;
    public final Map A08 = new HashMap();

    public final String AWN() {
        return null;
    }

    public final String AWO() {
        return null;
    }

    public final String AXA() {
        return null;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultiProductComponent)) {
            return false;
        }
        MultiProductComponent multiProductComponent = (MultiProductComponent) obj;
        return AnonymousClass17M.A00(this.A04, multiProductComponent.A04) && AnonymousClass17M.A00(this.A05, multiProductComponent.A05) && AnonymousClass17M.A00(this.A06, multiProductComponent.A06) && AnonymousClass17M.A00(this.A07, multiProductComponent.A07) && this.A02 == multiProductComponent.A02 && this.A00 == multiProductComponent.A00 && AnonymousClass17M.A00(this.A03, multiProductComponent.A03) && AnonymousClass17M.A00(this.A01, multiProductComponent.A01);
    }

    public final String A00() {
        return this.A04 + "_" + this.A02;
    }

    public final void A01() {
        for (ProductFeedItem productFeedItem : this.A03.A00()) {
            this.A08.put(productFeedItem.getId(), productFeedItem);
        }
    }

    public final void A02(ProductFeedItem productFeedItem) {
        if (!this.A08.containsKey(productFeedItem.getId())) {
            this.A03.A02.add(0, productFeedItem);
            this.A08.put(productFeedItem.getId(), productFeedItem);
            this.A00++;
        }
    }

    public final boolean A03(String str) {
        ProductFeedItem productFeedItem = (ProductFeedItem) this.A08.get(str);
        if (productFeedItem == null) {
            return false;
        }
        ProductFeedResponse productFeedResponse = this.A03;
        String id = productFeedItem.getId();
        Iterator it = productFeedResponse.A02.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (((ProductFeedItem) it.next()).getId().equals(id)) {
                it.remove();
                z = true;
            }
        }
        if (!z) {
            return false;
        }
        this.A08.remove(str);
        this.A00--;
        return true;
    }

    public final boolean BnJ(AnonymousClass0C1 r3) {
        if (this.A01 != null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int hashCode = ((this.A04.hashCode() * 31) + this.A05.hashCode()) * 31;
        String str = this.A06;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int hashCode2 = (((hashCode + i) * 31) + this.A02.hashCode()) * 31;
        String str2 = this.A07;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int hashCode3 = (((((hashCode2 + i2) * 31) + this.A00) * 31) + this.A03.hashCode()) * 31;
        ButtonDestination buttonDestination = this.A01;
        if (buttonDestination != null) {
            i3 = buttonDestination.hashCode();
        }
        return hashCode3 + i3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.A04);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        parcel.writeSerializable(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeParcelable(this.A03, i);
        parcel.writeParcelable(this.A01, i);
    }

    public final ButtonDestination AHN() {
        return this.A01;
    }

    public final AnonymousClass9Q3 ALh() {
        return this.A04;
    }

    public final AnonymousClass9RP ASq() {
        return AnonymousClass9RP.PRICE_WITH_SOLD_OUT;
    }

    public final ProductFeedResponse ASr() {
        return this.A03;
    }

    public final String AYP() {
        return this.A06;
    }

    public final String getId() {
        return this.A05;
    }

    public MultiProductComponent() {
    }

    public MultiProductComponent(Parcel parcel) {
        this.A04 = (AnonymousClass9Q3) parcel.readSerializable();
        this.A05 = parcel.readString();
        this.A06 = parcel.readString();
        this.A07 = parcel.readString();
        this.A02 = (C215629Rc) parcel.readSerializable();
        this.A00 = parcel.readInt();
        this.A03 = (ProductFeedResponse) parcel.readParcelable(ProductFeedResponse.class.getClassLoader());
        this.A01 = (ButtonDestination) parcel.readParcelable(ButtonDestination.class.getClassLoader());
        A01();
    }
}
