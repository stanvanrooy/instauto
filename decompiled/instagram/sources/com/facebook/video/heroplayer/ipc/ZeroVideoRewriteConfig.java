package com.facebook.video.heroplayer.ipc;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import java.util.List;

public class ZeroVideoRewriteConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(100);
    public String A00;
    public List A01;
    public boolean A02;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj != null && (obj instanceof ZeroVideoRewriteConfig)) {
            ZeroVideoRewriteConfig zeroVideoRewriteConfig = (ZeroVideoRewriteConfig) obj;
            if (this.A02 == zeroVideoRewriteConfig.A02 && this.A01.size() == zeroVideoRewriteConfig.A01.size() && (((str = this.A00) == null || str.equals(zeroVideoRewriteConfig.A00)) && str == zeroVideoRewriteConfig.A00)) {
                int i = 0;
                while (i < this.A01.size()) {
                    if (((ZeroVideoUrlRewriteRule) this.A01.get(i)).equals(zeroVideoRewriteConfig.A01.get(i))) {
                        i++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((this.A02 ? 1 : 0) * true) + this.A01.hashCode()) * 31;
        String str = this.A00;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeTypedList(this.A01);
        parcel.writeString(this.A00);
    }

    public ZeroVideoRewriteConfig(Parcel parcel) {
        this.A02 = parcel.readInt() != 1 ? false : true;
        this.A01 = parcel.createTypedArrayList(ZeroVideoUrlRewriteRule.CREATOR);
        this.A00 = parcel.readString();
    }
}
