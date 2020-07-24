package com.instagram.model.mediasize;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.C0003R;
import com.facebook.redex.PCreatorEBaseShape0S0000000_I0;
import com.instagram.common.typedurl.ImageUrl;
import java.util.ArrayList;
import java.util.List;
import p000X.Constants;
import p000X.StoredPreferences;
import p000X.AnonymousClass18D;
import p000X.AnonymousClass1Xh;
import p000X.C06220Of;
import p000X.C37261jN;

public class ImageInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape0S0000000_I0(59);
    public AnonymousClass1Xh A00;
    public List A01;

    public final int describeContents() {
        return 0;
    }

    public final float A00() {
        int height;
        ExtendedImageUrl extendedImageUrl = (ExtendedImageUrl) this.A01.get(0);
        if (extendedImageUrl == null || (height = extendedImageUrl.getHeight()) == 0) {
            return 1.0f;
        }
        return ((float) extendedImageUrl.getWidth()) / ((float) height);
    }

    public final ImageUrl A01() {
        return A02(Constants.ONE);
    }

    public final ImageUrl A02(Integer num) {
        Context context = StoredPreferences.A00;
        return C37261jN.A01(this.A01, Math.min((C06220Of.A09(context) - (context.getResources().getDimensionPixelSize(C0003R.dimen.photo_grid_spacing) << 1)) / 3, 240), num);
    }

    public final ExtendedImageUrl A03(Context context) {
        return A04(context, Constants.ZERO);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.A01.equals(((ImageInfo) obj).A01);
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.A01);
    }

    public final ExtendedImageUrl A04(Context context, Integer num) {
        ExtendedImageUrl A012 = C37261jN.A01(this.A01, Math.min(C06220Of.A09(context), 1080), num);
        if (A012.AZc().contains("ig_cache_key=")) {
            String A02 = AnonymousClass18D.A02(A012.AZc(), "full_size_");
            if (A02 != null) {
                A012.A03 = A02;
            } else {
                throw new RuntimeException("trying to set a null url in ExtendedImageUrl");
            }
        }
        return A012;
    }

    public ImageInfo() {
    }

    public ImageInfo(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        this.A01 = arrayList;
        parcel.readTypedList(arrayList, ExtendedImageUrl.CREATOR);
    }
}
