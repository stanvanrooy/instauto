package com.google.android.gms.internal.clearcut;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import p000X.C228479tj;
import p000X.C228589vH;

public final class zzr extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(193);
    public final int A00;
    public final String A01;
    public final int A02;
    public final int A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;
    public final boolean A08;

    public zzr(String str, int i, int i2, String str2, String str3, boolean z, String str4, boolean z2, int i3) {
        this.A04 = str;
        this.A03 = i;
        this.A00 = i2;
        this.A05 = str2;
        this.A06 = str3;
        this.A07 = z;
        this.A01 = str4;
        this.A08 = z2;
        this.A02 = i3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof zzr) {
                zzr zzr = (zzr) obj;
                if (!(C228589vH.A00(this.A04, zzr.A04) && this.A03 == zzr.A03 && this.A00 == zzr.A00 && C228589vH.A00(this.A01, zzr.A01) && C228589vH.A00(this.A05, zzr.A05) && C228589vH.A00(this.A06, zzr.A06) && this.A07 == zzr.A07 && this.A08 == zzr.A08 && this.A02 == zzr.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A04, Integer.valueOf(this.A03), Integer.valueOf(this.A00), this.A01, this.A05, this.A06, Boolean.valueOf(this.A07), Boolean.valueOf(this.A08), Integer.valueOf(this.A02)});
    }

    public final String toString() {
        return "PlayLoggerContext[" + "package=" + this.A04 + ',' + "packageVersionCode=" + this.A03 + ',' + "logSource=" + this.A00 + ',' + "logSourceName=" + this.A01 + ',' + "uploadAccount=" + this.A05 + ',' + "loggingId=" + this.A06 + ',' + "logAndroidId=" + this.A07 + ',' + "isAnonymous=" + this.A08 + ',' + "qosTier=" + this.A02 + "]";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C228479tj.A00(parcel);
        C228479tj.A0A(parcel, 2, this.A04, false);
        C228479tj.A04(parcel, 3, this.A03);
        C228479tj.A04(parcel, 4, this.A00);
        C228479tj.A0A(parcel, 5, this.A05, false);
        C228479tj.A0A(parcel, 6, this.A06, false);
        C228479tj.A0D(parcel, 7, this.A07);
        C228479tj.A0A(parcel, 8, this.A01, false);
        C228479tj.A0D(parcel, 9, this.A08);
        C228479tj.A04(parcel, 10, this.A02);
        C228479tj.A02(parcel, A002);
    }
}
