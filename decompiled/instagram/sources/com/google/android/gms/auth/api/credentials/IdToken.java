package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p000X.AnonymousClass0a2;
import p000X.C228479tj;
import p000X.C228589vH;

public final class IdToken extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(162);
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IdToken) {
                IdToken idToken = (IdToken) obj;
                if (!C228589vH.A00(this.A01, idToken.A01) || !C228589vH.A00(this.A00, idToken.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public IdToken(String str, String str2) {
        AnonymousClass0a2.A08(!TextUtils.isEmpty(str), "account type string cannot be null or empty");
        AnonymousClass0a2.A08(!TextUtils.isEmpty(str2), "id token string cannot be null or empty");
        this.A01 = str;
        this.A00 = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C228479tj.A00(parcel);
        C228479tj.A0A(parcel, 1, this.A01, false);
        C228479tj.A0A(parcel, 2, this.A00, false);
        C228479tj.A02(parcel, A002);
    }
}
