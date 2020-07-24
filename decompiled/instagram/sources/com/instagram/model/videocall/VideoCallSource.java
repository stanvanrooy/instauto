package com.instagram.model.videocall;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import java.util.Locale;
import java.util.Objects;
import p000X.C103484dZ;
import p000X.C16600or;

public class VideoCallSource implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(428);
    public final C16600or A00;
    public final C103484dZ A01;
    public final SurfaceKey A02;

    public interface SurfaceKey extends Parcelable {
        String getId();

        Object getKey();
    }

    public final int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        if (r1.equals(r5.A00) == false) goto L_0x001e;
     */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            VideoCallSource videoCallSource = (VideoCallSource) obj;
            C16600or r1 = this.A00;
            if (r1 == null) {
                if (videoCallSource.A00 != null) {
                    return false;
                }
            }
            C103484dZ r12 = this.A01;
            if (r12 != null) {
                if (!r12.equals(videoCallSource.A01)) {
                    return false;
                }
            } else if (videoCallSource.A01 != null) {
                return false;
            }
            SurfaceKey surfaceKey = this.A02;
            SurfaceKey surfaceKey2 = videoCallSource.A02;
            if (surfaceKey != null) {
                return surfaceKey.equals(surfaceKey2);
            }
            return surfaceKey2 == null;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.A00, this.A01, this.A02});
    }

    public final String toString() {
        return "VideoCallSource{mSource=" + this.A00 + ", mSurface=" + this.A01 + ", mSurfaceKey='" + this.A02 + '\'' + '}';
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00.A00);
        parcel.writeString(this.A01.A00);
        parcel.writeParcelable(this.A02, i);
    }

    public VideoCallSource(C16600or r1, C103484dZ r2, SurfaceKey surfaceKey) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = surfaceKey;
    }

    public VideoCallSource(Parcel parcel) {
        String readString = parcel.readString();
        for (C16600or r1 : C16600or.values()) {
            if (r1.A00.equals(readString)) {
                this.A00 = r1;
                this.A01 = C103484dZ.A00(parcel.readString());
                this.A02 = (SurfaceKey) parcel.readParcelable(SurfaceKey.class.getClassLoader());
                return;
            }
        }
        throw new RuntimeException(String.format(Locale.US, "Source %s not found", new Object[]{readString}));
    }
}
