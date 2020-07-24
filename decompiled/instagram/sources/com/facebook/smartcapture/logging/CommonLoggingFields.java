package com.facebook.smartcapture.logging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import java.util.HashMap;
import java.util.Map;
import p000X.C27238C4f;

public class CommonLoggingFields implements Parcelable {
    public static final CommonLoggingFields A06 = new CommonLoggingFields(C27238C4f.LOW_END, "", (String) null, (String) null, (Bundle) null);
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(86);
    public Bundle A00;
    public C27238C4f A01;
    public String A02;
    public String A03;
    public String A04;
    public Map A05;

    public final int describeContents() {
        return 0;
    }

    public static Map A00(Bundle bundle) {
        HashMap hashMap = new HashMap();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                hashMap.put(str, bundle.getString(str));
            }
        }
        return hashMap;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeBundle(this.A00);
    }

    public CommonLoggingFields(C27238C4f c4f, String str, String str2, String str3, Bundle bundle) {
        this.A01 = c4f;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A00 = bundle;
        this.A05 = A00(bundle);
    }

    public CommonLoggingFields(Parcel parcel) {
        this.A01 = (C27238C4f) parcel.readSerializable();
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
        this.A04 = parcel.readString();
        Bundle readBundle = parcel.readBundle(String.class.getClassLoader());
        this.A00 = readBundle;
        this.A05 = A00(readBundle);
    }
}
