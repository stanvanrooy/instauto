package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p000X.AnonymousClass0a2;
import p000X.C228479tj;

public final class HintRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(161);
    public final CredentialPickerConfig A00;
    public final String A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;
    public final String[] A05;
    public final int A06;
    public final boolean A07;

    public HintRequest(int i, CredentialPickerConfig credentialPickerConfig, boolean z, boolean z2, String[] strArr, boolean z3, String str, String str2) {
        this.A06 = i;
        AnonymousClass0a2.A02(credentialPickerConfig);
        this.A00 = credentialPickerConfig;
        this.A04 = z;
        this.A07 = z2;
        AnonymousClass0a2.A02(strArr);
        this.A05 = strArr;
        if (i < 2) {
            this.A03 = true;
            this.A01 = null;
            this.A02 = null;
            return;
        }
        this.A03 = z3;
        this.A01 = str;
        this.A02 = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C228479tj.A00(parcel);
        C228479tj.A09(parcel, 1, this.A00, i, false);
        C228479tj.A0D(parcel, 2, this.A04);
        C228479tj.A0D(parcel, 3, this.A07);
        C228479tj.A0G(parcel, 4, this.A05);
        C228479tj.A0D(parcel, 5, this.A03);
        C228479tj.A0A(parcel, 6, this.A01, false);
        C228479tj.A0A(parcel, 7, this.A02, false);
        C228479tj.A04(parcel, 1000, this.A06);
        C228479tj.A02(parcel, A002);
    }
}
