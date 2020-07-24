package com.instagram.model.shopping;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape0S0000000_I0;
import p000X.C53502Ta;

public class ProductSource implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape0S0000000_I0(70);
    public C53502Ta A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;

    public final int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        if (r1.equals(r5.A01) == false) goto L_0x001e;
     */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ProductSource productSource = (ProductSource) obj;
            String str = this.A01;
            if (str == null) {
                if (productSource.A01 != null) {
                    return false;
                }
            }
            if (this.A00 == productSource.A00) {
                String str2 = this.A04;
                if (str2 != null) {
                    if (!str2.equals(productSource.A04)) {
                        return false;
                    }
                } else if (productSource.A04 != null) {
                    return false;
                }
                String str3 = this.A03;
                if (str3 != null) {
                    if (!str3.equals(productSource.A03)) {
                        return false;
                    }
                } else if (productSource.A03 != null) {
                    return false;
                }
                String str4 = this.A02;
                String str5 = productSource.A02;
                if (str4 != null) {
                    return str4.equals(str5);
                }
                return str5 == null;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        String str = this.A01;
        int i4 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int hashCode = ((i * 31) + this.A00.hashCode()) * 31;
        String str2 = this.A04;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (hashCode + i2) * 31;
        String str3 = this.A03;
        if (str3 != null) {
            i3 = str3.hashCode();
        } else {
            i3 = 0;
        }
        int i6 = (i5 + i3) * 31;
        String str4 = this.A02;
        if (str4 != null) {
            i4 = str4.hashCode();
        }
        return i6 + i4;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeString(this.A00.toString());
        parcel.writeString(this.A04);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
    }

    public ProductSource() {
    }

    public ProductSource(Parcel parcel) {
        this.A01 = parcel.readString();
        this.A00 = C53502Ta.A00(parcel.readString());
        this.A04 = parcel.readString();
        this.A03 = parcel.readString();
        this.A02 = parcel.readString();
    }

    public ProductSource(String str, C53502Ta r3) {
        this.A01 = str;
        this.A00 = r3;
        this.A04 = null;
        this.A03 = null;
    }

    public ProductSource(String str, C53502Ta r2, String str2) {
        this.A01 = str;
        this.A00 = r2;
        this.A04 = str2;
    }
}
