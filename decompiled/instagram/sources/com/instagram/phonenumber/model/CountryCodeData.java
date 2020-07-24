package com.instagram.phonenumber.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape0S0000000_I0;
import java.util.Locale;
import p000X.C06360Ot;

public class CountryCodeData implements Comparable, Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape0S0000000_I0(78);
    public String A00;
    public String A01;
    public String A02;

    public final String A00() {
        return C06360Ot.formatString("%s (+%s)", this.A02, this.A01);
    }

    public final String A01() {
        return C06360Ot.formatString("%s +%s", this.A00, this.A01);
    }

    public final int describeContents() {
        return 0;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.A02.compareTo(((CountryCodeData) obj).A02);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A00);
    }

    public CountryCodeData() {
    }

    public CountryCodeData(int i, String str) {
        this(String.valueOf(i), new Locale("", str).getDisplayCountry(), str);
    }

    public CountryCodeData(Parcel parcel) {
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
        this.A00 = parcel.readString();
    }

    public CountryCodeData(String str, String str2, String str3) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = str3;
    }
}
