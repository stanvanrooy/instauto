package com.facebook.android.instantexperiences.payment;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.android.instantexperiences.jscall.InstantExperiencesJSBridgeCall;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;

public class CanShowPaymentModuleJSBridgeCall extends InstantExperiencesJSBridgeCall {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(20);

    public final String A01() {
        return "canShowPaymentModule";
    }

    public CanShowPaymentModuleJSBridgeCall(Parcel parcel) {
        super(parcel);
    }
}
