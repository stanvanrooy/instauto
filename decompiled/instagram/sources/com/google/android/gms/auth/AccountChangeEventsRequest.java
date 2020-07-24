package com.google.android.gms.auth;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.common.jobscheduler.compat.GcmTaskServiceCompat;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p000X.C228479tj;
import p000X.C228859vx;

public class AccountChangeEventsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C228859vx();
    public int A00;
    public Account A01;
    public String A02;
    public final int A03;

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C228479tj.A00(parcel);
        C228479tj.A04(parcel, 1, this.A03);
        C228479tj.A04(parcel, 2, this.A00);
        C228479tj.A0A(parcel, 3, this.A02, false);
        C228479tj.A09(parcel, 4, this.A01, i, false);
        C228479tj.A02(parcel, A002);
    }

    public AccountChangeEventsRequest() {
        this.A03 = 1;
    }

    public AccountChangeEventsRequest(int i, int i2, String str, Account account) {
        this.A03 = i;
        this.A00 = i2;
        this.A02 = str;
        if (account != null || TextUtils.isEmpty(str)) {
            this.A01 = account;
        } else {
            this.A01 = new Account(str, GcmTaskServiceCompat.GOOGLE_PREFIX);
        }
    }
}
