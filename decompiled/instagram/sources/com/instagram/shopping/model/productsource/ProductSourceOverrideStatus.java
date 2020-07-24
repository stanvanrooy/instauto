package com.instagram.shopping.model.productsource;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.C0003R;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.instagram.model.shopping.ProductSource;
import p000X.AnonymousClass2OA;

public enum ProductSourceOverrideStatus implements Parcelable {
    A05(-1, -1),
    BUSINESS_PARTNER(C0003R.string.brand_change_with_business_partner_dialog_title, C0003R.string.brand_change_with_business_partner_dialog_message),
    ALREADY_TAGGED(C0003R.string.brand_change_disabled_dialog_title, C0003R.string.brand_change_disabled_dialog_message);
    
    public static final Parcelable.Creator CREATOR = null;
    public final int A00;
    public final int A01;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        CREATOR = new PCreatorEBaseShape1S0000000_I1(470);
    }

    public final void A00(Context context, ProductSource productSource) {
        String str;
        String str2 = "";
        if (!(productSource == null || ((str = productSource.A03) == null && (str = productSource.A04) == null && (str = productSource.A01) == null))) {
            str2 = str;
        }
        AnonymousClass2OA r5 = new AnonymousClass2OA(context);
        r5.A03 = context.getResources().getString(this.A01, new Object[]{str2});
        r5.A0M(context.getResources().getString(this.A00, new Object[]{str2}));
        r5.A0A(C0003R.string.f118ok, (DialogInterface.OnClickListener) null);
        r5.A0U(true);
        r5.A03().show();
    }

    /* access modifiers changed from: public */
    ProductSourceOverrideStatus(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(ordinal());
    }
}
