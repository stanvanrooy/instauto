package com.facebook.android.instantexperiences.payment;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.android.instantexperiences.jscall.InstantExperiencesCallResult;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;

public final class PaymentsCheckoutJSBridgeCallResult extends InstantExperiencesCallResult {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(23);

    public PaymentsCheckoutJSBridgeCallResult(Parcel parcel) {
        super(parcel);
    }
}
