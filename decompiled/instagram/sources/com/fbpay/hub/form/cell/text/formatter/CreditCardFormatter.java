package com.fbpay.hub.form.cell.text.formatter;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import p000X.C169437Mc;
import p000X.C181147oL;

public class CreditCardFormatter implements TextFormatter {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(111);
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
        int[] iArr;
        if (!this.A00) {
            this.A00 = true;
            for (Object removeSpan : editable.getSpans(0, editable.length(), C169437Mc.class)) {
                editable.removeSpan(removeSpan);
            }
            C181147oL A002 = C181147oL.A00(editable.toString());
            if (editable.length() > A002.A00) {
                editable.replace(0, editable.length(), editable.subSequence(0, A002.A00));
            }
            if (A002 == C181147oL.AMEX) {
                iArr = C181147oL.A04;
            } else {
                iArr = C181147oL.A05;
            }
            int length = editable.length();
            for (int i : iArr) {
                if (i <= length) {
                    editable.setSpan(new C169437Mc(" "), i - 1, i, 33);
                }
            }
            this.A00 = false;
        }
    }

    public CreditCardFormatter() {
    }

    public CreditCardFormatter(Parcel parcel) {
    }
}
