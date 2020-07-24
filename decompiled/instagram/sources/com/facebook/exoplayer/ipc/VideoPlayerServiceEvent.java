package com.facebook.exoplayer.ipc;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import p000X.C229139wq;

public class VideoPlayerServiceEvent implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(64);

    public int describeContents() {
        C229139wq r0;
        if (this instanceof VpsVideoCacheDatabaseFullEvent) {
            r0 = C229139wq.DATABASE_FULL;
        } else if (this instanceof VpsPrefetchStartEvent) {
            r0 = C229139wq.PREFETCH_START;
        } else if (this instanceof VpsPrefetchCacheEvictEvent) {
            r0 = C229139wq.PREFETCH_CACHE_EVICT;
        } else if (this instanceof VpsManifestParseErrorEvent) {
            r0 = C229139wq.MANIFEST_PARSE_ERROR;
        } else if (!(this instanceof VpsCacheErrorEvent)) {
            throw new AbstractMethodError("describeContents");
        } else {
            r0 = C229139wq.CACHE_ERROR;
        }
        return r0.A00;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(describeContents());
    }
}
