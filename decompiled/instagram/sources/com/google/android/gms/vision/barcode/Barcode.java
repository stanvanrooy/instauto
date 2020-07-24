package com.google.android.gms.vision.barcode;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p000X.C228479tj;
import p000X.C228499u4;

public class Barcode extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C228499u4();
    public int A00;
    public int A01;
    public CalendarEvent A02;
    public ContactInfo A03;
    public DriverLicense A04;
    public Email A05;
    public GeoPoint A06;
    public Phone A07;
    public Sms A08;
    public UrlBookmark A09;
    public WiFi A0A;
    public String A0B;
    public String A0C;
    public Point[] A0D;

    public class Address extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(231);
        public int A00;
        public String[] A01;

        public final void writeToParcel(Parcel parcel, int i) {
            int A002 = C228479tj.A00(parcel);
            C228479tj.A04(parcel, 2, this.A00);
            C228479tj.A0G(parcel, 3, this.A01);
            C228479tj.A02(parcel, A002);
        }

        public Address() {
        }

        public Address(int i, String[] strArr) {
            this.A00 = i;
            this.A01 = strArr;
        }
    }

    public class CalendarDateTime extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(232);
        public int A00;
        public int A01;
        public int A02;
        public int A03;
        public int A04;
        public int A05;
        public String A06;
        public boolean A07;

        public final void writeToParcel(Parcel parcel, int i) {
            int A002 = C228479tj.A00(parcel);
            C228479tj.A04(parcel, 2, this.A05);
            C228479tj.A04(parcel, 3, this.A03);
            C228479tj.A04(parcel, 4, this.A00);
            C228479tj.A04(parcel, 5, this.A01);
            C228479tj.A04(parcel, 6, this.A02);
            C228479tj.A04(parcel, 7, this.A04);
            C228479tj.A0D(parcel, 8, this.A07);
            C228479tj.A0A(parcel, 9, this.A06, false);
            C228479tj.A02(parcel, A002);
        }

        public CalendarDateTime() {
        }

        public CalendarDateTime(int i, int i2, int i3, int i4, int i5, int i6, boolean z, String str) {
            this.A05 = i;
            this.A03 = i2;
            this.A00 = i3;
            this.A01 = i4;
            this.A02 = i5;
            this.A04 = i6;
            this.A07 = z;
            this.A06 = str;
        }
    }

    public class CalendarEvent extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(233);
        public CalendarDateTime A00;
        public CalendarDateTime A01;
        public String A02;
        public String A03;
        public String A04;
        public String A05;
        public String A06;

        public final void writeToParcel(Parcel parcel, int i) {
            int A002 = C228479tj.A00(parcel);
            C228479tj.A0A(parcel, 2, this.A06, false);
            C228479tj.A0A(parcel, 3, this.A02, false);
            C228479tj.A0A(parcel, 4, this.A03, false);
            C228479tj.A0A(parcel, 5, this.A04, false);
            C228479tj.A0A(parcel, 6, this.A05, false);
            C228479tj.A09(parcel, 7, this.A01, i, false);
            C228479tj.A09(parcel, 8, this.A00, i, false);
            C228479tj.A02(parcel, A002);
        }

        public CalendarEvent() {
        }

        public CalendarEvent(String str, String str2, String str3, String str4, String str5, CalendarDateTime calendarDateTime, CalendarDateTime calendarDateTime2) {
            this.A06 = str;
            this.A02 = str2;
            this.A03 = str3;
            this.A04 = str4;
            this.A05 = str5;
            this.A01 = calendarDateTime;
            this.A00 = calendarDateTime2;
        }
    }

    public class ContactInfo extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(234);
        public PersonName A00;
        public String A01;
        public String A02;
        public Address[] A03;
        public Email[] A04;
        public Phone[] A05;
        public String[] A06;

        public final void writeToParcel(Parcel parcel, int i) {
            int A002 = C228479tj.A00(parcel);
            C228479tj.A09(parcel, 2, this.A00, i, false);
            C228479tj.A0A(parcel, 3, this.A01, false);
            C228479tj.A0A(parcel, 4, this.A02, false);
            C228479tj.A0F(parcel, 5, this.A05, i);
            C228479tj.A0F(parcel, 6, this.A04, i);
            C228479tj.A0G(parcel, 7, this.A06);
            C228479tj.A0F(parcel, 8, this.A03, i);
            C228479tj.A02(parcel, A002);
        }

        public ContactInfo() {
        }

        public ContactInfo(PersonName personName, String str, String str2, Phone[] phoneArr, Email[] emailArr, String[] strArr, Address[] addressArr) {
            this.A00 = personName;
            this.A01 = str;
            this.A02 = str2;
            this.A05 = phoneArr;
            this.A04 = emailArr;
            this.A06 = strArr;
            this.A03 = addressArr;
        }
    }

    public class DriverLicense extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(235);
        public String A00;
        public String A01;
        public String A02;
        public String A03;
        public String A04;
        public String A05;
        public String A06;
        public String A07;
        public String A08;
        public String A09;
        public String A0A;
        public String A0B;
        public String A0C;
        public String A0D;

        public final void writeToParcel(Parcel parcel, int i) {
            int A002 = C228479tj.A00(parcel);
            C228479tj.A0A(parcel, 2, this.A05, false);
            C228479tj.A0A(parcel, 3, this.A07, false);
            C228479tj.A0A(parcel, 4, this.A0D, false);
            C228479tj.A0A(parcel, 5, this.A0B, false);
            C228479tj.A0A(parcel, 6, this.A08, false);
            C228479tj.A0A(parcel, 7, this.A02, false);
            C228479tj.A0A(parcel, 8, this.A00, false);
            C228479tj.A0A(parcel, 9, this.A01, false);
            C228479tj.A0A(parcel, 10, this.A03, false);
            C228479tj.A0A(parcel, 11, this.A0C, false);
            C228479tj.A0A(parcel, 12, this.A09, false);
            C228479tj.A0A(parcel, 13, this.A06, false);
            C228479tj.A0A(parcel, 14, this.A04, false);
            C228479tj.A0A(parcel, 15, this.A0A, false);
            C228479tj.A02(parcel, A002);
        }

        public DriverLicense() {
        }

        public DriverLicense(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
            this.A05 = str;
            this.A07 = str2;
            this.A0D = str3;
            this.A0B = str4;
            this.A08 = str5;
            this.A02 = str6;
            this.A00 = str7;
            this.A01 = str8;
            this.A03 = str9;
            this.A0C = str10;
            this.A09 = str11;
            this.A06 = str12;
            this.A04 = str13;
            this.A0A = str14;
        }
    }

    public class Email extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(236);
        public int A00;
        public String A01;
        public String A02;
        public String A03;

        public final void writeToParcel(Parcel parcel, int i) {
            int A002 = C228479tj.A00(parcel);
            C228479tj.A04(parcel, 2, this.A00);
            C228479tj.A0A(parcel, 3, this.A01, false);
            C228479tj.A0A(parcel, 4, this.A03, false);
            C228479tj.A0A(parcel, 5, this.A02, false);
            C228479tj.A02(parcel, A002);
        }

        public Email() {
        }

        public Email(int i, String str, String str2, String str3) {
            this.A00 = i;
            this.A01 = str;
            this.A03 = str2;
            this.A02 = str3;
        }
    }

    public class GeoPoint extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(237);
        public double A00;
        public double A01;

        public final void writeToParcel(Parcel parcel, int i) {
            int A002 = C228479tj.A00(parcel);
            double d = this.A00;
            C228479tj.A05(parcel, 2, 8);
            parcel.writeDouble(d);
            double d2 = this.A01;
            C228479tj.A05(parcel, 3, 8);
            parcel.writeDouble(d2);
            C228479tj.A02(parcel, A002);
        }

        public GeoPoint() {
        }

        public GeoPoint(double d, double d2) {
            this.A00 = d;
            this.A01 = d2;
        }
    }

    public class PersonName extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(238);
        public String A00;
        public String A01;
        public String A02;
        public String A03;
        public String A04;
        public String A05;
        public String A06;

        public final void writeToParcel(Parcel parcel, int i) {
            int A002 = C228479tj.A00(parcel);
            C228479tj.A0A(parcel, 2, this.A01, false);
            C228479tj.A0A(parcel, 3, this.A05, false);
            C228479tj.A0A(parcel, 4, this.A04, false);
            C228479tj.A0A(parcel, 5, this.A00, false);
            C228479tj.A0A(parcel, 6, this.A03, false);
            C228479tj.A0A(parcel, 7, this.A02, false);
            C228479tj.A0A(parcel, 8, this.A06, false);
            C228479tj.A02(parcel, A002);
        }

        public PersonName() {
        }

        public PersonName(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            this.A01 = str;
            this.A05 = str2;
            this.A04 = str3;
            this.A00 = str4;
            this.A03 = str5;
            this.A02 = str6;
            this.A06 = str7;
        }
    }

    public class Phone extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(239);
        public int A00;
        public String A01;

        public final void writeToParcel(Parcel parcel, int i) {
            int A002 = C228479tj.A00(parcel);
            C228479tj.A04(parcel, 2, this.A00);
            C228479tj.A0A(parcel, 3, this.A01, false);
            C228479tj.A02(parcel, A002);
        }

        public Phone() {
        }

        public Phone(int i, String str) {
            this.A00 = i;
            this.A01 = str;
        }
    }

    public class Sms extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(240);
        public String A00;
        public String A01;

        public final void writeToParcel(Parcel parcel, int i) {
            int A002 = C228479tj.A00(parcel);
            C228479tj.A0A(parcel, 2, this.A00, false);
            C228479tj.A0A(parcel, 3, this.A01, false);
            C228479tj.A02(parcel, A002);
        }

        public Sms() {
        }

        public Sms(String str, String str2) {
            this.A00 = str;
            this.A01 = str2;
        }
    }

    public class UrlBookmark extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(241);
        public String A00;
        public String A01;

        public final void writeToParcel(Parcel parcel, int i) {
            int A002 = C228479tj.A00(parcel);
            C228479tj.A0A(parcel, 2, this.A00, false);
            C228479tj.A0A(parcel, 3, this.A01, false);
            C228479tj.A02(parcel, A002);
        }

        public UrlBookmark() {
        }

        public UrlBookmark(String str, String str2) {
            this.A00 = str;
            this.A01 = str2;
        }
    }

    public class WiFi extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(242);
        public int A00;
        public String A01;
        public String A02;

        public final void writeToParcel(Parcel parcel, int i) {
            int A002 = C228479tj.A00(parcel);
            C228479tj.A0A(parcel, 2, this.A02, false);
            C228479tj.A0A(parcel, 3, this.A01, false);
            C228479tj.A04(parcel, 4, this.A00);
            C228479tj.A02(parcel, A002);
        }

        public WiFi() {
        }

        public WiFi(String str, String str2, int i) {
            this.A02 = str;
            this.A01 = str2;
            this.A00 = i;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C228479tj.A00(parcel);
        C228479tj.A04(parcel, 2, this.A00);
        C228479tj.A0A(parcel, 3, this.A0C, false);
        C228479tj.A0A(parcel, 4, this.A0B, false);
        C228479tj.A04(parcel, 5, this.A01);
        C228479tj.A0F(parcel, 6, this.A0D, i);
        C228479tj.A09(parcel, 7, this.A05, i, false);
        C228479tj.A09(parcel, 8, this.A07, i, false);
        C228479tj.A09(parcel, 9, this.A08, i, false);
        C228479tj.A09(parcel, 10, this.A0A, i, false);
        C228479tj.A09(parcel, 11, this.A09, i, false);
        C228479tj.A09(parcel, 12, this.A06, i, false);
        C228479tj.A09(parcel, 13, this.A02, i, false);
        C228479tj.A09(parcel, 14, this.A03, i, false);
        C228479tj.A09(parcel, 15, this.A04, i, false);
        C228479tj.A02(parcel, A002);
    }

    public Barcode() {
    }

    public Barcode(int i, String str, String str2, int i2, Point[] pointArr, Email email, Phone phone, Sms sms, WiFi wiFi, UrlBookmark urlBookmark, GeoPoint geoPoint, CalendarEvent calendarEvent, ContactInfo contactInfo, DriverLicense driverLicense) {
        this.A00 = i;
        this.A0C = str;
        this.A0B = str2;
        this.A01 = i2;
        this.A0D = pointArr;
        this.A05 = email;
        this.A07 = phone;
        this.A08 = sms;
        this.A0A = wiFi;
        this.A09 = urlBookmark;
        this.A06 = geoPoint;
        this.A02 = calendarEvent;
        this.A03 = contactInfo;
        this.A04 = driverLicense;
    }
}
