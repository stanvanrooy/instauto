package com.facebook.videolite.transcoder.base;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import java.util.Arrays;
import p000X.AnonymousClass000;

public class SphericalMetadata implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(102);
    public final String A00;
    public final String A01;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this != obj) {
            if (obj instanceof SphericalMetadata) {
                SphericalMetadata sphericalMetadata = (SphericalMetadata) obj;
                String str = this.A00;
                String str2 = sphericalMetadata.A00;
                if (str == str2 || (str != null && str.equals(str2))) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    String str3 = this.A01;
                    String str4 = sphericalMetadata.A01;
                    if (str3 == str4 || (str3 != null && str3.equals(str4))) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, this.A01});
    }

    public final String toString() {
        return AnonymousClass000.A0P("SphericalMetadata{projectionType=", this.A00, ", ", "stereoMode=", this.A01, "}");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    public SphericalMetadata(Parcel parcel) {
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
    }
}
