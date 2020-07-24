package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.common.zza;
import p000X.AnonymousClass0Z0;
import p000X.C193418Ps;

public final class IAccountAccessor$Stub$zza extends zza implements IAccountAccessor {
    public IAccountAccessor$Stub$zza(IBinder iBinder) {
        super(iBinder, C193418Ps.$const$string(90));
        AnonymousClass0Z0.A0A(1509851731, AnonymousClass0Z0.A03(-1201230921));
    }

    public final Account AFJ() {
        Parcelable parcelable;
        int A03 = AnonymousClass0Z0.A03(1311836929);
        Parcel A01 = A01(2, A00());
        Parcelable.Creator creator = Account.CREATOR;
        if (A01.readInt() == 0) {
            parcelable = null;
        } else {
            parcelable = (Parcelable) creator.createFromParcel(A01);
        }
        Account account = (Account) parcelable;
        A01.recycle();
        AnonymousClass0Z0.A0A(1908845612, A03);
        return account;
    }
}
