package com.facebook.common.util;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import java.util.Arrays;
import p000X.AnonymousClass17M;
import p000X.C11590fD;
import p000X.C228109rj;

public class Either implements C11590fD, Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(57);
    public final Object A00;
    public final Object A01;
    public final boolean A02;

    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{get()});
    }

    public Either(Parcel parcel) {
        Class<C228109rj> cls = C228109rj.class;
        Object readValue = parcel.readValue(cls.getClassLoader());
        Object readValue2 = parcel.readValue(cls.getClassLoader());
        boolean z = parcel.readInt() != 1 ? false : true;
        this.A00 = readValue;
        this.A01 = readValue2;
        this.A02 = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Either)) {
            return false;
        }
        return AnonymousClass17M.A00(get(), ((Either) obj).get());
    }

    public final Object get() {
        if (this.A02) {
            return this.A00;
        }
        return this.A01;
    }

    public final String toString() {
        String str;
        if (this.A02) {
            str = "left";
        } else {
            str = "right";
        }
        return StringFormatUtil.formatStrLocaleSafe("Either.%s(%s)", str, String.valueOf(get()));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.A00);
        parcel.writeValue(this.A01);
        parcel.writeInt(this.A02 ? 1 : 0);
    }
}
