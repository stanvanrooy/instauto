package com.facebook.exoplayer.ipc;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import java.util.HashMap;
import java.util.Map;

public final class ExoServiceVideoCacheAnalytics implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(61);
    public int A00;
    public Map[] A01;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        if (this.A01 != null) {
            for (int i2 = 0; i2 < this.A00; i2++) {
                Map map = this.A01[i2];
                if (map != null) {
                    parcel.writeInt(map.size());
                    for (String str : map.keySet()) {
                        parcel.writeString(str);
                        parcel.writeString((String) map.get(str));
                    }
                } else {
                    parcel.writeInt(0);
                }
            }
        }
    }

    public ExoServiceVideoCacheAnalytics() {
    }

    public ExoServiceVideoCacheAnalytics(Parcel parcel) {
        int readInt = parcel.readInt();
        this.A00 = readInt;
        this.A01 = new HashMap[readInt];
        for (int i = 0; i < this.A00; i++) {
            int readInt2 = parcel.readInt();
            HashMap hashMap = new HashMap(readInt2);
            for (int i2 = 0; i2 < readInt2; i2++) {
                hashMap.put(parcel.readString(), parcel.readString());
            }
            this.A01[i] = hashMap;
        }
    }
}
