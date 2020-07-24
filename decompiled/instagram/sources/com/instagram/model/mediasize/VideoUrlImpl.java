package com.instagram.model.mediasize;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape0S0000000_I0;

public class VideoUrlImpl implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape0S0000000_I0(60);
    public int A00;
    public int A01;
    public int A02;
    public Integer A03;
    public String A04;
    public String A05;

    public final int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0038, code lost:
        if (r1.equals(r5.A04) == false) goto L_0x003a;
     */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            VideoUrlImpl videoUrlImpl = (VideoUrlImpl) obj;
            if (this.A02 == videoUrlImpl.A02 && this.A00 == videoUrlImpl.A00 && this.A01 == videoUrlImpl.A01 && this.A05.equals(videoUrlImpl.A05)) {
                String str = this.A04;
                if (str == null) {
                    if (videoUrlImpl.A04 != null) {
                        return false;
                    }
                }
                Integer num = this.A03;
                Integer num2 = videoUrlImpl.A03;
                if (num != null) {
                    return num.equals(num2);
                }
                return num2 == null;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.A05.hashCode() * 31;
        String str = this.A04;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = (((((((hashCode + i) * 31) + this.A02) * 31) + this.A00) * 31) + this.A01) * 31;
        Integer num = this.A03;
        if (num != null) {
            i2 = num.hashCode();
        }
        return i3 + i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A05);
        parcel.writeString(this.A04);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeValue(this.A03);
    }

    public VideoUrlImpl() {
    }

    public VideoUrlImpl(Parcel parcel) {
        this.A05 = parcel.readString();
        this.A04 = parcel.readString();
        this.A02 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A03 = (Integer) parcel.readValue(Integer.class.getClassLoader());
    }

    public VideoUrlImpl(String str) {
        if (str != null) {
            this.A05 = str;
            return;
        }
        throw new RuntimeException("trying to created a VideoUrl object with null url");
    }
}
