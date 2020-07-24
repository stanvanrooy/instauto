package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p000X.C228479tj;

public final class zam extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(180);
    public final FastJsonResponse$Field A00;
    public final String A01;
    public final int A02;

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C228479tj.A00(parcel);
        C228479tj.A04(parcel, 1, this.A02);
        C228479tj.A0A(parcel, 2, this.A01, false);
        C228479tj.A09(parcel, 3, this.A00, i, false);
        C228479tj.A02(parcel, A002);
    }

    public zam(int i, String str, FastJsonResponse$Field fastJsonResponse$Field) {
        this.A02 = i;
        this.A01 = str;
        this.A00 = fastJsonResponse$Field;
    }

    public zam(String str, FastJsonResponse$Field fastJsonResponse$Field) {
        this.A02 = 1;
        this.A01 = str;
        this.A00 = fastJsonResponse$Field;
    }
}
