package com.facebook.browser.lite.ipc;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;

public class BrowserLiteJSBridgeCall implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(31);
    public final Context A00;
    public final Bundle A01;
    public final Bundle A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public final int describeContents() {
        return 0;
    }

    public final String A01() {
        Object obj;
        if (!this.A02.containsKey("callbackID")) {
            obj = null;
        } else {
            obj = this.A02.get("callbackID");
        }
        return (String) obj;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A03);
        parcel.writeBundle(this.A01);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeBundle(this.A02);
    }

    public final String A02() {
        return this.A05;
    }

    public BrowserLiteJSBridgeCall(Context context, String str, Bundle bundle, String str2, String str3, Bundle bundle2) {
        this.A00 = context;
        this.A03 = str;
        this.A01 = bundle;
        this.A04 = str2;
        this.A05 = str3;
        this.A02 = bundle2;
    }

    public BrowserLiteJSBridgeCall(Parcel parcel) {
        this.A00 = null;
        this.A03 = parcel.readString();
        this.A01 = parcel.readBundle();
        this.A04 = parcel.readString();
        this.A05 = parcel.readString();
        this.A02 = parcel.readBundle(getClass().getClassLoader());
    }
}
