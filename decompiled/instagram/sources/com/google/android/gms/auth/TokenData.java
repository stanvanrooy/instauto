package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.List;
import p000X.AnonymousClass0a2;
import p000X.C228479tj;
import p000X.C228589vH;

public class TokenData extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(167);
    public final int A00;
    public final Long A01;
    public final String A02;
    public final String A03;
    public final List A04;
    public final boolean A05;
    public final boolean A06;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A03, this.A01, Boolean.valueOf(this.A05), Boolean.valueOf(this.A06), this.A04, this.A02});
    }

    public final boolean equals(Object obj) {
        if (obj instanceof TokenData) {
            TokenData tokenData = (TokenData) obj;
            if (!TextUtils.equals(this.A03, tokenData.A03) || !C228589vH.A00(this.A01, tokenData.A01) || this.A05 != tokenData.A05 || this.A06 != tokenData.A06 || !C228589vH.A00(this.A04, tokenData.A04) || !C228589vH.A00(this.A02, tokenData.A02)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public TokenData(int i, String str, Long l, boolean z, boolean z2, List list, String str2) {
        this.A00 = i;
        AnonymousClass0a2.A04(str);
        this.A03 = str;
        this.A01 = l;
        this.A05 = z;
        this.A06 = z2;
        this.A04 = list;
        this.A02 = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C228479tj.A00(parcel);
        C228479tj.A04(parcel, 1, this.A00);
        C228479tj.A0A(parcel, 2, this.A03, false);
        Long l = this.A01;
        if (l != null) {
            C228479tj.A05(parcel, 3, 8);
            parcel.writeLong(l.longValue());
        }
        C228479tj.A0D(parcel, 4, this.A05);
        C228479tj.A0D(parcel, 5, this.A06);
        C228479tj.A0B(parcel, 6, this.A04);
        C228479tj.A0A(parcel, 7, this.A02, false);
        C228479tj.A02(parcel, A002);
    }
}
