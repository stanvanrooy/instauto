package com.facebook.exoplayer.ipc;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import java.util.List;

public class ZeroVideoRewriteConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(68);
    public float A00;
    public int A01;
    public List A02;
    public boolean A03;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof ZeroVideoRewriteConfig)) {
            ZeroVideoRewriteConfig zeroVideoRewriteConfig = (ZeroVideoRewriteConfig) obj;
            if (this.A03 == zeroVideoRewriteConfig.A03 && this.A02.size() == zeroVideoRewriteConfig.A02.size()) {
                int i = 0;
                while (true) {
                    if (i < this.A02.size()) {
                        if (!((ZeroVideoUrlRewriteRule) this.A02.get(i)).equals(zeroVideoRewriteConfig.A02.get(i))) {
                            break;
                        }
                        i++;
                    } else {
                        return this.A01 == zeroVideoRewriteConfig.A01 && ((double) Math.abs(this.A00 - zeroVideoRewriteConfig.A00)) <= 0.001d;
                    }
                }
            }
        }
    }

    public final int hashCode() {
        return (int) (((float) ((((((this.A03 ? 1 : 0) * true) + this.A02.hashCode()) * 31) + this.A01) * 31)) + this.A00);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeTypedList(this.A02);
        parcel.writeInt(this.A01);
        parcel.writeFloat(this.A00);
    }

    public ZeroVideoRewriteConfig(Parcel parcel) {
        this.A03 = parcel.readInt() != 1 ? false : true;
        this.A02 = parcel.createTypedArrayList(ZeroVideoUrlRewriteRule.CREATOR);
        this.A01 = parcel.readInt();
        this.A00 = parcel.readFloat();
    }
}
