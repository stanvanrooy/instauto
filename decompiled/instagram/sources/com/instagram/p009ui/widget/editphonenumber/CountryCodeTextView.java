package com.instagram.p009ui.widget.editphonenumber;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.instagram.phonenumber.model.CountryCodeData;
import p000X.AnonymousClass000;

/* renamed from: com.instagram.ui.widget.editphonenumber.CountryCodeTextView */
public class CountryCodeTextView extends TextView {
    public String A00;

    /* renamed from: com.instagram.ui.widget.editphonenumber.CountryCodeTextView$SavedState */
    public class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(477);
        public final String A00;

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.A00);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.A00 = parcel.readString();
        }

        public SavedState(Parcelable parcelable, String str) {
            super(parcelable);
            this.A00 = str;
        }
    }

    public String getCountryCodeWithoutPlus() {
        return this.A00.replace("+", "");
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.A00 = savedState.A00;
    }

    public void setCountryCodeWithCountryPrefix(CountryCodeData countryCodeData) {
        this.A00 = AnonymousClass000.A0E("+", countryCodeData.A01);
        setText(countryCodeData.A01());
    }

    public String getCountryCode() {
        return this.A00;
    }

    public final Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.A00);
    }

    public CountryCodeTextView(Context context) {
        super(context);
    }

    public CountryCodeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setCountryCodeWithPlus(CountryCodeData countryCodeData) {
        setCountryCodeWithPlus(AnonymousClass000.A0E("+", countryCodeData.A01));
    }

    public void setCountryCodeWithPlus(String str) {
        if (str != null && !str.isEmpty()) {
            if (!str.startsWith("+")) {
                str = AnonymousClass000.A0E("+", str);
            }
            this.A00 = str;
            setText(str);
        }
    }
}
