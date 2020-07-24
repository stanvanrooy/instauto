package com.instagram.creation.photo.edit.effectfilter;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape0S0000000_I0;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass85B;
import p000X.AnonymousClass8U1;
import p000X.C18550s2;
import p000X.C43391uK;
import p000X.C89113td;
import p000X.C89133th;
import p000X.C89173tm;
import p000X.C89213tq;
import p000X.C89393u9;
import p000X.C89433uD;

public class GradientBackgroundPhotoFilter extends PhotoFilter {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape0S0000000_I0(30);
    public C43391uK A00;
    public final boolean A01;
    public final float[] A02;
    public final float[] A03;

    public static float[] A00(int i) {
        return new float[]{((float) Color.red(i)) / 255.0f, ((float) Color.green(i)) / 255.0f, ((float) Color.blue(i)) / 255.0f};
    }

    public final void A0E(AnonymousClass8U1 r13, C89433uD r14, C89133th r15, AnonymousClass85B r16) {
        float[] fArr;
        float[] fArr2 = this.A03;
        if (!(fArr2 == null || (fArr = this.A02) == null)) {
            C89393u9 r9 = this.A09;
            if (r9 instanceof C89213tq) {
                C89213tq r92 = (C89213tq) r9;
                float f = fArr[0];
                float f2 = fArr[1];
                float f3 = fArr[2];
                float[] fArr3 = r92.A06;
                fArr3[0] = f;
                fArr3[1] = f2;
                fArr3[2] = f3;
                fArr3[3] = 1.0f;
                float f4 = fArr2[0];
                float f5 = fArr2[1];
                float f6 = fArr2[2];
                float[] fArr4 = r92.A08;
                fArr4[0] = f4;
                fArr4[1] = f5;
                fArr4[2] = f6;
                fArr4[3] = 1.0f;
            }
        }
        super.A0E(r13, r14, r15, r16);
    }

    public final void A0M(int i, int i2, boolean z) {
        if (this.A01) {
            z = true;
        }
        super.A0M(i, i2, z);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloatArray(this.A03);
        parcel.writeFloatArray(this.A02);
        parcel.writeInt(this.A01 ? 1 : 0);
    }

    public GradientBackgroundPhotoFilter(AnonymousClass0C1 r9, int i, int i2, Integer num) {
        super(r9, C18550s2.A00().A04(753), num, true, true, (C89173tm) null);
        this.A03 = A00(i);
        this.A02 = A00(i2);
        this.A01 = C89113td.A00(r9);
        this.A00 = new C43391uK(-1, r9);
        if (this.A01) {
            this.A0R = true;
            invalidate();
        }
    }

    public GradientBackgroundPhotoFilter(Parcel parcel) {
        super(parcel);
        float[] fArr = new float[3];
        this.A03 = fArr;
        this.A02 = new float[3];
        parcel.readFloatArray(fArr);
        parcel.readFloatArray(this.A02);
        boolean z = parcel.readInt() != 1 ? false : true;
        this.A01 = z;
        this.A00 = new C43391uK(-1, z);
    }
}
