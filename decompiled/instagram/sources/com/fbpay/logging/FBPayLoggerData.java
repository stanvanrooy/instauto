package com.fbpay.logging;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p000X.AnonymousClass2ZY;
import p000X.C26626Boi;

public class FBPayLoggerData implements Parcelable {
    public static volatile String A05;
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(127);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final Set A04;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FBPayLoggerData) {
                FBPayLoggerData fBPayLoggerData = (FBPayLoggerData) obj;
                if (!C26626Boi.A03(this.A00, fBPayLoggerData.A00) || !C26626Boi.A03(this.A01, fBPayLoggerData.A01) || !C26626Boi.A03(A00(), fBPayLoggerData.A00()) || !C26626Boi.A03(this.A03, fBPayLoggerData.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String A00() {
        if (this.A04.contains("sessionId")) {
            return this.A02;
        }
        if (A05 == null) {
            synchronized (this) {
                if (A05 == null) {
                    A05 = AnonymousClass2ZY.A00().toString();
                }
            }
        }
        return A05;
    }

    public final int hashCode() {
        return C26626Boi.A00(C26626Boi.A00(C26626Boi.A00(C26626Boi.A00(1, this.A00), this.A01), A00()), this.A03);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (this.A00 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(this.A00);
        }
        parcel.writeString(this.A01);
        if (this.A02 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(this.A02);
        }
        if (this.A03 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(this.A03);
        }
        parcel.writeInt(this.A04.size());
        for (String writeString : this.A04) {
            parcel.writeString(writeString);
        }
    }

    public FBPayLoggerData(Parcel parcel) {
        if (parcel.readInt() != 0) {
            this.A00 = parcel.readString();
        }
        this.A01 = parcel.readString();
        if (parcel.readInt() != 0) {
            this.A02 = parcel.readString();
        }
        if (parcel.readInt() != 0) {
            this.A03 = parcel.readString();
        }
        HashSet hashSet = new HashSet();
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            hashSet.add(parcel.readString());
        }
        this.A04 = Collections.unmodifiableSet(hashSet);
    }
}
