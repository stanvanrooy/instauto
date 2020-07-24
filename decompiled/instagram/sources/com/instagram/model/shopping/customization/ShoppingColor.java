package com.instagram.model.shopping.customization;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import p000X.C13150hy;
import p000X.C17440qF;

public final class ShoppingColor implements Parcelable {
    public static final PCreatorEBaseShape1S0000000_I1 CREATOR = new PCreatorEBaseShape1S0000000_I1(383);
    public String A00;
    public String A01;

    public final int describeContents() {
        return 0;
    }

    public final String A00(Context context) {
        String str;
        String str2;
        C13150hy.A02(context, "context");
        if (C17440qF.A00(context)) {
            str = this.A00;
            if (str == null) {
                str2 = "darkColor";
            }
            return str;
        }
        str = this.A01;
        if (str == null) {
            str2 = "lightColor";
        }
        return str;
        C13150hy.A03(str2);
        return str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C13150hy.A02(parcel, "parcel");
        String str = this.A01;
        if (str == null) {
            C13150hy.A03("lightColor");
        }
        parcel.writeString(str);
        String str2 = this.A00;
        if (str2 == null) {
            C13150hy.A03("darkColor");
        }
        parcel.writeString(str2);
    }
}
