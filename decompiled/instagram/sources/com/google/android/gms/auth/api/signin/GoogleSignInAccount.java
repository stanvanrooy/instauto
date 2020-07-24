package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p000X.C228479tj;
import p000X.C228689vT;
import p000X.C229299xW;
import p000X.C229329xa;

public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static C229329xa A0D = C229299xW.A00;
    public static final Parcelable.Creator CREATOR = new C228689vT();
    public long A00;
    public Uri A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public List A0A;
    public Set A0B = new HashSet();
    public final int A0C;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof GoogleSignInAccount) {
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
                if (googleSignInAccount.A07.equals(this.A07)) {
                    HashSet hashSet = new HashSet(googleSignInAccount.A0A);
                    hashSet.addAll(googleSignInAccount.A0B);
                    HashSet hashSet2 = new HashSet(this.A0A);
                    hashSet2.addAll(this.A0B);
                    if (hashSet.equals(hashSet2)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = (this.A07.hashCode() + 527) * 31;
        HashSet hashSet = new HashSet(this.A0A);
        hashSet.addAll(this.A0B);
        return hashCode + hashSet.hashCode();
    }

    public GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, List list, String str7, String str8) {
        this.A0C = i;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A05 = str4;
        this.A01 = uri;
        this.A06 = str5;
        this.A00 = j;
        this.A07 = str6;
        this.A0A = list;
        this.A08 = str7;
        this.A09 = str8;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C228479tj.A00(parcel);
        C228479tj.A04(parcel, 1, this.A0C);
        C228479tj.A0A(parcel, 2, this.A02, false);
        C228479tj.A0A(parcel, 3, this.A03, false);
        C228479tj.A0A(parcel, 4, this.A04, false);
        C228479tj.A0A(parcel, 5, this.A05, false);
        C228479tj.A09(parcel, 6, this.A01, i, false);
        C228479tj.A0A(parcel, 7, this.A06, false);
        C228479tj.A06(parcel, 8, this.A00);
        C228479tj.A0A(parcel, 9, this.A07, false);
        C228479tj.A0C(parcel, 10, this.A0A, false);
        C228479tj.A0A(parcel, 11, this.A08, false);
        C228479tj.A0A(parcel, 12, this.A09, false);
        C228479tj.A02(parcel, A002);
    }
}
