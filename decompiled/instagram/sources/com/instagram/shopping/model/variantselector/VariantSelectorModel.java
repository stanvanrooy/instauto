package com.instagram.shopping.model.variantselector;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.shopping.ProductVariantDimension;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p000X.AnonymousClass0a4;
import p000X.BTW;

public class VariantSelectorModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(471);
    public int A00;
    public List A01;
    public List A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final int A06;
    public final int A07;
    public final ProductVariantDimension A08;
    public final ImageUrl[] A09;
    public final String[] A0A;
    public final boolean[] A0B;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A08, i);
        parcel.writeInt(this.A07);
        parcel.writeInt(this.A0A.length);
        parcel.writeStringArray(this.A0A);
        ImageUrl[] imageUrlArr = this.A09;
        if (imageUrlArr == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(imageUrlArr.length);
            parcel.writeParcelableArray(this.A09, i);
        }
        parcel.writeBooleanArray(this.A0B);
        parcel.writeInt(this.A06);
        parcel.writeByte(this.A03 ? (byte) 1 : 0);
        parcel.writeByte(this.A04 ? (byte) 1 : 0);
        parcel.writeByte(this.A05 ? (byte) 1 : 0);
        parcel.writeList(this.A01);
        parcel.writeList(this.A02);
        parcel.writeInt(this.A00);
    }

    public VariantSelectorModel(Parcel parcel) {
        this.A01 = new ArrayList();
        this.A02 = new ArrayList();
        this.A08 = (ProductVariantDimension) parcel.readParcelable(ProductVariantDimension.class.getClassLoader());
        this.A07 = parcel.readInt();
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        this.A0A = strArr;
        parcel.readStringArray(strArr);
        int readInt2 = parcel.readInt();
        if (readInt2 == -1) {
            this.A09 = null;
        } else {
            this.A09 = new ImageUrl[readInt2];
            Parcelable[] readParcelableArray = parcel.readParcelableArray(ImageUrl.class.getClassLoader());
            for (int i = 0; i < readInt2; i++) {
                this.A09[i] = (ImageUrl) readParcelableArray[i];
            }
        }
        boolean[] zArr = new boolean[readInt];
        this.A0B = zArr;
        parcel.readBooleanArray(zArr);
        this.A06 = parcel.readInt();
        boolean z = true;
        this.A03 = parcel.readByte() == 1;
        this.A04 = parcel.readByte() == 1;
        this.A05 = parcel.readByte() != 1 ? false : z;
        Class<String> cls = String.class;
        parcel.readList(this.A01, cls.getClassLoader());
        parcel.readList(this.A02, cls.getClassLoader());
        this.A00 = parcel.readInt();
    }

    public VariantSelectorModel(ProductVariantDimension productVariantDimension, int i, List list, List list2, List list3, int i2) {
        ImageUrl[] imageUrlArr;
        boolean[] zArr;
        int length;
        String[] strArr = (String[]) list.toArray(new String[0]);
        if (list2 == null) {
            imageUrlArr = null;
        } else {
            imageUrlArr = (ImageUrl[]) list2.toArray(new ImageUrl[0]);
        }
        if (list3 instanceof BTW) {
            BTW btw = (BTW) list3;
            zArr = Arrays.copyOfRange(btw.A02, btw.A01, btw.A00);
        } else {
            Object[] array = list3.toArray();
            int length2 = array.length;
            zArr = new boolean[length2];
            for (int i3 = 0; i3 < length2; i3++) {
                Object obj = array[i3];
                AnonymousClass0a4.A06(obj);
                zArr[i3] = ((Boolean) obj).booleanValue();
            }
        }
        int i4 = 0;
        this.A01 = new ArrayList();
        this.A02 = new ArrayList();
        this.A08 = productVariantDimension;
        this.A07 = i;
        this.A0A = strArr;
        this.A09 = imageUrlArr;
        this.A0B = zArr;
        this.A06 = i2;
        this.A03 = false;
        ArrayList arrayList = new ArrayList();
        while (true) {
            String[] strArr2 = this.A0A;
            if (i4 >= strArr2.length) {
                break;
            }
            if (this.A0B[i4]) {
                arrayList.add(strArr2[i4]);
            }
            i4++;
        }
        this.A01 = arrayList;
        ArrayList arrayList2 = new ArrayList();
        int i5 = 0;
        while (true) {
            String[] strArr3 = this.A0A;
            length = strArr3.length;
            if (i5 >= length) {
                break;
            }
            if (!this.A0B[i5]) {
                arrayList2.add(strArr3[i5]);
            }
            i5++;
        }
        this.A02 = arrayList2;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            if (i6 >= length) {
                i7 = -1;
                break;
            }
            if (this.A0B[i6]) {
                if (this.A06 == i6) {
                    break;
                }
                i7++;
            } else if (this.A06 == i6) {
                i7 = i8;
                break;
            } else {
                i8++;
            }
            i6++;
        }
        this.A00 = i7;
    }
}
