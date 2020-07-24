package com.instagram.common.math;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.redex.PCreatorEBaseShape0S0000000_I0;
import java.nio.FloatBuffer;

public class Matrix3 implements Parcelable {
    public static final float[] A02 = {1.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f};
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape0S0000000_I0(25);
    public final FloatBuffer A00;
    public final float[] A01;

    public final int describeContents() {
        return 0;
    }

    public final void A00(float f, float f2) {
        float[] fArr = this.A01;
        fArr[6] = fArr[6] + (fArr[0] * f) + (fArr[3] * f2);
        fArr[7] = fArr[7] + (f * fArr[1]) + (f2 * fArr[4]);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloatArray(this.A00.array());
    }

    public Matrix3() {
        float[] fArr = new float[9];
        this.A01 = fArr;
        FloatBuffer wrap = FloatBuffer.wrap(fArr);
        this.A00 = wrap;
        wrap.position(0);
        this.A00.put(A02);
        this.A00.position(0);
    }

    public Matrix3(Parcel parcel) {
        float[] fArr = new float[9];
        this.A01 = fArr;
        this.A00 = FloatBuffer.wrap(fArr);
        parcel.readFloatArray(this.A01);
    }
}
