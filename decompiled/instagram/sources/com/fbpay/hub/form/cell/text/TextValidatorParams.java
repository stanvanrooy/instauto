package com.fbpay.hub.form.cell.text;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import p000X.Constants;
import p000X.AnonymousClass0a4;
import p000X.C181197oQ;

public class TextValidatorParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(110);
    public final int A00;
    public final Integer A01;
    public final String A02;
    public final String A03;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(C181197oQ.A01(this.A01));
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A00);
    }

    public TextValidatorParams(Parcel parcel) {
        Integer num;
        String readString = parcel.readString();
        AnonymousClass0a4.A06(readString);
        if (readString.equals("EXACT_LENGTH")) {
            num = Constants.ZERO;
        } else if (readString.equals("REGEX")) {
            num = Constants.ONE;
        } else if (readString.equals("EMPTY")) {
            num = Constants.A0C;
        } else if (readString.equals("US_STATE")) {
            num = Constants.A0N;
        } else if (readString.equals("DATE")) {
            num = Constants.A0Y;
        } else if (readString.equals("CARD")) {
            num = Constants.A0j;
        } else {
            throw new IllegalArgumentException(readString);
        }
        AnonymousClass0a4.A06(num);
        this.A01 = num;
        String readString2 = parcel.readString();
        AnonymousClass0a4.A06(readString2);
        this.A03 = readString2;
        this.A02 = parcel.readString();
        this.A00 = parcel.readInt();
    }

    public TextValidatorParams(Integer num, String str, int i) {
        this.A01 = num;
        this.A03 = str;
        this.A02 = null;
        this.A00 = i;
    }
}
