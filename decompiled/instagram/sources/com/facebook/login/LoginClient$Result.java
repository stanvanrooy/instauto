package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.AccessToken;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import p000X.AnonymousClass000;
import p000X.Constants;

public class LoginClient$Result implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(83);
    public final LoginClient$Request A00;
    public final String A01;
    public final String A02;
    public final AccessToken A03;
    public final Integer A04;

    public static LoginClient$Result A02(LoginClient$Request loginClient$Request, String str, String str2) {
        return new LoginClient$Result(loginClient$Request, Constants.A0C, (AccessToken) null, AnonymousClass000.A0E(str, str2), (String) null);
    }

    public final int describeContents() {
        return 0;
    }

    public static LoginClient$Result A00(LoginClient$Request loginClient$Request, AccessToken accessToken) {
        return new LoginClient$Result(loginClient$Request, Constants.ZERO, accessToken, (String) null, (String) null);
    }

    public static LoginClient$Result A01(LoginClient$Request loginClient$Request, String str) {
        return new LoginClient$Result(loginClient$Request, Constants.ONE, (AccessToken) null, str, (String) null);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        switch (this.A04.intValue()) {
            case 1:
                str = "CANCEL";
                break;
            case 2:
                str = "ERROR";
                break;
            default:
                str = "SUCCESS";
                break;
        }
        parcel.writeString(str);
        parcel.writeParcelable(this.A03, i);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A00, i);
    }

    public LoginClient$Result(Parcel parcel) {
        Integer num;
        String readString = parcel.readString();
        if (readString.equals("SUCCESS")) {
            num = Constants.ZERO;
        } else if (readString.equals("CANCEL")) {
            num = Constants.ONE;
        } else if (readString.equals("ERROR")) {
            num = Constants.A0C;
        } else {
            throw new IllegalArgumentException(readString);
        }
        this.A04 = num;
        this.A03 = (AccessToken) parcel.readParcelable(AccessToken.class.getClassLoader());
        this.A02 = parcel.readString();
        this.A01 = parcel.readString();
        this.A00 = (LoginClient$Request) parcel.readParcelable(LoginClient$Request.class.getClassLoader());
    }

    public LoginClient$Result(LoginClient$Request loginClient$Request, Integer num, AccessToken accessToken, String str, String str2) {
        this.A00 = loginClient$Request;
        this.A03 = accessToken;
        this.A02 = str;
        this.A04 = num;
        this.A01 = str2;
    }
}
