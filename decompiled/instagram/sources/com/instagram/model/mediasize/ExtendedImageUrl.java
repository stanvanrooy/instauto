package com.instagram.model.mediasize;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape0S0000000_I0;
import com.instagram.common.typedurl.ImageUrl;
import java.util.ArrayList;
import java.util.List;

public class ExtendedImageUrl implements ImageUrl {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape0S0000000_I0(58);
    public int A00;
    public int A01;
    public String A02;
    public String A03;
    public List A04;

    public final int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0032, code lost:
        if (r1.equals(r5.A02) == false) goto L_0x0034;
     */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ExtendedImageUrl extendedImageUrl = (ExtendedImageUrl) obj;
            if (this.A01 == extendedImageUrl.A01 && this.A00 == extendedImageUrl.A00 && this.A03.equals(extendedImageUrl.A03)) {
                String str = this.A02;
                if (str == null) {
                    if (extendedImageUrl.A02 != null) {
                        return false;
                    }
                }
                List list = this.A04;
                if (list != null) {
                    return list.equals(extendedImageUrl.A04);
                }
                return extendedImageUrl.A04 == null;
            }
        }
        return false;
    }

    public final List ALI() {
        return this.A04;
    }

    public final String AV6() {
        return this.A02;
    }

    public final String AZc() {
        return this.A03;
    }

    public final int getHeight() {
        return this.A00;
    }

    public final int getWidth() {
        return this.A01;
    }

    public final int hashCode() {
        int i;
        int hashCode = ((((this.A03.hashCode() * 31) + this.A01) * 31) + this.A00) * 31;
        String str = this.A02;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = (hashCode + i) * 31;
        List list = this.A04;
        if (list != null) {
            i2 = list.hashCode();
        }
        return i3 + i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A03);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A02);
        int i2 = 0;
        if (this.A04 != null) {
            i2 = 1;
        }
        parcel.writeInt(i2);
        List list = this.A04;
        if (list != null) {
            parcel.writeList(list);
        }
    }

    public ExtendedImageUrl() {
    }

    public ExtendedImageUrl(Parcel parcel) {
        this.A03 = parcel.readString();
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A02 = parcel.readString();
        if (!(parcel.readInt() == 0)) {
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, Integer.class.getClassLoader());
            this.A04 = arrayList;
        }
    }

    public ExtendedImageUrl(String str) {
        if (str != null) {
            this.A03 = str;
            return;
        }
        throw new RuntimeException("trying to created a ExtendedImageUrl object with null url");
    }
}
