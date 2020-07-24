package com.facebook.android.instantexperiences.jscall;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import p000X.C229249xC;
import p000X.C25109B1d;

public class InstantExperienceGenericErrorResult extends InstantExperiencesCallResult {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(17);

    public InstantExperienceGenericErrorResult(C229249xC r3) {
        super(r3.A00, r3.getMessage());
    }

    public InstantExperienceGenericErrorResult(C25109B1d b1d, String str) {
        super(b1d, str);
    }

    public InstantExperienceGenericErrorResult(Parcel parcel) {
        super(parcel);
    }
}
