package com.instagram.discovery.refinement.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.redex.PCreatorEBaseShape0S0000000_I0;
import java.util.Objects;

public class Refinement implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape0S0000000_I0(36);
    public RefinementAttributes A00;
    public String A01;

    public final int describeContents() {
        return 0;
    }

    public final String A01() {
        RefinementAttributes refinementAttributes = this.A00;
        String str = refinementAttributes.A03;
        if (str == null && (str = refinementAttributes.A02) == null) {
            return null;
        }
        return str;
    }

    public final String A02() {
        RefinementAttributes refinementAttributes = this.A00;
        switch (refinementAttributes.A00.ordinal()) {
            case 1:
                return refinementAttributes.A02;
            case 2:
                return "on_sale";
            case 3:
                if (!TextUtils.isEmpty(refinementAttributes.A01.A02)) {
                    return refinementAttributes.A01.A02;
                }
                break;
        }
        return refinementAttributes.A03;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Refinement)) {
            return false;
        }
        return Objects.equals(this.A00, ((Refinement) obj).A00);
    }

    public final int hashCode() {
        return Objects.hashCode(this.A00);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A00, i);
    }

    public final Long A00() {
        String A012 = A01();
        if (A012 == null) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(A012));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public Refinement() {
    }

    public Refinement(Parcel parcel) {
        this.A01 = parcel.readString();
        this.A00 = (RefinementAttributes) parcel.readParcelable(RefinementAttributes.class.getClassLoader());
    }

    public Refinement(String str, String str2) {
        this.A01 = str;
        RefinementAttributes refinementAttributes = new RefinementAttributes();
        this.A00 = refinementAttributes;
        refinementAttributes.A02 = str2;
        refinementAttributes.A00();
    }
}
