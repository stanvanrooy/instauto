package com.instagram.model.shopping;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape0S0000000_I0;
import com.instagram.common.textwithentities.TextWithEntitiesBlock;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.shopping.incentives.sellerfunded.Incentive;
import com.instagram.model.shopping.incentives.sellerfunded.IncentiveContainer;
import com.instagram.tagging.model.TaggableModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p000X.Constants;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass17M;
import p000X.AnonymousClass1NN;
import p000X.AnonymousClass230;
import p000X.AnonymousClass9JI;
import p000X.C23300zv;
import p000X.C249616t;
import p000X.C32981cA;

public class Product implements C249616t, AnonymousClass1NN, TaggableModel {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape0S0000000_I0(66);
    public Map A00;
    public long A01;
    public Merchant A02;
    public ProductCheckoutProperties A03;
    public ProductImageContainer A04;
    public ProductImageContainer A05;
    public ProductLaunchInformation A06;
    public AnonymousClass230 A07 = AnonymousClass230.APPROVED;
    public ProductUntaggableReason A08;
    public IncentiveContainer A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public List A0L;
    public List A0M;
    public List A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;

    public final String AWS(AnonymousClass0C1 r2) {
        return null;
    }

    public final boolean Afk() {
        return true;
    }

    public final boolean Agp() {
        return true;
    }

    public final boolean Aho() {
        return false;
    }

