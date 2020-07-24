package com.instagram.creation.photo.edit.tiltshift;

import android.graphics.PointF;
import android.os.Parcel;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.filterkit.filter.BaseSimpleFilter;
import p000X.Constants;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass85B;
import p000X.AnonymousClass8U1;
import p000X.AnonymousClass8U5;
import p000X.AnonymousClass8U6;
import p000X.AnonymousClass8UD;
import p000X.C1883682l;
import p000X.C89133th;
import p000X.C89433uD;

public abstract class BaseTiltShiftFilter extends BaseSimpleFilter {
    public float A00;
    public Integer A01;
    public float A02;
    public float A03;
    public PointF A04 = new PointF();
    public PointF A05 = new PointF();
    public AnonymousClass8U6 A06;
    public AnonymousClass8U6 A07;
    public AnonymousClass8U5 A08;
    public AnonymousClass8U5 A09;
    public AnonymousClass8UD A0A;

    public void A0P(AnonymousClass8U1 r5, C89133th r6, AnonymousClass85B r7) {
        AnonymousClass8U6 r1;
        float f;
        if (!(this instanceof TiltShiftFogFilter)) {
            TiltShiftBlurFilter tiltShiftBlurFilter = (TiltShiftBlurFilter) this;
            AnonymousClass8U5 r2 = tiltShiftBlurFilter.A02;
            PointF pointF = tiltShiftBlurFilter.A00;
            r2.A02(pointF.x, pointF.y);
            r1 = tiltShiftBlurFilter.A01;
            f = (float) r7.getWidth();
        } else {
            TiltShiftFogFilter tiltShiftFogFilter = (TiltShiftFogFilter) this;
            r1 = tiltShiftFogFilter.A01;
            f = tiltShiftFogFilter.A00;
        }
        r1.A02(f);
    }

    public final float A0H() {
        Integer num = this.A01;
        if (num == Constants.ONE) {
            return this.A02;
        }
        if (num == Constants.A0C) {
            return this.A03;
        }
        return -1.0f;
    }

    public final PointF A0I() {
        Integer num = this.A01;
        if (num == Constants.ONE) {
            return this.A05;
        }
        if (num == Constants.A0C) {
            return this.A04;
        }
        return null;
    }

    public final void A0J(float f) {
        float f2 = this.A00 + f;
        if (this.A01 == Constants.A0C) {
            this.A00 = f2;
            invalidate();
        }
    }

    public final void A0K(float f) {
        float f2;
        if (this.A01 == Constants.ONE) {
            f2 = this.A02;
        } else {
            f2 = this.A03;
        }
        A0L(f * f2);
    }

    public final void A0M(float f, float f2) {
        PointF pointF;
        Integer num = this.A01;
        if (num == Constants.ONE) {
            pointF = this.A05;
        } else if (num == Constants.A0C) {
            pointF = this.A04;
        } else {
            return;
        }
        A0N(pointF.x + f, pointF.y + f2);
    }

    public final void A0N(float f, float f2) {
        Integer num = this.A01;
        if (num == Constants.ONE) {
            PointF pointF = this.A05;
            pointF.x = Math.max(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, Math.min(1.0f, f));
            pointF.y = Math.max(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, Math.min(1.0f, f2));
        } else if (num == Constants.A0C) {
            PointF pointF2 = this.A04;
            pointF2.x = Math.max(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, Math.min(1.0f, f));
            pointF2.y = Math.max(BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, Math.min(1.0f, f2));
        } else {
            return;
        }
        invalidate();
    }

    public void A0O(AnonymousClass8U1 r2) {
        this.A0A = (AnonymousClass8UD) r2.A00("blurMode");
        this.A08 = (AnonymousClass8U5) r2.A00("origin");
        this.A06 = (AnonymousClass8U6) r2.A00("outerRadius");
        this.A07 = (AnonymousClass8U6) r2.A00("theta");
        this.A09 = (AnonymousClass8U5) r2.A00("stretchFactor");
    }

    public final void A0Q(Integer num) {
        float f;
        this.A01 = num;
        if (num == Constants.ONE) {
            PointF pointF = this.A05;
            A0N(pointF.x, pointF.y);
            f = this.A02;
        } else {
            if (num == Constants.A0C) {
                PointF pointF2 = this.A04;
                A0N(pointF2.x, pointF2.y);
                f = this.A03;
            }
            invalidate();
        }
        A0L(f);
        invalidate();
    }

    public final void A0E(AnonymousClass8U1 r6, C89433uD r7, C89133th r8, AnonymousClass85B r9) {
        r6.A03("image", r8.getTextureId());
        this.A0A.A02(C1883682l.A00(this.A01));
        Integer num = this.A01;
        if (num == Constants.ONE) {
            AnonymousClass8U5 r2 = this.A08;
            PointF pointF = this.A05;
            r2.A02(pointF.x, pointF.y);
            this.A06.A02(this.A02 * 1.5f);
        } else if (num == Constants.A0C) {
            AnonymousClass8U5 r22 = this.A08;
            PointF pointF2 = this.A04;
            r22.A02(pointF2.x, pointF2.y);
            this.A06.A02(this.A03);
            this.A07.A02(this.A00);
        }
        int AU9 = r9.AU9();
        int AU6 = r9.AU6();
        if (AU9 == AU6) {
            this.A09.A02(1.0f, 1.0f);
        } else if (AU9 > AU6) {
            this.A09.A02(((float) AU9) / ((float) AU6), 1.0f);
        } else {
            this.A09.A02(1.0f, ((float) AU6) / ((float) AU9));
        }
        A0P(r6, r8, r9);
    }

    public final void A0L(float f) {
        float max = Math.max(0.1f, Math.min(1.0f, f));
        Integer num = this.A01;
        if (num == Constants.ONE) {
            this.A02 = max;
        } else if (num == Constants.A0C) {
            this.A03 = max;
        } else {
            return;
        }
        invalidate();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.A05.x);
        parcel.writeFloat(this.A05.y);
        parcel.writeFloat(this.A02);
        parcel.writeFloat(this.A04.x);
        parcel.writeFloat(this.A04.y);
        parcel.writeFloat(this.A03);
        parcel.writeFloat(this.A00);
        parcel.writeInt(C1883682l.A00(this.A01));
    }

    public BaseTiltShiftFilter(AnonymousClass0C1 r4) {
        super(r4);
        A0Q(Constants.ONE);
        A0N(0.5f, 0.5f);
        A0L(0.5f);
        Integer num = Constants.A0C;
        A0Q(num);
        A0N(0.5f, 0.5f);
        A0L(0.5f);
        if (this.A01 == num) {
            this.A00 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
            invalidate();
        }
        A0Q(Constants.ZERO);
    }

    public BaseTiltShiftFilter(Parcel parcel) {
        super(parcel);
        A0Q(Constants.ONE);
        A0N(parcel.readFloat(), parcel.readFloat());
        A0L(parcel.readFloat());
        A0Q(Constants.A0C);
        A0N(parcel.readFloat(), parcel.readFloat());
        A0L(parcel.readFloat());
        float readFloat = parcel.readFloat();
        if (this.A01 == Constants.A0C) {
            this.A00 = readFloat;
            invalidate();
        }
        A0Q(C1883682l.A01(parcel.readInt()));
    }
}
