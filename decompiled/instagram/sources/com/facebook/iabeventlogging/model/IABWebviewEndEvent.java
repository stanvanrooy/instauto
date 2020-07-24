package com.facebook.iabeventlogging.model;

import android.os.Parcel;
import java.util.ArrayList;
import p000X.C25080AzM;

public class IABWebviewEndEvent extends IABEvent {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final long A07;
    public final long A08;
    public final long A09;
    public final long A0A;
    public final long A0B;
    public final long A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final ArrayList A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;

    public final String toString() {
        return "IABWebviewEndEvent{" + "userClickTs=" + this.A0A + ", webRequestStartedTs=" + this.A0B + ", browserOpenTs=" + this.A05 + ", scrollReadyTs=" + this.A09 + ", landingPageDomContentLoadedTs=" + this.A06 + ", landingPageLoadedTs=" + this.A07 + ", landingPageViewEndedTs=" + this.A08 + ", browserCloseTs=" + this.A04 + ", backgroundTimePairs=" + this.A0J + ", initialUrl='" + this.A0I + '\'' + ", initialLandUrl='" + this.A0H + '\'' + ", clickSource='" + this.A0D + '\'' + ", dismissMethod=" + this.A00 + ", landingPageStatusCode=" + this.A02 + ", sslErrorCode=" + this.A03 + ", interactionCount=" + this.A01 + ", type=" + this.A02 + ", iabSessionId='" + this.A03 + '\'' + ", eventTs=" + this.A01 + ", createdAtTs=" + this.A00 + ", isInitialUrlIsOpenApp=" + this.A0L + ", deepLinkUrl=" + this.A0E + ", shouldUseLEDesign=" + this.A0M + ", webviewEndFlags=" + this.A0C + ", isCrashed=" + this.A0K + ", errorMessage=" + this.A0F + ", errorStackTrace=" + this.A0G + '}';
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeLong(this.A0A);
        parcel.writeLong(this.A0B);
        parcel.writeLong(this.A05);
        parcel.writeLong(this.A09);
        parcel.writeLong(this.A06);
        parcel.writeLong(this.A07);
        parcel.writeLong(this.A08);
        parcel.writeList(this.A0J);
        parcel.writeString(this.A0I);
        parcel.writeString(this.A0H);
        parcel.writeString(this.A0D);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A01);
        parcel.writeByte(this.A0L ? (byte) 1 : 0);
        parcel.writeString(this.A0E);
        parcel.writeByte(this.A0M ? (byte) 1 : 0);
        parcel.writeLong(this.A0C);
        parcel.writeByte(this.A0K ? (byte) 1 : 0);
        parcel.writeString(this.A0F);
        parcel.writeString(this.A0G);
    }

    public IABWebviewEndEvent(String str, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, ArrayList arrayList, String str2, String str3, String str4, int i, int i2, int i3, int i4, boolean z, String str5, boolean z2, long j10, boolean z3, String str6, String str7) {
        super(C25080AzM.IAB_WEBVIEW_END, str, j, j2);
        this.A0A = j3;
        this.A0B = j4;
        this.A05 = j5;
        this.A09 = j6;
        this.A06 = j7;
        this.A07 = j8;
        this.A08 = j9;
        this.A04 = j;
        this.A0J = arrayList;
        this.A0I = str2;
        this.A0H = str3;
        this.A0D = str4;
        this.A00 = i;
        this.A02 = i2;
        this.A03 = i3;
        this.A01 = i4;
        this.A0L = z;
        this.A0E = str5;
        this.A0M = z2;
        this.A0C = j10;
        this.A0K = z3;
        this.A0F = str6;
        this.A0G = str7;
    }
}
