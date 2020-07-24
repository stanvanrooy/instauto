package com.facebook.wifiscan.parcelable;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import p000X.AnonymousClass2TL;

public class ParcelableWifiScanResult extends AnonymousClass2TL implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(103);

    public final int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        if (r1.equals(r8.A07) == false) goto L_0x0026;
     */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof AnonymousClass2TL)) {
            AnonymousClass2TL r8 = (AnonymousClass2TL) obj;
            if (this.A02 == r8.A02 && this.A01 == r8.A01) {
                String str = this.A07;
                if (str == null) {
                    if (r8.A07 != null) {
                        return false;
                    }
                }
                String str2 = this.A08;
                if (str2 != null) {
                    if (!str2.equals(r8.A08)) {
                        return false;
                    }
                } else if (r8.A08 != null) {
                    return false;
                }
                Integer num = this.A06;
                if (num != null) {
                    if (!num.equals(r8.A06)) {
                        return false;
                    }
                } else if (r8.A06 != null) {
                    return false;
                }
                String str3 = this.A09;
                if (str3 != null) {
                    if (!str3.equals(r8.A09)) {
                        return false;
                    }
                } else if (r8.A09 != null) {
                    return false;
                }
                String str4 = this.A0A;
                if (str4 != null) {
                    if (!str4.equals(r8.A0A)) {
                        return false;
                    }
                } else if (r8.A0A != null) {
                    return false;
                }
                String str5 = this.A0B;
                if (str5 != null) {
                    if (!str5.equals(r8.A0B)) {
                        return false;
                    }
                } else if (r8.A0B != null) {
                    return false;
                }
                Boolean bool = this.A03;
                if (bool != null) {
                    return bool.equals(r8.A03);
                }
                return r8.A03 == null;
            }
        }
        return false;
    }

    public static ParcelableWifiScanResult A02(AnonymousClass2TL r12) {
        if (r12 == null) {
            return null;
        }
        return new ParcelableWifiScanResult(r12.A02, r12.A07, r12.A01, r12.A08, r12.A06, r12.A09, r12.A0A, r12.A0B, r12.A03, r12.A04, r12.A05);
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
        long j = this.A02;
        int i9 = ((int) (j ^ (j >>> 32))) * 31;
        String str = this.A07;
        int i10 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i11 = (((i9 + i) * 31) + this.A01) * 31;
        String str2 = this.A08;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i12 = (i11 + i2) * 31;
        Integer num = this.A06;
        if (num != null) {
            i3 = num.hashCode();
        } else {
            i3 = 0;
        }
        int i13 = (i12 + i3) * 31;
        String str3 = this.A09;
        if (str3 != null) {
            i4 = str3.hashCode();
        } else {
            i4 = 0;
        }
        int i14 = (i13 + i4) * 31;
        String str4 = this.A0A;
        if (str4 != null) {
            i5 = str4.hashCode();
        } else {
            i5 = 0;
        }
        int i15 = (i14 + i5) * 31;
        String str5 = this.A0B;
        if (str5 != null) {
            i6 = str5.hashCode();
        } else {
            i6 = 0;
        }
        int i16 = (i15 + i6) * 31;
        Boolean bool = this.A03;
        if (bool != null) {
            i7 = bool.hashCode();
        } else {
            i7 = 0;
        }
        int i17 = (i16 + i7) * 31;
        Integer num2 = this.A04;
        if (num2 != null) {
            i8 = num2.hashCode();
        } else {
            i8 = 0;
        }
        int i18 = (i17 + i8) * 31;
        Integer num3 = this.A05;
        if (num3 != null) {
            i10 = num3.hashCode();
        }
        return i18 + i10;
    }

    public final String toString() {
        return "ParcelableWifiScanResult{timestampMs=" + this.A02 + ", BSSID='" + this.A07 + '\'' + ", level=" + this.A01 + ", SSID='" + this.A08 + '\'' + ", frequency=" + this.A06 + ", capabilities='" + this.A09 + '\'' + ", operatorName='" + this.A0A + '\'' + ", venueName='" + this.A0B + '\'' + ", hasCaptivePortal=" + this.A03 + '\'' + ", distanceMm=" + this.A04 + '\'' + ", distanceStd=" + this.A05 + '}';
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A02);
        parcel.writeString(this.A07);
        parcel.writeInt(this.A01);
        parcel.writeString(this.A08);
        parcel.writeValue(this.A06);
        parcel.writeString(this.A09);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A0B);
        parcel.writeValue(this.A03);
        parcel.writeValue(this.A04);
        parcel.writeValue(this.A05);
    }

    public ParcelableWifiScanResult(long j, String str, int i, String str2, Integer num, String str3, String str4, String str5, Boolean bool, Integer num2, Integer num3) {
        super(j, str, i, str2, num, str3, str4, str5, bool, num2, num3);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public ParcelableWifiScanResult(Parcel parcel) {
        super(parcel.readLong(), parcel.readString(), parcel.readInt(), parcel.readString(), (Integer) parcel.readValue(r1.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), (Boolean) parcel.readValue(Boolean.class.getClassLoader()), (Integer) parcel.readValue(r1.getClassLoader()), (Integer) parcel.readValue(r1.getClassLoader()));
        Class<Integer> cls = Integer.class;
    }
}
