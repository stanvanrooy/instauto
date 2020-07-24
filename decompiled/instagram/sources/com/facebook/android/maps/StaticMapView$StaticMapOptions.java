package com.facebook.android.maps;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.android.maps.model.LatLng;
import com.facebook.redex.PCreatorEBaseShape0S0000000_I0;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p000X.AnonymousClass000;

public class StaticMapView$StaticMapOptions implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape0S0000000_I0(3);
    public float A00 = 1.0f;
    public float A01 = 1.0f;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public List A0A = Collections.EMPTY_LIST;

    public final void A00() {
        this.A09 = null;
        this.A02 = null;
        this.A08 = null;
        this.A03 = null;
        this.A04 = null;
        this.A05 = null;
        this.A06 = null;
        this.A00 = 1.0f;
        this.A01 = 1.0f;
        this.A0A.clear();
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StaticMapView$StaticMapOptions)) {
            return false;
        }
        StaticMapView$StaticMapOptions staticMapView$StaticMapOptions = (StaticMapView$StaticMapOptions) obj;
        String str = this.A07;
        if (str != null ? str.equals(staticMapView$StaticMapOptions.A07) : staticMapView$StaticMapOptions.A07 == null) {
            String str2 = this.A09;
            if (str2 != null ? str2.equals(staticMapView$StaticMapOptions.A09) : staticMapView$StaticMapOptions.A09 == null) {
                String str3 = this.A02;
                if (str3 != null ? str3.equals(staticMapView$StaticMapOptions.A02) : staticMapView$StaticMapOptions.A02 == null) {
                    String str4 = this.A08;
                    if (str4 != null ? str4.equals(staticMapView$StaticMapOptions.A08) : staticMapView$StaticMapOptions.A08 == null) {
                        String str5 = this.A03;
                        if (str5 != null ? str5.equals(staticMapView$StaticMapOptions.A03) : staticMapView$StaticMapOptions.A03 == null) {
                            String str6 = this.A04;
                            if (str6 != null ? str6.equals(staticMapView$StaticMapOptions.A04) : staticMapView$StaticMapOptions.A04 == null) {
                                String str7 = this.A05;
                                if (str7 != null ? str7.equals(staticMapView$StaticMapOptions.A05) : staticMapView$StaticMapOptions.A05 == null) {
                                    String str8 = this.A06;
                                    if (str8 != null ? str8.equals(staticMapView$StaticMapOptions.A06) : staticMapView$StaticMapOptions.A06 == null) {
                                        return this.A00 == staticMapView$StaticMapOptions.A00 && this.A01 == staticMapView$StaticMapOptions.A01 && this.A0A.equals(staticMapView$StaticMapOptions.A0A);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final void A01(double d, double d2) {
        this.A02 = d + "," + d2;
    }

    public final void A03(int i, LatLng latLng, int i2) {
        StringBuilder sb = new StringBuilder("color:0x");
        Locale locale = Locale.US;
        sb.append(String.format(locale, "%08X", new Object[]{Integer.valueOf((i >>> 24) | (i << 8))}).toUpperCase(locale));
        sb.append('|');
        sb.append(latLng.A00);
        sb.append(',');
        sb.append(latLng.A01);
        sb.append('|');
        sb.append(i2);
        sb.append('m');
        this.A03 = sb.toString();
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        String str = this.A07;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (527 + hashCode) * 31;
        String str2 = this.A09;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.A02;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str4 = this.A08;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        String str5 = this.A03;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        String str6 = this.A04;
        if (str6 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str6.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        String str7 = this.A05;
        if (str7 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str7.hashCode();
        }
        int i8 = (i7 + hashCode7) * 31;
        String str8 = this.A06;
        if (str8 != null) {
            i = str8.hashCode();
        }
        return ((((((i8 + i) * 31) + Float.floatToIntBits(this.A00)) * 31) + Float.floatToIntBits(this.A01)) * 31) + this.A0A.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A07);
        parcel.writeString(this.A09);
        parcel.writeString(this.A02);
        parcel.writeString(this.A08);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeFloat(this.A00);
        parcel.writeFloat(this.A01);
        parcel.writeStringList(this.A0A);
    }

    public StaticMapView$StaticMapOptions(String str) {
        this.A07 = str;
    }

    public final void A02(double d, double d2) {
        this.A05 = AnonymousClass000.A0J("color:", "red", "|") + d + ", " + d2;
    }

    public final void A04(List list) {
        if (list.isEmpty()) {
            this.A05 = null;
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty("red")) {
            sb.append("|color:");
            sb.append("red");
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            LatLng latLng = (LatLng) it.next();
            sb.append('|');
            sb.append(latLng.A00);
            sb.append(',');
            sb.append(latLng.A01);
        }
        this.A05 = sb.toString().substring(1);
    }
}
