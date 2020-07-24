package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p000X.C228479tj;
import p000X.C228759vf;

public class GetServiceRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C228759vf();
    public Account A00;
    public Bundle A01;
    public IBinder A02;
    public String A03;
    public Feature[] A04;
    public Feature[] A05;
    public Scope[] A06;
    public int A07;
    public boolean A08;
    public final int A09;
    public final int A0A;

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C228479tj.A00(parcel);
        C228479tj.A04(parcel, 1, this.A09);
        C228479tj.A04(parcel, 2, this.A0A);
        C228479tj.A04(parcel, 3, this.A07);
        C228479tj.A0A(parcel, 4, this.A03, false);
        C228479tj.A08(parcel, 5, this.A02);
        C228479tj.A0F(parcel, 6, this.A06, i);
        C228479tj.A07(parcel, 7, this.A01);
        C228479tj.A09(parcel, 8, this.A00, i, false);
        C228479tj.A0F(parcel, 10, this.A04, i);
        C228479tj.A0F(parcel, 11, this.A05, i);
        C228479tj.A0D(parcel, 12, this.A08);
        C228479tj.A02(parcel, A002);
    }

    public GetServiceRequest(int i) {
        this.A09 = 4;
        this.A07 = 12451000;
        this.A0A = i;
        this.A08 = true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: android.accounts.Account} */
    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: type inference failed for: r1v3, types: [com.google.android.gms.common.internal.IAccountAccessor] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v11 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: Multi-variable type inference failed */
    public GetServiceRequest(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, Feature[] featureArr, Feature[] featureArr2, boolean z) {
        this.A09 = i;
        this.A0A = i2;
        this.A07 = i3;
        if ("com.google.android.gms".equals(str)) {
            this.A03 = "com.google.android.gms";
        } else {
            this.A03 = str;
        }
        if (i < 2) {
            ? r1 = 0;
            if (iBinder != null) {
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                    r1 = queryLocalInterface instanceof IAccountAccessor ? (IAccountAccessor) queryLocalInterface : new IAccountAccessor$Stub$zza(iBinder);
                }
                if (r1 != 0) {
                    long clearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                    } catch (RemoteException unused) {
                        Log.w("AccountAccessor", "Remote account accessor probably died");
                    } finally {
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                    }
                }
                r1 = 0;
            }
            this.A00 = r1;
        } else {
            this.A02 = iBinder;
            this.A00 = account;
        }
        this.A06 = scopeArr;
        this.A01 = bundle;
        this.A04 = featureArr;
        this.A05 = featureArr2;
        this.A08 = z;
    }
}
