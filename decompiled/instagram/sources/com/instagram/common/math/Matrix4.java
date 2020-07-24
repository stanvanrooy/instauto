package com.instagram.common.math;

import android.opengl.Matrix;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.redex.PCreatorEBaseShape0S0000000_I0;
import java.nio.FloatBuffer;
import p000X.AnonymousClass83F;

public class Matrix4 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape0S0000000_I0(26);
    public final FloatBuffer A00;
    public final float[] A01;

    public final int describeContents() {
        return 0;
    }

    public final AnonymousClass83F A00(AnonymousClass83F r9) {
        AnonymousClass83F r4 = new AnonymousClass83F();
        float[] fArr = this.A01;
        float f = fArr[0] * r9.A01;
        float f2 = fArr[4];
        float f3 = r9.A02;
        float f4 = f + (f2 * f3);
        float f5 = fArr[8];
        float f6 = r9.A03;
        float f7 = f4 + (f5 * f6);
        float f8 = fArr[12];
        float f9 = r9.A00;
        r4.A01 = f7 + (f8 * f9);
        float f10 = fArr[1];
        float f11 = r9.A01;
        r4.A02 = (f10 * f11) + (fArr[5] * f3) + (fArr[9] * f6) + (fArr[13] * f9);
        float f12 = fArr[6];
        float f13 = r9.A02;
        r4.A03 = (fArr[2] * f11) + (f12 * f13) + (fArr[10] * f6) + (fArr[14] * f9);
        r4.A00 = (fArr[3] * f11) + (fArr[7] * f13) + (fArr[11] * r9.A03) + (fArr[15] * f9);
        return r4;
    }

    public final void A01() {
        Matrix.setIdentityM(this.A01, 0);
    }

    public final void A02(float f) {
        Matrix.rotateM(this.A01, 0, f, 1.0f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
    }

    public final void A03(float f) {
        Matrix.rotateM(this.A01, 0, f, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, 1.0f);
    }

    public final void A04(float f, float f2) {
        Matrix.scaleM(this.A01, 0, f, f2, 1.0f);
    }

    public final void A05(float f, float f2, float f3) {
        Matrix.translateM(this.A01, 0, f, f2, f3);
    }

    public final void A06(Matrix4 matrix4) {
        A09(matrix4.A01);
    }

    public final void A07(Matrix4 matrix4) {
        System.arraycopy(matrix4.A01, 0, this.A01, 0, 16);
    }

    public final void A08(Matrix4 matrix4, Matrix4 matrix42) {
        if (this == matrix4 || this == matrix42) {
            throw new IllegalArgumentException("This matrix can't be the same instance as leftMatrix or rightMatrix, otherwise the result could be undefined");
        }
        Matrix.multiplyMM(this.A01, 0, matrix4.A01, 0, matrix42.A01, 0);
    }

    public final void A09(float[] fArr) {
        float[] fArr2 = new float[16];
        Matrix.multiplyMM(fArr2, 0, this.A01, 0, fArr, 0);
        System.arraycopy(fArr2, 0, this.A01, 0, 16);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloatArray(this.A00.array());
    }

    public Matrix4() {
        float[] fArr = new float[16];
        this.A01 = fArr;
        this.A00 = FloatBuffer.wrap(fArr);
        A01();
    }

    public Matrix4(Parcel parcel) {
        float[] fArr = new float[16];
        this.A01 = fArr;
        this.A00 = FloatBuffer.wrap(fArr);
        parcel.readFloatArray(this.A01);
    }

    public Matrix4(Matrix4 matrix4) {
        float[] fArr = new float[16];
        this.A01 = fArr;
        this.A00 = FloatBuffer.wrap(fArr);
        System.arraycopy(matrix4.A01, 0, this.A01, 0, 16);
    }

    public Matrix4(float[] fArr) {
        float[] fArr2 = new float[16];
        this.A01 = fArr2;
        this.A00 = FloatBuffer.wrap(fArr2);
        System.arraycopy(fArr, 0, this.A01, 0, 16);
    }
}
