package com.fbpay.hub.form.cell.text.formatter;

import android.os.Parcel;
import android.os.Parcelable;
import android.telephony.PhoneNumberFormattingTextWatcher;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;

public class PhoneFormatter extends PhoneNumberFormattingTextWatcher implements TextFormatter {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(113);

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
    }

    public PhoneFormatter() {
    }

    public PhoneFormatter(Parcel parcel) {
    }
}
