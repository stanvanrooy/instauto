package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import com.google.android.gms.common.server.converter.zaa;
import p000X.C228479tj;
import p000X.C228489tz;
import p000X.C228649vO;

public class FastJsonResponse$Field extends AbstractSafeParcelable {
    public static final PCreatorEBaseShape1S0000000_I1 CREATOR = new PCreatorEBaseShape1S0000000_I1(179);
    public C228649vO A00;
    public zak A01;
    public final int A02;
    public final int A03;
    public final String A04;
    public final boolean A05;
    public final int A06;
    public final int A07;
    public final Class A08;
    public final String A09;
    public final boolean A0A;

    public static FastJsonResponse$Field A00(String str, int i) {
        return new FastJsonResponse$Field(7, false, 7, false, str, i, (Class) null);
    }

    public static FastJsonResponse$Field A01(String str, int i) {
        return new FastJsonResponse$Field(7, true, 7, true, str, i, (Class) null);
    }

    public final String toString() {
        C228489tz r2 = new C228489tz(this);
        r2.A00("versionCode", Integer.valueOf(this.A06));
        r2.A00("typeIn", Integer.valueOf(this.A02));
        r2.A00("typeInArray", Boolean.valueOf(this.A05));
        r2.A00("typeOut", Integer.valueOf(this.A07));
        r2.A00("typeOutArray", Boolean.valueOf(this.A0A));
        r2.A00("outputFieldName", this.A09);
        r2.A00("safeParcelFieldId", Integer.valueOf(this.A03));
        String str = this.A04;
        if (str == null) {
            str = null;
        }
        r2.A00("concreteTypeName", str);
        Class cls = this.A08;
        if (cls != null) {
            r2.A00("concreteType.class", cls.getCanonicalName());
        }
        C228649vO r0 = this.A00;
        if (r0 != null) {
            r2.A00("converterName", r0.getClass().getCanonicalName());
        }
        return r2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        zaa zaa;
        int A002 = C228479tj.A00(parcel);
        C228479tj.A04(parcel, 1, this.A06);
        C228479tj.A04(parcel, 2, this.A02);
        C228479tj.A0D(parcel, 3, this.A05);
        C228479tj.A04(parcel, 4, this.A07);
        C228479tj.A0D(parcel, 5, this.A0A);
        C228479tj.A0A(parcel, 6, this.A09, false);
        C228479tj.A04(parcel, 7, this.A03);
        String str = this.A04;
        if (str == null) {
            str = null;
        }
        C228479tj.A0A(parcel, 8, str, false);
        C228649vO r1 = this.A00;
        if (r1 == null) {
            zaa = null;
        } else if (r1 instanceof StringToIntConverter) {
            zaa = new zaa((StringToIntConverter) r1);
        } else {
            throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
        }
        C228479tj.A09(parcel, 9, zaa, i, false);
        C228479tj.A02(parcel, A002);
    }

    public FastJsonResponse$Field(int i, int i2, boolean z, int i3, boolean z2, String str, int i4, String str2, zaa zaa) {
        this.A06 = i;
        this.A02 = i2;
        this.A05 = z;
        this.A07 = i3;
        this.A0A = z2;
        this.A09 = str;
        this.A03 = i4;
        if (str2 == null) {
            this.A08 = null;
            this.A04 = null;
        } else {
            this.A08 = SafeParcelResponse.class;
            this.A04 = str2;
        }
        if (zaa == null) {
            this.A00 = null;
            return;
        }
        StringToIntConverter stringToIntConverter = zaa.A00;
        if (stringToIntConverter != null) {
            this.A00 = stringToIntConverter;
            return;
        }
        throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
    }

    public FastJsonResponse$Field(int i, boolean z, int i2, boolean z2, String str, int i3, Class cls) {
        this.A06 = 1;
        this.A02 = i;
        this.A05 = z;
        this.A07 = i2;
        this.A0A = z2;
        this.A09 = str;
        this.A03 = i3;
        this.A08 = cls;
        if (cls == null) {
            this.A04 = null;
        } else {
            this.A04 = cls.getCanonicalName();
        }
        this.A00 = null;
    }
}
