package com.instagram.pendingmedia.model;

import android.media.MediaMetadataRetriever;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape0S0000000_I0;
import java.io.File;
import java.util.List;
import p000X.AnonymousClass0P6;
import p000X.C46571zz;

public class ClipInfo implements Parcelable, C46571zz {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape0S0000000_I0(74);
    public double A00;
    public double A01;
    public float A02 = 1.0f;
    public float A03;
    public float A04 = 0.5f;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public long A0B = -1;
    public long A0C = -1;
    public Integer A0D = null;
    public String A0E;
    public String A0F;
    public List A0G;
    public boolean A0H;
    public boolean A0I = false;
    public boolean A0J;
    public transient String A0K;

    public final int describeContents() {
        return 0;
    }

    public final int A00() {
        long j = this.A0B;
        if (j > 0) {
            return (int) ((this.A0C * 8000) / j);
        }
        return -1;
    }

    public final String A01() {
        String str;
        if (this.A0K == null && (str = this.A0F) != null && new File(str).exists()) {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(this.A0F);
            this.A0K = mediaMetadataRetriever.extractMetadata(12);
        }
        String str2 = this.A0K;
        if (str2 == null) {
            return "unknown";
        }
        return str2;
    }

    public final void A02(int i, int i2) {
        this.A0A = i;
        this.A07 = i2;
        this.A03 = ((float) i) / ((float) i2);
    }

    public final void A03(int i, int i2) {
        int i3;
        Integer num = this.A0D;
        if (num != null) {
            i3 = num.intValue();
        } else {
            i3 = 0;
        }
        if (i3 == 1 || i3 == 3) {
            A02(i2, i);
        } else {
            A02(i, i2);
        }
    }

    public final int AKe() {
        return this.A06 - this.A08;
    }

    public ClipInfo setVideoFilePath(String str, long j) {
        this.A0F = str;
        this.A0C = j;
        return this;
    }

    public final String toString() {
        return "ClipInfo{mVideoFilePath='" + this.A0F + '\'' + ", mVideoFileSize=" + this.A0C + ", mCameraId=" + this.A05 + ", mPan=" + this.A04 + ", mRotation=" + this.A0D + ", mAspectPostCrop=" + this.A02 + ", mStartTime=" + this.A08 + ", mEndTime=" + this.A06 + ", mHasTrimEdits=" + this.A0I + ", mTrimScroll=" + this.A09 + ", mWidth=" + this.A0A + ", mHeight=" + this.A07 + ", mSoftware='" + this.A0E + '\'' + ", mCropRect=" + this.A0G + ", mHFlip=" + this.A0H + ", mExifLatitude=" + this.A00 + ", mExifLongitude=" + this.A01 + ", mIsBoomerang=" + this.A0J + ", mOriginalDurationMs=" + this.A0B + ", mMimeType='" + this.A0K + '\'' + ", mAspectRatio=" + this.A03 + '}';
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A0F);
        parcel.writeLong(this.A0C);
        parcel.writeInt(this.A05);
        parcel.writeFloat(this.A04);
        parcel.writeValue(this.A0D);
        parcel.writeFloat(this.A02);
        parcel.writeInt(this.A08);
        parcel.writeInt(this.A06);
        parcel.writeInt(this.A0I ? 1 : 0);
        parcel.writeInt(this.A09);
        parcel.writeInt(this.A0A);
        parcel.writeInt(this.A07);
        parcel.writeString(this.A0E);
        parcel.writeList(this.A0G);
        parcel.writeInt(this.A0H ? 1 : 0);
        parcel.writeDouble(this.A00);
        parcel.writeDouble(this.A01);
        parcel.writeInt(this.A0J ? 1 : 0);
        parcel.writeLong(this.A0B);
        parcel.writeString(this.A0K);
        parcel.writeFloat(this.A03);
    }

    public final void A04(String str) {
        long A022 = AnonymousClass0P6.A02(str);
        this.A0F = str;
        this.A0C = A022;
    }

    public ClipInfo() {
    }

    public ClipInfo(Parcel parcel) {
        this.A0F = parcel.readString();
        this.A0C = parcel.readLong();
        this.A05 = parcel.readInt();
        this.A04 = parcel.readFloat();
        Class<Integer> cls = Integer.class;
        this.A0D = (Integer) parcel.readValue(cls.getClassLoader());
        this.A02 = parcel.readFloat();
        this.A08 = parcel.readInt();
        this.A06 = parcel.readInt();
        boolean z = true;
        this.A0I = parcel.readInt() == 1;
        this.A09 = parcel.readInt();
        this.A0A = parcel.readInt();
        this.A07 = parcel.readInt();
        this.A0E = parcel.readString();
        this.A0G = parcel.readArrayList(cls.getClassLoader());
        this.A0H = parcel.readInt() == 1;
        this.A00 = parcel.readDouble();
        this.A01 = parcel.readDouble();
        this.A0J = parcel.readInt() != 1 ? false : z;
        this.A0B = parcel.readLong();
        this.A0K = parcel.readString();
        this.A03 = parcel.readFloat();
    }
}
