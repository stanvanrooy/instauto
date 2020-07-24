package com.google.android.exoplayer2.drm;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import p000X.C25948Bd0;
import p000X.C29686D4x;
import p000X.D6U;

public final class DrmInitData implements Comparator, Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(129);
    public int A00;
    public final int A01;
    public final String A02;
    public final SchemeData[] A03;

    public final class SchemeData implements Parcelable {
        public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(130);
        public int A00;
        public final String A01;
        public final UUID A02;
        public final boolean A03;
        public final byte[] A04;

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof SchemeData)) {
                return false;
            }
            if (obj != this) {
                SchemeData schemeData = (SchemeData) obj;
                if (!this.A01.equals(schemeData.A01) || !C25948Bd0.A0D(this.A02, schemeData.A02) || !Arrays.equals(this.A04, schemeData.A04)) {
                    return false;
                }
            }
            return true;
        }

        public final int hashCode() {
            if (this.A00 == 0) {
                this.A00 = (((this.A02.hashCode() * 31) + this.A01.hashCode()) * 31) + Arrays.hashCode(this.A04);
            }
            return this.A00;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.A02.getMostSignificantBits());
            parcel.writeLong(this.A02.getLeastSignificantBits());
            parcel.writeString(this.A01);
            parcel.writeByteArray(this.A04);
            parcel.writeByte(this.A03 ? (byte) 1 : 0);
        }

        public SchemeData(Parcel parcel) {
            this.A02 = new UUID(parcel.readLong(), parcel.readLong());
            this.A01 = parcel.readString();
            this.A04 = parcel.createByteArray();
            this.A03 = parcel.readByte() != 0;
        }

        public SchemeData(UUID uuid, String str, byte[] bArr, boolean z) {
            D6U.A01(uuid);
            this.A02 = uuid;
            D6U.A01(str);
            this.A01 = str;
            this.A04 = bArr;
            this.A03 = z;
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            DrmInitData drmInitData = (DrmInitData) obj;
            if (!C25948Bd0.A0D(this.A02, drmInitData.A02) || !Arrays.equals(this.A03, drmInitData.A03)) {
                return false;
            }
        }
        return true;
    }

    public final DrmInitData A00(String str) {
        if (C25948Bd0.A0D(this.A02, str)) {
            return this;
        }
        return new DrmInitData(str, false, this.A03);
    }

    public final int compare(Object obj, Object obj2) {
        SchemeData schemeData = (SchemeData) obj;
        SchemeData schemeData2 = (SchemeData) obj2;
        UUID uuid = C29686D4x.A03;
        if (!uuid.equals(schemeData.A02)) {
            return schemeData.A02.compareTo(schemeData2.A02);
        }
        if (uuid.equals(schemeData2.A02)) {
            return 0;
        }
        return 1;
    }

    public final int hashCode() {
        int hashCode;
        if (this.A00 == 0) {
            String str = this.A02;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            this.A00 = (hashCode * 31) + Arrays.hashCode(this.A03);
        }
        return this.A00;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeTypedArray(this.A03, 0);
    }

    public DrmInitData(Parcel parcel) {
        this.A02 = parcel.readString();
        SchemeData[] schemeDataArr = (SchemeData[]) parcel.createTypedArray(SchemeData.CREATOR);
        this.A03 = schemeDataArr;
        this.A01 = schemeDataArr.length;
    }

    public DrmInitData(String str, List list) {
        this(str, false, (SchemeData[]) list.toArray(new SchemeData[list.size()]));
    }

    public DrmInitData(String str, boolean z, SchemeData... schemeDataArr) {
        this.A02 = str;
        schemeDataArr = z ? (SchemeData[]) schemeDataArr.clone() : schemeDataArr;
        Arrays.sort(schemeDataArr, this);
        this.A03 = schemeDataArr;
        this.A01 = schemeDataArr.length;
    }
}
