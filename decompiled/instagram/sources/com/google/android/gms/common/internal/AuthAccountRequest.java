package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p000X.C228479tj;
import p000X.C228749ve;

public class AuthAccountRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C228749ve();
    public Account A00;
    public Integer A01;
    public Integer A02;
    public final int A03;
    public final IBinder A04;
    public final Scope[] A05;

    public AuthAccountRequest(int i, IBinder iBinder, Scope[] scopeArr, Integer num, Integer num2, Account account) {
        this.A03 = i;
        this.A04 = iBinder;
        this.A05 = scopeArr;
        this.A01 = num;
        this.A02 = num2;
        this.A00 = account;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C228479tj.A00(parcel);
        C228479tj.A04(parcel, 1, this.A03);
        C228479tj.A08(parcel, 2, this.A04);
        C228479tj.A0F(parcel, 3, this.A05, i);
        Integer num = this.A01;
        if (num != null) {
            C228479tj.A05(parcel, 4, 4);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.A02;
        if (num2 != null) {
            C228479tj.A05(parcel, 5, 4);
            parcel.writeInt(num2.intValue());
        }
        C228479tj.A09(parcel, 6, this.A00, i, false);
        C228479tj.A02(parcel, A002);
    }
}
