package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p000X.AnonymousClass0a2;
import p000X.C228479tj;
import p000X.C228549vA;
import p000X.C228589vH;

public class Credential extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new C228549vA();
    public final Uri A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final List A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Credential) {
                Credential credential = (Credential) obj;
                if (!TextUtils.equals(this.A01, credential.A01) || !TextUtils.equals(this.A02, credential.A02) || !C228589vH.A00(this.A00, credential.A00) || !TextUtils.equals(this.A03, credential.A03) || !TextUtils.equals(this.A04, credential.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, this.A02, this.A00, this.A03, this.A04});
    }

    public Credential(String str, String str2, Uri uri, List list, String str3, String str4, String str5, String str6) {
        List unmodifiableList;
        AnonymousClass0a2.A03(str, "credential identifier cannot be null");
        String trim = str.trim();
        AnonymousClass0a2.A05(trim, "credential identifier cannot be empty");
        if (str3 == null || !TextUtils.isEmpty(str3)) {
            if (str4 != null) {
                boolean z = false;
                if (!TextUtils.isEmpty(str4)) {
                    Uri parse = Uri.parse(str4);
                    if (parse.isAbsolute() && parse.isHierarchical() && !TextUtils.isEmpty(parse.getScheme()) && !TextUtils.isEmpty(parse.getAuthority()) && ("http".equalsIgnoreCase(parse.getScheme()) || "https".equalsIgnoreCase(parse.getScheme()))) {
                        z = true;
                    }
                }
                if (!Boolean.valueOf(z).booleanValue()) {
                    throw new IllegalArgumentException("Account type must be a valid Http/Https URI");
                }
            }
            if (TextUtils.isEmpty(str4) || TextUtils.isEmpty(str3)) {
                if (str2 != null && TextUtils.isEmpty(str2.trim())) {
                    str2 = null;
                }
                this.A02 = str2;
                this.A00 = uri;
                if (list == null) {
                    unmodifiableList = Collections.emptyList();
                } else {
                    unmodifiableList = Collections.unmodifiableList(list);
                }
                this.A07 = unmodifiableList;
                this.A01 = trim;
                this.A03 = str3;
                this.A04 = str4;
                this.A05 = str5;
                this.A06 = str6;
                return;
            }
            throw new IllegalArgumentException("Password and AccountType are mutually exclusive");
        }
        throw new IllegalArgumentException("Password must not be empty if set");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C228479tj.A00(parcel);
        C228479tj.A0A(parcel, 1, this.A01, false);
        C228479tj.A0A(parcel, 2, this.A02, false);
        C228479tj.A09(parcel, 3, this.A00, i, false);
        C228479tj.A0C(parcel, 4, this.A07, false);
        C228479tj.A0A(parcel, 5, this.A03, false);
        C228479tj.A0A(parcel, 6, this.A04, false);
        C228479tj.A0A(parcel, 9, this.A05, false);
        C228479tj.A0A(parcel, 10, this.A06, false);
        C228479tj.A02(parcel, A002);
    }
}
