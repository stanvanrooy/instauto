package com.instagram.common.gallery;

import android.graphics.PointF;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.webkit.MimeTypeMap;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.redex.PCreatorEBaseShape0S0000000_I0;
import com.instagram.common.util.gradient.BackgroundGradientColors;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import p000X.C181807pW;
import p000X.C76823Xl;
import p000X.C84653m5;

public class Medium implements C84653m5, Parcelable {
    public static int A0Y = Integer.MIN_VALUE;
    public static final Pattern A0Z = Pattern.compile(".*(?i)screenshot.*");
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape0S0000000_I0(24);
    public double A00;
    public double A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public long A0A;
    public long A0B;
    public C181807pW A0C;
    public BackgroundGradientColors A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L;
    public String A0M;
    public String A0N;
    public String A0O;
    public String A0P;
    public String A0Q;
    public String A0R;
    public String A0S;
    public String A0T;
    public List A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;

    public final boolean Ae6() {
        return false;
    }

    public final int describeContents() {
        return 0;
    }

    public final float A02() {
        C181807pW r0 = this.A0C;
        if (r0 != null) {
            return r0.A00;
        }
        return BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
    }

    public final String A03() {
        String str;
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(this.A0P);
        if (fileExtensionFromUrl != null) {
            str = fileExtensionFromUrl.toLowerCase();
        } else {
            str = null;
        }
        return MimeTypeMap.getSingleton().getMimeTypeFromExtension(str);
    }

    public final List A04() {
        ArrayList arrayList = new ArrayList();
        List<FaceCenter> list = this.A0U;
        if (list == null) {
            list = Collections.emptyList();
        }
        for (FaceCenter faceCenter : list) {
            arrayList.add(new PointF(faceCenter.A01, faceCenter.A02));
        }
        return arrayList;
    }

    public final boolean A05() {
        if (this.A08 != 1) {
            return false;
        }
        return true;
    }

    public final boolean A06() {
        String str = this.A0H;
        if (str == null) {
            return false;
        }
        if (A0Z.matcher(str).matches() || "0".equals(this.A0H)) {
            return true;
        }
        return false;
    }

    public final String AOA() {
        return String.valueOf(this.A05);
    }

    public final boolean AiO() {
        if (this.A08 == 3) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        return this.A0P.equals(((Medium) obj).A0P);
    }

    public final int hashCode() {
        return this.A0P.hashCode();
    }

    public final boolean isValid() {
        String str;
        if (this.A0V || ((!A05() && !AiO()) || (str = this.A0P) == null || str.isEmpty())) {
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A05);
        parcel.writeInt(this.A08);
        parcel.writeString(this.A0P);
        parcel.writeInt(this.A02);
        parcel.writeString(this.A0H);
        parcel.writeInt(this.A03);
        parcel.writeString(this.A0N);
        parcel.writeString(this.A0T);
        parcel.writeInt(this.A0V ? 1 : 0);
        parcel.writeString(this.A0S);
        parcel.writeInt(this.A07);
        parcel.writeLong(this.A0B);
        parcel.writeLong(this.A0A);
        parcel.writeInt(this.A06);
        parcel.writeString(this.A0E);
        parcel.writeParcelable(this.A0D, i);
        parcel.writeString(this.A0G);
        parcel.writeInt(this.A0W ? 1 : 0);
        parcel.writeDouble(this.A00);
        parcel.writeDouble(this.A01);
        parcel.writeInt(this.A09);
        parcel.writeInt(this.A04);
        parcel.writeString(this.A0O);
        parcel.writeString(this.A0M);
        parcel.writeString(this.A0R);
        parcel.writeString(this.A0K);
        if (this.A0U == null) {
            this.A0U = new ArrayList();
        }
        parcel.writeParcelableArray((Parcelable[]) this.A0U.toArray(new FaceCenter[0]), i);
        parcel.writeString(this.A0Q);
        parcel.writeString(this.A0F);
    }

    public static Medium A00(File file, int i, int i2) {
        long currentTimeMillis = System.currentTimeMillis();
        return new Medium(0, i, file.getAbsolutePath(), 0, i2, currentTimeMillis / 1000, currentTimeMillis, Uri.fromFile(file));
    }

    public static Medium A01(boolean z, int i, int i2, String str) {
        long currentTimeMillis = System.currentTimeMillis();
        int i3 = A0Y;
        A0Y = i3 + 1;
        int i4 = 1;
        if (z) {
            i4 = 3;
        }
        Medium medium = new Medium(i3, i4, UUID.randomUUID().toString(), 0, 0, currentTimeMillis / 1000, currentTimeMillis, (Uri) null);
        medium.A09 = i;
        medium.A04 = i2;
        medium.A0Q = str;
        return medium;
    }

    public final String AMI() {
        return this.A0N;
    }

    public final int AUk() {
        return this.A07;
    }

    public final int getDuration() {
        return this.A03;
    }

    public Medium() {
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public Medium(int i, int i2, String str, int i3, int i4, long j, long j2, Uri uri) {
        this(r1, r2, r3, 0, (String) null, r6, i4, j, j2, false, uri);
        int i5 = i;
        String str2 = str;
        int i6 = i2;
        int i7 = i3;
    }

    public Medium(int i, int i2, String str, int i3, String str2, int i4, int i5, long j, long j2, boolean z, Uri uri) {
        String str3;
        this.A05 = i;
        this.A08 = i2;
        this.A0P = str;
        this.A02 = i3;
        this.A0H = str2;
        this.A07 = i4;
        this.A03 = i5;
        this.A0A = j;
        this.A0B = j2;
        this.A0X = z;
        if (uri != null) {
            str3 = uri.toString();
        } else {
            str3 = null;
        }
        this.A0T = str3;
        this.A0N = C76823Xl.A01(i5);
    }

    public Medium(Parcel parcel) {
        this.A05 = parcel.readInt();
        this.A08 = parcel.readInt();
        this.A0P = parcel.readString();
        this.A02 = parcel.readInt();
        this.A0H = parcel.readString();
        this.A03 = parcel.readInt();
        this.A0N = parcel.readString();
        this.A0T = parcel.readString();
        boolean z = false;
        this.A0V = parcel.readInt() == 1;
        this.A0S = parcel.readString();
        this.A07 = parcel.readInt();
        this.A0B = parcel.readLong();
        this.A0A = parcel.readLong();
        this.A06 = parcel.readInt();
        this.A0E = parcel.readString();
        this.A0D = (BackgroundGradientColors) parcel.readParcelable(BackgroundGradientColors.class.getClassLoader());
        this.A0G = parcel.readString();
        this.A0W = parcel.readInt() == 1 ? true : z;
        this.A00 = parcel.readDouble();
        this.A01 = parcel.readDouble();
        this.A09 = parcel.readInt();
        this.A04 = parcel.readInt();
        this.A0O = parcel.readString();
        this.A0M = parcel.readString();
        this.A0R = parcel.readString();
        this.A0K = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.A0U = arrayList;
        arrayList.addAll(parcel.createTypedArrayList(FaceCenter.CREATOR));
        this.A0Q = parcel.readString();
        this.A0F = parcel.readString();
    }
}
