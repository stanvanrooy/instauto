package com.instagram.model.videocall;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;

public class VideoCallInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(427);
    public final String A00;
    public final String A01;

    public final int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        if (r1.equals(r5.A01) == false) goto L_0x001e;
     */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            VideoCallInfo videoCallInfo = (VideoCallInfo) obj;
            String str = this.A01;
            if (str == null) {
                if (videoCallInfo.A01 != null) {
                    return false;
                }
            }
            String str2 = this.A00;
            String str3 = videoCallInfo.A00;
            if (str2 != null) {
                return str2.equals(str3);
            }
            return str3 == null;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        String str = this.A01;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        String str2 = this.A00;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 + i2;
    }

    public final String toString() {
        return "VideoCallInfo{videoCallId='" + this.A01 + '\'' + ", serverInfo='" + this.A00 + '\'' + '}';
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
    }

    public VideoCallInfo(Parcel parcel) {
        this.A01 = parcel.readString();
        this.A00 = parcel.readString();
    }

    public VideoCallInfo(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }
}
