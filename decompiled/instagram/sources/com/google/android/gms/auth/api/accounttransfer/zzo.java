package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.internal.auth.zzaz;
import java.util.List;
import p000X.C04450Ea;
import p000X.C228479tj;

public class zzo extends zzaz {
    public static final C04450Ea A06;
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(156);
    public List A00;
    public List A01;
    public List A02;
    public List A03;
    public List A04;
    public final int A05;

    static {
        C04450Ea r2 = new C04450Ea();
        A06 = r2;
        r2.put("registered", FastJsonResponse$Field.A01("registered", 2));
        C04450Ea r22 = A06;
        r22.put("in_progress", FastJsonResponse$Field.A01("in_progress", 3));
        r22.put("success", FastJsonResponse$Field.A01("success", 4));
        r22.put("failed", FastJsonResponse$Field.A01("failed", 5));
        r22.put("escrowed", FastJsonResponse$Field.A01("escrowed", 6));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C228479tj.A00(parcel);
        C228479tj.A04(parcel, 1, this.A05);
        C228479tj.A0B(parcel, 2, this.A00);
        C228479tj.A0B(parcel, 3, this.A01);
        C228479tj.A0B(parcel, 4, this.A02);
        C228479tj.A0B(parcel, 5, this.A03);
        C228479tj.A0B(parcel, 6, this.A04);
        C228479tj.A02(parcel, A002);
    }

    public zzo() {
        this.A05 = 1;
    }

    public zzo(int i, List list, List list2, List list3, List list4, List list5) {
        this.A05 = i;
        this.A00 = list;
        this.A01 = list2;
        this.A02 = list3;
        this.A03 = list4;
        this.A04 = list5;
    }
}
