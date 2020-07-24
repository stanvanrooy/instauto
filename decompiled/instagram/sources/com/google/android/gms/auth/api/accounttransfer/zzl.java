package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.internal.auth.zzaz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import p000X.C228479tj;

public final class zzl extends zzaz {
    public static final HashMap A05;
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(155);
    public zzo A00;
    public ArrayList A01;
    public int A02;
    public final int A03;
    public final Set A04;

    static {
        HashMap hashMap = new HashMap();
        A05 = hashMap;
        hashMap.put("authenticatorData", new FastJsonResponse$Field(11, true, 11, true, "authenticatorData", 2, zzr.class));
        A05.put(ReactProgressBarViewManager.PROP_PROGRESS, new FastJsonResponse$Field(11, false, 11, false, ReactProgressBarViewManager.PROP_PROGRESS, 4, zzo.class));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C228479tj.A00(parcel);
        Set set = this.A04;
        if (set.contains(1)) {
            C228479tj.A04(parcel, 1, this.A03);
        }
        if (set.contains(2)) {
            C228479tj.A0C(parcel, 2, this.A01, true);
        }
        if (set.contains(3)) {
            C228479tj.A04(parcel, 3, this.A02);
        }
        if (set.contains(4)) {
            C228479tj.A09(parcel, 4, this.A00, i, true);
        }
        C228479tj.A02(parcel, A002);
    }

    public zzl() {
        this.A04 = new HashSet(1);
        this.A03 = 1;
    }

    public zzl(Set set, int i, ArrayList arrayList, int i2, zzo zzo) {
        this.A04 = set;
        this.A03 = i;
        this.A01 = arrayList;
        this.A02 = i2;
        this.A00 = zzo;
    }
}
