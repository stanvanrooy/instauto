package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.internal.auth.zzaz;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import p000X.C228479tj;

public class zzr extends zzaz {
    public static final HashMap A06;
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(157);
    public zzt A00;
    public String A01;
    public String A02;
    public String A03;
    public final int A04;
    public final Set A05;

    static {
        HashMap hashMap = new HashMap();
        A06 = hashMap;
        hashMap.put("authenticatorInfo", new FastJsonResponse$Field(11, false, 11, false, "authenticatorInfo", 2, zzt.class));
        HashMap hashMap2 = A06;
        hashMap2.put("signature", FastJsonResponse$Field.A00("signature", 3));
        hashMap2.put("package", FastJsonResponse$Field.A00("package", 4));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C228479tj.A00(parcel);
        Set set = this.A05;
        if (set.contains(1)) {
            C228479tj.A04(parcel, 1, this.A04);
        }
        if (set.contains(2)) {
            C228479tj.A09(parcel, 2, this.A00, i, true);
        }
        if (set.contains(3)) {
            C228479tj.A0A(parcel, 3, this.A02, true);
        }
        if (set.contains(4)) {
            C228479tj.A0A(parcel, 4, this.A01, true);
        }
        if (set.contains(5)) {
            C228479tj.A0A(parcel, 5, this.A03, true);
        }
        C228479tj.A02(parcel, A002);
    }

    public zzr() {
        this.A05 = new HashSet(3);
        this.A04 = 1;
    }

    public zzr(Set set, int i, zzt zzt, String str, String str2, String str3) {
        this.A05 = set;
        this.A04 = i;
        this.A00 = zzt;
        this.A02 = str;
        this.A01 = str2;
        this.A03 = str3;
    }
}
