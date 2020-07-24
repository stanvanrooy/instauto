package com.instagram.model.videocall;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.videocall.VideoCallSource;

public class VideoCallThreadSurfaceKey implements VideoCallSource.SurfaceKey, Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(429);
    public final DirectThreadKey A00;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            VideoCallThreadSurfaceKey videoCallThreadSurfaceKey = (VideoCallThreadSurfaceKey) obj;
            if (this.A00 == null) {
                return videoCallThreadSurfaceKey.A00 == null;
            }
            if (videoCallThreadSurfaceKey.A00 != null) {
                return getId().equals(videoCallThreadSurfaceKey.getId());
            }
        }
        return false;
    }

    public static VideoCallThreadSurfaceKey A00(String str) {
        return new VideoCallThreadSurfaceKey(new DirectThreadKey(str));
    }

    public final String getId() {
        return this.A00.A00;
    }

    public final int hashCode() {
        if (this.A00 != null) {
            return getId().hashCode();
        }
        return 0;
    }

    public final String toString() {
        if (("VideoCallThreadSurfaceKey{mId='" + this.A00) == null) {
            return "null";
        }
        return getId() + '\'' + '}';
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00;
    }

    public VideoCallThreadSurfaceKey(Parcel parcel) {
        this.A00 = (DirectThreadKey) parcel.readParcelable(DirectThreadKey.class.getClassLoader());
    }

    public VideoCallThreadSurfaceKey(DirectThreadKey directThreadKey) {
        this.A00 = directThreadKey;
    }
}
