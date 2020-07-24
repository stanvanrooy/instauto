package com.instagram.filterkit.filter;

import android.os.Parcel;
import com.instagram.common.math.Matrix4;
import com.instagram.creation.photo.edit.effectfilter.GradientBackgroundPhotoFilter;
import java.util.Arrays;
import p000X.C89433uD;

public abstract class BaseFilter implements IgFilter {
    public boolean A00 = true;

    public boolean A0B() {
        if (!(this instanceof GradientBackgroundPhotoFilter)) {
            return false;
        }
        GradientBackgroundPhotoFilter gradientBackgroundPhotoFilter = (GradientBackgroundPhotoFilter) this;
        Matrix4 matrix4 = gradientBackgroundPhotoFilter.A06;
        if (matrix4 != null) {
            return Arrays.equals(matrix4.A01, gradientBackgroundPhotoFilter.A00.A0A.A01);
        }
    }

    public void A8Y(C89433uD r1) {
    }

    public boolean Ags() {
        return false;
    }

    public void AoY() {
        this.A00 = false;
    }

    public int describeContents() {
        return 0;
    }

    public void invalidate() {
        this.A00 = true;
    }

    public void writeToParcel(Parcel parcel, int i) {
    }

    public void Bio(int i) {
        if (!(this instanceof BaseSimpleFilter)) {
            throw new UnsupportedOperationException("Not implemented at this time");
        }
        ((BaseSimpleFilter) this).A00 = i;
    }

    public boolean Ag0() {
        return this.A00;
    }

    public String toString() {
        return getClass().getSimpleName();
    }

    public BaseFilter() {
    }

    public BaseFilter(Parcel parcel) {
    }
}
