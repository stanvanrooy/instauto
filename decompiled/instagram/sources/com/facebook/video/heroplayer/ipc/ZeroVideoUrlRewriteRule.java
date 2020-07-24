package com.facebook.video.heroplayer.ipc;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import java.util.regex.Pattern;

public class ZeroVideoUrlRewriteRule implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(101);
    public final String A00;
    public final String A01;
    public final Pattern A02 = Pattern.compile(this.A00);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof ZeroVideoUrlRewriteRule)) {
            ZeroVideoUrlRewriteRule zeroVideoUrlRewriteRule = (ZeroVideoUrlRewriteRule) obj;
            return this.A00.equals(zeroVideoUrlRewriteRule.A00) && this.A01.equals(zeroVideoUrlRewriteRule.A01);
        }
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + this.A01.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    public ZeroVideoUrlRewriteRule(Parcel parcel) {
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
    }
}
