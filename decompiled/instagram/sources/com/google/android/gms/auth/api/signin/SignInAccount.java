package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p000X.AnonymousClass0a2;
import p000X.C228479tj;

public class SignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(164);
    public GoogleSignInAccount A00;
    public String A01;
    public String A02;

    public SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.A00 = googleSignInAccount;
        AnonymousClass0a2.A05(str, "8.3 and 8.4 SDKs require non-null email");
        this.A01 = str;
        AnonymousClass0a2.A05(str2, "8.3 and 8.4 SDKs require non-null userId");
        this.A02 = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C228479tj.A00(parcel);
        C228479tj.A0A(parcel, 4, this.A01, false);
        C228479tj.A09(parcel, 7, this.A00, i, false);
        C228479tj.A0A(parcel, 8, this.A02, false);
        C228479tj.A02(parcel, A002);
    }
}
