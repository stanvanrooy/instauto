package com.instagram.business.controller.datamodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import java.util.Arrays;
import p000X.AnonymousClass65B;

public class BusinessConversionStep implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(258);
    public final AnonymousClass65B A00;
    public final ConversionStep A01;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof BusinessConversionStep)) {
            return false;
        }
        BusinessConversionStep businessConversionStep = (BusinessConversionStep) obj;
        return businessConversionStep.A01 == this.A01 && businessConversionStep.A00 == this.A00;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, this.A00});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A01, i);
        parcel.writeInt(this.A00.A00);
    }

    public BusinessConversionStep(Parcel parcel) {
        AnonymousClass65B r0;
        this.A01 = (ConversionStep) parcel.readParcelable(ConversionStep.class.getClassLoader());
        if (parcel.readInt() == 1) {
            r0 = AnonymousClass65B.SKIP;
        } else {
            r0 = AnonymousClass65B.NEXT;
        }
        this.A00 = r0;
    }

    public BusinessConversionStep(ConversionStep conversionStep) {
        this(conversionStep, AnonymousClass65B.NEXT);
    }

    public BusinessConversionStep(ConversionStep conversionStep, AnonymousClass65B r2) {
        this.A01 = conversionStep;
        this.A00 = r2;
    }
}