    public final int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        if (r1.equals(r5.A09) == false) goto L_0x0028;
     */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Product) {
            Product product = (Product) obj;
            if (this.A0Q == product.A0Q && this.A0P == product.A0P && this.A0O == product.A0O) {
                IncentiveContainer incentiveContainer = this.A09;
                if (incentiveContainer == null) {
                    if (product.A09 != null) {
                        return false;
                    }
                }
                List list = this.A0L;
                if (list != null) {
                    if (!list.equals(product.A0L)) {
                        return false;
                    }
                } else if (product.A0L != null) {
                    return false;
                }
                List list2 = this.A0N;
                if (list2 != null) {
                    if (!list2.equals(product.A0N)) {
                        return false;
                    }
                } else if (product.A0N != null) {
                    return false;
                }
                if (this.A02.equals(product.A02)) {
                    ProductCheckoutProperties productCheckoutProperties = this.A03;
                    if (productCheckoutProperties != null) {
                        if (!productCheckoutProperties.equals(product.A03)) {
                            return false;
                        }
                    } else if (product.A03 != null) {
                        return false;
                    }
                    ProductLaunchInformation productLaunchInformation = this.A06;
                    if (productLaunchInformation != null) {
                        if (!productLaunchInformation.equals(product.A06)) {
                            return false;
                        }
                    } else if (product.A06 != null) {
                        return false;
                    }
                    ProductImageContainer productImageContainer = this.A04;
                    if (productImageContainer != null) {
                        if (!productImageContainer.equals(product.A04)) {
                            return false;
                        }
                    } else if (product.A04 != null) {
                        return false;
                    }
                    ProductImageContainer productImageContainer2 = this.A05;
                    if (productImageContainer2 != null) {
                        if (!productImageContainer2.equals(product.A05)) {
                            return false;
                        }
                    } else if (product.A05 != null) {
                        return false;
                    }
                    if (this.A07 == product.A07) {
                        String str = this.A0A;
                        if (str != null) {
                            if (!str.equals(product.A0A)) {
                                return false;
                            }
                        } else if (product.A0A != null) {
                            return false;
                        }
                        String str2 = this.A0C;
                        if (str2 != null) {
                            if (!str2.equals(product.A0C)) {
                                return false;
                            }
                        } else if (product.A0C != null) {
                            return false;
                        }
                        String str3 = this.A0G;
                        if (str3 != null) {
                            if (!str3.equals(product.A0G)) {
                                return false;
                            }
                        } else if (product.A0G != null) {
                            return false;
                        }
                        String str4 = this.A0D;
                        if (str4 != null) {
                            if (!str4.equals(product.A0D)) {
                                return false;
                            }
                        } else if (product.A0D != null) {
                            return false;
                        }
                        String str5 = this.A0H;
                        if (str5 != null) {
                            if (!str5.equals(product.A0H)) {
                                return false;
                            }
                        } else if (product.A0H != null) {
                            return false;
                        }
                        String str6 = this.A0E;
                        if (str6 != null) {
                            if (!str6.equals(product.A0E)) {
                                return false;
                            }
                        } else if (product.A0E != null) {
                            return false;
                        }
                        String str7 = this.A0F;
                        if (str7 != null) {
                            if (!str7.equals(product.A0F)) {
                                return false;
                            }
                        } else if (product.A0F != null) {
                            return false;
                        }
                        String str8 = this.A0I;
                        if (str8 != null) {
                            if (!str8.equals(product.A0I)) {
                                return false;
                            }
                        } else if (product.A0I != null) {
                            return false;
                        }
                        String str9 = this.A0J;
                        if (str9 != null) {
                            if (!str9.equals(product.A0J)) {
                                return false;
                            }
                        } else if (product.A0J != null) {
                            return false;
                        }
                        String str10 = this.A0B;
                        if (str10 != null) {
                            if (!str10.equals(product.A0B)) {
                                return false;
                            }
                        } else if (product.A0B != null) {
                            return false;
                        }
                        if (AnonymousClass17M.A00(this.A08, product.A08)) {
                            String str11 = this.A0K;
                            if (str11 != null) {
                                return str11.equals(product.A0K);
                            }
                            return product.A0K == null;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static void A00(Product product) {
        List<ProductVariantValue> list = product.A0N;
        if (list != null) {
            product.A00 = new HashMap();
            for (ProductVariantValue productVariantValue : list) {
                product.A00.put(productVariantValue.A01, productVariantValue.A03);
            }
        }
    }

    public final ImageInfo A01() {
        ProductImageContainer productImageContainer = this.A04;
        if (productImageContainer == null) {
            return null;
        }
        return productImageContainer.A00;
    }

    public final ImageInfo A02() {
        ProductImageContainer productImageContainer = this.A05;
        if (productImageContainer == null && (productImageContainer = this.A04) == null) {
            return null;
        }
        return productImageContainer.A00;
    }

    public final Incentive A03() {
        IncentiveContainer incentiveContainer = this.A09;
        if (incentiveContainer == null || Collections.unmodifiableList(incentiveContainer.A00).isEmpty()) {
            return null;
        }
        return (Incentive) Collections.unmodifiableList(this.A09.A00).get(0);
    }

    public final String A05(String str) {
        return (String) this.A00.get(str);
    }

    public final List A06() {
        List list = this.A0M;
        if (list == null) {
            return null;
        }
        return Collections.unmodifiableList(list);
    }

    public final List A07() {
        List list = this.A0N;
        if (list == null) {
            return null;
        }
        return Collections.unmodifiableList(list);
    }

    public final boolean A08() {
        List<ProductVariantValue> list = this.A0N;
        if (list != null) {
            for (ProductVariantValue productVariantValue : list) {
                if (productVariantValue.A00 == AnonymousClass9JI.THUMBNAIL) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean A09() {
        return "native_checkout".equals(this.A0A);
    }

    public final boolean A0A() {
        ProductCheckoutProperties productCheckoutProperties = this.A03;
        if ((productCheckoutProperties == null || productCheckoutProperties.A00 <= 0) && !A0D()) {
            return false;
        }
        return true;
    }

    public final boolean A0B() {
        return !this.A0D.equals(this.A0H);
    }

    public final boolean A0C() {
        ProductUntaggableReason productUntaggableReason = this.A08;
        if (productUntaggableReason == null || productUntaggableReason.A02 == Constants.ZERO) {
            return true;
        }
        return false;
    }

    public final boolean A0D() {
        ProductLaunchInformation productLaunchInformation = this.A06;
        if (productLaunchInformation == null || productLaunchInformation.A01) {
            return false;
        }
        return true;
    }

    public final Integer AV3() {
        if (this.A0Q) {
            return Constants.ZERO;
        }
        return Constants.ONE;
    }

    public final boolean AhP() {
        return this.A0Q;
    }

    public final void BkJ(Integer num) {
        boolean z = false;
        if (num == Constants.ZERO) {
            z = true;
        }
        this.A0Q = z;
    }

    public final String getId() {
        return this.A0J;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20 = (((((this.A0Q ? 1 : 0) * true) + (this.A0P ? 1 : 0)) * 31) + (this.A0O ? 1 : 0)) * 31;
        IncentiveContainer incentiveContainer = this.A09;
        int i21 = 0;
        if (incentiveContainer != null) {
            i = incentiveContainer.hashCode();
        } else {
            i = 0;
        }
        int i22 = (i20 + i) * 31;
        List list = this.A0L;
        if (list != null) {
            i2 = list.hashCode();
        } else {
            i2 = 0;
        }
        int i23 = (i22 + i2) * 31;
        List list2 = this.A0N;
        if (list2 != null) {
            i3 = list2.hashCode();
        } else {
            i3 = 0;
        }
        int hashCode = (((i23 + i3) * 31) + this.A02.hashCode()) * 31;
        ProductCheckoutProperties productCheckoutProperties = this.A03;
        if (productCheckoutProperties != null) {
            i4 = productCheckoutProperties.hashCode();
        } else {
            i4 = 0;
        }
        int i24 = (hashCode + i4) * 31;
        ProductLaunchInformation productLaunchInformation = this.A06;
        if (productLaunchInformation != null) {
            i5 = productLaunchInformation.hashCode();
        } else {
            i5 = 0;
        }
        int i25 = (i24 + i5) * 31;
        ProductImageContainer productImageContainer = this.A04;
        if (productImageContainer != null) {
            i6 = productImageContainer.hashCode();
        } else {
            i6 = 0;
        }
        int i26 = (i25 + i6) * 31;
        ProductImageContainer productImageContainer2 = this.A05;
        if (productImageContainer2 != null) {
            i7 = productImageContainer2.hashCode();
        } else {
            i7 = 0;
        }
        int i27 = (i26 + i7) * 31;
        AnonymousClass230 r0 = this.A07;
        if (r0 != null) {
            i8 = r0.hashCode();
        } else {
            i8 = 0;
        }
        int i28 = (i27 + i8) * 31;
        String str = this.A0A;
        if (str != null) {
            i9 = str.hashCode();
        } else {
            i9 = 0;
        }
        int i29 = (i28 + i9) * 31;
        String str2 = this.A0C;
        if (str2 != null) {
            i10 = str2.hashCode();
        } else {
            i10 = 0;
        }
        int i30 = (i29 + i10) * 31;
        String str3 = this.A0G;
        if (str3 != null) {
            i11 = str3.hashCode();
        } else {
            i11 = 0;
        }
        int i31 = (i30 + i11) * 31;
        String str4 = this.A0D;
        if (str4 != null) {
            i12 = str4.hashCode();
        } else {
            i12 = 0;
        }
        int i32 = (i31 + i12) * 31;
        String str5 = this.A0H;
        if (str5 != null) {
            i13 = str5.hashCode();
        } else {
            i13 = 0;
        }
        int i33 = (i32 + i13) * 31;
        String str6 = this.A0E;
        if (str6 != null) {
            i14 = str6.hashCode();
        } else {
            i14 = 0;
        }
        int i34 = (i33 + i14) * 31;
        String str7 = this.A0F;
        if (str7 != null) {
            i15 = str7.hashCode();
        } else {
            i15 = 0;
        }
        int i35 = (i34 + i15) * 31;
        String str8 = this.A0I;
        if (str8 != null) {
            i16 = str8.hashCode();
        } else {
            i16 = 0;
        }
        int i36 = (i35 + i16) * 31;
        String str9 = this.A0J;
        if (str9 != null) {
            i17 = str9.hashCode();
        } else {
            i17 = 0;
        }
        int i37 = (i36 + i17) * 31;
        String str10 = this.A0B;
        if (str10 != null) {
            i18 = str10.hashCode();
        } else {
            i18 = 0;
        }
        int i38 = (i37 + i18) * 31;
        String str11 = this.A0K;
        if (str11 != null) {
            i19 = str11.hashCode();
        } else {
            i19 = 0;
        }
        int i39 = (i38 + i19) * 31;
        ProductUntaggableReason productUntaggableReason = this.A08;
        if (productUntaggableReason != null) {
            i21 = productUntaggableReason.hashCode();
        }
        return i39 + i21;
    }

    public void setIsInStock(boolean z) {
        ProductCheckoutProperties productCheckoutProperties = this.A03;
        if (productCheckoutProperties != null) {
            productCheckoutProperties.A00 = z ? 1 : 0;
        }
    }

    public void setPrice(String str, String str2) {
        this.A0C = str2;
        this.A0D = str2;
        this.A0G = str;
        this.A0H = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A0Q ? 1 : 0);
        parcel.writeLong(this.A01);
        parcel.writeInt(this.A0P ? 1 : 0);
        parcel.writeInt(this.A0O ? 1 : 0);
        parcel.writeParcelable(this.A09, i);
        int i2 = 0;
        int i3 = 1;
        if (this.A0L == null) {
            i3 = 0;
        }
        parcel.writeInt(i3);
        List list = this.A0L;
        if (list != null) {
            parcel.writeList(list);
        }
        int i4 = 1;
        if (this.A0N == null) {
            i4 = 0;
        }
        parcel.writeInt(i4);
        List list2 = this.A0N;
        if (list2 != null) {
            parcel.writeList(list2);
        }
        parcel.writeParcelable(this.A02, i);
        parcel.writeParcelable(this.A03, i);
        parcel.writeParcelable(this.A06, i);
        parcel.writeParcelable(this.A04, i);
        parcel.writeParcelable(this.A05, i);
        parcel.writeString(this.A07.A00);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A0E);
        if (this.A0M != null) {
            i2 = 1;
        }
        parcel.writeInt(i2);
        List list3 = this.A0M;
        if (list3 != null) {
            parcel.writeList(list3);
        }
        parcel.writeString(this.A0F);
        parcel.writeString(this.A0G);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A0H);
        parcel.writeString(this.A0I);
        parcel.writeString(this.A0J);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0K);
        parcel.writeParcelable(this.A08, i);
    }

    public final String A04() {
        if (A0B()) {
            return this.A0D;
        }
        return this.A0H;
    }

    public final void A6t(AnonymousClass0C1 r3) {
        C23300zv.A00(r3).BXT(new C32981cA(this));
    }

    public final Collection AV4() {
        return Collections.emptyList();
    }

    public final void Bhx(String str) {
        this.A0J = str;
    }

    public void setReviewStatus(AnonymousClass230 r1) {
        this.A07 = r1;
    }

    public Product() {
    }

    public Product(Parcel parcel) {
        boolean z = false;
        this.A0Q = parcel.readInt() == 1;
        this.A01 = parcel.readLong();
        this.A0P = parcel.readInt() == 1;
        this.A0O = parcel.readInt() == 1 ? true : z;
        this.A09 = (IncentiveContainer) parcel.readParcelable(IncentiveContainer.class.getClassLoader());
        if (parcel.readInt() == 1) {
            ArrayList arrayList = new ArrayList();
            this.A0L = arrayList;
            parcel.readList(arrayList, ProductImageContainer.class.getClassLoader());
        }
        if (parcel.readInt() == 1) {
            ArrayList arrayList2 = new ArrayList();
            this.A0N = arrayList2;
            parcel.readList(arrayList2, ProductVariantValue.class.getClassLoader());
        }
        this.A02 = (Merchant) parcel.readParcelable(Merchant.class.getClassLoader());
        this.A03 = (ProductCheckoutProperties) parcel.readParcelable(ProductCheckoutProperties.class.getClassLoader());
        this.A06 = (ProductLaunchInformation) parcel.readParcelable(ProductLaunchInformation.class.getClassLoader());
        Class<ProductImageContainer> cls = ProductImageContainer.class;
        this.A04 = (ProductImageContainer) parcel.readParcelable(cls.getClassLoader());
        this.A05 = (ProductImageContainer) parcel.readParcelable(cls.getClassLoader());
        this.A07 = AnonymousClass230.A00(parcel.readString());
        this.A0A = parcel.readString();
        this.A0C = parcel.readString();
        this.A0E = parcel.readString();
        if (parcel.readInt() == 1) {
            ArrayList arrayList3 = new ArrayList();
            this.A0M = arrayList3;
            parcel.readList(arrayList3, TextWithEntitiesBlock.class.getClassLoader());
        }
        this.A0F = parcel.readString();
        this.A0G = parcel.readString();
        this.A0D = parcel.readString();
        this.A0H = parcel.readString();
        this.A0I = parcel.readString();
        this.A0J = parcel.readString();
        this.A0B = parcel.readString();
        this.A0K = parcel.readString();
        this.A08 = (ProductUntaggableReason) parcel.readParcelable(ProductUntaggableReason.class.getClassLoader());
        A00(this);
    }
}
