package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p000X.AnonymousClass0a2;
import p000X.C228479tj;

public final class zak extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(181);
    public final String A00;
    public final HashMap A01;
    public final int A02;

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (String str : this.A01.keySet()) {
            sb.append(str);
            sb.append(":\n");
            Map map = (Map) this.A01.get(str);
            for (String str2 : map.keySet()) {
                sb.append("  ");
                sb.append(str2);
                sb.append(": ");
                sb.append(map.get(str2));
            }
        }
        return sb.toString();
    }

    public zak(int i, ArrayList arrayList, String str) {
        this.A02 = i;
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            zal zal = (zal) arrayList.get(i2);
            String str2 = zal.A00;
            HashMap hashMap2 = new HashMap();
            int size2 = zal.A01.size();
            for (int i3 = 0; i3 < size2; i3++) {
                zam zam = (zam) zal.A01.get(i3);
                hashMap2.put(zam.A01, zam.A00);
            }
            hashMap.put(str2, hashMap2);
        }
        this.A01 = hashMap;
        AnonymousClass0a2.A02(str);
        this.A00 = str;
        for (String str3 : hashMap.keySet()) {
            Map map = (Map) this.A01.get(str3);
            for (String str4 : map.keySet()) {
                ((FastJsonResponse$Field) map.get(str4)).A01 = this;
            }
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C228479tj.A00(parcel);
        C228479tj.A04(parcel, 1, this.A02);
        ArrayList arrayList = new ArrayList();
        for (String str : this.A01.keySet()) {
            arrayList.add(new zal(str, (Map) this.A01.get(str)));
        }
        C228479tj.A0C(parcel, 2, arrayList, false);
        C228479tj.A0A(parcel, 3, this.A00, false);
        C228479tj.A02(parcel, A002);
    }
}
