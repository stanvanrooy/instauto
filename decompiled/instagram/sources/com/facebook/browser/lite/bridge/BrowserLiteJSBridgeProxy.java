package com.facebook.browser.lite.bridge;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCall;
import p000X.AQ8;
import p000X.AnonymousClass087;
import p000X.AnonymousClass7AF;

public class BrowserLiteJSBridgeProxy implements Parcelable {
    public static final Parcelable.Creator CREATOR = new AnonymousClass087();
    public Bundle A00;
    public AQ8 A01;
    public String A02;
    public final String A03;

    public final synchronized Bundle A04() {
        return this.A00;
    }

    public final synchronized AQ8 A05() {
        return this.A01;
    }

    public final synchronized String A06() {
        return this.A02;
    }

    public final synchronized void A07(AQ8 aq8) {
        this.A01 = aq8;
        if (aq8 != null) {
            this.A02 = aq8.A14();
        }
    }

    public final synchronized void A08(String str) {
        this.A02 = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A03);
        parcel.writeBundle(this.A00);
    }

    public static boolean A00(AQ8 aq8, BrowserLiteJSBridgeCall browserLiteJSBridgeCall, String str) {
        Uri uri;
        if (!AnonymousClass7AF.A00(str)) {
            return false;
        }
        Uri uri2 = null;
        if (aq8.A14() != null) {
            uri = Uri.parse(aq8.A14());
        } else {
            uri = null;
        }
        String A022 = browserLiteJSBridgeCall.A02();
        if (A022 != null) {
            uri2 = Uri.parse(A022);
        }
        if (uri == null || uri.getAuthority() == null || uri2 == null || uri2.getAuthority() == null || !uri.getAuthority().equals(uri2.getAuthority())) {
            return false;
        }
        return true;
    }

    public final Context A03() {
        if (A05() != null) {
            return A05().A05();
        }
        return null;
    }

    public BrowserLiteJSBridgeProxy() {
        this.A03 = "_AutofillExtensions";
    }

    public BrowserLiteJSBridgeProxy(Parcel parcel) {
        this.A03 = parcel.readString();
        this.A00 = parcel.readBundle();
    }
}
