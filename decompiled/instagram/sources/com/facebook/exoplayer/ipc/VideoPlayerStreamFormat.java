package com.facebook.exoplayer.ipc;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.video.ColorInfo;
import java.util.List;
import p000X.D6U;

public final class VideoPlayerStreamFormat extends Format implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(66);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return ((VideoPlayerStreamFormat) obj).A0Q.equals(this.A0Q);
    }

    public final int hashCode() {
        return this.A0Q.hashCode();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public VideoPlayerStreamFormat(Parcel parcel) {
        super(r2, r4, r4, r5, r6, -1, r8, r9, r10, -1, -1.0f, (byte[]) null, -1, (ColorInfo) null, r16, r17, -1, -1, -1, 0, r22, -1, Long.MAX_VALUE, (List) null, (DrmInitData) null, (Metadata) null, r29, false, false, false, false, r34, r35, r36, r37, r38);
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        float readFloat = parcel.readFloat();
        int readInt3 = parcel.readInt();
        int readInt4 = parcel.readInt();
        int readInt5 = parcel.readInt();
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        String readString5 = parcel.readString();
        boolean z = parcel.readInt() == 1;
        String readString6 = parcel.readString();
        String readString7 = parcel.readString();
        String readString8 = parcel.readString();
        boolean z2 = parcel.readInt() != 0;
        D6U.A01(readString);
    }
}
