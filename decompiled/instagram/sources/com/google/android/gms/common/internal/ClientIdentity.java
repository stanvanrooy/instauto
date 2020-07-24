package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p000X.C228479tj;
import p000X.C228589vH;

public class ClientIdentity extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(172);
    public final int A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj != null && (obj instanceof ClientIdentity)) {
                ClientIdentity clientIdentity = (ClientIdentity) obj;
                if (clientIdentity.A00 != this.A00 || !C228589vH.A00(clientIdentity.A01, this.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        int i = this.A00;
        String str = this.A01;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
        sb.append(i);
        sb.append(":");
        sb.append(str);
        return sb.toString();
    }

    public ClientIdentity(int i, String str) {
        this.A00 = i;
        this.A01 = str;
    }

    public final int hashCode() {
        return this.A00;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C228479tj.A00(parcel);
        C228479tj.A04(parcel, 1, this.A00);
        C228479tj.A0A(parcel, 2, this.A01, false);
        C228479tj.A02(parcel, A002);
    }
}
