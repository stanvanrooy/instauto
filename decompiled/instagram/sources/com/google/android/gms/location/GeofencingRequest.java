package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import p000X.C228479tj;

public class GeofencingRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(219);
    public final int A00;
    public final String A01;
    public final List A02;

    public GeofencingRequest(List list, int i, String str) {
        this.A02 = list;
        this.A00 = i;
        this.A01 = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GeofencingRequest[");
        sb.append("geofences=");
        sb.append(this.A02);
        int i = this.A00;
        StringBuilder sb2 = new StringBuilder(30);
        sb2.append(", initialTrigger=");
        sb2.append(i);
        sb2.append(", ");
        sb.append(sb2.toString());
        String valueOf = String.valueOf(this.A01);
        sb.append(valueOf.length() != 0 ? "tag=".concat(valueOf) : new String("tag="));
        sb.append("]");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C228479tj.A00(parcel);
        C228479tj.A0C(parcel, 1, this.A02, false);
        C228479tj.A04(parcel, 2, this.A00);
        C228479tj.A0A(parcel, 3, this.A01, false);
        C228479tj.A02(parcel, A002);
    }
}
