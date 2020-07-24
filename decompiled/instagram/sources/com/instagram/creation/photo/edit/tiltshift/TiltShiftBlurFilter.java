package com.instagram.creation.photo.edit.tiltshift;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.instagram.util.creation.ShaderBridge;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass8U1;
import p000X.AnonymousClass8U5;
import p000X.AnonymousClass8U6;
import p000X.C89433uD;

public class TiltShiftBlurFilter extends BaseTiltShiftFilter {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(311);
    public PointF A00;
    public AnonymousClass8U6 A01;
    public AnonymousClass8U5 A02;

    public final AnonymousClass8U1 A0C(C89433uD r3) {
        int A002 = ShaderBridge.A00("BlurDynamic");
        if (A002 == 0 && (A002 = ShaderBridge.A00("BlurDynamicFixedLoop")) == 0) {
            return null;
        }
        AnonymousClass8U1 r0 = new AnonymousClass8U1(A002);
        A0O(r0);
        return r0;
    }

    public final void A0O(AnonymousClass8U1 r2) {
        super.A0O(r2);
        this.A02 = (AnonymousClass8U5) r2.A00("blurVector");
        this.A01 = (AnonymousClass8U6) r2.A00("dimension");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.A00.x);
        parcel.writeFloat(this.A00.y);
    }

    public TiltShiftBlurFilter(AnonymousClass0C1 r5, float f, float f2) {
        super(r5);
        PointF pointF = new PointF();
        this.A00 = pointF;
        pointF.x = Math.max(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, Math.min(1.0f, f));
        pointF.y = Math.max(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, Math.min(1.0f, f2));
    }

    public TiltShiftBlurFilter(Parcel parcel) {
        super(parcel);
        this.A00 = new PointF();
        float readFloat = parcel.readFloat();
        float readFloat2 = parcel.readFloat();
        PointF pointF = this.A00;
        pointF.x = Math.max(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, Math.min(1.0f, readFloat));
        pointF.y = Math.max(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, Math.min(1.0f, readFloat2));
    }
}
