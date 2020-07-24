package com.facebook.common.locale;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.stringformat.StringFormatUtil;
import java.util.Locale;

public abstract class LocaleMember implements Parcelable {
    public final Locale A00;

    public String A01() {
        return ((Country) this).A00.getCountry();
    }

    public String A02() {
        return ((Country) this).A00.getISO3Country();
    }

    public String A03(Locale locale) {
        return ((Country) this).A00.getDisplayCountry(locale);
    }

    public final boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        return A01().equals(((LocaleMember) obj).A01());
    }

    public final String toString() {
        return StringFormatUtil.formatStrLocaleSafe("%s (%s/%s)", A03(Locale.US), A01(), A02());
    }

    public LocaleMember(Locale locale) {
        this.A00 = locale;
    }

    public final int describeContents() {
        return hashCode();
    }

    public final int hashCode() {
        return A01().hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(A01());
    }
}
