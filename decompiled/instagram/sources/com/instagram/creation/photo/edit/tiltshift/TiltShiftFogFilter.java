package com.instagram.creation.photo.edit.tiltshift;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.instagram.util.creation.ShaderBridge;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass8U1;
import p000X.AnonymousClass8U6;
import p000X.C89433uD;

public class TiltShiftFogFilter extends BaseTiltShiftFilter {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(312);
    public float A00;
    public AnonymousClass8U6 A01;

    public final AnonymousClass8U1 A0C(C89433uD r3) {
        int A002 = ShaderBridge.A00("BlurComposite");
        if (A002 == 0) {
            return null;
        }
        AnonymousClass8U1 r0 = new AnonymousClass8U1(A002);
        A0O(r0);
        return r0;
    }

    public final void A0O(AnonymousClass8U1 r2) {
        super.A0O(r2);
        this.A01 = (AnonymousClass8U6) r2.A00("dimFactor");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.A00);
    }

    public TiltShiftFogFilter(AnonymousClass0C1 r2) {
        super(r2);
        this.A00 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        invalidate();
    }

    public TiltShiftFogFilter(Parcel parcel) {
        super(parcel);
        this.A00 = parcel.readFloat();
        invalidate();
    }
}
