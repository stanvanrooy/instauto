package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p000X.AnonymousClass0a2;
import p000X.C228479tj;
import p000X.C229319xY;

public final class SignInConfiguration extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(163);
    public GoogleSignInOptions A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (obj instanceof SignInConfiguration) {
            SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
            if (this.A01.equals(signInConfiguration.A01)) {
                GoogleSignInOptions googleSignInOptions = this.A00;
                if (googleSignInOptions == null) {
                    if (signInConfiguration.A00 == null) {
                        return true;
                    }
                } else if (googleSignInOptions.equals(signInConfiguration.A00)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        C229319xY r1 = new C229319xY();
        r1.A00(this.A01);
        r1.A00(this.A00);
        return r1.A00;
    }

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        AnonymousClass0a2.A04(str);
        this.A01 = str;
        this.A00 = googleSignInOptions;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C228479tj.A00(parcel);
        C228479tj.A0A(parcel, 2, this.A01, false);
        C228479tj.A09(parcel, 5, this.A00, i, false);
        C228479tj.A02(parcel, A002);
    }
}
