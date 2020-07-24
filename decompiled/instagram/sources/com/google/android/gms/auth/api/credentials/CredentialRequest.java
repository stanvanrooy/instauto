package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p000X.AnonymousClass0a2;
import p000X.C228479tj;
import p000X.C228579vE;

public final class CredentialRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(160);
    public final CredentialPickerConfig A00;
    public final CredentialPickerConfig A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;
    public final String[] A06;
    public final int A07;
    public final boolean A08;

    public CredentialRequest(int i, boolean z, String[] strArr, CredentialPickerConfig credentialPickerConfig, CredentialPickerConfig credentialPickerConfig2, boolean z2, String str, String str2, boolean z3) {
        CredentialPickerConfig credentialPickerConfig3 = credentialPickerConfig;
        CredentialPickerConfig credentialPickerConfig4 = credentialPickerConfig2;
        this.A07 = i;
        this.A05 = z;
        AnonymousClass0a2.A02(strArr);
        this.A06 = strArr;
        if (credentialPickerConfig == null) {
            new C228579vE();
            credentialPickerConfig3 = new CredentialPickerConfig(2, false, true, false, 1);
        }
        this.A00 = credentialPickerConfig3;
        if (credentialPickerConfig2 == null) {
            new C228579vE();
            credentialPickerConfig4 = new CredentialPickerConfig(2, false, true, false, 1);
        }
        this.A01 = credentialPickerConfig4;
        if (i < 3) {
            this.A04 = true;
            this.A02 = null;
            this.A03 = null;
        } else {
            this.A04 = z2;
            this.A02 = str;
            this.A03 = str2;
        }
        this.A08 = z3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C228479tj.A00(parcel);
        C228479tj.A0D(parcel, 1, this.A05);
        C228479tj.A0G(parcel, 2, this.A06);
        C228479tj.A09(parcel, 3, this.A00, i, false);
        C228479tj.A09(parcel, 4, this.A01, i, false);
        C228479tj.A0D(parcel, 5, this.A04);
        C228479tj.A0A(parcel, 6, this.A02, false);
        C228479tj.A0A(parcel, 7, this.A03, false);
        C228479tj.A04(parcel, 1000, this.A07);
        C228479tj.A0D(parcel, 8, this.A08);
        C228479tj.A02(parcel, A002);
    }
}
