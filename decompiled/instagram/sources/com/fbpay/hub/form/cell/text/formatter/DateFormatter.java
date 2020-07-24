package com.fbpay.hub.form.cell.text.formatter;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import p000X.C169437Mc;

public class DateFormatter implements TextFormatter {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(112);
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
            if (editable.length() == 1 && Integer.parseInt(editable.toString()) > 1) {
                editable.insert(0, "0");
            }
            for (Object removeSpan : editable.getSpans(0, editable.length(), C169437Mc.class)) {
                editable.removeSpan(removeSpan);
            }
            if (editable.length() == 2 && Integer.parseInt(editable.toString()) > 12) {
                editable.insert(0, "0");
            }
            if (2 <= editable.length()) {
                editable.setSpan(new C169437Mc("/"), 1, 2, 33);
            }
            this.A00 = false;
        }
    }

    public DateFormatter() {
    }

    public DateFormatter(Parcel parcel) {
    }
}
