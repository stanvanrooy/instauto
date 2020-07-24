package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import p000X.B5B;
import p000X.C228479tj;
import p000X.C228489tz;
import p000X.C228589vH;

public class PlaceReport extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(205);
    public final String A00;
    public final String A01;
    public final int A02;
    public final String A03;

    public PlaceReport(int i, String str, String str2, String str3) {
        this.A02 = i;
        this.A01 = str;
        this.A00 = str2;
        this.A03 = str3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof PlaceReport) {
            PlaceReport placeReport = (PlaceReport) obj;
            return C228589vH.A00(this.A01, placeReport.A01) && C228589vH.A00(this.A00, placeReport.A00) && C228589vH.A00(this.A03, placeReport.A03);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, this.A00, this.A03});
    }

    public final String toString() {
        C228489tz r2 = new C228489tz(this);
        r2.A00("placeId", this.A01);
        r2.A00(B5B.INTENT_PARAM_TAG, this.A00);
        String str = this.A03;
        if (!"unknown".equals(str)) {
            r2.A00("source", str);
        }
        return r2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C228479tj.A00(parcel);
        C228479tj.A04(parcel, 1, this.A02);
        C228479tj.A0A(parcel, 2, this.A01, false);
        C228479tj.A0A(parcel, 3, this.A00, false);
        C228479tj.A0A(parcel, 4, this.A03, false);
        C228479tj.A02(parcel, A002);
    }
}
