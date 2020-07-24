package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Map;
import p000X.C228479tj;

public final class zal extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(182);
    public final String A00;
    public final ArrayList A01;
    public final int A02;

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C228479tj.A00(parcel);
        C228479tj.A04(parcel, 1, this.A02);
        C228479tj.A0A(parcel, 2, this.A00, false);
        C228479tj.A0C(parcel, 3, this.A01, false);
        C228479tj.A02(parcel, A002);
    }

    public zal(int i, String str, ArrayList arrayList) {
        this.A02 = i;
        this.A00 = str;
        this.A01 = arrayList;
    }

    public zal(String str, Map map) {
        ArrayList arrayList;
        this.A02 = 1;
        this.A00 = str;
        if (map == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (String str2 : map.keySet()) {
                arrayList.add(new zam(str2, (FastJsonResponse$Field) map.get(str2)));
            }
        }
        this.A01 = arrayList;
    }
}
