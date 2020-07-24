package com.instagram.model.effect;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.shopping.ProductAREffectContainer;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import p000X.Constants;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass3DX;
import p000X.C23300zv;
import p000X.C43091tn;

public class AttributedAREffect extends AREffect {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(358);
    public int A00;
    public ImageUrl A01;
    public ImageUrl A02;
    public C43091tn A03;
    public ProductAREffectContainer A04;
    public Integer A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public List A0D;
    public List A0E;
    public List A0F;
    public String A0G;

    public final String AWS(AnonymousClass0C1 r2) {
        return null;
    }

    public final boolean Afk() {
        return false;
    }

    public final boolean Agp() {
        return false;
    }

    public final boolean Aho() {
        return false;
    }

    public final int describeContents() {
        return 0;
    }

    public final String A0C() {
        ProductAREffectContainer productAREffectContainer = this.A04;
        if (productAREffectContainer != null) {
            return productAREffectContainer.A00.A00.A02.A03;
        }
        return this.A0G;
    }

    public final boolean AhP() {
        if (this.A05 == Constants.ZERO) {
            return true;
        }
        return false;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A08);
        parcel.writeString(this.A09);
        parcel.writeParcelable(this.A02, i);
        parcel.writeString(this.A0G);
        parcel.writeString(this.A06);
        parcel.writeParcelable(this.A01, i);
        parcel.writeInt(this.A00);
        int i2 = 0;
        if (this.A05 == Constants.ZERO) {
            i2 = 1;
        }
        parcel.writeByte((byte) i2);
        parcel.writeStringList(this.A0D);
        parcel.writeStringList(this.A0F);
        parcel.writeString(this.A0B);
        parcel.writeParcelable(this.A04, i);
        parcel.writeString(this.A0A);
        parcel.writeStringList(this.A0E);
        parcel.writeString(this.A07);
        parcel.writeString(this.A0C);
        parcel.writeSerializable(this.A03);
    }

    public final void A6t(AnonymousClass0C1 r5) {
        C23300zv.A00(r5).BXT(new AnonymousClass3DX(this.A08, this.A05));
    }

    public final Collection AV4() {
        return Collections.EMPTY_LIST;
    }

    public final void BkJ(Integer num) {
        this.A05 = num;
    }

    public AttributedAREffect(Parcel parcel) {
        Integer num;
        this.A08 = parcel.readString();
        this.A09 = parcel.readString();
        Class<ImageUrl> cls = ImageUrl.class;
        this.A02 = (ImageUrl) parcel.readParcelable(cls.getClassLoader());
        this.A0G = parcel.readString();
        this.A06 = parcel.readString();
        this.A01 = (ImageUrl) parcel.readParcelable(cls.getClassLoader());
        this.A00 = parcel.readInt();
        if (parcel.readByte() != 0) {
            num = Constants.ZERO;
        } else {
            num = Constants.ONE;
        }
        this.A05 = num;
        this.A0D = parcel.createStringArrayList();
        this.A0F = parcel.createStringArrayList();
        this.A0B = parcel.readString();
        this.A04 = (ProductAREffectContainer) parcel.readParcelable(ProductAREffectContainer.class.getClassLoader());
        this.A0A = parcel.readString();
        this.A0E = parcel.createStringArrayList();
        this.A07 = parcel.readString();
        this.A0C = parcel.readString();
        this.A03 = (C43091tn) parcel.readSerializable();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public AttributedAREffect(String str, String str2, ImageUrl imageUrl, String str3, String str4, ImageUrl imageUrl2, int i, boolean z, List list, List list2) {
        this(r1, r2, r3, r4, str4, imageUrl2, r7, z, list, list2, (List) null, (String) null, (String) null, (String) null, (ProductAREffectContainer) null, (String) null, (C43091tn) null);
        String str5 = str3;
        ImageUrl imageUrl3 = imageUrl;
        String str6 = str2;
        String str7 = str;
        int i2 = i;
    }

    public AttributedAREffect(String str, String str2, ImageUrl imageUrl, String str3, String str4, ImageUrl imageUrl2, int i, boolean z, List list, List list2, List list3, String str5, String str6, String str7, ProductAREffectContainer productAREffectContainer, String str8, C43091tn r18) {
        Integer num;
        this.A08 = str;
        this.A09 = str2;
        this.A02 = imageUrl;
        this.A0G = str3;
        this.A06 = str4;
        this.A01 = imageUrl2;
        this.A00 = i;
        if (z) {
            num = Constants.ZERO;
        } else {
            num = Constants.ONE;
        }
        this.A05 = num;
        this.A0D = list;
        this.A0F = list2;
        this.A0E = list3;
        this.A07 = str5;
        this.A0C = str6;
        this.A0A = str7;
        this.A04 = productAREffectContainer;
        this.A0B = str8;
        this.A03 = r18;
    }
}
