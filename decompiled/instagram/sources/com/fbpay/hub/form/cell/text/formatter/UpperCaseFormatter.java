package com.fbpay.hub.form.cell.text.formatter;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import java.util.Locale;

public class UpperCaseFormatter implements TextFormatter {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(114);
    public boolean A00;

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final int describeContents() {
        return 0;
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void writeToParcel(Parcel parcel, int i) {
    }

    public final void afterTextChanged(Editable editable) {
        if (!this.A00) {
            this.A00 = true;
            editable.replace(0, editable.length(), editable.toString().toUpperCase(Locale.US));
            this.A00 = false;
        }
    }

    public UpperCaseFormatter() {
    }

    public UpperCaseFormatter(Parcel parcel) {
    }
}
