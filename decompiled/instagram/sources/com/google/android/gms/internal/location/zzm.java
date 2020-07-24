package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.zzj;
import java.util.Collections;
import java.util.List;
import p000X.C228479tj;
import p000X.C228589vH;

public final class zzm extends AbstractSafeParcelable {
    public static final zzj A03 = new zzj(true, 50, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, Long.MAX_VALUE, Integer.MAX_VALUE);
    public static final List A04 = Collections.emptyList();
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(197);
    public zzj A00;
    public String A01;
    public List A02;

    public zzm(zzj zzj, List list, String str) {
        this.A00 = zzj;
        this.A02 = list;
        this.A01 = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzm) {
            zzm zzm = (zzm) obj;
            return C228589vH.A00(this.A00, zzm.A00) && C228589vH.A00(this.A02, zzm.A02) && C228589vH.A00(this.A01, zzm.A01);
        }
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C228479tj.A00(parcel);
        C228479tj.A09(parcel, 1, this.A00, i, false);
        C228479tj.A0C(parcel, 2, this.A02, false);
        C228479tj.A0A(parcel, 3, this.A01, false);
        C228479tj.A02(parcel, A002);
    }
}
