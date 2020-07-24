package com.instagram.creation.capture.quickcapture.effectinfobottomsheet;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.dextricks.DexOptimizationMessageHandler;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;

public enum EffectInfoBottomSheetMode implements Parcelable {
    NORMAL,
    SHOPPING,
    TRY_ON;
    
    public static final Parcelable.Creator CREATOR = null;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        CREATOR = new PCreatorEBaseShape1S0000000_I1(DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
