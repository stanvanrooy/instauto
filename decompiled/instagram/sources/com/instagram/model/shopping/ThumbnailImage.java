package com.instagram.model.shopping;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.instagram.common.typedurl.ImageUrl;
import java.util.Arrays;
import p000X.AnonymousClass17M;

public class ThumbnailImage implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(381);
    public ImageUrl A00;

    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00});
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return AnonymousClass17M.A00(this.A00, ((ThumbnailImage) obj).A00);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
    }

    public ThumbnailImage() {
    }

    public ThumbnailImage(Parcel parcel) {
        this.A00 = (ImageUrl) parcel.readParcelable(ImageUrl.class.getClassLoader());
    }
}
