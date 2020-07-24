package com.instagram.discovery.refinement.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.instagram.model.keyword.Keyword;
import java.util.Objects;
import p000X.AnonymousClass9YF;

public class RefinementAttributes implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(326);
    public AnonymousClass9YF A00;
    public Keyword A01;
    public String A02;
    public String A03;
    public boolean A04;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            RefinementAttributes refinementAttributes = (RefinementAttributes) obj;
            if (!Objects.equals(this.A03, refinementAttributes.A03) || !Objects.equals(this.A02, refinementAttributes.A02) || this.A04 != refinementAttributes.A04 || !Objects.equals(this.A01, refinementAttributes.A01) || !Objects.equals(this.A00, refinementAttributes.A00)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.A03, this.A02, Boolean.valueOf(this.A04), this.A01, this.A00});
    }

    public final void A00() {
        AnonymousClass9YF r0;
        if (this.A03 != null) {
            r0 = AnonymousClass9YF.CATEGORY_ID;
        } else if (this.A02 != null) {
            r0 = AnonymousClass9YF.CATEGORY;
        } else if (this.A04) {
            r0 = AnonymousClass9YF.ON_SALE;
        } else if (this.A01 != null) {
            r0 = AnonymousClass9YF.KEYWORD;
        } else {
            return;
        }
        this.A00 = r0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeParcelable(this.A01, i);
    }

    public RefinementAttributes() {
    }

    public RefinementAttributes(Parcel parcel) {
        this.A03 = parcel.readString();
        this.A02 = parcel.readString();
        this.A04 = parcel.readInt() != 1 ? false : true;
        this.A01 = (Keyword) parcel.readParcelable(Keyword.class.getClassLoader());
        A00();
    }
}
