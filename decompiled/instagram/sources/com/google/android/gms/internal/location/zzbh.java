package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Locale;
import p000X.C228479tj;

public final class zzbh extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(196);
    public final String A00;
    public final double A01;
    public final double A02;
    public final float A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final long A07;
    public final short A08;

    public zzbh(String str, int i, short s, double d, double d2, float f, long j, int i2, int i3) {
        if (str == null || str.length() > 100) {
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() != 0 ? "requestId is null or too long: ".concat(valueOf) : new String("requestId is null or too long: "));
        } else if (f <= BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("invalid radius: ");
            sb.append(f);
            throw new IllegalArgumentException(sb.toString());
        } else if (d > 90.0d || d < -90.0d) {
            StringBuilder sb2 = new StringBuilder(42);
            sb2.append("invalid latitude: ");
            sb2.append(d);
            throw new IllegalArgumentException(sb2.toString());
        } else if (d2 > 180.0d || d2 < -180.0d) {
            StringBuilder sb3 = new StringBuilder(43);
            sb3.append("invalid longitude: ");
            sb3.append(d2);
            throw new IllegalArgumentException(sb3.toString());
        } else {
            int i4 = i & 7;
            if (i4 != 0) {
                this.A08 = s;
                this.A00 = str;
                this.A01 = d;
                this.A02 = d2;
                this.A03 = f;
                this.A07 = j;
                this.A04 = i4;
                this.A05 = i2;
                this.A06 = i3;
                return;
            }
            StringBuilder sb4 = new StringBuilder(46);
            sb4.append("No supported transition specified: ");
            sb4.append(i);
            throw new IllegalArgumentException(sb4.toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof zzbh)) {
                zzbh zzbh = (zzbh) obj;
                if (!(this.A03 == zzbh.A03 && this.A01 == zzbh.A01 && this.A02 == zzbh.A02 && this.A08 == zzbh.A08)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.A01);
        int i = ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31;
        long doubleToLongBits2 = Double.doubleToLongBits(this.A02);
        return (((((((i * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + Float.floatToIntBits(this.A03)) * 31) + this.A08) * 31) + this.A04;
    }

    public final String toString() {
        Locale locale = Locale.US;
        Object[] objArr = new Object[9];
        objArr[0] = this.A08 != 1 ? null : "CIRCLE";
        objArr[1] = this.A00.replaceAll("\\p{C}", "?");
        objArr[2] = Integer.valueOf(this.A04);
        objArr[3] = Double.valueOf(this.A01);
        objArr[4] = Double.valueOf(this.A02);
        objArr[5] = Float.valueOf(this.A03);
        objArr[6] = Integer.valueOf(this.A05 / 1000);
        objArr[7] = Integer.valueOf(this.A06);
        objArr[8] = Long.valueOf(this.A07);
        return String.format(locale, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", objArr);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C228479tj.A00(parcel);
        C228479tj.A0A(parcel, 1, this.A00, false);
        C228479tj.A06(parcel, 2, this.A07);
        short s = this.A08;
        C228479tj.A05(parcel, 3, 4);
        parcel.writeInt(s);
        double d = this.A01;
        C228479tj.A05(parcel, 4, 8);
        parcel.writeDouble(d);
        double d2 = this.A02;
        C228479tj.A05(parcel, 5, 8);
        parcel.writeDouble(d2);
        C228479tj.A03(parcel, 6, this.A03);
        C228479tj.A04(parcel, 7, this.A04);
        C228479tj.A04(parcel, 8, this.A05);
        C228479tj.A04(parcel, 9, this.A06);
        C228479tj.A02(parcel, A002);
    }
}
