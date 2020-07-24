package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;
import p000X.C228479tj;
import p000X.C228589vH;

public final class zzbd extends AbstractSafeParcelable {
    public static final List A07 = Collections.emptyList();
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(195);
    public LocationRequest A00;
    public String A01;
    public String A02;
    public List A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;

    public zzbd(LocationRequest locationRequest, List list, String str, boolean z, boolean z2, boolean z3, String str2) {
        this.A00 = locationRequest;
        this.A03 = list;
        this.A02 = str;
        this.A04 = z;
        this.A05 = z2;
        this.A06 = z3;
        this.A01 = str2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzbd) {
            zzbd zzbd = (zzbd) obj;
            return C228589vH.A00(this.A00, zzbd.A00) && C228589vH.A00(this.A03, zzbd.A03) && C228589vH.A00(this.A02, zzbd.A02) && this.A04 == zzbd.A04 && this.A05 == zzbd.A05 && this.A06 == zzbd.A06 && C228589vH.A00(this.A01, zzbd.A01);
        }
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A00);
        String str = this.A02;
        if (str != null) {
            sb.append(" tag=");
            sb.append(str);
        }
        String str2 = this.A01;
        if (str2 != null) {
            sb.append(" moduleId=");
            sb.append(str2);
        }
        sb.append(" hideAppOps=");
        sb.append(this.A04);
        sb.append(" clients=");
        sb.append(this.A03);
        sb.append(" forceCoarseLocation=");
        sb.append(this.A05);
        if (this.A06) {
            sb.append(" exemptFromBackgroundThrottle");
        }
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C228479tj.A00(parcel);
        C228479tj.A09(parcel, 1, this.A00, i, false);
        C228479tj.A0C(parcel, 5, this.A03, false);
        C228479tj.A0A(parcel, 6, this.A02, false);
        C228479tj.A0D(parcel, 7, this.A04);
        C228479tj.A0D(parcel, 8, this.A05);
        C228479tj.A0D(parcel, 9, this.A06);
        C228479tj.A0A(parcel, 10, this.A01, false);
        C228479tj.A02(parcel, A002);
    }
}
