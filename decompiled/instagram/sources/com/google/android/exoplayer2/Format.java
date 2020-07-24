package com.google.android.exoplayer2;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.exoplayer.ipc.VideoPlayerStreamFormat;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.video.ColorInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p000X.C25948Bd0;

public class Format implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(128);
    public int A00;
    public final float A01;
    public final float A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final int A0F;
    public final long A0G;
    public final DrmInitData A0H;
    public final Metadata A0I;
    public final ColorInfo A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;
    public final String A0N;
    public final String A0O;
    public final String A0P;
    public final String A0Q;
    public final String A0R;
    public final String A0S;
    public final List A0T;
    public final boolean A0U;
    public final boolean A0V;
    public final boolean A0W;
    public final boolean A0X;
    public final boolean A0Y;
    public final boolean A0Z;
    public final byte[] A0a;

    public static Format A00(String str) {
        return new Format((String) null, (String) null, str, (String) null, -1, -1, -1, -1, -1, -1.0f, (byte[]) null, -1, (ColorInfo) null, -1, -1, -1, 0, (String) null, -1, Long.MAX_VALUE, (List) null, (DrmInitData) null);
    }

    public static Format A01(String str, String str2) {
        return new Format(str, (String) null, str2, (String) null, -1, -1, -1, -1, -1, -1.0f, (byte[]) null, -1, (ColorInfo) null, -1, -1, -1, 0, (String) null, -1, Long.MAX_VALUE, (List) null, (DrmInitData) null);
    }

    public static Format A02(String str, String str2, int i) {
        return A04(str, str2, i, (String) null, (DrmInitData) null, Long.MAX_VALUE, Collections.emptyList());
    }

    public static Format A03(String str, String str2, int i, int i2, int i3, int i4, List list, DrmInitData drmInitData, int i5, String str3) {
        return new Format(str, (String) null, str2, (String) null, -1, i, -1, -1, -1, -1.0f, (byte[]) null, -1, (ColorInfo) null, i2, i3, i4, i5, str3, -1, Long.MAX_VALUE, list, drmInitData);
    }

    public static Format A04(String str, String str2, int i, String str3, DrmInitData drmInitData, long j, List list) {
        return new Format(str, (String) null, str2, (String) null, -1, -1, -1, -1, -1, -1.0f, (byte[]) null, -1, (ColorInfo) null, -1, -1, -1, i, str3, -1, j, list, drmInitData);
    }

    public int describeContents() {
        boolean z = this instanceof VideoPlayerStreamFormat;
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Format format = (Format) obj;
            if (!(this.A04 == format.A04 && this.A09 == format.A09 && this.A0F == format.A0F && this.A08 == format.A08 && this.A01 == format.A01 && this.A0B == format.A0B && this.A02 == format.A02 && this.A0E == format.A0E && this.A05 == format.A05 && this.A0C == format.A0C && this.A0A == format.A0A && this.A06 == format.A06 && this.A07 == format.A07 && this.A0G == format.A0G && this.A0D == format.A0D && C25948Bd0.A0D(this.A0Q, format.A0Q) && C25948Bd0.A0D(this.A0R, format.A0R) && this.A03 == format.A03 && C25948Bd0.A0D(this.A0L, format.A0L) && C25948Bd0.A0D(this.A0S, format.A0S) && C25948Bd0.A0D(this.A0K, format.A0K) && C25948Bd0.A0D(this.A0H, format.A0H) && C25948Bd0.A0D(this.A0I, format.A0I) && C25948Bd0.A0D(this.A0J, format.A0J) && Arrays.equals(this.A0a, format.A0a) && A0A(format))) {
                return false;
            }
        }
        return true;
    }

    public final Format A05(float f) {
        String str = this.A0Q;
        String str2 = this.A0L;
        String str3 = this.A0S;
        String str4 = this.A0K;
        int i = this.A04;
        int i2 = this.A09;
        int i3 = this.A0F;
        int i4 = this.A08;
        return new Format(str, str2, str3, str4, i, i2, i3, i4, f, this.A0B, this.A02, this.A0a, this.A0E, this.A0J, this.A05, this.A0C, this.A0A, this.A06, this.A07, this.A0D, this.A0R, this.A03, this.A0G, this.A0T, this.A0H, this.A0I, this.A0P, this.A0X, this.A0Y, this.A0V, this.A0U, this.A0Z, this.A0N, this.A0O, this.A0M, this.A0W);
    }

    public final Format A06(int i, int i2) {
        String str = this.A0Q;
        String str2 = this.A0L;
        String str3 = this.A0S;
        String str4 = this.A0K;
        int i3 = this.A04;
        int i4 = this.A09;
        int i5 = this.A0F;
        int i6 = this.A08;
        float f = this.A01;
        int i7 = this.A0B;
        float f2 = this.A02;
        byte[] bArr = this.A0a;
        int i8 = this.A0E;
        ColorInfo colorInfo = this.A0J;
        int i9 = this.A05;
        int i10 = this.A0C;
        int i11 = this.A0A;
        ColorInfo colorInfo2 = colorInfo;
        int i12 = i9;
        int i13 = i10;
        int i14 = i11;
        return new Format(str, str2, str3, str4, i3, i4, i5, i6, f, i7, f2, bArr, i8, colorInfo2, i12, i13, i14, i, i2, this.A0D, this.A0R, this.A03, this.A0G, this.A0T, this.A0H, this.A0I, this.A0P, this.A0X, this.A0Y, this.A0V, this.A0U, this.A0Z, this.A0N, this.A0O, this.A0M, this.A0W);
    }

    public final Format A07(long j) {
        String str = this.A0Q;
        String str2 = this.A0L;
        String str3 = this.A0S;
        String str4 = this.A0K;
        int i = this.A04;
        int i2 = this.A09;
        int i3 = this.A0F;
        int i4 = this.A08;
        float f = this.A01;
        int i5 = this.A0B;
        float f2 = this.A02;
        byte[] bArr = this.A0a;
        int i6 = this.A0E;
        ColorInfo colorInfo = this.A0J;
        int i7 = this.A05;
        int i8 = this.A0C;
        int i9 = this.A0A;
        int i10 = this.A06;
        int i11 = this.A07;
        int i12 = this.A0D;
        String str5 = this.A0R;
        int i13 = this.A03;
        ColorInfo colorInfo2 = colorInfo;
        int i14 = i7;
        int i15 = i8;
        int i16 = i9;
        int i17 = i10;
        int i18 = i11;
        return new Format(str, str2, str3, str4, i, i2, i3, i4, f, i5, f2, bArr, i6, colorInfo2, i14, i15, i16, i17, i18, i12, str5, i13, j, this.A0T, this.A0H, this.A0I, this.A0P, this.A0X, this.A0Y, this.A0V, this.A0U, this.A0Z, this.A0N, this.A0O, this.A0M, this.A0W);
    }

    public final Format A08(DrmInitData drmInitData) {
        String str = this.A0Q;
        String str2 = this.A0L;
        String str3 = this.A0S;
        String str4 = this.A0K;
        int i = this.A04;
        int i2 = this.A09;
        int i3 = this.A0F;
        int i4 = this.A08;
        float f = this.A01;
        int i5 = this.A0B;
        float f2 = this.A02;
        byte[] bArr = this.A0a;
        int i6 = this.A0E;
        ColorInfo colorInfo = this.A0J;
        int i7 = this.A05;
        int i8 = this.A0C;
        int i9 = this.A0A;
        int i10 = this.A06;
        int i11 = this.A07;
        int i12 = this.A0D;
        String str5 = this.A0R;
        int i13 = this.A03;
        long j = this.A0G;
        List list = this.A0T;
        ColorInfo colorInfo2 = colorInfo;
        int i14 = i7;
        int i15 = i8;
        int i16 = i9;
        int i17 = i10;
        int i18 = i11;
        int i19 = i12;
        return new Format(str, str2, str3, str4, i, i2, i3, i4, f, i5, f2, bArr, i6, colorInfo2, i14, i15, i16, i17, i18, i19, str5, i13, j, list, drmInitData, this.A0I, this.A0P, this.A0X, this.A0Y, this.A0V, this.A0U, this.A0Z, this.A0N, this.A0O, this.A0M, this.A0W);
    }

    public final Format A09(Metadata metadata) {
        String str = this.A0Q;
        String str2 = this.A0L;
        String str3 = this.A0S;
        String str4 = this.A0K;
        int i = this.A04;
        int i2 = this.A09;
        int i3 = this.A0F;
        int i4 = this.A08;
        float f = this.A01;
        int i5 = this.A0B;
        float f2 = this.A02;
        byte[] bArr = this.A0a;
        int i6 = this.A0E;
        ColorInfo colorInfo = this.A0J;
        int i7 = this.A05;
        int i8 = this.A0C;
        int i9 = this.A0A;
        int i10 = this.A06;
        int i11 = this.A07;
        int i12 = this.A0D;
        String str5 = this.A0R;
        int i13 = this.A03;
        long j = this.A0G;
        List list = this.A0T;
        DrmInitData drmInitData = this.A0H;
        ColorInfo colorInfo2 = colorInfo;
        int i14 = i7;
        int i15 = i8;
        int i16 = i9;
        int i17 = i10;
        int i18 = i11;
        int i19 = i12;
        return new Format(str, str2, str3, str4, i, i2, i3, i4, f, i5, f2, bArr, i6, colorInfo2, i14, i15, i16, i17, i18, i19, str5, i13, j, list, drmInitData, metadata, this.A0P, this.A0X, this.A0Y, this.A0V, this.A0U, this.A0Z, this.A0N, this.A0O, this.A0M, this.A0W);
    }

    public final boolean A0A(Format format) {
        if (this.A0T.size() == format.A0T.size()) {
            int i = 0;
            while (i < this.A0T.size()) {
                if (Arrays.equals((byte[]) this.A0T.get(i), (byte[]) format.A0T.get(i))) {
                    i++;
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        if (this.A00 == 0) {
            String str = this.A0Q;
            int i = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i2 = (527 + hashCode) * 31;
            String str2 = this.A0L;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i3 = (i2 + hashCode2) * 31;
            String str3 = this.A0S;
            if (str3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str3.hashCode();
            }
            int i4 = (i3 + hashCode3) * 31;
            String str4 = this.A0K;
            if (str4 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = str4.hashCode();
            }
            int i5 = (((((((((((i4 + hashCode4) * 31) + this.A04) * 31) + this.A0F) * 31) + this.A08) * 31) + this.A05) * 31) + this.A0C) * 31;
            String str5 = this.A0R;
            if (str5 == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = str5.hashCode();
            }
            int i6 = (((i5 + hashCode5) * 31) + this.A03) * 31;
            DrmInitData drmInitData = this.A0H;
            if (drmInitData == null) {
                hashCode6 = 0;
            } else {
                hashCode6 = drmInitData.hashCode();
            }
            int i7 = (i6 + hashCode6) * 31;
            Metadata metadata = this.A0I;
            if (metadata != null) {
                i = metadata.hashCode();
            }
            this.A00 = i7 + i;
        }
        return this.A00;
    }

    public final String toString() {
        return "Format(" + this.A0Q + ", " + this.A0L + ", " + this.A0S + ", " + this.A0K + ", " + this.A04 + ", " + this.A0R + ", [" + this.A0F + ", " + this.A08 + ", " + this.A01 + "]" + ", [" + this.A05 + ", " + this.A0C + "])";
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (!(this instanceof VideoPlayerStreamFormat)) {
            parcel.writeString(this.A0Q);
            parcel.writeString(this.A0L);
            parcel.writeString(this.A0S);
            parcel.writeString(this.A0K);
            parcel.writeInt(this.A04);
            parcel.writeInt(this.A09);
            parcel.writeInt(this.A0F);
            parcel.writeInt(this.A08);
            parcel.writeFloat(this.A01);
            parcel.writeInt(this.A0B);
            parcel.writeFloat(this.A02);
            int i2 = 0;
            if (this.A0a != null) {
                i2 = 1;
            }
            parcel.writeInt(i2);
            byte[] bArr = this.A0a;
            if (bArr != null) {
                parcel.writeByteArray(bArr);
            }
            parcel.writeInt(this.A0E);
            parcel.writeParcelable(this.A0J, i);
            parcel.writeInt(this.A05);
            parcel.writeInt(this.A0C);
            parcel.writeInt(this.A0A);
            parcel.writeInt(this.A06);
            parcel.writeInt(this.A07);
            parcel.writeInt(this.A0D);
            parcel.writeString(this.A0R);
            parcel.writeInt(this.A03);
            parcel.writeLong(this.A0G);
            int size = this.A0T.size();
            parcel.writeInt(size);
            for (int i3 = 0; i3 < size; i3++) {
                parcel.writeByteArray((byte[]) this.A0T.get(i3));
            }
            parcel.writeParcelable(this.A0H, 0);
            parcel.writeParcelable(this.A0I, 0);
            parcel.writeString(this.A0P);
            parcel.writeInt(this.A0X ? 1 : 0);
            parcel.writeInt(this.A0Y ? 1 : 0);
            parcel.writeInt(this.A0V ? 1 : 0);
            parcel.writeInt(this.A0U ? 1 : 0);
            parcel.writeString(this.A0N);
            parcel.writeString(this.A0O);
            parcel.writeString(this.A0M);
            parcel.writeInt(this.A0W ? 1 : 0);
            return;
        }
        VideoPlayerStreamFormat videoPlayerStreamFormat = (VideoPlayerStreamFormat) this;
        parcel.writeString(videoPlayerStreamFormat.A0Q);
        parcel.writeString(videoPlayerStreamFormat.A0L);
        parcel.writeInt(videoPlayerStreamFormat.A0F);
        parcel.writeInt(videoPlayerStreamFormat.A08);
        parcel.writeFloat(videoPlayerStreamFormat.A01);
        parcel.writeInt(videoPlayerStreamFormat.A05);
        parcel.writeInt(videoPlayerStreamFormat.A0C);
        parcel.writeInt(videoPlayerStreamFormat.A04);
        parcel.writeString(videoPlayerStreamFormat.A0R);
        parcel.writeString(videoPlayerStreamFormat.A0K);
        parcel.writeString(videoPlayerStreamFormat.A0P);
        parcel.writeInt(videoPlayerStreamFormat.A0Z ? 1 : 0);
        parcel.writeString(videoPlayerStreamFormat.A0N);
        parcel.writeString(videoPlayerStreamFormat.A0O);
        parcel.writeString(videoPlayerStreamFormat.A0M);
    }

    public Format(Parcel parcel) {
        byte[] bArr;
        this.A0Q = parcel.readString();
        this.A0L = parcel.readString();
        this.A0S = parcel.readString();
        this.A0K = parcel.readString();
        this.A04 = parcel.readInt();
        this.A09 = parcel.readInt();
        this.A0F = parcel.readInt();
        this.A08 = parcel.readInt();
        this.A01 = parcel.readFloat();
        this.A0B = parcel.readInt();
        this.A02 = parcel.readFloat();
        if (C25948Bd0.A0C(parcel)) {
            bArr = parcel.createByteArray();
        } else {
            bArr = null;
        }
        this.A0a = bArr;
        this.A0E = parcel.readInt();
        this.A0J = (ColorInfo) parcel.readParcelable(ColorInfo.class.getClassLoader());
        this.A05 = parcel.readInt();
        this.A0C = parcel.readInt();
        this.A0A = parcel.readInt();
        this.A06 = parcel.readInt();
        this.A07 = parcel.readInt();
        this.A0D = parcel.readInt();
        this.A0R = parcel.readString();
        this.A03 = parcel.readInt();
        this.A0G = parcel.readLong();
        int readInt = parcel.readInt();
        this.A0T = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            this.A0T.add(parcel.createByteArray());
        }
        this.A0H = (DrmInitData) parcel.readParcelable(DrmInitData.class.getClassLoader());
        this.A0I = (Metadata) parcel.readParcelable(Metadata.class.getClassLoader());
        this.A0P = parcel.readString();
        this.A0X = C25948Bd0.A0C(parcel);
        this.A0Y = C25948Bd0.A0C(parcel);
        this.A0V = C25948Bd0.A0C(parcel);
        this.A0U = C25948Bd0.A0C(parcel);
        this.A0Z = C25948Bd0.A0C(parcel);
        this.A0N = parcel.readString();
        this.A0O = parcel.readString();
        this.A0M = parcel.readString();
        this.A0W = C25948Bd0.A0C(parcel);
    }

    public Format(String str, String str2, String str3, String str4, int i, int i2, int i3, int i4, float f, int i5, float f2, byte[] bArr, int i6, ColorInfo colorInfo, int i7, int i8, int i9, int i10, int i11, int i12, String str5, int i13, long j, List list, DrmInitData drmInitData, Metadata metadata, String str6, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str7, String str8, String str9, boolean z6) {
        int i14 = i5;
        float f3 = f2;
        int i15 = i10;
        List list2 = list;
        this.A0Q = str;
        this.A0L = str2;
        this.A0S = str3;
        this.A0K = str4;
        this.A04 = i;
        this.A09 = i2;
        this.A0F = i3;
        this.A08 = i4;
        this.A01 = f;
        int i16 = 0;
        this.A0B = i14 == -1 ? 0 : i14;
        this.A02 = f2 == -1.0f ? 1.0f : f3;
        this.A0a = bArr;
        this.A0E = i6;
        this.A0J = colorInfo;
        this.A05 = i7;
        this.A0C = i8;
        this.A0A = i9;
        this.A06 = i15 == -1 ? 0 : i15;
        int i17 = i11;
        this.A07 = i17 != -1 ? i17 : i16;
        this.A0D = i12;
        this.A0R = str5;
        this.A03 = i13;
        this.A0G = j;
        this.A0T = list == null ? Collections.emptyList() : list2;
        this.A0H = drmInitData;
        this.A0I = metadata;
        this.A0P = str6;
        this.A0X = z;
        this.A0Y = z2;
        this.A0V = z3;
        this.A0U = z4;
        this.A0Z = z5;
        this.A0N = str7;
        this.A0O = str8;
        this.A0M = str9;
        this.A0W = z6;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public Format(String str, String str2, String str3, String str4, int i, int i2, int i3, int i4, int i5, float f, byte[] bArr, int i6, ColorInfo colorInfo, int i7, int i8, int i9, int i10, String str5, int i11, long j, List list, DrmInitData drmInitData) {
        this(r1, r2, r3, r4, r5, r6, r7, r8, -1.0f, r10, r11, r12, r13, r14, r15, i8, i9, -1, -1, i10, str5, i11, j, list, drmInitData, (Metadata) null, (String) null, false, false, false, false, false, (String) null, (String) null, (String) null, false);
        int i12 = i7;
        ColorInfo colorInfo2 = colorInfo;
        int i13 = i6;
        byte[] bArr2 = bArr;
        String str6 = str;
        String str7 = str2;
        String str8 = str3;
        int i14 = i2;
        int i15 = i;
        String str9 = str4;
        int i16 = i3;
        int i17 = i4;
        int i18 = i5;
        float f2 = f;
    }
}
