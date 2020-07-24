package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Locale;
import p000X.C228479tj;
import p000X.C228589vH;
import p000X.C228879w1;

public final class WebImage extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C228879w1();
    public final int A00;
    public final int A01;
    public final Uri A02;
    public final int A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof WebImage)) {
                WebImage webImage = (WebImage) obj;
                if (!(C228589vH.A00(this.A02, webImage.A02) && this.A00 == webImage.A00 && this.A01 == webImage.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A02, Integer.valueOf(this.A00), Integer.valueOf(this.A01)});
    }

    public final String toString() {
        return String.format(Locale.US, "Image %dx%d %s", new Object[]{Integer.valueOf(this.A00), Integer.valueOf(this.A01), this.A02.toString()});
    }

    public WebImage(int i, Uri uri, int i2, int i3) {
        this.A03 = i;
        this.A02 = uri;
        this.A00 = i2;
        this.A01 = i3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C228479tj.A00(parcel);
        C228479tj.A04(parcel, 1, this.A03);
        C228479tj.A09(parcel, 2, this.A02, i, false);
        C228479tj.A04(parcel, 3, this.A00);
        C228479tj.A04(parcel, 4, this.A01);
        C228479tj.A02(parcel, A002);
    }
}
