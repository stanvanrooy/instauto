package com.google.android.gms.auth.api.accounttransfer;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.internal.auth.zzaz;
import com.instagram.realtimeclient.RealtimeProtocol;
import java.util.HashMap;
import java.util.Set;
import p000X.AnonymousClass003;
import p000X.C228429tM;
import p000X.C228479tj;

public class zzt extends zzaz {
    public static final HashMap A07;
    public static final Parcelable.Creator CREATOR = new C228429tM();
    public int A00;
    public String A01;
    public byte[] A02;
    public PendingIntent A03;
    public DeviceMetaData A04;
    public final int A05;
    public final Set A06;

    static {
        HashMap hashMap = new HashMap();
        A07 = hashMap;
        hashMap.put("accountType", FastJsonResponse$Field.A00("accountType", 2));
        HashMap hashMap2 = A07;
        hashMap2.put(RealtimeProtocol.USERS_ACCOUNT_STATUS, new FastJsonResponse$Field(0, false, 0, false, RealtimeProtocol.USERS_ACCOUNT_STATUS, 3, (Class) null));
        hashMap2.put("transferBytes", new FastJsonResponse$Field(8, false, 8, false, "transferBytes", 4, (Class) null));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C228479tj.A00(parcel);
        Set set = this.A06;
        if (set.contains(1)) {
            C228479tj.A04(parcel, 1, this.A05);
        }
        if (set.contains(2)) {
            C228479tj.A0A(parcel, 2, this.A01, true);
        }
        if (set.contains(3)) {
            C228479tj.A04(parcel, 3, this.A00);
        }
        if (set.contains(4)) {
            C228479tj.A0E(parcel, 4, this.A02, true);
        }
        if (set.contains(5)) {
            C228479tj.A09(parcel, 5, this.A03, i, true);
        }
        if (set.contains(6)) {
            C228479tj.A09(parcel, 6, this.A04, i, true);
        }
        C228479tj.A02(parcel, A002);
    }

    public zzt() {
        this.A06 = new AnonymousClass003(3);
        this.A05 = 1;
    }

    public zzt(Set set, int i, String str, int i2, byte[] bArr, PendingIntent pendingIntent, DeviceMetaData deviceMetaData) {
        this.A06 = set;
        this.A05 = i;
        this.A01 = str;
        this.A00 = i2;
        this.A02 = bArr;
        this.A03 = pendingIntent;
        this.A04 = deviceMetaData;
    }
}
