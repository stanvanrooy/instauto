package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import p000X.AnonymousClass0a2;
import p000X.C228479tj;
import p000X.C228589vH;

public class AccountChangeEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(165);
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final String A04;
    public final String A05;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof AccountChangeEvent) {
                AccountChangeEvent accountChangeEvent = (AccountChangeEvent) obj;
                if (!(this.A00 == accountChangeEvent.A00 && this.A03 == accountChangeEvent.A03 && C228589vH.A00(this.A04, accountChangeEvent.A04) && this.A01 == accountChangeEvent.A01 && this.A02 == accountChangeEvent.A02 && C228589vH.A00(this.A05, accountChangeEvent.A05))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A00), Long.valueOf(this.A03), this.A04, Integer.valueOf(this.A01), Integer.valueOf(this.A02), this.A05});
    }

    public final String toString() {
        String str;
        int i = this.A01;
        if (i == 1) {
            str = "ADDED";
        } else if (i == 2) {
            str = "REMOVED";
        } else if (i == 3) {
            str = "RENAMED_FROM";
        } else if (i != 4) {
            str = NetInfoModule.CONNECTION_TYPE_UNKNOWN_DEPRECATED;
        } else {
            str = "RENAMED_TO";
        }
        String str2 = this.A04;
        String str3 = this.A05;
        int i2 = this.A02;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 91 + str.length() + String.valueOf(str3).length());
        sb.append("AccountChangeEvent {accountName = ");
        sb.append(str2);
        sb.append(", changeType = ");
        sb.append(str);
        sb.append(", changeData = ");
        sb.append(str3);
        sb.append(", eventIndex = ");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }

    public AccountChangeEvent(int i, long j, String str, int i2, int i3, String str2) {
        this.A00 = i;
        this.A03 = j;
        AnonymousClass0a2.A02(str);
        this.A04 = str;
        this.A01 = i2;
        this.A02 = i3;
        this.A05 = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C228479tj.A00(parcel);
        C228479tj.A04(parcel, 1, this.A00);
        C228479tj.A06(parcel, 2, this.A03);
        C228479tj.A0A(parcel, 3, this.A04, false);
        C228479tj.A04(parcel, 4, this.A01);
        C228479tj.A04(parcel, 5, this.A02);
        C228479tj.A0A(parcel, 6, this.A05, false);
        C228479tj.A02(parcel, A002);
    }
}
