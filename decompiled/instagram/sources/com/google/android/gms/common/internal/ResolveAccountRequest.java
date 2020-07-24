package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p000X.C228479tj;
import p000X.C228789vl;

public class ResolveAccountRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C228789vl();
    public final int A00;
    public final Account A01;
    public final GoogleSignInAccount A02;
    public final int A03;

    public ResolveAccountRequest(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.A03 = i;
        this.A01 = account;
        this.A00 = i2;
        this.A02 = googleSignInAccount;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C228479tj.A00(parcel);
        C228479tj.A04(parcel, 1, this.A03);
        C228479tj.A09(parcel, 2, this.A01, i, false);
        C228479tj.A04(parcel, 3, this.A00);
        C228479tj.A09(parcel, 4, this.A02, i, false);
        C228479tj.A02(parcel, A002);
    }
}
