package com.fbpay.hub.form.params;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import p000X.Bk4;
import p000X.C26626Boi;

public class FormLogEvents implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(116);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FormLogEvents) {
                FormLogEvents formLogEvents = (FormLogEvents) obj;
                if (!C26626Boi.A03(this.A00, formLogEvents.A00) || !C26626Boi.A03(this.A01, formLogEvents.A01) || !C26626Boi.A03(this.A02, formLogEvents.A02) || !C26626Boi.A03(this.A03, formLogEvents.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C26626Boi.A00(C26626Boi.A00(C26626Boi.A00(C26626Boi.A00(1, this.A00), this.A01), this.A02), this.A03);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (this.A00 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(this.A00);
        }
        if (this.A01 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(this.A01);
        }
        if (this.A02 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(this.A02);
        }
        if (this.A03 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeString(this.A03);
    }

    public FormLogEvents(Bk4 bk4) {
        this.A00 = null;
        this.A01 = bk4.A00;
        this.A02 = null;
        this.A03 = null;
    }

    public FormLogEvents(Parcel parcel) {
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = parcel.readString();
        }
    }
}
